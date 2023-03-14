package Exercicio2.SistemaAmigo;

public class TestaSistemaAmigo {
    public static void main(String[] args) {
        SistemaAmigo sys = new SistemaAmigo();

        try {
            sys.cadastraAmigo("José", "josé@email.com");
            sys.cadastraAmigo("Maria", "maria@email.com");
            sys.configuraAmigoSecretoDe("josé@email.com", "maria@email.com");
        } catch (AmigoInexistenteException | AmigoNaoSorteadoException | AmigoJaExisteException e) {
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
