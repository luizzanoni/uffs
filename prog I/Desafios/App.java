import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de numeros inteiros: ");
        int quantidade = scanner.nextInt();
        int[] numeros = new int[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Continue informando os numeros: ");
            numeros[i] = scanner.nextInt();
        }

        scanner.close();

        if (quantidade > 0) {

            int menor = numeros[0];
            for (int i = 1; i < numeros.length; i++) {
                if (numeros[i] < menor) {
                    menor = numeros[i];
                }
            }

            int maior = numeros[0];
            for (int i = 1; i < numeros.length; i++) {
                if (numeros[i] > maior) {
                    maior = numeros[i];
                }
            }

            System.out.println("Menor numero: " + menor);
            System.out.println("Maior numero: " + maior);

            System.out.println("Primeiro numero informado: " + numeros[0]);
            System.out.println("Último numero informado: " + numeros[numeros.length - 1]);
        } else {
            System.out.println("Nenhum número informado.");
        }
    }
}
