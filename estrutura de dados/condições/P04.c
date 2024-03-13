// Faça um programa que peça 4 números inteiros. Em seguida, apresente quantos números informados são negativos e 
// quantos são positivos (considere o 0 como positivo). Exemplos de execução:
// 	N1: 12		N1: -1
// 	N2: 4		N2: -20
// 	N3: -3		N3: -7
// 	N4: 5		N4: -11
// 	3 (+) e 1 (-)	0 (+) e 4 (-)

#include <stdio.h>

int main() {
  int n1, n2, n3, n4, positivos, negativos;

  printf("Digite o primeiro número: ");
  scanf("%d", &n1);
  printf("Digite o segundo número: ");
  scanf("%d", &n2);
  printf("Digite o terceiro número: ");
  scanf("%d", &n3);
  printf("Digite o quarto número: ");
  scanf("%d", &n4);

  positivos = 0;
  negativos = 0;

  if (n1 >= 0) {
    positivos++;
  } else {
    negativos++;
  }
  if (n2 >= 0) {
    positivos++;
  } else {
    negativos++;
  }
  if (n3 >= 0) {
    positivos++;
  } else {
    negativos++;
  }
  if (n4 >= 0) {
    positivos++;
  } else {
    negativos++;
  }
  
  printf("%d (+) e %d (-)", positivos, negativos);

  return 0;
}
