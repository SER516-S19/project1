import javax.swing.*;
import java.awt.*;

/**
 * 
 * @author Kirti Jha GitID 34
 *
 */

public class Panel_34 extends JPanel implements PanelInterface {
    JLabel jlabel;
    public Panel_34()
    {

        this.setLayout(new GridBagLayout());
        jlabel = new JLabel("Kirti Jha");
        jlabel.setFont(new Font("Arial", Font.BOLD,20));
        this.add(jlabel );
        this.setBackground(Color.yellow);
        this.setVisible(true);
    }
    

    @Override
    public void sayHi(boolean flag)
    {
        if(flag)
            this.jlabel.setText("<html><center>Kirti Jha<br>HI!</center></html>");
        else
            this.jlabel.setText("Kirti Jha");
    }   
   
}

