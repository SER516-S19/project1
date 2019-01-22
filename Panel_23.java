import java.awt.*;
import javax.swing.*;

/**
 * Panel 23
 * Trevor Forrey (tforrey)
 * Ser 516
 */
public class Panel_23 extends JPanel {
    /**
     * Panel 23 Constructor
     * Calls makePanel()
     */
    public Panel_23() {
        makePanel();
    }

     /**
     * makePanel
     * Creates a panel with a yellow background
     * and the name Trevor Forrey inside of it
     */
    private void makePanel() {
        add(new JLabel("Trevor Forrey"));
        setBackground(Color.YELLOW);
    }

    /**
     * Test Code
     */
    // public static void main(String[] args) {
    //     JFrame f = new JFrame("Panel Example");
    //     f.setSize(300,300);    
    //     f.add(new Panel_23());  
    //     f.setVisible(true);  
    // }
}