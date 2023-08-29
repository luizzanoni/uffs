import java.util.Scanner;

public class trocaEmVetorI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetorN = new int[20];
        
        for (int i = 0; i < 20; i++) {
            vetorN[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < 10; i++) {
            int temp = vetorN[i];
            vetorN[i] = vetorN[19 - i];
            vetorN[19 - i] = temp;
        }
        
        for (int i = 0; i < 20; i++) {
            System.out.println("N[" + i + "] = " + vetorN[i]);
        }
    }
}
