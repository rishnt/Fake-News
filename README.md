# Fake-News

Fake News Detection Project
Overview
This project aims to detect fake news using machine learning techniques and provide an Android application interface for users to interact with the system. The project consists of two main modules: a Python machine learning code file and an Android application.

Python Machine Learning Code
The Python code file, named create_machine_learning_code.py, contains the implementation of the machine learning model used for fake news detection. It utilizes various natural language processing techniques and classification algorithms to identify fake news articles. This module is responsible for training the model, testing its accuracy, and saving the trained model for later use.

Android Application
The Android application provides a user-friendly interface for users to input news articles and receive predictions on their authenticity. The project includes the following sub-files within the src directory:

.gitignore: This file specifies the files and directories that should be ignored by version control systems like Git. It typically includes build files, temporary files, and sensitive information that shouldn't be committed.

build.gradle: This file contains the build configuration for the Android application. It defines the project dependencies, build settings, and other configuration options required for building the app.

proguard-rules.pro: This file contains the ProGuard rules for obfuscating and optimizing the Android application's code. ProGuard helps reduce the size of the APK and obfuscates the code to make reverse engineering more difficult.

Usage
To use this project, follow these steps:

Execute the create_machine_learning_code.py file to train and save the machine learning model.
Build and run the Android application on an Android device or emulator.
Input a news article into the Android application to receive a prediction on its authenticity.


Dependencies
The project relies on the following dependencies:

implementation 'androidx.appcompat:appcompat:1.6.1'
    implementation 'com.google.android.material:material:1.8.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
    testImplementation 'junit:junit:4.13.2'
    androidTestImplementation 'androidx.test.ext:junit:1.1.5'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.5.1'
    implementation 'com.github.bumptech.glide:glide:4.12.0'
    implementation 'com.squareup.retrofit2:retrofit:2.9.0'
    implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
    implementation 'org.tensorflow:tensorflow-lite-task-vision-play-services:0.4.2'
    implementation 'com.google.android.gms:play-services-tflite-gpu:16.1.0'

Python: 
nltk library:
from nltk.corpus import stopwords: Required for accessing the stopwords corpus to remove common words from text data.
from nltk.stem.porter import PorterStemmer: Used for stemming words to their base form in text data preprocessing.

sklearn library:
from sklearn.feature_extraction.text import TfidfVectorizer: Used for converting text data into a numerical representation using the TF-IDF (Term Frequency-Inverse Document Frequency) algorithm.
from sklearn.model_selection import train_test_split: Required for splitting the dataset into training and testing sets for model evaluation.
from sklearn.linear_model import LogisticRegression: Used for implementing the logistic regression algorithm for classification.
from sklearn.metrics import accuracy_score: Used to calculate the accuracy of the machine learning model.
Make sure to install the necessary dependencies by using a package manager like pip or conda before running the Python code.

Android: [insert required Android dependencies]
Make sure to install the necessary dependencies before running the project.

Contributors
Feel free to reach out to the contributors for any questions or inquiries related to the project.



References
Shaikh, J., & Patil, R. (2020). Fake News Detection using Machine Learning. 2020 IEEE International Symposium on Sustainable Energy, Signal Processing and Cyber Security (iSSSC).
