import java.util.Scanner;

public class AnimalClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String palavra1 = scanner.nextLine();
        String palavra2 = scanner.nextLine();
        String palavra3 = scanner.nextLine();

        scanner.close();

        String animal = identifyAnimal(palavra1, palavra2, palavra3);
        System.out.println(animal);
    }

    public static String identifyAnimal(String palavra1, String palavra2, String palavra3) {
        if (palavra1.equals("vertebrado")) {
            if (palavra2.equals("ave")) {
                if (palavra3.equals("carnivoro")) {
                    return "aguia";
                } else if (palavra3.equals("onivoro")) {
                    return "pomba";
                }
            } else if (palavra2.equals("mamifero")) {
                if (palavra3.equals("onivoro")) {
                    return "homem";
                } else if (palavra3.equals("herbivoro")) {
                    return "vaca";
                }
            }
        } else if (palavra1.equals("invertebrado")) {
            if (palavra2.equals("inseto")) {
                if (palavra3.equals("hematofago")) {
                    return "pulga";
                } else if (palavra3.equals("herbivoro")) {
                    return "lagarta";
                }
            } else if (palavra2.equals("anelideo")) {
                if (palavra3.equals("hematofago")) {
                    return "sanguessuga";
                } else if (palavra3.equals("onivoro")) {
                    return "minhoca";
                }
            }
        }

        return "Animal não identificado";
    }
}
