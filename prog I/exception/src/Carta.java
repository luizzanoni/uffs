public class Carta {

    private int valor;
    private String naipe;

    public Carta() {
        this.valor = 0;
        this.naipe = "";
    }

    public Carta(int valor, String naipe) {
        this.valor = valor;
        this.naipe = naipe;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        if (valor < 1 || valor > 13) {
            throw new IllegalArgumentException("Valor da carta inválido");
        }

        this.valor = valor;
    }

    public String getNaipe() {
        return naipe;
    }

    public void setNaipe(String naipe) {
        if (!naipe.equals("copas") && !naipe.equals("espadas") && !naipe.equals("ouros") && !naipe.equals("paus")) {
            throw new IllegalArgumentException("Naipe da carta inválido");
        }

        this.naipe = naipe;
    }

    @Override
    public String toString() {
        return String.format("%s de %s", this.valor, this.naipe);
    }
}