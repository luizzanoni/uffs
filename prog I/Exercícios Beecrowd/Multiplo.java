import java.io.IOException;
import java.util.Scanner;

public class Multiplo {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int inA = scanner.nextInt();
        int inB = scanner.nextInt();
        int resto = 0;

        if(inA > inB){
            resto = inA % inB;
        }else{
            resto = inB % inA;
        }

        String retorno = resto == 0 ? "Sao Multiplos" : "Nao sao Multiplos";
        System.out.println(retorno);
        scanner.close();
    }
}
