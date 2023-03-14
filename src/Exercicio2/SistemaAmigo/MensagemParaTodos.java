package Exercicio2.SistemaAmigo;

public class MensagemParaTodos extends Mensagem{
    public MensagemParaTodos(String texto, String emailRemetente, boolean anonima) {
        super(texto, emailRemetente, anonima);
    }
    public String getTextoCompletoAExibir(){
        return "Mensagem de " + getEmailRemetente() +
                " para todos. Texto: " + getTexto();
    }
}
