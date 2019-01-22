import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Aravinda Sai Kondamari
 * @GitId 43
 */
public class Panel_43 extends JPanel {

    Panel_43() {
        createPanel();
    }

    public void createPanel() {
        JLabel labelName = new JLabel("Aravinda Sai Kondamari_43");
        labelName.setFont(new Font("Monotype Corsiva", Font.BOLD, 12));
        add(labelName);
        setBackground(Color.GREEN);
        setForeground(Color.ORANGE);
    }
}
