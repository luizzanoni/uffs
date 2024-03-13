// Faça um programa que peça o número de horas trabalhadas e o valor da hora de um determinado funcionário. Em seguida, calcule o salário do funcionário. 
// Caso o funcionário tenha trabalhado mais de 200 horas, o salário final é acrescido de 5%. Exemplos de execução:
// 	Horas trabalhadas: 120				Horas trabalhadas: 210
// 	Valor da hora: 100,00				Valor da hora: 50.00
// 	Salário: 12000.00					Salário: 11025.00



#include <stdio.h>

int main() {
    float horas_trabalhadas, valor_hora, salario, bonus;

    printf("Digite o número de horas trabalhadas: ");
    scanf("%f", &horas_trabalhadas);

    printf("Digite o valor da hora de trabalho: ");
    scanf("%f", &valor_hora);

    salario = horas_trabalhadas * valor_hora;

    if (horas_trabalhadas > 200) {
        bonus = salario * 0.05;  
        salario += bonus;
    }

    printf("O salário do funcionário é: R$ %.2f\n", salario);

    return 0;
}
