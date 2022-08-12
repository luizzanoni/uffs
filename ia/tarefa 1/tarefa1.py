import numpy as np

def sigmoid(h):
    return 1/(1+np.exp(-h))

def sigmoin_prime(h):
    return sigmoid(h) * (1 - sigmoid(h))

entrada = np.array([0.7, -0.3])
peso = np.array([0.1, 0.1])
bias = -0.1

h = entrada[0]*peso[0] + entrada[1]*peso[1] + bias

saida_neuronio = sigmoid(h)
print(saida_neuronio)