import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("x do primeiro ponto: ");
        double x1 = scanner.nextDouble();
        System.out.print("y do primeiro ponto: ");
        double y1 = scanner.nextDouble();
        
        System.out.print("x do segundo ponto: ");
        double x2 = scanner.nextDouble();
        System.out.print("y do segundo ponto: ");
        double y2 = scanner.nextDouble();
        
        double distancia = distance(x1, y1, x2, y2);
        
        System.out.println("A distância euclidiana entre os pontos é: " + distancia);
        
        scanner.close();
    }
    
    public static double distance(double x1, double y1, double x2, double y2) {
        double deltaX = x2 - x1;
        double deltaY = y2 - y1;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}
