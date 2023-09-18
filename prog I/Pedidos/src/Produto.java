import java.util.Scanner;

public class Produto {

    private int codigo;

    private double valor;

    private String nome;

    private String descricao;
    
    private int qtdeEstoque;

    public Produto(){
        Scanner scanProdInt = new Scanner(System.in);
        Scanner scanProdFloat = new Scanner(System.in);
        Scanner scanProdString = new Scanner(System.in);

        System.out.println("Defina um nome para o produto:");
        setNome(scanProdString.nextLine());
        System.out.println("Defina o codigo para o produto (Somente numeros inteiros):");
        setCodigo(scanProdInt.nextInt());
        System.out.println("Defina o valor do produto (Somento numeros ex: 1,25): ");
        setValor(scanProdFloat.nextFloat());
        System.out.println("Defina uma descrição para o produto:");
        setDescricao(scanProdString.nextLine());
        System.out.println("Defina a quantia em estoque do produto:");
        setQtdeEstoque(scanProdString.nextInt());

        scanProdInt.close();
        scanProdFloat.close();
        scanProdString.close();

        this.showInfoProduto(true);
    }

    public Produto(String nome, int codigo, double valor, int qtdeEstoque, String descricao){
        setNome(nome);
        setCodigo(codigo);
        setValor(valor);
        setQtdeEstoque(qtdeEstoque);
        setDescricao(descricao);
        this.showInfoProduto(true);
    }

    public void showInfoProduto(boolean isCadastro){
        if(isCadastro){
            System.out.println("### Produto cadastrado com sucesso. ###");
        }else{
            System.out.println("### Informações do produto. ###");
        }

        System.out.println("Nome: " + this.nome);
        System.out.println("Código: " + this.codigo);
        System.out.println("Valor: R$ " + this.valor);
        System.out.println("Desrição: " + this.descricao);
    }

    public boolean alterarQuantiaEstoque(int qtdeRemovidos){
        if (this.qtdeEstoque - qtdeRemovidos < 0){
            System.out.println("Infelizmente a não temos essa quantia em estoque; Qtde em estoque: " + this.qtdeEstoque);
            return false;
        }else{
            setQtdeEstoque(this.qtdeEstoque - qtdeRemovidos);
            System.out.println("Quantia em estoque alterada para: " + this.qtdeEstoque);
            return true;
        }
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setQtdeEstoque(int qtdeEstoque) {
        this.qtdeEstoque = qtdeEstoque;
    }

    public int getQtdeEstoque() {
        return qtdeEstoque;
    }
}
