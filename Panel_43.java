import java.awt.BorderLayout;
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
public class Panel_43 extends JPanel implements PanelInterface{

    public Panel_43() {
        JLabel labelName = new JLabel("Aravinda Sai Kondamari_43");
        labelName.setFont(new Font("TimesRoman", Font.ITALIC, 14));
        labelName.setHorizontalAlignment(JLabel.CENTER);
        setLayout(new BorderLayout());
        add(labelName);
        setBackground(Color.GREEN);
    }

    @Override
    public void sayHi(boolean showHi) {
        JLabel labelHi = new JLabel("Hi");
        labelHi.setFont(new Font("TimesRoman", Font.BOLD, 16));
        labelHi.setHorizontalAlignment(JLabel.CENTER);
          if (showHi) {
            add(labelHi, BorderLayout.SOUTH);
        } else {
            remove(labelHi);
        }
        validate();
    }
}