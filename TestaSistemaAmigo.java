package SistemaAmigo;

public class TestaSistemaAmigo {
    public static void main(String[] args) {
        SistemaAmigo sys = new SistemaAmigo();
        sys.cadastrarAmigo("José", "josé@email.com");
        sys.cadastrarAmigo("Maria", "maria@email.com");
        try {
            sys.configuraAmigoSecretoDe("josé@email.com", "maria@email.com");
        } catch (AmigoInexistenteException e) {
            System.out.println("Amigo inexistente");
        }
        Mensagem msg = new MensagemParaAlguem("NEVER GONNA GIVE YOU UP", "maria@email.com", "josé@email.com", false);
        System.out.println(msg.getTextoCompletoAExibir());
        sys.cadastrarMensagens(msg);

        Mensagem msgTodos = new MensagemParaTodos("Never gonna give you up", "maria@email.com", true);
        System.out.println(msgTodos.getTextoCompletoAExibir());
        for (Mensagem m : sys.pesquisaMensagensAnonimas()) {
            System.out.println(m.getTextoCompletoAExibir());
        }
        String secretoPesquisado = sys.pesquisaAmigoSecreto("maria@email.com");
        if(secretoPesquisado.equals("Amigo Secreto: maria@email.com")){
            System.out.println("Ok");
        }
    }
}
