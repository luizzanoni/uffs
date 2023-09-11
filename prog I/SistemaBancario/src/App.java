import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Crie seu Id: ");
            int idPessoa = scanner.nextInt();

            scanner.nextLine();

            System.out.print("Digite seu nome: ");
            String razaoSocial = scanner.nextLine();

            pessoa1.id = idPessoa;
            pessoa1.razaoSocial = razaoSocial;

            System.out.println("Seu ID e Usuário é:  " + pessoa1.id + " - " + pessoa1.razaoSocial);

            System.out.println("Digite 1 para obter um cartão ou 0 para sair: ");
            int opcao = scanner.nextInt();

            if (opcao == 0) {
                System.out.println("Obrigado por escolher nossos serviços " + pessoa1.razaoSocial);
                break;
            } else {
                Agencia agencia1 = new Agencia();
                System.out.print("Informe o Id da Agência: ");
                int id = scanner.nextInt();

                scanner.nextLine();

                System.out.print("Digite o nome da Agência: ");
                String razaoSocialAgencia = scanner.nextLine();

                agencia1.id = id;
                agencia1.razaoSocialAgencia = razaoSocialAgencia;
                System.out.println("Sua Agência é: " + agencia1.id + " - " + agencia1.razaoSocialAgencia);


                CartaoCredito cartao1 = new CartaoCredito();
                System.out.print("Digite o número de seu cartão: ");
                int numero = scanner.nextInt();

                scanner.nextLine();

                System.out.print("Digite a data de validade: ");
                String dataValidade = scanner.nextLine();

                cartao1.numero = numero;
                cartao1.dataValidade = dataValidade;
                System.out.println("O numero do seu cartão é: " + cartao1.numero + " e ele vence dia: " + cartao1.dataValidade);

                System.out.println("Digite 1 para editar a Agência ou 0 para sair: ");
                int opcao1 = scanner.nextInt();

                if (opcao1 == 1) {
                    int novoIdAg = scanner.nextInt();
                    agencia1.setId(novoIdAg);
                    String novoNomeAg = scanner.nextLine();
                    agencia1.setRazaoSocialAgencia(novoNomeAg);

                    System.out.print(agencia1.id + " - " + agencia1.razaoSocialAgencia);
                    scanner.nextLine();
                } else {
                    System.out.println("Obrigado por escolher nossos serviços " + pessoa1.razaoSocial);
                    break;
                }

            }
        }
        scanner.close();
    }
}
