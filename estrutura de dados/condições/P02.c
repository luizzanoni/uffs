// Uma loja vende produtos à vista e a prazo (pagamento 30 dias depois da compra). À vista tem um desconto de 5% e a prazo um acréscimo de 10%. 
// Faça um programa em C que peça o preço do produto e a forma de pagamento: 1 para à vista e 2 para a prazo. Depois apresente o preço final do produto. Exemplos de execução:
// 	Preço do produto: 120.00				Preço do produto: 200.00
// 	Forma de pagamento: 1				Forma de pagamento: 2
// 	Preço a vista: 114.00				Preço a prazo: 220.00

#include <stdio.h>

int main() {
    float preco, precoFinal;
    int formaPagamento;

    printf("Digite o preço do produto: R$ ");
    scanf("%f", &preco);

    printf("Digite a forma de pagamento (1 - à vista, 2 - a prazo): ");
    scanf("%d", &formaPagamento);

    switch (formaPagamento) {
    case 1:
        precoFinal = preco * 0.95;
        break;
    case 2:
        precoFinal = preco * 1.1;
        break;
    default:
        printf("Forma de pagamento inválida!");
        return 1;
    }

    printf("O preço final do produto é: R$ %.2f\n", precoFinal);

    return 0;
}