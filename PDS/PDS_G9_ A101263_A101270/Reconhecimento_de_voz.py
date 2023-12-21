import pyaudio
import wave
import os
import scipy.io.wavfile as wavfile
import python_speech_features as sf
import joblib
import numpy as np
from scipy.signal import butter, lfilter
import time
FRAMES_PER_BUFFER = 3200
FORMAT = pyaudio.paInt16
CHANNELS = 1
RATE = 16000
RECORD_SECONDS = 1.7
WAVE_OUTPUT_FILENAME = "D:\\3Ano\\3ano\\PDS\\Ptosent\\Voice\\test\\test.wav"




print("              _______________MENU________________ ")
print("             |___________________________________|")
print("             |_____________APP LIST:_____________|")
print("             |                                   |")
print("             |             1: Excel              |")
print("             |             2: Word               |")
print("             |___________________________________|")
print("\t")
print("\t")
print("\t")
print("                     Recording in 1 second!                 ")

time.sleep(1)


pa = pyaudio.PyAudio()


stream = pa.open(format=FORMAT, channels=CHANNELS, rate=RATE, input=True, frames_per_buffer=FRAMES_PER_BUFFER)

print('Recording...')

frames = []

for i in range(0, int(RATE / FRAMES_PER_BUFFER * RECORD_SECONDS)):
    data = stream.read(FRAMES_PER_BUFFER)
    frames.append(data)


stream.stop_stream()
stream.close()
pa.terminate()

wave_file = wave.open(WAVE_OUTPUT_FILENAME, 'wb')
wave_file.setnchannels(CHANNELS)
wave_file.setsampwidth(pa.get_sample_size(FORMAT))
wave_file.setframerate(RATE)
wave_file.writeframes(b''.join(frames))
wave_file.close()

print('Recording finished')


rate, data = wavfile.read(WAVE_OUTPUT_FILENAME)
data = np.frombuffer(data, dtype=np.int16)



models = joblib.load('wave.ckpt')


rate, signal = wavfile.read(WAVE_OUTPUT_FILENAME)


mfcc_features = sf.mfcc(signal, rate)


best_score, best_label = None, None
for label, model in models.items():
    score = model.score(mfcc_features)
    if best_score is None or score > best_score:
        best_score = score
        best_label = label

print(f'Predicted Word: {best_label}')



stream.stop_stream()
stream.close()
pa.terminate()


print(f'Predicted Word: {best_label}')


if best_label == 'Excel':
    print('Detected "Excel". Do you want to launch Excel? Please say "Yes" to launch or "No" to cancel.')
    print("\t")
    print("                     Recording in 1 second!                 ")
    print("\t")
    time.sleep(1)  

    
    pa = pyaudio.PyAudio()
    
   
    stream = pa.open(format=FORMAT, channels=CHANNELS, rate=RATE, input=True, frames_per_buffer=FRAMES_PER_BUFFER)
    print('                 Listening for your response...              ')
    print("\t")
    frames = []
    for i in range(0, int(RATE / FRAMES_PER_BUFFER * RECORD_SECONDS)):
        data = stream.read(FRAMES_PER_BUFFER)
        frames.append(data)

    
    stream.stop_stream()
    stream.close()
    pa.terminate()

    
    RESPONSE_WAVE_OUTPUT_FILENAME = "D:\\3Ano\\3ano\\PDS\\Ptosent\\Voice\\response\\response.wav"
    wave_file = wave.open(RESPONSE_WAVE_OUTPUT_FILENAME, 'wb')
    wave_file.setnchannels(CHANNELS)
    wave_file.setsampwidth(pa.get_sample_size(FORMAT))
    wave_file.setframerate(RATE)
    wave_file.writeframes(b''.join(frames))
    wave_file.close()

    rate, signal = wavfile.read(RESPONSE_WAVE_OUTPUT_FILENAME)
    mfcc_features = sf.mfcc(signal, rate)
    response_label = None
    best_score = None  
    for label, model in models.items():
        score = model.score(mfcc_features)
        if response_label is None or score > best_score:
            best_score = score
            response_label = label

    print(f'Your response: {response_label}')
    
    
    if response_label.lower()== 'yes':
       
        os.system("start excel")
     
    elif response_label == 'No':
        print('Excel will not be launched.')
        print("\t")
    else:
        print('Sorry, I did not catch that. Please try again.')
        print("\t")
