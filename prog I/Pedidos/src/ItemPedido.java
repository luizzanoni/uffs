public class ItemPedido {

    private Produto produto;
    
    private int quantidade = 0;

    ItemPedido(Produto produto){
        setProduto(produto);
    }

    ItemPedido(Produto produto, int quantidade){
        setProduto(produto);
        setQuantidade(quantidade);
        produto.alterarQuantiaEstoque(quantidade);
    }

    public void alterarQuantidade(int quantidade){
        setQuantidade(this.quantidade + quantidade);
        produto.alterarQuantiaEstoque(quantidade);
    }

    public void showDadosItemPedido(){
        System.out.println("Código / Nome produto: " + produto.getCodigo() + " / " + produto.getNome() + "; quantidade: " + this.quantidade);
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public Produto getProduto() {
        return produto;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
