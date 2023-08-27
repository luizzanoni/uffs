import java.io.IOException;
import java.util.Scanner;

public class Salario {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int idUser = scanner.nextInt();
        int nHoras = scanner.nextInt();
        float valHoras = scanner.nextFloat();

        float salario = nHoras * valHoras;

        System.out.println("NUMBER = " + idUser);
        System.out.printf("SALARY = U$ %.2f\n", salario);
        scanner.close();
    } 
}