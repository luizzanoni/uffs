import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite seu Id: ");
            int idPessoa = scanner.nextInt();

            scanner.nextLine();

            System.out.print("Digite seu nome: ");
            String nomePessoa = scanner.nextLine();

            pessoa1.Id = idPessoa;
            pessoa1.RazaoSocial = nomePessoa;

            System.out.println(pessoa1.Id + " - " + pessoa1.RazaoSocial);

            System.out.println("Digite 1 para obter um cartão ou 0 para sair: ");
            int opcao = scanner.nextInt();

            if (opcao == 0) {
                System.out.println("Obrigado por escolher nossos serviços " + pessoa1.RazaoSocial);
                break;
            } else {
                CartaoCredito cartao1 = new CartaoCredito();
                System.out.print("Digite o número de seu cartão: ");
                int numero = scanner.nextInt();

                scanner.nextLine();

                System.out.print("Digite a data de validade: ");
                String dataValidade = scanner.nextLine();

                cartao1.Numero = numero;
                cartao1.DataValidade = dataValidade;
                System.out.println("O numero do seu cartão é: " + cartao1.Numero + " e ele vence dia: " + cartao1.DataValidade);
            }
        }
        scanner.close();
    }
}
