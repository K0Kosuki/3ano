import scipy.io.wavfile as wf
import python_speech_features as sf
import numpy as np
import wave as we
import hmmlearn as hl
import joblib
import os

from Train import search_file,get_matrix,model_pred

test_sample = search_file('./Dataset/testing')
print(test_sample)
test_x,test_y = get_matrix(test_sample)
models = joblib.load(filename='wave5.ckpt')
pred_test_y = model_pred(test_x,test_y,models)

print(pred_test_y)
print(test_y)