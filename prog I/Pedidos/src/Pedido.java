public class Pedido {

    private ItemPedido[] itensPedido = new ItemPedido[0];
    
    private double valorTotal = 0;

    public void adicionarProdutosAoPedido(ItemPedido newItem) {
        valorTotal = 0;
        ItemPedido[] newItensPedido = new ItemPedido[itensPedido.length + 1];

        if (itensPedido.length >= 1) {
            for (int i = 0; i < itensPedido.length; i++) {
                newItensPedido[i] = itensPedido[i];
                valorTotal += newItensPedido[i].getProduto().getValor() * newItensPedido[i].getQuantidade();
            }
        }

        newItensPedido[newItensPedido.length - 1] = newItem;
        valorTotal += newItensPedido[newItensPedido.length - 1].getProduto().getValor() * newItensPedido[newItensPedido.length - 1].getQuantidade();
        itensPedido = newItensPedido;

        System.out.println("Item adicionao ao pedido com sucesso");
    }

    public void showValorTotal() {
        System.out.println("Valor total do pedido é de: R$ " + this.valorTotal);
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public ItemPedido[] getItensPedido() {
        return itensPedido;
    }
}
