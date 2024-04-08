package classes;

public class Cliente extends Pessoa {

    private static int identificadorEstatico;
    private int idCliente;
    private String nome;

    public Cliente(String nome, int idade, String cpf, String sexo, String endereco, String telefone) {
        super(nome, idade, cpf, sexo, endereco, telefone);
        this.nome = nome;
        this.idCliente = this.identificadorEstatico;
        this.identificadorEstatico++;
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
