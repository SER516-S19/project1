import javax.swing.*;
import java.awt.*;

/**
 * --------------------------
 * 
 * @author Carnic
 * This Panel belongs to Tab Jashua Drumm.(Tab 21)
 *  ----------------------------
 */



public class Panel_57 extends JPanel implements PanelInterface{
    JLabel nameLabel;
    String panelText;

    public Panel_57() {
        this.setLayout(new GridBagLayout());
        nameLabel = new JLabel("Carnic");
        nameLabel.setFont(new Font("Verdana", Font.BOLD, 20));
        this.add(nameLabel);
        this.setBackground(Color.gray);
        this.setVisible(true);
    }
    
    public void sayHi(boolean flag)
    {
        if(flag)
            //central alligning the text
            this.nameLabel.setText("<html><center>Hi<br>Carnic!</center></html>");
        else
            this.nameLabel.setText("<html><center>Carnic!</center></html>");
    }
    
}
