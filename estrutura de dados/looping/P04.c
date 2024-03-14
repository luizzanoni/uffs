// Construa um programa que simule uma calculadora simples. Primeiro é solicitada a
// operação desejada +, -, / ou *, em seguida os dois operandos. Como resultado, o
// programa mostra o resultado da operação. O Programa é finalizado quando a operação
// desejada for igual à @.

#include <stdio.h>

int main() {
    char operacao;
    float num1, num2, resultado;

    printf("Bem-vindo à calculadora simples!\n");

    do {
        printf("\nDigite a operação desejada (+, -, /, * ou @ para sair): ");
        scanf(" %c", &operacao);

        if (operacao == '@') {
            printf("Programa encerrado.\n");
            break;
        }

        printf("Digite o primeiro operando: ");
        scanf("%f", &num1);

        printf("Digite o segundo operando: ");
        scanf("%f", &num2);

        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                printf("Resultado: %.2f\n", resultado);
                break;
            case '-':
                resultado = num1 - num2;
                printf("Resultado: %.2f\n", resultado);
                break;
            case '*':
                resultado = num1 * num2;
                printf("Resultado: %.2f\n", resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    printf("Resultado: %.2f\n", resultado);
                } else {
                    printf("Erro: divisão por zero.\n");
                }
                break;
            default:
                printf("Operação inválida.\n");
        }

    } while (operacao != '@');

    return 0;
}
