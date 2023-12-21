import scipy.io.wavfile as wf
import python_speech_features as sf
import numpy as np
import wave as we
import hmmlearn.hmm as hl
import joblib
import os

def search_file(directory: object) -> object:
    directory = os.path.normpath(directory)
    objects = {}
    for curdir, subdir, files in os.walk(directory):
        for file in files:
            if file.endswith('.wav'):
                label = curdir.split(os.path.sep)[-1]
                if label not in objects:
                    objects[label] = []
                    path = os.path.join(curdir,file)
                    objects[label].append(path)
    return objects



def get_matrix(train_sample):
    train_x, train_y = [], []


  
    for label,filenames in train_sample.items():
        mfccs = np.array([])
        for filename in filenames:
            sample_rate , sigs = wf.read(filename)
            mfcc = sf.mfcc(sigs,sample_rate)
            if len(mfccs) == 0:
                mfccs=mfcc
            else:
                mfccs = np.append(mfccs,mfcc,axis=0)
        train_x.append(mfccs)
        train_y.append(label)
    return train_x, train_y

def model_train(train_x, train_y):
    models = {}
    for mfccs,label in zip(train_x,train_y):
        model = hl.GMMHMM(n_components=4,covariance_type='diag',n_iter=1000)
        models[label] = model.fit(mfccs)
    return models

def model_pred(test_x, test_y, models):
    pred_test_y = []
    for mfccs in test_x:
        best_score, best_label = None, None
        for label, model in models.items():
            score = model.score(mfccs)
            if (best_score is None) or (score > best_score):
                best_score = score
                best_label = label
        pred_test_y.append(best_label)
    return pred_test_y





def train():
    train_samples = search_file('./Dataset/training')
   # print(train_samples)
    #print(train_samples['Yes'])
    train_x, train_y = get_matrix(train_samples)
    models = model_train(train_x, train_y)
    joblib.dump(value = models, filename="wave3.ckpt")

def test():
    test_sample = search_file('./Dataset/testing')
    print(test_sample)
    test_x,test_y = get_matrix(test_sample)
    models = joblib.load(filename='wave3.ckpt')
    pred_test_y = model_pred(test_x,test_y,models)

    print(pred_test_y)
    print(test_y)

train()
test()