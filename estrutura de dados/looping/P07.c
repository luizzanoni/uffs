// Faça um programa que peça o salário e o número de filhos dos habitantes de uma
// região. Quando o salário informado for menor que zero, as entradas são finalizadas e
// serão apresentadas as médias salarial e de filhos informados. Exemplo:
// Salário: 1500
// Filhos: 2
// Salário: 3245
// Filhos: 2
// Salário: -1
// Média salários: 2372.5
// Média filhos: 2.0


#include <stdio.h>

int main() {
    float salario, total_salario = 0, media_salario;
    int filhos, total_filhos = 0, cont = 0;
    float media_filhos;

    printf("Digite o salário e o número de filhos dos habitantes de uma região (um salário menor que zero finaliza as entradas):\n");

    do {
        printf("Salário: ");
        scanf("%f", &salario);
        if (salario >= 0) {
            printf("Filhos: ");
            scanf("%d", &filhos);
            total_salario += salario;
            total_filhos += filhos;
            cont++;
        }
    } while (salario >= 0);

    if (cont > 0) {
        media_salario = total_salario / cont;
        media_filhos = (float)total_filhos / cont;
        printf("Média salários: %.2f\n", media_salario);
        printf("Média filhos: %.2f\n", media_filhos);
    } else {
        printf("Nenhum salário foi digitado.\n");
    }

    return 0;
}
