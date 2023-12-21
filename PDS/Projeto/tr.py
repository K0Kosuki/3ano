import os
import scipy.io.wavfile as wf
import python_speech_features as sf
import numpy as np
import joblib
from hmmlearn import hmm

def search_files(directory):
    # 初始化一个字典来保存分类标签和文件路径
    objects = {}
    # 遍历目录
    for curdir, subdirs, files in os.walk(directory):
        for file in files:
            if file.endswith('.wav'):
                label = curdir.split(os.path.sep)[-1]
                if label not in objects:
                    objects[label] = []
                path = os.path.join(curdir, file)
                objects[label].append(path)
    return objects

def extract_features(file_paths):
    features = []
    for file_path in file_paths:
        sample_rate, signal = wf.read(file_path)
        mfccs = sf.mfcc(signal, sample_rate)
        features.append(mfccs)
    return features

def train_model(features, labels):
    models = {}
    for mfccs, label in zip(features, labels):
        model = hmm.GMMHMM(n_components=4, covariance_type='diag', n_iter=1000)
        model.fit(mfccs)
        models[label] = model
    return models

def main():
    # 训练
    train_samples = search_files('path/to/training/data')
    train_features, train_labels = [], []
    for label, file_paths in train_samples.items():
        mfccs = extract_features(file_paths)
        train_features.extend(mfccs)
        train_labels.extend([label] * len(mfccs))

    models = train_model(train_features, train_labels)
    joblib.dump(models, 'models.pkl')

    # 测试
    test_samples = search_files('path/to/testing/data')
    test_features, test_labels = [], []
    for label, file_paths in test_samples.items():
        mfccs = extract_features(file_paths)
        test_features.extend(mfccs)
        test_labels.extend([label] * len(mfccs))

    models = joblib.load('models.pkl')
    # 假定每个测试样本都是单独的特征集
    predictions = [models[label].score(mfcc) for mfcc in test_features for label in models]

    # 打印预测结果
    print(predictions)

if __name__ == "__main__":
    main()
