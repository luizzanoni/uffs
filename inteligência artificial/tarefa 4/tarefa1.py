import numpy as np

def sigmoid(x):
    return 1/(1+np.exp(-x))

n_entrada = 3
n_camadas_ocultas = 4
n_saida = 2

entrada = np.array([1, 2, 3])
saida = np.array([0.25, -0.4])

pesos_camadas_oculta = np.array([
    [-0.02,  0.04, -0.08, 0.09],
    [ 0.15,  0.18,  0.07, 0.12],
    [-0.07,  0.04, -0.04, 0.01]
])

weights_hidden_out = np.array([
    [-0.18,  0.01],
    [-0.08,  0.05],
    [-0.04,  0.05],
    [-0.09,  0.87]
])

combinaco_linear = np.dot(entrada, pesos_camadas_oculta)
fun_ativacao = sigmoid(combinaco_linear)

combinacao_linear_oculta = np.dot(fun_ativacao, weights_hidden_out)
fun_ativacao_oculta = sigmoid(combinacao_linear_oculta)
print(fun_ativacao_oculta)


erro=saida-fun_ativacao_oculta
print(erro)