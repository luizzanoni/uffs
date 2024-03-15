// Um professor gostaria de ter um programa para calcular a média final de seus alunos.
// Para isso, ele informa a matrícula e as 5 notas que o alunos teve durante o semestre.
// Após informar as 5 notas, o programa imprime a matrícula do aluno e a média que obteve
// (média aritmética simples). Quando o professor digitar 0 o programa finaliza e apresenta a
// média geral da turma. Proibido colocar 5 scanf para pedir as notas. Exemplo:
// Matrícula: 22010
// Nota 1: 4
// Nota 2: 6
// Nota 3: 6
// Nota 4: 6
// Nota 5: 8
// Aluno: 22010 Média: 6.0
// Matrícula: 0
// Média geral da turma: 6.0

#include <stdio.h>

int main() {
  int matricula;
  float notas[5], somaNotas = 0.0, media = 0.0, mediaGeral = 0.0, contadorAlunos = 0.0;

  do {
    printf("\nMatrícula: ");
    scanf("%d", &matricula);

    if (matricula != 0) {
      somaNotas = 0.0;
      contadorAlunos++;

      for (int i = 0; i < 5; i++) {
        printf("Nota %d: ", i + 1);
        scanf("%f", &notas[i]);
        somaNotas += notas[i];
      }
      media = somaNotas / 5.0;

      printf("\nAluno: %d | Média: %.1f\n", matricula, media);
      mediaGeral += media;
    }
  } while (matricula != 0);
  
  if (contadorAlunos > 0) {
    mediaGeral /= contadorAlunos;
    printf("\nMédia geral da turma: %.1f\n", mediaGeral);
  }

  return 0;
}
