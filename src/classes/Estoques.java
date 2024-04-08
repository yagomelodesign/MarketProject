package classes;


public class Estoques {
    private Produto produto;
    private int quantidade;
    
    public Estoques(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }
    
    public void adicionarAoEstoque(int quantidade){
        this.quantidade += quantidade;
    }
}
