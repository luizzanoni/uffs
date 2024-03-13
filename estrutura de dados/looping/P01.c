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
