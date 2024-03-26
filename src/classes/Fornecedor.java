package classes;

public class Fornecedor extends Pessoa{

    Categorias categoriaFornecida = new Categorias();

    public Fornecedor(String nome, int idade, String cpf, String sexo, String endereco, String telefone, Categorias categoria) {
        
        super(nome, idade, cpf, sexo, endereco, telefone);
        this.categoriaFornecida = categoria;
    }

    public Categorias getCategoria() {
        return categoriaFornecida;
    }

    public void setCategoria(Categorias categoria) {
        this.categoriaFornecida = categoria;
    }

    @Override
    void falar() {
        throw new UnsupportedOperationException("Olá, sou o fornecedor " + super.getNome()); 
    }

}
