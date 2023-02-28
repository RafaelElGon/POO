public class MensagemParaAlguem extends Mensagem {
    private String emailDestinatario;

    public MensagemParaAlguem(String emailRemetente, String emailDestinatario, boolean anonima){
        super(emailRemetente, emailDestinatario, anonima);

    }
    @Override
    public String getTextoCompletoAExibir() {
        if(ehAnonima()){
            return "Mensagem de " + super.getEmailRemetente() + " para "
                    + emailDestinatario + ". Texto: " + super.getTexto();
        }
        return "Mensagem para " + emailDestinatario +
                ". Texto: " + super.getTexto();
    }
    public String getEmailDestinatario() {
        return emailDestinatario;
    }
    public void setEmailDestinatario(String emailDestinatario) {
        this.emailDestinatario = emailDestinatario;
    }
}
