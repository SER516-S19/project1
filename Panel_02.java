import javax.swing.*;
import java.awt.*;

/*--------------------------
This Panel belongs to Tab Jashua Drumm.(Tab 21)
Author: KRISHNA CHANDU AKULA
----------------------------*/

@SuppressWarnings("serial")
public class Panel_02 extends JPanel {

    public Panel_02() {
       addLabelToPanel();
   }
    
    //This Methods Adds Label to Panel which gets added to Tab_21 
    private void addLabelToPanel() {
        
       this.setLayout(new GridBagLayout());
        JLabel lbl = new JLabel("KRISHNA CHANDU AKULA");
        lbl.setAlignmentX(CENTER_ALIGNMENT);
        lbl.setFont(new Font("ChandusFont", Font.ITALIC, 19));
        lbl.setForeground(Color.decode("#A7D7C5"));//a7d7c5
        this.setBackground(Color.decode("#5C8D89"));//5c8d89
        this.add(lbl);
        this.setAlignmentX(CENTER_ALIGNMENT);

}
}