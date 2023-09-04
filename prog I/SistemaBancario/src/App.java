public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Pessoa pessoa1 = new Pessoa();
        pessoa1.idPessoa = 50;

        pessoa1.RazaoSocial = "Luiz";

        Conta c1 = new Conta();

        c1.numero = 1;
        c1.saldo = 580;
        c1.limite = 500;

        Conta c2 = new Conta();
        c2.numero = 2;
        c2.saldo = 1000;
        c2.limite = 2000;

        c1.deposita(100);
        c2.deposita(170);

        System.out.println(c1.saldo);
        System.out.println(c2.saldo);

        System.out.println(pessoa1.idPessoa + " - " + pessoa1.RazaoSocial);
    }
}
