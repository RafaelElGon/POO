package Turma;

import java.util.ArrayList;
import java.util.List;

public class SistemaTurma {
    private List<Turma> turmas = new ArrayList<Turma>();

    public List<Turma> pesquisaTurmaPorDisciplina(String disciplina){
        List<Turma> turmasDisciplina = new ArrayList<Turma>();

        for(Turma t: this.turmas){
            if(t.getDisciplina().equals(disciplina) && this.turmas != null){
                turmasDisciplina.add(t);
            }
        }
        return turmasDisciplina;
    }

    public void cadastraAlunoEmTurma(Pessoa aluno, String disciplina){
        for(Turma t: this.turmas){
            if(t.getDisciplina().equals(disciplina)){
               t.getAlunos().add(aluno);
            }
        }
    }
}
