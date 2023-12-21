import scipy.io.wavfile as wf
import python_speech_features as sf
import numpy as np
import matplotlib.pyplot as mp
import wave as we

filename = './Dataset/training/Steam/Steam6.wav'
Wave = we.open(filename)
print(filename)
a = Wave.getparams().nframes
print ('总数',a)
f = Wave.getparams().framerate
print ('频率',f)

samples_time = 1/f
time = a/f
print ('时间',time)
sample_rate, audio_sequence = wf.read(filename)

print('sp',sample_rate, audio_sequence)
x_seq = np.arange(0,time,samples_time)
print(x_seq,len(x_seq))
mp.plot(x_seq,audio_sequence, 'blue')
mp.xlabel('time(s)')
mp.show()

mfcc = sf.mfcc(audio_sequence,sample_rate)
print(mfcc.shape)
print(mfcc,len(mfcc),len(mfcc[0]))

mp.matshow(mfcc.T,cmap='gist_rainbow')
mp.show()
