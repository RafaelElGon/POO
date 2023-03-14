package Turma;

import java.util.List;

public class Turma {
    private List<Pessoa> alunos;
    private String disciplina;

    public Turma(List<Pessoa> pessoas, String disciplina){
        this.disciplina = disciplina;
        this.alunos = pessoas;
    }

    public List<Pessoa> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Pessoa> pessoas) {
        this.alunos = pessoas;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
