package Geometria;

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    double calcularArea() {
        return Math.PI * raio * raio;
    }

    double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}
