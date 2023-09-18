import java.util.Scanner;

public class App {
    private static final int LISTAR_ITENS = -1;
    private static final int MOSTRAR_CARRINHO = -2;
    private static final int FINALIZAR_COMPRA = -3;

    public static void main(String[] args) {
        Pedido pedidoCliente = new Pedido();
        Produto[] arrayProdutos = {
                new Produto("Banana", 1, 0.45, 1000, "Banana é Amarela"),
                new Produto("Vergamota", 2, 1.15, 1450, "Vergamota é muito boa (Azeda)"),
                new Produto("Laranja", 3, 0.75, 1250, "Laranja docinha direto do pé")
        };

        Scanner scanner = new Scanner(System.in);

        System.out.println("#########################\n");
        System.out.println("Bem-vindo ao mercadinho da esquina do Zéca Urubu: ");
        listarProdutos(arrayProdutos);

        while (true) {
            System.out.println("Informe o código desejado para adicionar ao seu pedido:");
            System.out.println("Informe: \n -1 (Lista Itens) \n -2 (Mostar Carrinho) \n -3 (Finaliza Pedido) ");
            int codigoSelecionado = scanner.nextInt();

            if (codigoSelecionado == LISTAR_ITENS) {
                listarProdutos(arrayProdutos);
            } else if (codigoSelecionado == MOSTRAR_CARRINHO) {
                mostrarCarrinho(pedidoCliente);
            } else if (codigoSelecionado == FINALIZAR_COMPRA) {
                finalizarCompra(pedidoCliente);
                break;
            } else {
                adicionaProdutoAoCarrinho(codigoSelecionado, arrayProdutos, pedidoCliente, scanner);
            }
        }
        scanner.close();
    }

    private static void listarProdutos(Produto[] produtos) {
        System.out.println("Hoje na vendinha tem:");
        for (Produto produto : produtos) {
            System.out.println("Código: " + produto.getCodigo() + "; " + produto.getNome() + " à R$ " +
            produto.getValor() + " em estoque temos " + produto.getQtdeEstoque());
        }
    }

    private static void mostrarCarrinho(Pedido pedidoCliente) {
        ItemPedido[] pedidos = pedidoCliente.getItensPedido();
        if (pedidos.length == 0) {
            System.out.println("O carrinho está vazio.");
        } else {
            System.out.println("O carrinho possui:");
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
            System.out.println("Não temos o que procurava.");
        } else {
            mostrarCarrinho(pedidoCliente);
            pedidoCliente.showValorTotal();
            System.out.println("Pix: +55 (49) 98810-7337 \n Caixa Econômica Federal");
        }
    }

    private static void adicionaProdutoAoCarrinho(int codSelecionado, Produto[] produtos, Pedido pedidoCliente, Scanner scanner) {
        boolean isItemAdicionado = false;

        for (ItemPedido item : pedidoCliente.getItensPedido()) {
            if (item.getProduto().getCodigo() == codSelecionado) {
                isItemAdicionado = true;
                System.out.println("Você já selecionou " + item.getQuantidade() + " " +
                        item.getProduto().getNome() + "(s). Deseja incluir mais quantas (0 para não incluir mais nenhuma):");
                int maisQuantidade = scanner.nextInt();
                if (maisQuantidade + item.getQuantidade() > item.getProduto().getQtdeEstoque()) {
                    System.out.println("Quantidade informada maior do que a disponível. Tente novamente.");
                    break;
                }
                item.alterarQuantidade(maisQuantidade);
                break;
            }
        }

        if (!isItemAdicionado) {
            for (Produto produto : produtos) {
                if (codSelecionado == produto.getCodigo()) {
                    System.out.println("Temos em estoque " + produto.getQtdeEstoque() + " " +
                            produto.getNome() + "s, quantas deseja:");
                    int quantidadeEstoque = scanner.nextInt();
                    if (quantidadeEstoque > produto.getQtdeEstoque()) {
                        System.out.println("Quantidade informada maior do que a disponível. Tente novamente.");
                        break;
                    }
                    ItemPedido novoItemPedido = new ItemPedido(produto);
                    novoItemPedido.alterarQuantidade(quantidadeEstoque);
                    pedidoCliente.adicionarProdutosAoPedido(novoItemPedido);
                    break;
                }
            }
        }
    }
}
