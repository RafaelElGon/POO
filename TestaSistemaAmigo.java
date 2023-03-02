import java.util.ArrayList;
import java.util.List;

public class TestaSistemaAmigo {
    public static void main(String[] args) {
        SistemaAmigo sys = new SistemaAmigo();
        sys.cadastrarAmigo("José","josé@email.com");
        sys.cadastrarAmigo("Maria","maria@email.com");
        try {
            sys.configuraAmigoSecretoDe("josé@email.com", "maria@email.com");
        } catch (AmigoInexistenteException e) {
            System.out.println("Amigo inexistente");
        }
        Mensagem msg = new MensagemParaAlguem("NEVER GONNA GIVE YOU UP", "josé@email.com", false);
        System.out.println(msg.getTextoCompletoAExibir());
    }
}

//a) Cadastre dois amigos José e Maria com seus e-mails.
//        b) Configure o amigo secreto de José como sendo Maria e o amigo secreto de Maria como sendo José. Obs: Lembre
//        de tratar a exceção que pode ser lançada.
//        c) Envie uma mensagem anônima de Maria para José.
//        d) Envie uma mensagem anônima de Maria para todos.
//        e) Pesquise as mensagens anônimas e imprima o texto completo dessas mensagens através do método
//        getTextoCompletoAExibir.
//        f) Pesquise o e-mail do amigo secreto de José e veja se é o e-mail de Maria, imprimindo “Ok” caso seja.
