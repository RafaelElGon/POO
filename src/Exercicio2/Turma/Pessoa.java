package Turma;

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;

    public Pessoa(String nomeInput,int idadeInput, String cpfInput){
        this.nome = nomeInput;
        this.idade = idadeInput;
        this.cpf = cpfInput;
    }
    public Pessoa(){
        this("Nome vazio", 0, "Sem CPF");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
