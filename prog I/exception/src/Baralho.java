import java.util.Arrays;
import java.util.Random;

public class Baralho {

    private Carta[] cartas;

    public Baralho() {
        this.cartas = new Carta[52];

        int k = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 13; j++) {
                this.cartas[k] = new Carta(j, getNaipe(i));
                k++;
            }
        }
    }

    private String getNaipe(int i) {
        switch (i) {
            case 0:
                return "copas";
            case 1:
                return "espadas";
            case 2:
                return "ouros";
            default:
                return "paus";
        }
    }

    public void embaralhar() {
        Random gerador = new Random();

        for (int i = 0; i < cartas.length; i++) {
            int posicao = gerador.nextInt(cartas.length);

            Carta aux = cartas[i];
            cartas[i] = cartas[posicao];
            cartas[posicao] = aux;
        }
    }

    public Carta[] getCartas() {
        return cartas;
    }

    public Carta getCarta(int indice) {
        if (indice < 0 || indice >= cartas.length) {
            throw new IllegalArgumentException("Indice da carta inválido");
        }

        return cartas[indice];
    }

    public void setCarta(int indice, Carta carta) {
        if (indice < 0 || indice >= cartas.length) {
            throw new IllegalArgumentException("Indice da carta inválido");
        }

        cartas[indice] = carta;
    }

    @Override
    public String toString() {
        return Arrays.toString(cartas);
    }
}