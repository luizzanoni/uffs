public class Main {

    public static void main(String[] args) {
        Baralho baralho = new Baralho();

        System.out.println("Baralho em ordem:");
        System.out.println(baralho);

        baralho.embaralhar();

        System.out.println("Baralho embaralhado:");
        System.out.println(baralho);
    }
}