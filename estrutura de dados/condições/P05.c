// Você vai fazer um programa para classificar os competidores segundo as suas posições. Foram criadas 5 classes: 
// Top 5 (1-5), Top 10 (6-10), Top 20 (11-20), Top 30 (21-30) e Top 100 (outras posições). 
// Faça um programa que peça a posição do competidor e indique a classe do mesmo. Exemplos de execução:
// 	Posição: 12		Posição: 5		Posição: 34
// 	Top 20		Top 5			Top 100

#include <stdio.h>

int main() {
  int posicao;

  printf("Digite a posição do competidor: ");
  scanf("%d", &posicao);

  if (posicao <= 5) {
    printf("Top 5");
  } else if (posicao <= 10) {
    printf("Top 10");
  } else if (posicao <= 20) {
    printf("Top 20");
  } else if (posicao <= 30) {
    printf("Top 30");
  } else {
    printf("Top 100");
  }

  return 0;
}