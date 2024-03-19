package classes;

public class Cliente extends Pessoa{

    private String nome;
    
    public Cliente(String nome, int idade, String cpf, String sexo, String endereco, String telefone) {
        super(nome, idade, cpf, sexo, endereco, telefone);
        this.nome = nome;
        
    }
    
    // Polimorfismo
    @Override
    public void falar(){
        System.out.println("Meu nome é " + this.nome);
    }

}
