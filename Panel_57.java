import javax.swing.*;
import java.awt.*;

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
            this.nameLabel.setText("Hi Carnic!");
        else
            this.nameLabel.setText("Carnic");
    }
    
}
