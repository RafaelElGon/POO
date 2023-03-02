public class MensagemParaAlguem extends Mensagem {
    private String emailDestinatario;

    public MensagemParaAlguem(String texto, String emailRemetente, boolean anonima){
        super(texto, emailRemetente, anonima);

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
