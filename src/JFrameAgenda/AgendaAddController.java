package JFrameAgenda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgendaAddController implements ActionListener {
    private Agenda agenda;
    private JFrame primaryWindow;

    public AgendaAddController(Agenda agenda, JFrame primaryWindow){
        this.agenda = agenda;
        this.primaryWindow = primaryWindow;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nome = JOptionPane.showInputDialog(primaryWindow, "Nome do aniversariante:");

        int dia = Integer.parseInt(JOptionPane.showInputDialog(primaryWindow, "Dia do mês em que nasceu: [1 - 31]"));

        int mes = Integer.parseInt(JOptionPane.showInputDialog(primaryWindow, "Mês em que nasceu: [1 - 12]"));

        boolean cadastrou = agenda.cadastraContato(nome, dia, mes);

        if(cadastrou){
            JOptionPane.showMessageDialog(primaryWindow, "Aniversariante cadastrado.");
        } else{
            JOptionPane.showMessageDialog(primaryWindow, "Aniversariante " + nome + " não foi cadastrado. " +
                    "Verifique se já está cadastrado no sistema.");
        }
    }
}
