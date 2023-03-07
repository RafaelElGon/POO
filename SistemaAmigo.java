package SistemaAmigo;

import java.util.ArrayList;
import java.util.List;

public class SistemaAmigo {
    private List<Mensagem> mensagens;
    private List<Amigo> amigos;
    
    public SistemaAmigo(){
            this.mensagens = new ArrayList<>();
            this.amigos = new ArrayList<>();
    }

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

    public String pesquisaAmigoSecreto(String emailAmigo) throws AmigoInexistenteException, AmigoNaoSorteadoException{
        String amigoSecreto = null;
        for (Amigo a : this.amigos) {
            if (a.getEmail().equals(emailAmigo)) {
                if(amigo.getEmailAmigoSorteado() == null){
                    throw new AmigoNaoSorteadoException("Esse amigo não foi sorteado");
                } else{
                    return a.getEmailAmigoSorteado();
                }
            }
        }
        throw new AmigoInexistenteException("Amigo inexistente");
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
        List<Mensagem> mensagemCopia = new ArrayList<>(this.mensagens);
        return mensagemCopia;
    }
}
