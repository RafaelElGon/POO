package JFrameAgenda;

import javax.swing.*;
import java.awt.*;

public class AgendaGUIV2 extends JFrame {
    JLabel linha1, linha2;
    ImageIcon img = new ImageIcon("./Imagens/image.png");
    public AgendaGUIV2(){
        setTitle("Janela");
        setSize(1080, 720);
        setLocation(200, 50);
        setResizable(false);
        getContentPane().setBackground(Color.white);
        linha1 = new JLabel("texto", JLabel.CENTER);
        linha1.setForeground(Color.black);
        linha1.setFont(new Font("Comic Sans", Font.PLAIN, 24));
        linha2 = new JLabel(finger, JLabel.CENTER);
        getContentPane().setLayout(new GridLayout(3, 2));
        getContentPane().add(linha1);
        getContentPane().add(linha2);
    }
    public static void main(String[] args) {
        JFrame window = new AgendaGUIV2();
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
