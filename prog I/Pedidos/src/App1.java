import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Pedido pedidoCliente = new Pedido();
        Produto[] arrProdutos = {
                new Produto("Banana", 1, 0.25, 150, "Banana Amarela"),
                new Produto("Vergamota", 2, 0.65, 60, "Vergamota Azeda"),
                new Produto("Laranja", 3, 0.35, 100, "Laranja docinha") };

        System.out.println("#########################\n");
        System.out.println("Bem vindo a mercearia do Tripa: Hoje temos os seguintes produtos: ");

        for (int i = 0; i < arrProdutos.length; i++) {
            System.out.println("Códido: " + arrProdutos[i].getCodigo() + "; " + arrProdutos[i].getNome() + " à R$ "
                    + arrProdutos[i].getValor() + " em estoque temos " + arrProdutos[i].getQtdeEstoque());
        }

        boolean isBreakWhile = false;
        Scanner scanCode = new Scanner(System.in);
        Scanner scanQuantia = new Scanner(System.in);

        while (!isBreakWhile) {

            System.out.println(
                    "Informe o código do produto que deseja adicionar ao seu pedido \n (-1 para ver lista de itens) \n (-2 para ver carrinho) \n (-3 para finalizar compra) ");
            int codSelecionado = scanCode.nextInt();

            if (codSelecionado == -1) {
                for (int i = 0; i < arrProdutos.length; i++) {
                    System.out.println("Códido: " + arrProdutos[i].getCodigo() + "; " + arrProdutos[i].getNome()
                            + " à R$ " + arrProdutos[i].getValor() + " em estoque temos "
                            + arrProdutos[i].getQtdeEstoque());
                }

                continue;
            } else if (codSelecionado == -2) {

                ItemPedido[] pedidos = pedidoCliente.getItensPedido();
                if (pedidos.length == 0) {
                    System.out.println("Seu carrinho está vazio.");
                } else {
                    System.out.println("Seu carrinho possui:");
                    for (int i = 0; i < pedidos.length; i++) {
                        System.out.println("Item " + (i + 1) + ": " + pedidos[i].getQuantidade() + " "
                                + pedidos[i].getProduto().getNome() + "(s), total de R$ "
                                + (pedidos[i].getQuantidade() * pedidos[i].getProduto().getValor()));
                    }
                }

                continue;
            } else if (codSelecionado == -3) {

                ItemPedido[] pedidos = pedidoCliente.getItensPedido();
                if (pedidos.length == 0) {
                    System.out.println("Desculpa por não termos oque procurava iremos tentar melhorar.");
                } else {
                    System.out.println("Seu carrinho ficou assim:");
                    for (int i = 0; i < pedidos.length; i++) {
                        System.out.println("Item " + (i + 1) + ": " + pedidos[i].getQuantidade() + " "
                                + pedidos[i].getProduto().getNome() + "(s), total de R$ "
                                + (pedidos[i].getQuantidade() * pedidos[i].getProduto().getValor()));
                    }
                    pedidoCliente.showValorTotal();
                    System.out.println("Pix: +55 (49) 98810-7337");
                }

                isBreakWhile = true;
                break;
            }

            boolean isItemAdicionado = false;
                if (pedidoCliente.getItensPedido().length >= 1) {
                    for (int j = 0; j < pedidoCliente.getItensPedido().length; j++) {
                        if (pedidoCliente.getItensPedido()[j].getProduto().getCodigo() == codSelecionado) {
                            isItemAdicionado = true;
                            System.out.println("Você já selecionou " + pedidoCliente.getItensPedido()[j].getQuantidade()
                                    + " " + pedidoCliente.getItensPedido()[j].getProduto().getNome()
                                    + "(s) deseja incluir mais quantas (0 para nao incluir mais nenhuma):");
                            int maisQtde = scanQuantia.nextInt();
                            if (maisQtde + pedidoCliente.getItensPedido()[j].getQuantidade() > pedidoCliente.getItensPedido()[j].getProduto().getQtdeEstoque()) {
                                System.out.println("Quantia informada maior que a disponivel, tente novamente;");
                                break;
                            }
                            pedidoCliente.getItensPedido()[j]
                                    .alterarQuantidade(maisQtde);
                            break;
                        }
                    }
                };

            for (int i = 0; i < arrProdutos.length; i++) {
                if (!isItemAdicionado && codSelecionado == arrProdutos[i].getCodigo()) {
                    ItemPedido newItemPedido = new ItemPedido(arrProdutos[i]);

                    System.out.println("Temos em estoque " + arrProdutos[i].getQtdeEstoque() + " "
                            + arrProdutos[i].getNome() + "s, quantas desejas: ");
                    int qtdeEsc = scanQuantia.nextInt();
                    if (qtdeEsc > newItemPedido.getProduto().getQtdeEstoque()) {
                        System.out.println("Quantia informada maior que a disponivel, tente novamente;");
                        break;
                    }
                    newItemPedido.alterarQuantidade(qtdeEsc);
                    pedidoCliente.adicionarProdutosAoPedido(newItemPedido);
                    break;
                }
            }

            System.out.println("#####################");
        }

        scanCode.close();
        scanQuantia.close();
    }
}
