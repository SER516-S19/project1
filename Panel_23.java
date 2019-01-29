import java.awt.*;
import javax.swing.*;

/**
 * Panel 23
 * Trevor Forrey (tforrey)
 * Ser 516
 */
public class Panel_23 extends JPanel implements PanelInterface {

    private JLabel hiLabel;
    private JLabel nameLabel;

    /**
     * Panel 23 Constructor
     * Calls makePanel()
     */
    public Panel_23() {
        
        hiLabel = new JLabel("HI");
        nameLabel = new JLabel("Trevor Forrey");
        hiLabel.setHorizontalAlignment(JLabel.CENTER);
        nameLabel.setHorizontalAlignment(JLabel.CENTER);

        setLayout(new BorderLayout());

        add(nameLabel);
        setBackground(Color.YELLOW);
    }

     /**
     * sayHi
     * Adds/Removes "HI" label from the panel
     */
    public void sayHi(boolean sayHi) {
        if (sayHi) {
            add(hiLabel, BorderLayout.SOUTH);
        } else {
            remove(hiLabel);
        }
        validate();
    }

    /**
     * Test Code
     */
    // public static void main(String[] args) {
    //     JFrame f = new JFrame("Panel Example");
    //     f.setSize(300,300);    
    //     Panel_23 myPanel = new Panel_23();
    //     f.add(myPanel);  
    //     f.setVisible(true);  
    //     myPanel.sayHi(true);
    // }
}