package JFrameAgenda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgendaRemoveController implements ActionListener {
    private Agenda agenda;
    private JFrame primaryWindow;

    public AgendaRemoveController(Agenda agenda, JFrame primaryWindow) {
        this.agenda = agenda;
        this.primaryWindow = primaryWindow;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nome = JOptionPane.showInputDialog(primaryWindow, "Nome do aniversariante para ser removido.");
        boolean removeu = agenda.removeContato(nome);

        if(removeu){
            JOptionPane.showMessageDialog(primaryWindow, nome + " removido com sucesso.");
        }
        else {
            JOptionPane.showMessageDialog(primaryWindow, "Aniversariante de nome " + nome + " não foi encontrado.");
        }

    }
}
