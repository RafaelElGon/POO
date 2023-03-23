package JFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class JFrameInicial extends JFrame {
    public JFrameInicial(){
        setTitle("waltur");
        setSize(800, 600);
        setLocation(150, 150);
        setResizable(false);
        getContentPane().setBackground(Color.green);
    }
    public static void main (String[] args){
        JFrame window = new JFrameInicial();
        window.setVisible(true);
        WindowListener primaryWindowCloser = new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        };
        window.addWindowListener(primaryWindowCloser);
    }
}