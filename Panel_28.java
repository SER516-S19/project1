import javax.swing.*;
import java.awt.*;

public class Panel_28 extends JPanel implements PanelInterface {
    
    JLabel nameLabel;
	String panelText;
    public Panel_28() {
        
        this.setLayout(new GridBagLayout());
        nameLabel = new JLabel("Raju Koushik Gorantla");
        nameLabel.setFont(new Font("Arial", Font.BOLD,25));
        this.add(nameLabel);
        this.setBackground(Color.LIGHT_GRAY);
        this.setVisible(true);
        
    }
    
    @Override
    public void sayHi(boolean flag)
    {
        if(flag)
            this.nameLabel.setText("<html><center>Raju Koushik Gorantla<br>HI</center></html>");
        else
            this.nameLabel.setText("Raju Koushik Gorantla");
    }
    
   
}
