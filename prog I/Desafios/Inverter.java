import java.util.Scanner;

public class Inverter {

    public static void main(String[] args) {

        int numeroInvertido = 0;
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o numero inteiro: ");
        int i = scanner.nextInt();

        while (i > 0) {
            int digito = i % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            i /= 10;
        }

        System.out.println("Número invertido: " + numeroInvertido);
        scanner.close();
    }
}
