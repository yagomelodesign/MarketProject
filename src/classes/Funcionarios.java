package classes;

public class Funcionarios extends Pessoa {

    private static int identificadorEstatico;
    private int idFuncionarios;
    private String funcao;
    private double salario;

    public Funcionarios(String nome, int idade, String cpf, String sexo, String endereco, String telefone, String funcao, double salario) {
        super(nome, idade, cpf, sexo, endereco, telefone);
        this.idFuncionarios = this.identificadorEstatico;
        this.identificadorEstatico++;
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
    public void andar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void falar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
