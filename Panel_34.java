import javax.swing.*;
import java.awt.*;

public class Panel_34 extends JPanel {
    public Panel_34() {
        init();
    }
    
    /**
     * Method to Initialize components of the JPanel
     */
    private void init() {
        this.setLayout(new GridBagLayout());
        JLabel j = new JLabel("Kirti Jha");
        this.add(j);
        this.setBackground(Color.yellow);
        this.setVisible(true);
    }
    
   
}

