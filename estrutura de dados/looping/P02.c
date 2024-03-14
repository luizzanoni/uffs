// Faça um programa que simule a multiplicação por meio de adições. Para tal serãoo
// pedidos os dois operandos. Por exemplo se for informado 3 e 4, deverá ser calculado,
// usando a soma, 3∗4, ou seja, 12. Este cálculo é feito somando o primeiro valor informado
// por ele mesmo o número de vezes representada pelo segundo número. Nesse exemplo, o
// três seria somado quatro vezes: 3+3+3+3, resultando 12.

#include <stdio.h>

int main() {
  int numeroA, numeroB, resultado = 0;

  printf("Digite o primeiro número: ");
  scanf("%d", &numeroA);

  printf("Digite o segundo número: ");
  scanf("%d", &numeroB);

  for (int i = 0; i < numeroB; i++) {
    resultado += numeroA;
  }

  printf("O resultado da multiplicação de %d por %d é: %d\n", numeroA, numeroB, resultado);

  return 0;
}