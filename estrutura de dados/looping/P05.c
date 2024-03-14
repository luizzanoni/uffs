// Faça um programa para calcular o fatorial de um número dado. O fatorial de um número
// n é n × (n − 1) × (n − 2) × . . . × 1, por definição o fatorial de 0 e 1 é 1. Por exemplo, o
// fatorial de 5 é 120, ou seja, 5 × 4 × 3 × 2 × 1 (perceba que não é necessário fazer a última
// multiplicação já que 1 é o elemento neutro da multiplicação).

#include <stdio.h>

int main() {
    int numero;
    unsigned long long fatorial = 1;

    printf("Digite um número para calcular o fatorial: ");
    scanf("%d", &numero);

    if (numero < 0) {
        printf("Erro: Não é possível calcular o fatorial de um número negativo.\n");
    } else {
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        printf("O fatorial de %d é: %llu\n", numero, fatorial);
    }

    return 0;
}
