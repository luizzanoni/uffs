import java.util.Scanner;

public class App {
    private static final int LISTAR_ITENS = -1;
    private static final int MOSTRAR_CARRINHO = -2;
    private static final int FINALIZAR_COMPRA = -3;

    public static void main(String[] args) {
        Pedido pedidoCliente = new Pedido();
        Produto[] arrProdutos = {
                new Produto("Banana", 1, 0.25, 150, "Banana Amarela"),
                new Produto("Vergamota", 2, 0.65, 60, "Vergamota Azeda"),
                new Produto("Laranja", 3, 0.35, 100, "Laranja docinha")
        };

        Scanner scanner = new Scanner(System.in);

        System.out.println("#########################\n");
        System.out.println("Bem-vindo à mercearia do Tripa: Hoje temos os seguintes produtos: ");
        listarProdutos(arrProdutos);

        while (true) {
            System.out.println("Informe o código do produto que deseja adicionar ao seu pedido:");
            int codSelecionado = scanner.nextInt();

            if (codSelecionado == LISTAR_ITENS) {
                listarProdutos(arrProdutos);
            } else if (codSelecionado == MOSTRAR_CARRINHO) {
                mostrarCarrinho(pedidoCliente);
            } else if (codSelecionado == FINALIZAR_COMPRA) {
                finalizarCompra(pedidoCliente);
                break;
            } else {
                adicionarProdutoAoCarrinho(codSelecionado, arrProdutos, pedidoCliente, scanner);
            }
        }

        scanner.close();
    }

    private static void listarProdutos(Produto[] produtos) {
        System.out.println("Produtos disponíveis:");
        for (Produto produto : produtos) {
            System.out.println("Código: " + produto.getCodigo() + "; " + produto.getNome() + " à R$ " +
            produto.getValor() + " em estoque temos " + produto.getQtdeEstoque());
        }
    }

    private static void mostrarCarrinho(Pedido pedidoCliente) {
        ItemPedido[] pedidos = pedidoCliente.getItensPedido();
        if (pedidos.length == 0) {
            System.out.println("Seu carrinho está vazio.");
        } else {
            System.out.println("Seu carrinho possui:");
            for (int i = 0; i < pedidos.length; i++) {
                ItemPedido item = pedidos[i];
                System.out.println("Item " + (i + 1) + ": " + item.getQuantidade() + " " +
                        item.getProduto().getNome() + "(s), total de R$ " +
                        (item.getQuantidade() * item.getProduto().getValor()));
            }
        }
    }

    private static void finalizarCompra(Pedido pedidoCliente) {
        ItemPedido[] pedidos = pedidoCliente.getItensPedido();
        if (pedidos.length == 0) {
            System.out.println("Desculpe por não termos o que procurava. Iremos tentar melhorar.");
        } else {
            System.out.println("Seu carrinho ficou assim:");
            mostrarCarrinho(pedidoCliente);
            pedidoCliente.showValorTotal();
            System.out.println("Pix: +55 (49) 98810-7337");
        }
    }

    private static void adicionarProdutoAoCarrinho(int codSelecionado, Produto[] produtos, Pedido pedidoCliente, Scanner scanner) {
        boolean isItemAdicionado = false;

        for (ItemPedido item : pedidoCliente.getItensPedido()) {
            if (item.getProduto().getCodigo() == codSelecionado) {
                isItemAdicionado = true;
                System.out.println("Você já selecionou " + item.getQuantidade() + " " +
                        item.getProduto().getNome() + "(s). Deseja incluir mais quantas (0 para não incluir mais nenhuma):");
                int maisQtde = scanner.nextInt();
                if (maisQtde + item.getQuantidade() > item.getProduto().getQtdeEstoque()) {
                    System.out.println("Quantidade informada maior do que a disponível. Tente novamente.");
                    break;
                }
                item.alterarQuantidade(maisQtde);
                break;
            }
        }

        if (!isItemAdicionado) {
            for (Produto produto : produtos) {
                if (codSelecionado == produto.getCodigo()) {
                    System.out.println("Temos em estoque " + produto.getQtdeEstoque() + " " +
                            produto.getNome() + "s, quantas deseja:");
                    int qtdeEsc = scanner.nextInt();
                    if (qtdeEsc > produto.getQtdeEstoque()) {
                        System.out.println("Quantidade informada maior do que a disponível. Tente novamente.");
                        break;
                    }
                    ItemPedido newItemPedido = new ItemPedido(produto);
                    newItemPedido.alterarQuantidade(qtdeEsc);
                    pedidoCliente.adicionarProdutosAoPedido(newItemPedido);
                    break;
                }
            }
        }
    }
}
