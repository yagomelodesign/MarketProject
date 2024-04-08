package classes;

public class Produto {
    
    private static int identificadorEstatico;
    private int idProduto;
    private String nome;
    private double preco;
    private String marca;
    private Categorias categoria;

    public Produto(Categorias categoria){
        this.categoria = categoria;
        this.idProduto = this.identificadorEstatico;
        this.identificadorEstatico++;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
