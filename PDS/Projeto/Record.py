import pyaudio
import wave
import matplotlib.pyplot as plt
import numpy as np

FRAMES_PER_BUFFER = 3200
FORMAT = pyaudio.paInt16
CHANNELS = 1
RATE = 16000

pa = pyaudio.PyAudio()

stream = pa.open(
    format=FORMAT,
    channels=CHANNELS,
    rate=RATE,
    input=True,
    frames_per_buffer=FRAMES_PER_BUFFER
)

print ('Recording......')

seconds = 1.7
frames = []
second_tracking = 0
second_count = 0
for i in range(0, int(RATE / FRAMES_PER_BUFFER * seconds)):
    data = stream.read(FRAMES_PER_BUFFER)
    frames.append(data)
    second_tracking += 1
    if second_tracking == RATE / FRAMES_PER_BUFFER:
        second_count += 1
        second_tracking = 0
        print(f'Time left: {seconds - second_count}')

stream.stop_stream()
stream.close()
pa.terminate()

obj = wave.open('No16.wav', 'wb')
obj.setnchannels(CHANNELS)  
obj.setsampwidth(pa.get_sample_size(FORMAT))  # 设置采样宽度
obj.setframerate(RATE)
obj.writeframes(b''.join(frames))
obj.close()
