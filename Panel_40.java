import javax.swing.*;
import java.awt.*;

public class Panel_40 extends JPanel {
    public Panel_40() {
        init();
    }
    
    /**
     * Method to Initialize components of the JPanel
     */
    private void init() {
        this.setLayout(new GridBagLayout());
        JLabel nameLabel = new JLabel("Trupti Khatavkar");
        this.add(nameLabel);
        this.setBackground(Color.yellow);
        this.setVisible(true);
    }
    
   
}
