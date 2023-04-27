package Forge.Interactions;

import Forge.Armory;
import Forge.weaponDEX;
import Forge.weaponMDR;
import Forge.weaponSTR;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DamageTesterController implements ActionListener {
    private Armory armory;
    private JFrame window;

    public DamageTesterController(Armory armory, JFrame window) {
        this.armory = armory;
        this.window = window;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        JOptionPane.showMessageDialog(window, """
                What d'ye intend t' use today?
                Weapons that require strength
                Moderate weapons
                Dexterity weapons""");

        //using JCheckbox to make options of types of weapons
        JCheckBox weapon1 = new JCheckBox("Strength weapons");
        JCheckBox weapon2 = new JCheckBox("Moderate weapons");
        JCheckBox weapon3 = new JCheckBox("Dexterity weapons");

        ButtonGroup weaponGroup = new ButtonGroup(); //make weapon1 to weapon3 be options to choose from
        weaponGroup.add(weapon1);
        weaponGroup.add(weapon2);
        weaponGroup.add(weapon3);

        panel.add(weapon1); //add the buttons to a panel
        panel.add(weapon2);
        panel.add(weapon3);

        frame.add(panel); //add panel to the frame d
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

        if(weapon1.isSelected()){
            String weaponName = JOptionPane.showInputDialog(window, "Name yer weapon (Nome da arma)");
            JOptionPane.showMessageDialog(window, "Now giv' it a good hit!");

            int dmg = armory.weaponDmg(new weaponSTR(weaponName, 0));
            if(dmg > 8){
                JOptionPane.showMessageDialog(window, "That's a good hit!");
            }
        } else if(weapon2.isSelected()){
            String weaponName = JOptionPane.showInputDialog(window, "Name yer weapon (Nome da arma)");

            int dmg = armory.weaponDmg(new weaponMDR(weaponName, 0));
            if(dmg > 6){
                JOptionPane.showMessageDialog(window, "That's a good hit!");
            }
        } else {
            String weaponName = JOptionPane.showInputDialog(window, "Name yer weapon (Nome da arma)");

            int dmg = armory.weaponDmg(new weaponDEX(weaponName, 0));
            if(dmg > 4){
                JOptionPane.showMessageDialog(window, "That's a good hit!");
            }
        }



    }
}