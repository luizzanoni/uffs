// Sabendo que as faixas etárias para votação são: 18 a 70 anos voto obrigatório; 16, 17 e acima de 70 anos voto facultativo; 
// outras idades (ou seja, menor que 16 anos) não pode votar, crie um programa que processa essa verificação. Exemplos de execução:
// Idade: 20			Idade: 17			Idade: 12
// Voto obrigatório		Voto facultativo	Não pode votar

#include <stdio.h>

int main() {
  int idade;

  printf("Digite sua idade: ");
  scanf("%d", &idade);

  if (idade >= 18 && idade <= 70) {
    printf("Voto obrigatório!");
  } else if (idade >= 16 && idade <= 17) {
    printf("Voto facultativo!");
  } else if (idade >= 71) {
    printf("Voto facultativo!");
  } else {
    printf("Você não pode votar!");
  }

  return 0;
}