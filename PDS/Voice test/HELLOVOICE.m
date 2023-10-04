
[audioIn,fs] = audioread(fullfile("Mult Hello.wav"));
%图 plot
figure
t = (1/fs)*(0:length(audioIn)-1);
plot(t,audioIn);
grid on
xlabel("Time (s)")
title("Hello Signal")

[y,fs] = audioread("Mult Hello.wav");


load("KWSBaseline.mat","KWSBaseline")

fig = figure;
plot(t,[audioIn,KWSBaseline'])
grid on
xlabel("Time (s)")
legend("Speech","KWS Baseline",Location="southeast")
l = findall(fig,"type","line");
l(1).LineWidth = 2;
title("Validation Signal")