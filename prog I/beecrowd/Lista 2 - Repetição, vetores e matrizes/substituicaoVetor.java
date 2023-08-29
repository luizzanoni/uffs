import java.io.IOException;
import java.util.Scanner;

public class substituicaoVetor {
    public static void main(String[] args) throws IOException {
       Scanner scanner = new Scanner(System.in);
       int values[] = new int[10];

       for(int i = 0; i < 10; i++){
            values[i] = scanner.nextInt();
       }

        for(int i = 0; i < 10; i++){
            if (values[i] <= 0){
                values[i] = 1;
            }
            System.out.printf("X[%d] = %d\n", i, values[i]);
       }

       scanner.close();
    }
}