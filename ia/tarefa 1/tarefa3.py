from tokenize import String
import numpy as np

def sigmoid(h):
    return 1/(1+np.exp(-h))

def sigmoin_prime(h):
    return sigmoid(h) * (1 - sigmoid(h))

entrada = np.array([1, 2, 3, 4])
saida = np.array(0.5)
peso = np.array([0.5, -0.5, 0.3, 0.1])
#nessa taxa nescessita de apenas 17 iterações
taxa_de_aprendizagem = 0.5
bias = 0.5

epochs = 500
variacao_peso = 0
nro_iteracoes = 0
for e in range(epochs):
    nro_iteracoes += 1
    #simplificação do que é feito no métood abaixo
    #h = entrada[0]*peso[0] + entrada[1]*peso[1] + bias
    h = np.dot(entrada, peso) + bias

    saida_neural = sigmoid(h)
    erro_rede = saida - saida_neural
    termo_erro = erro_rede * sigmoin_prime(h)
    variacao_peso = taxa_de_aprendizagem * termo_erro * entrada
    peso = peso + variacao_peso

    if(erro_rede == 0.0):
        print(nro_iteracoes)
        break
    
    print(erro_rede)
    