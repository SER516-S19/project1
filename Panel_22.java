import javax.swing.*;
import java.awt.*;

/*--------------------------
This Panel belongs to Tab Jashua Drumm.
Author: Sai Ram Eadala
----------------------------*/

@SuppressWarnings("serial")
public class Panel_22 extends JPanel {

    public Panel_22() {
       initComponents();
   }
    
    private void initComponents() {
        
       this.setLayout(new GridBagLayout());
        JLabel label = new JLabel("SaiRam Eadala");
        label.setAlignmentX(CENTER_ALIGNMENT);
        label.setFont(new Font("Italic", Font.ITALIC, 18));
        label.setForeground(Color.LIGHT_GRAY);
        this.setBackground(Color.WHITE);
        this.add(label);
        this.setAlignmentX(CENTER_ALIGNMENT);

}
}