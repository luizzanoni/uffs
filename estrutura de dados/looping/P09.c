// Fazer um programa que simule um campeonato com 4 times (A, B, C e D). Sera pedido
// o nome do primeiro time com os gols marcados e o nome do segundo time com os gols
// marcados. Este processo se repetirá até que seja informado um valor diferente de A, B, C
// ou D para o primeiro time. Ao final deverá ser apresentado o n´número de pontos de cada
// time e o campeão. Caso houver empate na primeira colocação informar que não houve
// campeão. Calculo dos pontos: vitória 3 pontos, empate 1 ponto e derrota 0 ponto.
// Exemplo:
// Time: A
// Gols: 2
// Time: B
// Gols: 1
// Time: C
// Gols: 2
// Time: A
// Gols: 4
// Time: X ← valor diferente de A, B, C ou D, então finaliza
// Campeão: A
// A: 6 pontos
// B: 0 pontos
// C: 0 pontos
// D: 0 pontos

#include <stdio.h>
#include <string.h>

#define MAX_TIMES 4

typedef struct {
    char nome;
    int pontos;
} Time;

void inicializarTimes(Time times[]) {
    for (int i = 0; i < MAX_TIMES; i++) {
        times[i].nome = 'A' + i;
        times[i].pontos = 0;
    }
}

int encontrarIndiceTime(char nome, Time times[]) {
    for (int i = 0; i < MAX_TIMES; i++) {
        if (times[i].nome == nome) {
            return i;
        }
    }
    return -1;
}

void atualizarPontuacao(int indiceTime1, int indiceTime2, int golsTime1, int golsTime2, Time times[]) {
    if (golsTime1 > golsTime2) {
        times[indiceTime1].pontos += 3; // Vitória do time 1
    } else if (golsTime1 < golsTime2) {
        times[indiceTime2].pontos += 3; // Vitória do time 2
    } else {
        times[indiceTime1].pontos += 1; // Empate
        times[indiceTime2].pontos += 1; // Empate
    }
}

int main() {
    Time times[MAX_TIMES];
    char nomeTime1, nomeTime2;
    int golsTime1, golsTime2;

    inicializarTimes(times);

    while (1) {
        printf("Time: ");
        scanf(" %c", &nomeTime1);

        // Verifica se o nome do time é válido
        if (nomeTime1 < 'A' || nomeTime1 > 'D') {
            break;
        }

        printf("Gols: ");
        scanf("%d", &golsTime1);

        printf("Time: ");
        scanf(" %c", &nomeTime2);

        printf("Gols: ");
        scanf("%d", &golsTime2);

        int indiceTime1 = encontrarIndiceTime(nomeTime1, times);
        int indiceTime2 = encontrarIndiceTime(nomeTime2, times);

        if (indiceTime1 != -1 && indiceTime2 != -1) {
            atualizarPontuacao(indiceTime1, indiceTime2, golsTime1, golsTime2, times);
        }
    }

    // Encontra o time com mais pontos
    int maxPontos = 0;
    char campeao = ' ';
    int empate = 0;

    for (int i = 0; i < MAX_TIMES; i++) {
        if (times[i].pontos > maxPontos) {
            maxPontos = times[i].pontos;
            campeao = times[i].nome;
            empate = 0;
        } else if (times[i].pontos == maxPontos) {
            empate = 1;
        }
    }

    // Imprime os resultados
    for (int i = 0; i < MAX_TIMES; i++) {
        printf("%c: %d pontos\n", times[i].nome, times[i].pontos);
    }

    if (empate) {
        printf("Não houve campeão\n");
    } else {
        printf("Campeão: %c\n", campeao);
    }

    return 0;
}
