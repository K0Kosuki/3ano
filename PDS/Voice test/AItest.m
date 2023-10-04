[audioIn,fs] = audioread("keywordTestSignal.wav");
sound(audioIn,fs)

downloadFolder = matlab.internal.examples.downloadSupportFile("audio","KeywordSpotting.zip");
dataFolder = tempdir;
unzip(downloadFolder,dataFolder)
netFolder = fullfile(dataFolder,"KeywordSpotting");
load(fullfile(netFolder,"KWSNet.mat"));

windowLength = 512;
overlapLength = 384;
afe = audioFeatureExtractor(SampleRate=fs, ...
    Window=hann(windowLength,"periodic"),OverlapLength=overlapLength, ...
    mfcc=true,mfccDelta=true,mfccDeltaDelta=true);

features = extract(afe,audioIn);

features = (features - M)./S;

mask = classify(KWSNet,features.');

mask = repmat(mask,windowLength-overlapLength,1);
mask = double(mask) - 1;
mask = mask(:);
figure
audioIn = audioIn(1:length(mask));
t = (0:length(audioIn)-1)/fs;
plot(t,audioIn)
grid on
hold on
plot(t, mask)
legend("Speech","YES")




sound(audioIn(mask==1),fs)


generateMATLABFunction(afe,"generateKeywordFeatures",IsStreaming=true);

hopLength = windowLength - overlapLength;
frameLength = hopLength;
adr = audioDeviceReader(SampleRate=fs,SamplesPerFrame=frameLength);

scope = timescope(SampleRate=fs, ...
    TimeSpanSource="property", ...
    TimeSpan=5, ...
    TimeSpanOverrunAction="Scroll", ...
    BufferLength=fs*5*2, ...
    ShowLegend=true, ...
    ChannelNames={'Speech','Keyword Mask'}, ...
    YLimits=[-1.2,1.2], ...
    Title="Keyword Spotting");

numHopsPerUpdate = 16;
dataBuff = dsp.AsyncBuffer(windowLength);
featureBuff = dsp.AsyncBuffer(numHopsPerUpdate);
plotBuff = dsp.AsyncBuffer(numHopsPerUpdate*windowLength);
timeLimit = 20;

tic
while toc < timeLimit

    data = adr();
    write(dataBuff,data);
    write(plotBuff,data);

    frame = read(dataBuff,windowLength,overlapLength);
    features = generateKeywordFeatures(frame,fs);
    write(featureBuff,features.');

    if featureBuff.NumUnreadSamples == numHopsPerUpdate
        featureMatrix = read(featureBuff);
        featureMatrix(~isfinite(featureMatrix)) = 0;
        featureMatrix = (featureMatrix - M)./S;

        [keywordNet,v] = classifyAndUpdateState(KWSNet,featureMatrix.');
        v = double(v) - 1;
        v = repmat(v,hopLength,1);
        v = v(:);
        v = mode(v);
        v = repmat(v,numHopsPerUpdate*hopLength,1);

        data = read(plotBuff);
        scope([data,v]);

        if ~isVisible(scope)
            break;
        end
    end
end
hide(scope)