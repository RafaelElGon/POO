package JFrameAgenda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public class AgendaAyla implements Agenda{
    private Map<String, Contato> contatos;

    @Override
    public boolean cadastraContato(String nome, int dia, int mes) {
        if(contatos.containsKey(nome)){
            this.contatos.put(nome, new Contato(nome, dia, mes));
            return true;
        }
        return false;
    }

    @Override
    public Collection<Contato> pesquisaAniversariantes(int dia, int mes) {
        Collection<Contato> contatosAchados = new ArrayList<>();

        for(Contato c: this.contatos.values()){
            if(c.getDiaAniversario() == dia && c.getMesAniversario() == mes){
                contatosAchados.add(c);
            }
        }
        return contatosAchados;
    }

    @Override
    public boolean removeContato(String nome) {
        if(this.contatos.containsKey(nome)){
            this.contatos.remove(nome);
            return true;
        }
        return false;
    }
}
