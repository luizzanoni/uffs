
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Exemplo {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    
    ArrayList<String> opcao = new ArrayList();// [ A ] declarando e instanciando uma opcao de contatos

    
    opcao.add("1 – Cadastrar Produto");// [ B ] usando o método add() para gravar 4 contatos na opcao
    opcao.add("2 – Consultar estoque");
    opcao.add("3 – Remover unidades");
    opcao.add("4 – Adicionar unidades");
	opcao.add("9 - Sair");
	
    int i;

    // [ C ] mostrando os "n" contatos da opcao (usando o índice)
    // número de elementos da opcao: método size()
    System.out.printf("Percorrendo o ArrayList (usando o índice)\n");
    int n = opcao.size();
    for (i=0; i<n; i++) {
      System.out.printf("Posição %d- %s\n", i, opcao.get(i));
    }

    System.out.printf("\nInforme a posição a ser excluída:\n");
    i = ler.nextInt();

    try {
      // [ D ] remove o i-ésimo contato da opcao
      opcao.remove(i);
    } catch (IndexOutOfBoundsException e) {
        // exceção lançada para indicar que um índice (i)
        // está fora do intervalo válido (de 0 até opcao.size()-1)
        System.out.printf("\nErro: posição inválida (%s).",
          e.getMessage());
    }

    // [ E ] mostrando os "n" das opções de menu (usando for-each)
    System.out.printf("\nPercorrendo o ArrayList (usando for-each)\n");
    i = 0;
    for (String contato: opcao) {
      System.out.printf("Posição %d- %s\n", i, contato);
      i++;
    }

    // [ F ] mostrando os "n" contatos da opcao (com iterator)
    System.out.printf("\nPercorrendo o ArrayList (usando iterator)\n");
    i = 0;
    Iterator<String> iterator = opcao.iterator();
    while (iterator.hasNext()) {
      System.out.printf("Posição %d- %s\n", i, iterator.next());
      i++;
    }
  }

}