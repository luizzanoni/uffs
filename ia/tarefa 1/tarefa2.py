from tokenize import String
import numpy as np

def sigmoid(h):
    return 1/(1+np.exp(-h))

def sigmoin_prime(h):
    return sigmoid(h) * (1 - sigmoid(h))

entrada = np.array([1, 2, 3, 4])
saida = np.array(0.5)
peso = np.array([0.5, -0.5, 0.3, 0.1])
taxa_de_aprendizagem = 0.5
bias = -0.1


#simplificação do que é feito no métood abaixo
#h = entrada[0]*peso[0] + entrada[1]*peso[1] + bias

h = np.dot(entrada, peso) + bias

saida_neural = sigmoid(h)
print("saída neural: ")
print(saida_neural)

erro_rede = saida - saida_neural
print("erro da rede: ")
print(erro_rede)

termo_erro = erro_rede * sigmoin_prime(h)
print("termo de erro: ")
print(termo_erro)

variacao_peso = taxa_de_aprendizagem * termo_erro * entrada
print("variação dos pesos: ")
print(variacao_peso)