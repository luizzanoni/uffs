// Antonio tem 1,50m e cresce 2cm por ano. Carlos tem 1,10m e cresce 3cm por ano.
// Fazer um programa que calcule quantos anos seriam necessários para que Carlos tivesse
// a mesma altura que Antonio. Supondo que os dois crescem todos os anos.

#include <stdio.h>

int main() {
  float alturaAntonio = 1.50;
  float alturaCarlos = 1.10;

  float crescimentoAntonio = 0.02;
  float crescimentoCarlos = 0.03;

  int anos = 0;

  while (alturaCarlos < alturaAntonio) {
    alturaAntonio += crescimentoAntonio;
    alturaCarlos += crescimentoCarlos;
    anos++;
  }
  printf("Levaria %d anos para que Carlos tivesse a mesma altura que Antonio.\n", anos);
  return 0;
}