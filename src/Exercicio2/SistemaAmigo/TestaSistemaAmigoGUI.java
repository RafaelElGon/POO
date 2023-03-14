package Exercicio2.SistemaAmigo;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class TestaSistemaAmigoGUI {
    public static void main(String[] args) {
        SistemaAmigo sys = new SistemaAmigo();
        List<Amigo> amigoSorteio = new ArrayList<>();
        String msgLimite = JOptionPane.showInputDialog("Informe o máximo de mensagens que o sistema suportará");
        int qtAmigos = Integer.parseInt(JOptionPane.showInputDialog("Quantos amigos participarão da brincadeira?"));

        for(int i = 0; i <= qtAmigos; i++){
            try {
                String nomeParticipante = JOptionPane.showInputDialog("Nome do participante");
                String emailParticipante = JOptionPane.showInputDialog("Email do participante");
                sys.cadastraAmigo(nomeParticipante, emailParticipante);
            } catch (AmigoJaExisteException e){
                System.out.println("Amigo já foi cadastrado");
            }
        }

        //usar uma lista diferente pra não interferir com os dados em sys.getAmigos();
        List<Amigo> amigoList = sys.getAmigos();

        //faz o sorteio e cadastra os sorteados em amigoSorteio
            for(int i = 0; i <= amigoList.size(); i++){
                try {
                    int posicaoSorteada = (int) (Math.random() * sys.getAmigos().size());
                    amigoSorteio.add(amigoList.get(posicaoSorteada));
                    amigoList.remove(amigoList.get(posicaoSorteada));
                    if (i != posicaoSorteada) {
                        sys.configuraAmigoSecretoDe(amigoList.get(i).getEmail(), amigoSorteio.get(i).getEmail());
                    }
                } catch (AmigoNaoSorteadoException e){
                    System.out.println("Amigo não sorteado");
                }
        }
            for(Amigo a: amigoSorteio){
                System.out.println(a.getEmailAmigoSorteado());
            }
    }
}