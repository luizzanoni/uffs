// Faça um programa que peça uma valor e imprima a soma de todos os números de 1 até
// o valor informado. Por exemplo, se o valor informado for 6, o resultado será 21, ou seja,
// 1 + 2 + 3 + 4 + 5 + 6.

#include <stdio.h>

int main() {
    int numero, soma = 0;

    printf("Digite um número: ");
    scanf("%d", &numero);

    for (int i = 1; i <= valor; i++) {
        soma += i;
    }

    printf("A soma de todos os números de 1 até %d é: %d\n", numero, soma);

    return 0;
}