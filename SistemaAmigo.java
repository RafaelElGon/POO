

import java.util.ArrayList;
import java.util.List;

public class SistemaAmigo {
    private List<Mensagem> mensagens;
    private List<Amigo> amigos;

    public SistemaAmigo(){
        this.mensagens = new ArrayList<>();
        this.amigos = new ArrayList<>();
    }

    public void cadastraAmigo(String nomeAmigo, String emailAmigo) throws AmigoJaExisteException{
        for(Amigo a: this.amigos){
            if(a.equals(new Amigo(nomeAmigo, emailAmigo))){
                throw new AmigoJaExisteException("Amigo já está cadastrado");
            }
        }
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

    public Amigo pesquisaAmigo(String emailAmigo) throws AmigoInexistenteException{
        Amigo amigoPesquisado = null;
        for (Amigo a : this.amigos) {
            if (a.getEmail().equals(emailAmigo)) {
                amigoPesquisado = a;
            }
        }
        if(amigoPesquisado == null){throw new AmigoInexistenteException("Amigo Inexistente");}
        return amigoPesquisado;
    }

    public String pesquisaAmigoSecreto(String emailAmigo) throws AmigoInexistenteException, AmigoNaoSorteadoException{
        String amigoSecreto = null;
        for (Amigo a : this.amigos) {
            if (a.getEmail().equals(emailAmigo)) {
                amigoSecreto = "Amigo secreto: " + a;
            }
        }
        if(amigoSecreto == null){throw new AmigoInexistenteException("Amigo Inexistente");}

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
            throw new AmigoInexistenteException("Amigo Inexistente");
        } else {
            a.setEmailAmigoSorteado(emailAmigoSorteado);
        }
    }

    public List<Mensagem> pesquisaTodasAsMensagens() {
        return this.mensagens;
    }

    public String enviarMensagemParaAlguem(String texto, String remetente, String destinatario, boolean anonima){
        Mensagem msg = new MensagemParaAlguem(texto, remetente, destinatario, anonima);

        return msg.getTextoCompletoAExibir();
    }
}