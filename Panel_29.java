import javax.swing.*;
import java.awt.*;

/**Panel Class Panel_29
 * Author: Abhishek Gupta
 * Created: 1/19/2019
 */
public class Panel_29 extends JPanel {
    public Panel_29() {
        init();
    }
    
    /**
     * Method to Initialize components of the JPanel
     */
    private void init() {
        this.setLayout(new GridBagLayout());
        JLabel nameLabel = new JLabel("Abhishek Gupta");
        this.add(nameLabel);
        this.setBackground(Color.lightGray);
        this.setVisible(true);
    }
    
    public static void main(String args[]) {
    	new Panel_29();
    }
}
