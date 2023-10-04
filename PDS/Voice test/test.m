downloadFile = matlab.internal.examples.downloadSupportFile("audio","wav2vec2/wav2vec2-base-960.zip");
wav2vecLocation = fullfile(tempdir,"wav2vec");
unzip(downloadFile,wav2vecLocation)
addpath(wav2vecLocation)
