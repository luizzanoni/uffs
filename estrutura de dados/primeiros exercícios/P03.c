// Faça um programa que calcule a duração de um evento qualquer. Para tal, o programa pede a hora de início e hora de fim (sem os minutos), as horas serão informadas de 0 a 23. 
// Perceba que um evento pode começar em um dia e acabar em outro. Os eventos nunca terão duração de mais de 24 horas. Exemplos de execução:
// 	Início: 12			Início: 10			Início: 21
// 	Fim: 4			    Fim: 15			    Fim: 6
// 	Duração: 16 horas   Duração: 5 horas	Duração: 9 horas

#include <stdio.h>

int main() {
    int horaInicio, horaFim, duracao;

    printf("Digite a hora de início do evento (0-23): ");
    scanf("%d", &horaInicio);

    printf("Digite a hora de fim do evento (0-23): ");
    scanf("%d", &horaFim);

    if (horaFim >= horaInicio) {
    duracao = horaFim - horaInicio;
    } else {
    duracao = 24 - horaInicio + horaFim;
    }

    printf("A duração do evento é de %d horas\n", duracao);

    return 0;
}
