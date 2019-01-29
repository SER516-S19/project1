import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * This class creates a Jpanel and its contents
 * that will be used in tabs as per the project.
 * 
 * @author Aravinda Sai Kondamari - AravindSaiK
 * @version 2.0
 * Id: 43
 */

public class Panel_43 extends JPanel implements PanelInterface{

    JLabel labelHi;

    public Panel_43() {
        JLabel labelName = new JLabel("Aravinda Sai Kondamari");
        labelName.setFont(new Font("TimesRoman", Font.ITALIC, 24));
        labelName.setHorizontalAlignment(JLabel.CENTER);
        labelName.setVerticalAlignment(JLabel.CENTER);
        labelHi = new JLabel("Hi!");
        labelHi.setFont(new Font("TimesRoman", Font.BOLD, 26));
        labelHi.setHorizontalAlignment(JLabel.CENTER);
        setLayout(new BorderLayout());
        add(labelName);
        setBackground(Color.GREEN);
    }

    /** 
     * Method from common interface, when
     * called will display "Hi!".
     */
    @Override
    public void sayHi(boolean showHi) {
          if (showHi) {
            add(labelHi, BorderLayout.SOUTH);
        } else {
            remove(labelHi);
        }
        validate();
    }
}
