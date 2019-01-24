import java.awt.*;
import javax.swing.*;


/**
 * Panel 61
 * @author Yuvan Pradeep
 * @version 2.0
 */

public class Panel_61 extends JPanel implements PanelInterface{
    
    private JLabel label = new JLabel();
    private String user_name = "Yuvan Pradeep";
    
    public Panel_61()
    {
        label.setText(user_name);
        label.setFont(new Font("Calibri",Font.PLAIN,20));
        add(label);
        setBackground(Color.LIGHT_GRAY);
    }
    
    @Override
	public void sayHi(boolean flag) {
		if(flag) {
			label.setText(user_name + " " + "HI");
        } 
        else {
			label.setText(user_name);
		}
	}

}
