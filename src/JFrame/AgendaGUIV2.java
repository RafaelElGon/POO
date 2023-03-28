package JFramePackage;

import javax.swing.*;
import java.awt.*;

public class AgendaGUIV2 extends JFrame {
    JLabel linha1, linha2;
    ImageIcon finger = new ImageIcon("./imagens/among-us-twerk.gif");
    public AgendaGUIV2(){
        setTitle("waltur");
        setSize(1080, 720);
        setLocation(500, 0);
        setResizable(false);
        getContentPane().setBackground(Color.white);
        linha1 = new JLabel("bere cal sal", JLabel.CENTER);
        linha1.setForeground(Color.black);
        linha1.setFont(new Font("Comic Sans", Font.PLAIN, 76));
        linha2 = new JLabel(finger, JLabel.CENTER);
        getContentPane().setLayout(new GridLayout(3, 1));
        getContentPane().add(linha1);
        getContentPane().add(linha2);
    }
    public static void main(String[] args) {
        JFrame window = new AgendaGUIV2();
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
