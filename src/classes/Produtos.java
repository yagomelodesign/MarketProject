package classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 12046386671
 */
public class Produtos {
    
    private String nome;
    private double preco;
    private String marca;
    
    Categorias categoriaProduto = new Categorias();

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

    public Categorias getCategoriaProduto() {
        return categoriaProduto;
    }

    public void setCategoriaProduto(Categorias categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }
    
    
    
}
