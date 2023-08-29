import java.io.IOException;
import java.util.Scanner;

public class validacaoNota {
    public static void main(String[] args) throws IOException {
       Scanner scanner = new Scanner(System.in);
        int notasValidas = 0;
        double somaNotas = 0;

        while (notasValidas < 2) {
            double nota = scanner.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("nota invalida");
            } else {
                somaNotas += nota;
                notasValidas++;
            }
        }

        double media = somaNotas / 2;
        System.out.printf("media = %.2f%n", media);
    }
}