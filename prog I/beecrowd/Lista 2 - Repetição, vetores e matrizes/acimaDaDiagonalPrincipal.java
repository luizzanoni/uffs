import java.util.Scanner;

public class OperacaoMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char operacao = scanner.next().charAt(0);
        
        double[][] matriz = new double[12][12];
        
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                matriz[i][j] = scanner.nextDouble();
            }
        }
        
        double resultado = 0;
        int elementosConsiderados = 0;
        
        for (int i = 0; i < 12; i++) {
            for (int j = i + 1; j < 12; j++) {
                resultado += matriz[i][j];
                elementosConsiderados++;
            }
        }
        
        if (operacao == 'M') {
            resultado /= elementosConsiderados;
        }
        
        System.out.printf("%.1f%n", resultado);
    }
}
