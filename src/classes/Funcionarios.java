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
public class Funcionarios extends Pessoa {

    private String funcao;
    private double salario;

    public Funcionarios(String nome, int idade, String cpf, String sexo, String endereco, String telefone, String funcao, double salario) {
        super(nome, idade, cpf, sexo, endereco, telefone);
        this.funcao = funcao;
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    void falar() {
        System.out.println("Olá");
    }
}
