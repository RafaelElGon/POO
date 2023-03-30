package JFrameAgenda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;

public class AgendaSearchController implements ActionListener {
    private Agenda agenda;
    private JFrame primaryWindow;

    public AgendaSearchController(Agenda agenda, JFrame primaryWindow) {
        this.agenda = agenda;
        this.primaryWindow = primaryWindow;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int dia = Integer.parseInt(JOptionPane.showInputDialog(primaryWindow, "Dia do mês para pesquisar: [1 - 31]"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog(primaryWindow, "Mês para pesquisar: [1 - 12]"));

        Collection<Contato> aniversariantes = agenda.pesquisaAniversariantes(dia, mes);

        if(aniversariantes.size() > 0){
            JOptionPane.showMessageDialog(primaryWindow, "Aniversariantes encontrados: ");

            for(Contato c: aniversariantes){
                JOptionPane.showMessageDialog(primaryWindow, c.toString());
            }
        }
        else {
            JOptionPane.showMessageDialog(primaryWindow, "Não foi encontrado aniversariante na data " + dia + "/" + mes);
        }
    }
}
