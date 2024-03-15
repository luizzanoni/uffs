// Dada uma sequência de n números (um número menor ou igual à 0 finaliza a
// sequência), apresentar o porcentual de números informados que são maiores ou igual a
// 10 e menores ou igual a 20. Exemplo:
// Número: 5
// Número: 6
// Número: 11
// Número: 21
// Número: 0
// % entre 10 e 20: 50%

#include <stdio.h>

int main() {
    int num, count = 0, total = 0;

    printf("Digite uma sequência de números (um número menor ou igual a 0 finaliza a sequência):\n");

    do {
        scanf("%d", &num);
        if (num > 0) {
            total++;
            if (num >= 10 && num <= 20) {
                count++;
            }
        }
    } while (num > 0);

    if (total > 0) {
        printf("%% entre 10 e 20: %.2f%%\n", (float)count / total * 100);
    } else {
        printf("Nenhum número foi digitado.\n");
    }

    return 0;
}

// TENTEI DE TUDO E NÃO CONSEGUI FAZER FUNCIONAR COM AS SAÍDAS QUE O SENHOR DEU, ELAS FICAM EM 25%