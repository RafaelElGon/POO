package JFrameAgenda;

import javax.swing.*;
import java.awt.*;

public class AgendaGUIV3 extends JFrame {
    JLabel line1, line2;
    ImageIcon peumImg = new ImageIcon("./Imagens/peuns.jpg");
    ImageIcon addImg = new ImageIcon("./Imagens/addButton.jpg");
    ImageIcon deleteImg = new ImageIcon("./Imagens/removeButton.jpg");
    ImageIcon searchImg = new ImageIcon("./Imagens/searchButton.jpg");
    JButton addButton, searchButton, removeButton;

    public AgendaGUIV3(){
        setTitle("Agenda muito incrível :D");
        setSize(800, 800);
        setLocation(200,50 );
        setResizable(false);
        getContentPane().setBackground(Color.white);
        line1 = new JLabel("Agenda inacreditável!!!!!!!!!");
        line1.setForeground(Color.black);
        line2 = new JLabel(peumImg, JLabel.CENTER);
        addButton = new JButton("Add", addImg);
        //addButton.addActionListener(new AgendaAddController(agenda, this));
        searchButton = new JButton("Search", searchImg);
        //searchButton.addActionListener(new AgendaSearchController(agenda, this));
        removeButton = new JButton("Delete", deleteImg);
        //removeButton.addActionListener(new AgendaRemoveController(agenda, this));

        getContentPane().setLayout(new GridLayout(3, 2));
        getContentPane().add(line1);
        getContentPane().add(addButton);
        getContentPane().add(line2);
        getContentPane().add(searchButton);
        getContentPane().add(new JLabel());
        getContentPane().add(removeButton);
    }
    public static void main(String[] args) {
     JFrame window = new AgendaGUIV3();
     window.setVisible(true);
     window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
