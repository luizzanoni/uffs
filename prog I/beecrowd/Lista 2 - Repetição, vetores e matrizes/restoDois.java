import java.io.IOException;
import java.util.Scanner;

public class restoDois {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        int value = scanner.nextInt();

        for(int i = 0; i <= 10000; i++){
            if (i % value == 2) {
                System.out.println(i);
            }
        }
    }
}
