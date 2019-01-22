import javax.swing.*;
import java.awt.*;

public class Panel_28 extends JPanel {
    public Panel_28() {
        init();
    }
    
    private void init() {
        this.setLayout(new GridBagLayout());
        JLabel nameLabel = new JLabel("Raju Koushik Gorantla");
        this.add(nameLabel);
        this.setBackground(Color.LIGHT_GRAY);
        this.setVisible(true);
    }
    
   
}
