function featureVector = generateKeywordFeatures(x, varargin)
%generateKeywordFeatures Extract multiple features from streaming audio
%   featureVector = generateKeywordFeatures(audioIn) returns audio features
%   extracted from audioIn.
%
%   featureVector = generateKeywordFeatures(audioIn,"Reset",TF) returns feature extractors
%   to their initial conditions before extracting features.
%
%   Parameters of the audioFeatureExtractor used to generate this
%   function must be honored when calling this function.
%    - Sample rate of the input should be 16000 Hz.
%    - Frame length of the input should be 512 samples.
%    - Successive frames of the input should be overlapped by
%      384 samples before calling generateKeywordFeatures.
%
%
%      % EXAMPLE 1: Extract features
%        source = dsp.ColoredNoise();
%        inputBuffer = dsp.AsyncBuffer;
%        for ii = 1:10
%            audioIn = source();
%            write(inputBuffer,audioIn);
%            while inputBuffer.NumUnreadSamples > 128
%                x = read(inputBuffer,512,384);
%                featureVector = generateKeywordFeatures(x);
%                % ... do something with featureVector ...
%            end
%         end
%
%
%      % EXAMPLE 2: Extract features from speech regions only
%        [audioIn,fs] = audioread("Counting-16-44p1-mono-15secs.wav");
%        audioIn = resample(audioIn,16000,fs);
%        source = dsp.AsyncBuffer(size(audioIn,1));
%        write(source,audioIn);
%        TF = false;
%        while source.NumUnreadSamples > 128
%            x = read(source,512,384);
%            isSilence = var(x) < 0.01;
%            if ~isSilence
%                featureVector = generateKeywordFeatures(x,"Reset",TF);
%                TF = false;
%            else
%                TF = true;
%            end
%            % ... do something with featureVector ...
%        end
%
%
%      % EXAMPLE 3: Generate code that does not use reset
%        targetDataType = "single";
%        codegen generateKeywordFeatures -args {ones(512,1,targetDataType)}
%        source = dsp.ColoredNoise('OutputDataType',targetDataType);
%        inputBuffer = dsp.AsyncBuffer;
%        for ii = 1:10
%            audioIn = source();
%            write(inputBuffer,audioIn);
%            while inputBuffer.NumUnreadSamples > 128
%                x = read(inputBuffer,512,384);
%                featureVector = generateKeywordFeatures_mex(x);
%                % ... do something with featureVector ...
%            end
%         end
%
%
%      % EXAMPLE 4: Generate code that uses reset
%        targetDataType = "single";
%        codegen generateKeywordFeatures -args {ones(512,1,targetDataType),'Reset',true}
%        [audioIn,fs] = audioread("Counting-16-44p1-mono-15secs.wav");
%        audioIn = resample(audioIn,16000,fs);
%        source = dsp.AsyncBuffer(size(audioIn,1));
%        write(source,cast(audioIn,targetDataType));
%        TF = false;
%        while source.NumUnreadSamples > 128
%            x = read(source,512,384);
%            isSilence = var(x) < 0.01;
%            if ~isSilence
%                featureVector = generateKeywordFeatures_mex(x,'Reset',TF);
%                TF = false;
%            else
%                TF = true;
%            end
%            % ... do something with featureVector ...
%        end
%
%   See also audioFeatureExtractor, dsp.AsyncBuffer, codegen.

%   Generated by audioFeatureExtractor on 13-10月-2023 10:23:15 +0100
%#codegen

dataType = underlyingType(x);
numChannels = size(x,2);

props = coder.const(getProps(dataType));

persistent config outputIndex state
if isempty(outputIndex)
    [config, outputIndex] = coder.const(@getConfig,dataType,props);
    state = getState(dataType,numChannels);
else
    assert(state.NumChannels == numChannels)
end
if nargin==3
    if strcmpi(varargin{1},"Reset") && varargin{2}
        state = reset(state);
    end
end

% Preallocate feature vector
featureVector = coder.nullcopy(zeros(props.NumFeatures,numChannels,dataType));

