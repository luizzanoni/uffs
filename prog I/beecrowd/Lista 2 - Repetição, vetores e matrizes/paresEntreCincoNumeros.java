import java.io.IOException;
import java.util.Scanner;

public class paresEntreCincoNumeros {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        int numerosAdicionados = 0;
        
        for (int i = 0; i < 5; i++) {
            int value = scanner.nextInt();

            if (value % 2 == 0){
                numerosAdicionados++;
            }
        }
        
        System.out.println(numerosAdicionados + "valores pares");
        scanner.close();
        
    }
}
