// Faça um programa que peça um número e imprima os números de 1 até o número
// informado. Sendo que, quando chegar na metade da impressão, mostrar a mensagem
// Metade (a metade não precisa ser exata). Exemplos:
// Número: 6 Número: 7 ou Número: 7

#include <stdio.h>

int main() {
    int numero;

    printf("Digite um número: ");
    scanf("%d", &numero);

    for (int i = 1; i <= numero; i++) {
        printf("%d\n", i);
        if (i == (numero + 1) / 2) {
            printf("Metade\n");
        }
    }
    return 0;
}
