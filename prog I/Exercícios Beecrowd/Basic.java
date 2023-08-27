import java.io.IOException;
import java.util.Scanner;

public class Basic {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int inputOne = scanner.nextInt();
        int inputTwo = scanner.nextInt();
        int sumInputs = inputOne + inputTwo;
        
        System.out.printf("x = " + sumInputs + "\n");
        scanner.close();
    }
}