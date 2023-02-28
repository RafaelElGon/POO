import java.util.ArrayList;
import java.util.List;

public class SistemaAmigo {
    private List<Mensagem> mensagens;
    private List<Amigo> amigos;

    public void cadastrarAmigo(String nomeAmigo, String emailAmigo){
        this.amigos.add(new Amigo(nomeAmigo, emailAmigo));
    }
    public Amigo pesquisaAmigo(String emailAmigo){
        Amigo amigoPesquisado = null;
        for(Amigo a: this.amigos){
            if(a.getEmail().equals(emailAmigo)){
                amigoPesquisado = a;
            }
        }
        return amigoPesquisado;
    }
    public List<Mensagem> pesquisaMensagensAnonimas(){
        List<Mensagem> mensagensAnonimas = new ArrayList<>();

        for(Mensagem m: mensagens){
            if(m.ehAnonima()){
                mensagensAnonimas.add(m);
            }
        }
        return mensagensAnonimas;
    }
    public void configuraAmigoSecretoDe(String emailDaPessoa, String emailAmigoSorteado) throws AmigoInexistenteException{

    }
    public List<Mensagem> pesquisaTodasAsMensagens(){
        return this.mensagens;
    }
    public String pesquisaAmigoSecretoDe(String emailDaPessoa) throws AmigoInexistenteException, AmigoNaoSorteadoException{

    }
}
