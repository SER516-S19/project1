import javax.swing.*;
import java.awt.*;

public class Panel_57 extends JPanel {
    public Panel_57() {
        init();
    }
    
    /**
     * Method to Initialize components of the JPanel
     */
    private void init() {
        this.setLayout(new GridBagLayout());
        JLabel nameLabel = new JLabel("Carnic");
        this.add(nameLabel);
        this.setBackground(Color.yellow);
        this.setVisible(true);
    }
    
   
}