import java.io.IOException;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int valInput[] = new int[3];

        for (int i = 0; i < valInput.length; i++) {
            valInput[i] = scanner.nextInt();
        }

        int valSort[] = valInput.clone();

        for (int i = 0; i < valSort.length - 1; i++) {
            int valMenor = 0;
            int indexMenor = 0;
            int valMaior = 0;
            int indexMaior = 0;
            int indexAtualComp = i < valSort.length - 1 ? i + 1 : i;

            for (int j = indexAtualComp; j < valSort.length; j++) {
                if (valSort[i] > valSort[j]) {
                    indexMenor = j;
                    valMenor = valSort[indexMenor];

                    indexMaior = i;
                    valMaior = valSort[indexMaior];

                    valSort[indexMaior] = valMenor;
                    valSort[indexMenor] = valMaior;
                }
            }
        }

        for (int i = 0; i < valSort.length; i++) System.out.println(valSort[i] + (i == valSort.length - 1 ?  "\n" : ""));
        for (int i = 0; i < valInput.length; i++) System.out.println(valInput[i]);

        scanner.close();
    }
}
