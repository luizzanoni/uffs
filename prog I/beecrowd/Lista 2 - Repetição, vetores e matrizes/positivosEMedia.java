import java.io.IOException;
import java.util.Scanner;

public class positivosEMedia {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        int contaPositivos = 0;
        double somaPositivos = 0.0;
        
        for (int i = 0; i < 6; i++) {
            double value = scanner.nextDouble();
            
            if (value > 0) {
                contaPositivos++;
                somaPositivos += value;
            }
        }
        
        scanner.close();
        
        System.out.println(contaPositivos + " valores positivos");
        
        if (contaPositivos > 0) {
            double valFinal = somaPositivos / contaPositivos;
            System.out.printf("%.1f%n", valFinal);
        }
    }
}
