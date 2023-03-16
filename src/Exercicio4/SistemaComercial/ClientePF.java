package Exercicio4.SistemaComercial;

public class ClientePF extends Cliente {
    private String CPF;
    public ClientePF(String nome, String endereco, String email, String CPF) {
        super(nome, endereco, email);
        this.CPF = CPF;
    }
    @Override //retorna o cpf
    public String getId() {
        return this.CPF;
    }
}
