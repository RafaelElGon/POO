package SistemaAmigo;

import java.util.ArrayList;
import java.util.List;

public class SistemaAmigo {
    private List<Mensagem> mensagens = new ArrayList<>();
    private List<Amigo> amigos = new ArrayList<>();

    public void cadastrarAmigo(String nomeAmigo, String emailAmigo) {
        this.amigos.add(new Amigo(nomeAmigo, emailAmigo));
    }

    public List<Mensagem> getMensagens() {
        return mensagens;
    }

    public List<Amigo> getAmigos() {
        return amigos;
    }

    public void cadastrarMensagens(Mensagem m) {
        this.mensagens.add(m);
    }

    public Amigo pesquisaAmigo(String emailAmigo) {
        Amigo amigoPesquisado = null;
        for (Amigo a : this.amigos) {
            if (a.getEmail().equals(emailAmigo)) {
                amigoPesquisado = a;
            }
        }
        return amigoPesquisado;
    }

    public String pesquisaAmigoSecreto(String emailAmigo) {
        String amigoSecreto = null;
        for (Amigo a : this.amigos) {
            if (a.getEmail().equals(emailAmigo)) {
                amigoSecreto = "Amigo secreto: " + a;
            }
        }
        return amigoSecreto;
    }

    public List<Mensagem> pesquisaMensagensAnonimas() {
        List<Mensagem> mensagensAnonimas = new ArrayList<>();

        for (Mensagem m : this.mensagens) {
            if (!m.ehAnonima()) {
                mensagensAnonimas.add(m);
            }
        }
        return mensagensAnonimas;
    }
    public void configuraAmigoSecretoDe(String emailDaPessoa, String emailAmigoSorteado) throws AmigoInexistenteException {
        Amigo a = pesquisaAmigo(emailDaPessoa);
        if( a == null){
            throw new AmigoInexistenteException("No bitches?");
        } else {
            a.setEmailAmigoSorteado(emailAmigoSorteado);
        }
    }

    public List<Mensagem> pesquisaTodasAsMensagens() {
        return this.mensagens;
    }
}
