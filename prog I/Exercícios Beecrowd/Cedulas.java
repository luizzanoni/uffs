import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Cedulas {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner scanner = new Scanner(System.in);
        
        int valCedulas[] = {100, 50, 20, 10, 5, 2, 1};
        int nCedulas[] = {0, 0, 0, 0, 0, 0, 0};
        int nMoney = scanner.nextInt();

        int restoDivisao = nMoney;
        for(int i = 0; i < valCedulas.length; i++){
            nCedulas[i] = restoDivisao / valCedulas[i];
            restoDivisao = restoDivisao % valCedulas[i];
        }
        System.out.println(nMoney);
        for(int i = 0; i < valCedulas.length; i++) System.out.printf("%d nota(s) de R$ %.2f\n", nCedulas[i], (float) valCedulas[i]);
        scanner.close();
    }
}