package Exercicio2.SistemaAmigo;

public class MensagemParaAlguem extends Mensagem {
    private String emailDestinatario;

    public MensagemParaAlguem(String texto, String emailRemetente, String emailDestinatario, boolean anonima ){
        super(texto, emailRemetente, anonima);
        this.emailDestinatario = emailDestinatario;

    }
    @Override
    public String getTextoCompletoAExibir() {
        if(ehAnonima()){
            return "Mensagem de " + getEmailRemetente() + " para "
                    + emailDestinatario + ". Texto: " + getTexto();
        }
        return "Mensagem para " + emailDestinatario +
                ". Texto: " + getTexto();
    }
    public String getEmailDestinatario() {
        return emailDestinatario;
    }
    public void setEmailDestinatario(String emailDestinatario) {
        this.emailDestinatario = emailDestinatario;
    }
}
