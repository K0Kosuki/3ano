
devices = audiodevinfo;
disp(devices.input);


recObj = audiorecorder;  % 创建音频录制对象
disp('开始录音...');
recordblocking(recObj, 2);  % 录制 2 秒钟的声音，可以根据需要调整持续时间
disp('录音完成.');

% 获取录制的音频数据
audioData = getaudiodata(recObj);

% 停止录制对象
stop(recObj);

filename = 'Yes2.wav';  % 指定保存的文件名
audiowrite(filename, audioData, recObj.SampleRate);  % 将录制的音频数据保存为 WAV 文件
disp(['音频已保存为 ' filename]);



[audioData,fs] = audioread("Yes2.wav");
soundsc(audioData,fs)

[y,fs] = audioread(filename);
t = seconds(0:1/fs:(size(y,1)-1)/fs);
plot(t,y)
title(filename)
xlabel("Time")
ylabel("Amplitude")
legend("Channel 1", "Channel 2")
xlim("tight")
ylim([-1 1])