import java.io.IOException;
import java.util.Scanner;

public class Animal {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String iptClasse = scanner.nextLine();

        if (iptClasse.equals("vertebrado")) {
            String iptFilo = scanner.nextLine();

            if (iptFilo.equals("ave")) {
                String iptAlimentacao = scanner.nextLine();

                if (iptAlimentacao.equals("carnivoro")) {
                    System.out.println("aguia");
                } else if (iptAlimentacao.equals("onivoro")) {
                    System.out.println("pomba");
                }
            } else if (iptFilo.equals("mamifero")) {
                String iptAlimentacao = scanner.nextLine();

                if (iptAlimentacao.equals("onivoro")) {
                    System.out.println("homem");
                } else if (iptAlimentacao.equals("herbivoro")) {
                    System.out.println("vaca");
                }
            }
        }else if (iptClasse.equals("invertebrado")) {
            String iptFilo = scanner.nextLine();

            if (iptFilo.equals("inseto")) {
                String iptAlimentacao = scanner.nextLine();

                if (iptAlimentacao.equals("hematofago")) {
                    System.out.println("pulga");
                } else if (iptAlimentacao.equals("herbivoro")) {
                    System.out.println("lagarta");
                }
            } else if (iptFilo.equals("anelidio")) {
                String iptAlimentacao = scanner.nextLine();

                if (iptAlimentacao.equals("hematofago")) {
                    System.out.println("sanguessuga");
                } else if (iptAlimentacao.equals("onivoro")) {
                    System.out.println("minhoca");
                }
            }
        }

        scanner.close();
    }
}