% Fourier transform
Y = fft(bsxfun(@times,x,props.Window),props.FFTLength);
Z = Y(config.OneSidedSpectrumBins,:);
Zpower = real(Z.*conj(Z));

% Mel spectrum
melSpectrum = reshape(config.melSpectrum.FilterBank*Zpower,[],1,numChannels);

% Mel-frequency cepstral coefficients (MFCC)
melcc = cepstralCoefficients(melSpectrum,"NumCoeffs",13,"Rectification","log");
featureVector(outputIndex.mfcc,:) = melcc;
[melccDelta,state.mfccDelta] = audioDelta(melcc,9,state.mfccDelta);
featureVector(outputIndex.mfccDelta,:) = melccDelta;
[featureVector(outputIndex.mfccDeltaDelta,:),state.mfccDeltaDelta] = audioDelta(melccDelta,9,state.mfccDeltaDelta);
end

function props = getProps(dataType)
props.Window = cast([0;3.764908042774850471801073581446e-05;0.00015059065189787501637397326703649;0.00033880770582522812262027400720399;0.00060227189741379749676752908271737;0.00094094354992541040516584871511441;0.0013547716606548965145861984638032;0.0018436939086109993546358509775018;0.0024076366639015356341246842930559;0.0030465149988219697441138578142272;0.0037602327006450164681439218838932;0.0045486822861099951431640420196345;0.0054117450176094927805081624683226;0.0063492909210707826339614712196635;0.0073611788055293891908092973608291;0.0084472562843918574948531841073418;0.0096073597983847847103788808453828;0.010841314640186172635338834879803;0.012148934980735714983524076160393;0.0135300238972199116105343819072;0.014984373402728012880658070571371;0.016511764477573964704504305700539;0.018111967102280079888743102856097;0.019784740292217106727434838830959;0.021529832133895587809035987447714;0.023346979822903068946260418670136;0.025235909703481662624824366503162;0.027196337309739360144078545999946;0.029227967408489596845555524851079;0.031330494043712520113587061132421;0.0335036005826305216537264186627;0.035746959763392205378096377899055;0.038060233744356630758431947469944;0.040443074154971114797518794148345;0.042895122148234654524401321395999;0.045416008454738809874129401578102;0.048005353438278330902022617010516;0.050662767153023091637464858649764;0.053387849402242337770729818657856;0.056180189798573032522455150683527;0.059039367825822475221997365224524;0.061964952902296699388529077623389;0.064956504445644269729598363483092;0.068013571939206651784104451508028;0.071135694999863940957141039689304;0.07432240344736740222941762112896;0.077573217375146441554534249007702;0.080887647222580960626459045670344;0.084265193848727382164298660427448;0.087705348607487354506417887023417;0.091207593424208144305964651721297;0.094771400873702615896831957797986;0.098396234259677528566356841110974;0.1020815476955582168372416163038;0.10582678618669683068276299309218;0.10963138571395275588926665477629;0.11349477331863150331159317829588;0.11741636718877052070197919420025;0.12139557674675771625771858452936;0.12543180273827031490085914811061;0.12952443732252039154673184384592;0.13367286416379359215156341633701;0.1378764585242664986175498142984;0.14213458735809070265787568132509;0.14644660940672621363134453531529;0.1508118752955135422055832350452;0.15522972763146652974697303761786;0.159699501102273433428280213775;0.16422052257649077944279270013794;0.16879211120491410813571064863936;0.17341357852311156673152936491533;0.17808422855510425142355757088808;0.18280335791817725610286515802727;0.1875702559288067727827353792236;0.19238420470968659037325210192648;0.19724447929783722743835028268222;0.20215034775378326603600953603745;0.2071010712717805679616844827251;0.21209590429107733067226604362077;0.21713409460819338425707769602013;0.22221488349019885566448806457629;0.22733750578897676808409755722096;0.23250119005645136782689519350242;0.23770515866076558086916747924988;0.24294862790338916935795054996561;0.248230808137141212288412361886;0.25355090388510792553944384053466;0.25890811396043855729942606558325;0.26430163158700109571341840819514;0.2697306445208800251833736183471;0.27519433517269670241844892188965;0.28069188073073614297925360006047;0.28622245328485890203396024844551;0.29178521995118134046975910678157;0.29737934299750506950132944439247;0.3030039799694759228287921359879;0.30865828381745508135480804412509;0.31434140302408120071220309910132;0.32005248173250588905602853628807;0.32579065987528277315021796312067;0.33155507330389000220094430915196;0.33734485391886848137943388792337;0.34315912980055418568525738010067;0.34899702534038590240328403524472;0.354857661372768862229065689462;0.36074015530747349789209010850755;0.36664362126255078955239241622621;0.37256717019774265864384688029531;0.37850991004836798126120811502915;0.38447094585966434809876091094338;0.39044937992156514283692558819894;0.39644431190389073371704853343545;0.40245483899193584820253022371617;0.40848005602242948297586622175004;0.41451905561984930814745098359708;0.42057092833306930490522290710942;0.42663476277231915378962412432884;0.43270964574643688838051502898452;0.43879466240039188829058502960834;0.44488889635305839398426996922353;0.45099142983521961491888419004681;0.4571013438277800600140210462996;0.46321771820016627296823230608425;0.46933963184889565534163580196036;0.47546616283629095089935390205937;0.481596388529320518223642011435;0.48772938573854385246875153825385;0.49386423085714004077573235917953;0.49999999999999994448884876874217;0.50613576914285995922426764082047;0.51227061426145603650894599923049;0.518403611470679481776357988565;0.52453383716370904910064609794063;0.53066036815110428914721296678181;0.53678228179983367152061646265793;0.54289865617221988447482772244257;0.54900857016478032956996457869536;0.55511110364694149499342756826081;0.56120533759960811170941497039166;0.56729035425356300059718250849983;0.57336523722768084621037587567116;0.57942907166693058407247463037493;0.58548094438015063634139778514509;0.59151994397757046151298254699213;0.59754516100806409628631854502601;0.60355568809610926628295146656455;0.60955062007843485716307441180106;0.61552905414033554087893662654096;0.6214900899516319077164894224552;0.62743282980225723033385065718903;0.63335637873744921044760758377379;0.63925984469252650210790989149245;0.64514233862723102674863184802234;0.65100297465961398657441350223962;0.65684087019944570329244015738368;0.66265514608113140759826364956098;0.66844492669610999779905569084804;0.67420934012471722684978203687933;0.67994751826749411094397146371193;0.68565859697591879928779690089868;0.69134171618254480762288949335925;0.69699602003052396614890540149645;0.70262065700249487498751932434971;0.70821478004881854850793843070278;0.71377754671514093143258605778101;0.71930811926926363497614147490822;0.72480566482730335309270230936818;0.73026935547912008583892884416855;0.73569836841299884877543036054703;0.7410918860395613316782714719011;0.74644909611489196343825369694969;0.75176919186285873220043640685617;0.75705137209661077513089821877657;0.76229484133923430810853005823446;0.7674988099435484656396511127241;0.77266249421102317640475121152122;0.77778511650980097780205824165023;0.78286590539180656023177107272204;0.78790409570892272483888518763706;0.7928989287282194320383155172749;0.79784965224621662294168800144689;0.80275552070216271705049848605995;0.80761579529031335411559666681569;0.81242974407119317170611338951858;0.81719664208182263287483237945708;0.82191577144489569306529119785409;0.82658642147688832224616817256901;0.83120788879508600288659181387629;0.83577947742350922055720729986206;0.84030049889772651106056855496718;0.84477027236853352576417819363996;0.84918812470448634677211430243915;0.85355339059327373085750423342688;0.85786541264190929734212431867491;0.86212354147573333484899649192812;0.86632713583620635233728535240516;0.87047556267747938640866323112277;0.87456819726172962958798962063156;0.8786044232532423947645838779863;0.88258363281122953480917203705758;0.88650522668136844117725559044629;0.89036861428604718859958211396588;0.89417321381330316931723700690782;0.89791845230444167214045592118055;0.9016037657403224159224919276312;0.90522859912629738410316804220201;0.90879240657579174467173288576305;0.91229465139251253447127965046093;0.91573480615127267334685257083038;0.91911235277741898386238972307183;0.9224267826248535584454657509923;0.92567759655263259777058237887104;0.92886430500013594802055649779504;0.93198642806079334821589554849197;0.93504349555435561924809917400125;0.93803504709770324510031969111878;0.94096063217417746926685140351765;0.94381981020142691196639361805865;0.94661215059775760671811895008432;0.94933723284697690836253514135024;0.95199464656172172460912861424731;0.9545839915452611901258705984219;0.957104877851765345475598678604;0.95955692584502894071363243710948;0.96193976625564336924156805253006;0.96425304023660773911075239084312;0.96649639941736942283512235007947;0.96866950595628742437526170760975;0.97077203259151034764329324389109;0.9728036626902605288336189914844;0.97476409029651833737517563349684;0.97665302017709687554258835007204;0.97847016786610441219096401255229;0.98021525970778289327256516116904;0.98188803289771997562240812840173;0.98348823552242603529549569429946;0.98501562659727204263049316068646;0.98646997610277997736716315557715;0.98785106501926422950532469258178;0.98915868535981377185350993386237;0.99039264020161521528962111915462;0.99155274371560819801629804715049;0.99263882119447055529803947138134;0.99365070907892916185488729752251;0.9945882549823905627306430687895;0.99545131771388994934568472672254;0.99623976729935503904300730937393;0.9969534850011780857670373734436;0.99759236333609835334357285319129;0.99815630609138894513421291776467;0.9986452283393451034854138015362;0.99905905645007453408368292002706;0.99939772810258620250323247091728;0.99966119229417471636622849473497;0.99984940934810206947247479547514;0.99996235091957230700643322052201;1;0.99996235091957230700643322052201;0.99984940934810206947247479547514;0.99966119229417471636622849473497;0.99939772810258620250323247091728;0.99905905645007453408368292002706;0.9986452283393451034854138015362;0.99815630609138894513421291776467;0.99759236333609835334357285319129;0.9969534850011780857670373734436;0.99623976729935503904300730937393;0.99545131771388994934568472672254;0.9945882549823905627306430687895;0.99365070907892916185488729752251;0.99263882119447055529803947138134;0.99155274371560819801629804715049;0.99039264020161521528962111915462;0.98915868535981377185350993386237;0.98785106501926422950532469258178;0.98646997610277997736716315557715;0.98501562659727204263049316068646;0.98348823552242603529549569429946;0.98188803289771997562240812840173;0.98021525970778289327256516116904;0.97847016786610441219096401255229;0.97665302017709687554258835007204;0.97476409029651833737517563349684;0.9728036626902605288336189914844;0.97077203259151034764329324389109;0.96866950595628742437526170760975;0.96649639941736942283512235007947;0.96425304023660773911075239084312;0.96193976625564336924156805253006;0.95955692584502894071363243710948;0.957104877851765345475598678604;0.9545839915452611901258705984219;0.95199464656172172460912861424731;0.94933723284697690836253514135024;0.94661215059775760671811895008432;0.94381981020142691196639361805865;0.94096063217417746926685140351765;0.93803504709770324510031969111878;0.93504349555435561924809917400125;0.93198642806079334821589554849197;0.92886430500013594802055649779504;0.92567759655263259777058237887104;0.9224267826248535584454657509923;0.91911235277741898386238972307183;0.91573480615127267334685257083038;0.91229465139251253447127965046093;0.90879240657579174467173288576305;0.90522859912629738410316804220201;0.9016037657403224159224919276312;0.89791845230444167214045592118055;0.89417321381330316931723700690782;0.89036861428604718859958211396588;0.88650522668136844117725559044629;0.88258363281122953480917203705758;0.8786044232532423947645838779863;0.87456819726172962958798962063156;0.87047556267747938640866323112277;0.86632713583620635233728535240516;0.86212354147573333484899649192812;0.85786541264190929734212431867491;0.85355339059327373085750423342688;0.84918812470448634677211430243915;0.84477027236853352576417819363996;0.84030049889772651106056855496718;0.83577947742350922055720729986206;0.83120788879508600288659181387629;0.82658642147688832224616817256901;0.82191577144489569306529119785409;0.81719664208182263287483237945708;0.81242974407119317170611338951858;0.80761579529031335411559666681569;0.80275552070216271705049848605995;0.79784965224621662294168800144689;0.7928989287282194320383155172749;0.78790409570892272483888518763706;0.78286590539180656023177107272204;0.77778511650980097780205824165023;0.77266249421102317640475121152122;0.7674988099435484656396511127241;0.76229484133923430810853005823446;0.75705137209661077513089821877657;0.75176919186285873220043640685617;0.74644909611489196343825369694969;0.7410918860395613316782714719011;0.73569836841299884877543036054703;0.73026935547912008583892884416855;0.72480566482730335309270230936818;0.71930811926926363497614147490822;0.71377754671514093143258605778101;0.70821478004881854850793843070278;0.70262065700249487498751932434971;0.69699602003052396614890540149645;0.69134171618254480762288949335925;0.68565859697591879928779690089868;0.67994751826749411094397146371193;0.67420934012471722684978203687933;0.66844492669610999779905569084804;0.66265514608113140759826364956098;0.65684087019944570329244015738368;0.65100297465961398657441350223962;0.64514233862723102674863184802234;0.63925984469252650210790989149245;0.63335637873744921044760758377379;0.62743282980225723033385065718903;0.6214900899516319077164894224552;0.61552905414033554087893662654096;0.60955062007843485716307441180106;0.60355568809610926628295146656455;0.59754516100806409628631854502601;0.59151994397757046151298254699213;0.58548094438015063634139778514509;0.57942907166693058407247463037493;0.57336523722768084621037587567116;0.56729035425356300059718250849983;0.56120533759960811170941497039166;0.55511110364694149499342756826081;0.54900857016478032956996457869536;0.54289865617221988447482772244257;0.53678228179983367152061646265793;0.53066036815110428914721296678181;0.52453383716370904910064609794063;0.518403611470679481776357988565;0.51227061426145603650894599923049;0.50613576914285995922426764082047;0.49999999999999994448884876874217;0.49386423085714004077573235917953;0.48772938573854385246875153825385;0.481596388529320518223642011435;0.47546616283629095089935390205937;0.46933963184889565534163580196036;0.46321771820016627296823230608425;0.4571013438277800600140210462996;0.45099142983521961491888419004681;0.44488889635305839398426996922353;0.43879466240039188829058502960834;0.43270964574643688838051502898452;0.42663476277231915378962412432884;0.42057092833306930490522290710942;0.41451905561984930814745098359708;0.40848005602242948297586622175004;0.40245483899193584820253022371617;0.39644431190389073371704853343545;0.39044937992156514283692558819894;0.38447094585966434809876091094338;0.37850991004836798126120811502915;0.37256717019774265864384688029531;0.36664362126255078955239241622621;0.36074015530747349789209010850755;0.354857661372768862229065689462;0.34899702534038590240328403524472;0.34315912980055418568525738010067;0.33734485391886848137943388792337;0.33155507330389000220094430915196;0.32579065987528277315021796312067;0.32005248173250588905602853628807;0.31434140302408120071220309910132;0.30865828381745508135480804412509;0.3030039799694759228287921359879;0.29737934299750506950132944439247;0.29178521995118134046975910678157;0.28622245328485890203396024844551;0.28069188073073614297925360006047;0.27519433517269670241844892188965;0.2697306445208800251833736183471;0.26430163158700109571341840819514;0.25890811396043855729942606558325;0.25355090388510792553944384053466;0.248230808137141212288412361886;0.24294862790338916935795054996561;0.23770515866076558086916747924988;0.23250119005645136782689519350242;0.22733750578897676808409755722096;0.22221488349019885566448806457629;0.21713409460819338425707769602013;0.21209590429107733067226604362077;0.2071010712717805679616844827251;0.20215034775378326603600953603745;0.19724447929783722743835028268222;0.19238420470968659037325210192648;0.1875702559288067727827353792236;0.18280335791817725610286515802727;0.17808422855510425142355757088808;0.17341357852311156673152936491533;0.16879211120491410813571064863936;0.16422052257649077944279270013794;0.159699501102273433428280213775;0.15522972763146652974697303761786;0.1508118752955135422055832350452;0.14644660940672621363134453531529;0.14213458735809070265787568132509;0.1378764585242664986175498142984;0.13367286416379359215156341633701;0.12952443732252039154673184384592;0.12543180273827031490085914811061;0.12139557674675771625771858452936;0.11741636718877052070197919420025;0.11349477331863150331159317829588;0.10963138571395275588926665477629;0.10582678618669683068276299309218;0.1020815476955582168372416163038;0.098396234259677528566356841110974;0.094771400873702615896831957797986;0.091207593424208144305964651721297;0.087705348607487354506417887023417;0.084265193848727382164298660427448;0.080887647222580960626459045670344;0.077573217375146441554534249007702;0.07432240344736740222941762112896;0.071135694999863940957141039689304;0.068013571939206651784104451508028;0.064956504445644269729598363483092;0.061964952902296699388529077623389;0.059039367825822475221997365224524;0.056180189798573032522455150683527;0.053387849402242337770729818657856;0.050662767153023091637464858649764;0.048005353438278330902022617010516;0.045416008454738809874129401578102;0.042895122148234654524401321395999;0.040443074154971114797518794148345;0.038060233744356630758431947469944;0.035746959763392205378096377899055;0.0335036005826305216537264186627;0.031330494043712520113587061132421;0.029227967408489596845555524851079;0.027196337309739360144078545999946;0.025235909703481662624824366503162;0.023346979822903068946260418670136;0.021529832133895587809035987447714;0.019784740292217106727434838830959;0.018111967102280079888743102856097;0.016511764477573964704504305700539;0.014984373402728012880658070571371;0.0135300238972199116105343819072;0.012148934980735714983524076160393;0.010841314640186172635338834879803;0.0096073597983847847103788808453828;0.0084472562843918574948531841073418;0.0073611788055293891908092973608291;0.0063492909210707826339614712196635;0.0054117450176094927805081624683226;0.0045486822861099951431640420196345;0.0037602327006450164681439218838932;0.0030465149988219697441138578142272;0.0024076366639015356341246842930559;0.0018436939086109993546358509775018;0.0013547716606548965145861984638032;0.00094094354992541040516584871511441;0.00060227189741379749676752908271737;0.00033880770582522812262027400720399;0.00015059065189787501637397326703649;3.764908042774850471801073581446e-05],dataType);
props.SampleRate = cast(16000,dataType);
props.FFTLength = uint16(512);
props.NumFeatures = uint8(39);
end

function [config, outputIndex] = getConfig(dataType, props)
powerNormalizationFactor = 1/(sum(props.Window)^2);

config.OneSidedSpectrumBins = uint16(1:257);

melFilterbank = designAuditoryFilterBank(props.SampleRate, ...
    "FrequencyScale","mel", ...
    "FFTLength",props.FFTLength, ...
    "OneSided",true, ...
    "FrequencyRange",[0 8000], ...
    "NumBands",32, ...
    "Normalization","bandwidth", ...
    "FilterBankDesignDomain","linear");
melFilterbank = melFilterbank*powerNormalizationFactor;
config.melSpectrum.FilterBank = cast(melFilterbank,dataType);

outputIndex.mfcc = uint8(1:13);
outputIndex.mfccDelta = uint8(14:26);
outputIndex.mfccDeltaDelta = uint8(27:39);
end

function state = getState(dataType, numChannels)
state.NumChannels = numChannels;
state.mfccDelta = zeros(8,13,numChannels,dataType);
state.mfccDeltaDelta = zeros(8,13,numChannels,dataType);
end

function state = reset(state)
state.mfccDelta(:,:,:) = 0;
state.mfccDeltaDelta(:,:,:) = 0;
end
