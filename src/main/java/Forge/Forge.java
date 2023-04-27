package Forge;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Forge extends JFrame {
    JLabel label1, label2, label3;
    JButton b1, b2, b3, b4, b5;
    ImageIcon forge = new ImageIcon("./ForgeWeapons/forgeBackground.png");
    ImageIcon blackSmith = new ImageIcon("./ForgeWeapons/dwarf.png");
    ImageIcon yoana = new ImageIcon("./ForgeWeapons/YoanaPortrait.png");
    Armory armory = new Armory();
    private JPanel panel1;

    //TODO: Controllers e Listeners, terminar interface

    public Forge() {
        setTitle("Blacksmith");
        setSize(1600, 900);
        setLocation(0, 0);
        setResizable(false);

        JPanel panel = new JPanel();
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);


        label1 = new JLabel("WELCOME TO THE FORGE", SwingConstants.CENTER);
        label1.setForeground(Color.BLACK);
        label2 = new JLabel(yoana);
        label3 = new JLabel(forge);
        label3.setBounds(0, 0, getWidth(), getHeight());

        b1 = new JButton("<html>- Show me what you got there.<br/>(Mostrar o inventário da loja)</html>");
        b2 = new JButton("<html>- Hey, what do you think could be the main attribute of this weapon here?<br/>(Perguntar atributo da arma)</html>");
        b3 = new JButton("<html>- Store this weapon for me.<br/>(Guardar uma arma)</html>");
        b4 = new JButton("<html>- What are the attributes of these weapons?<br/>(Perguntar os atributos de uma coleção de armas)</html>");
        b5 = new JButton(" 'Testar uma arma nos bonecos de treino' ");

        b1.setFont(new Font("Palatino Linotype", Font.PLAIN, 16));
        b2.setFont(new Font("Palatino Linotype", Font.PLAIN, 16));
        b3.setFont(new Font("Palatino Linotype", Font.PLAIN, 16));
        b4.setFont(new Font("Palatino Linotype", Font.PLAIN, 16));
        b5.setFont(new Font("Palatino Linotype", Font.PLAIN, 16));

        b2.setSize(new Dimension(200,100));

        getContentPane().add(label3);
        getContentPane().add(label1);
        getContentPane().add(b1);
        getContentPane().add(b2);
        getContentPane().add(b3);
        getContentPane().add(b4);
        getContentPane().add(b5);
        this.add(panel);

        //adding the components to the horizontal group
        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addComponent(b1)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b2)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b3)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b4)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b5).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED));

        //adding the components to the vertical group
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(b1)
                        .addComponent(b2)
                        .addComponent(b3)
                        .addComponent(b4)
                        .addComponent(b5));

        panel.setBorder(BorderFactory.createEmptyBorder(720, 0, 0, 0));
        this.add(panel);
    }

    public static void main(String[] args) {
        JFrame window = new Forge();

        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        window.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                int answer = JOptionPane.showConfirmDialog(window, "Are ye sure ye want tae exit the shop?");
                if(answer == JOptionPane.YES_OPTION){
                    System.exit(0);
                }
            }
        });
    }
}