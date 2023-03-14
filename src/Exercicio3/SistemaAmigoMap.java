package Exercicio3;

import Exercicio2.SistemaAmigo.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SistemaAmigoMap {
    private HashMap<String, Amigo> amigos;
    private List<Mensagem> mensagens;

    public SistemaAmigoMap() {
        this.mensagens = new ArrayList<>();
        this.amigos = new HashMap<>();
    }

    public void cadastraAmigo(String nomeAmigo, String emailAmigo) throws AmigoJaExisteException {
        if (this.amigos.containsKey(emailAmigo)) {
            throw new AmigoJaExisteException("Amigo já foi cadastrado");
        } else {
            Amigo a = new Amigo(nomeAmigo, emailAmigo);
            this.amigos.put(emailAmigo, a);
        }
    }

    public HashMap<String, Amigo> getAmigos() {
        return this.amigos;
    }

    public List<Mensagem> getMensagens() {
        return this.mensagens;
    }

    public void cadastrarMensagens(Mensagem m, String key) {
        this.mensagens.add(m);
    }

    public Amigo pesquisaAmigo(String emailAmigo) throws AmigoInexistenteException {
        Amigo amigoPesquisado = null;
        if (this.amigos.containsKey(emailAmigo)) {
            amigoPesquisado = this.amigos.get(emailAmigo);
        } else {
            throw new AmigoInexistenteException("Amigo Inexistente");
        }
        return amigoPesquisado;
    }

    public String pesquisaAmigoSecreto(String emailAmigo) throws AmigoInexistenteException, AmigoNaoSorteadoException {
        String amigoSecreto = null;

        for (String s : this.amigos.keySet()) {
            if (s.equals(emailAmigo) && this.amigos.get(emailAmigo).getEmailAmigoSorteado() != null) {
                amigoSecreto = this.amigos.get(emailAmigo).getEmailAmigoSorteado();
            } else {
                throw new AmigoNaoSorteadoException("Amigo não foi sorteado");
            }
        }
        if (amigoSecreto == null) {
            throw new AmigoInexistenteException("Amigo Inexistente");
        }

        return amigoSecreto;
    }

    public List<Mensagem> pesquisaMensagensAnonimas() {
        List<Mensagem> mensagensAnonimas = new ArrayList<>();

        for (Mensagem m : this.mensagens) {
            if (m.ehAnonima()) {
                mensagensAnonimas.add(m);
            }
        }
        return mensagensAnonimas;
    }

    public void configuraAmigoSecretoDe(String emailDaPessoa, String emailAmigoSorteado) throws AmigoInexistenteException {
        Amigo amigoPesquisado = pesquisaAmigo(emailDaPessoa);

        if (amigoPesquisado == null) {
            throw new AmigoInexistenteException("Amigo Inexistente");
        } else {
            this.amigos.get(emailDaPessoa).setEmailAmigoSorteado(emailAmigoSorteado);
        }
    }

    public String enviarMensagemParaAlguem(String texto, String remetente, String destinatario, boolean anonima){
        Mensagem msg = new MensagemParaAlguem(texto, remetente, destinatario, anonima);
        this.mensagens.add(msg);

        return msg.getTextoCompletoAExibir();
    }

    public String MensagemParaTodos(String texto, String emailRemetente, boolean anonima) {
        Mensagem msg = new MensagemParaTodos(texto, emailRemetente, anonima);
        this.mensagens.add(msg);

        return msg.getTextoCompletoAExibir();
    }

    public List<Mensagem> pesquisaTodasAsMensagens() {
        return this.mensagens;
    }
}