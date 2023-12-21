import pyaudio
import wave
import numpy as np
from scipy.io import wavfile
from scipy.signal import butter, lfilter

def low_pass_filter(data, cutoff, fs, order=5):
    nyq = 0.5 * fs
    normal_cutoff = cutoff / nyq
    b, a = butter(order, normal_cutoff, btype='low', analog=False)
    y = lfilter(b, a, data)
    return y



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

print('Recording......')

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

# 保存原始音频
obj = wave.open('Word1.wav', 'wb')
obj.setnchannels(CHANNELS)
obj.setsampwidth(pa.get_sample_size(FORMAT))
obj.setframerate(RATE)
obj.writeframes(b''.join(frames))
obj.close()

# 读取音频文件
rate, data = wavfile.read('Word1.wav')
data = np.frombuffer(data, dtype=np.int16)

# 应用低通滤波器
filtered_data = low_pass_filter(data, cutoff=3000, fs=RATE)

# 保存处理后的音频
wavfile.write('Word1', RATE, filtered_data.astype(np.int16))
