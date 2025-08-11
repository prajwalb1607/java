import pandas as pd
import tensorflow as tf
import numpy as np
import cv2 as cv
import matplotlib.pyplot as plt
from tensorflow.python.keras.metrics import accuracy
mist = tf.keras.datasets.mnist

(x_train, y_train),(x_test,y_test)=mnist.load_data()

x_train = tf.keras.utils.normalize(x_train , axis = 1)
x_test = tf.keras.utils