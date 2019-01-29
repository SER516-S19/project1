import javax.swing.*;
import java.awt.*;

/**Panel Class Panel_29
 * Author: Abhishek Gupta
 * Created: 1/19/2019
 */
public class Panel_29 extends JPanel implements PanelInterface {
    private JLabel PanelLabel = new JLabel();
    private String UserName = "Abhishek Gupta";
	
    /**
    * Class constructor.
    */
    public Panel_29() {
        setLayout(new GridBagLayout());
        PanelLabel.setText(UserName);
        add(PanelLabel);
        setBackground(Color.lightGray);
        setVisible(true);
    }
    
    /**
    * This method has been overridden from the interface toggles
    * the text on the panel to show Hi when the flag is true.
    */
    @Override
    public void sayHi(boolean flag) {
	if(flag) {
		label.setText(UserName + " " + "HI");
	}
	else {
		label.setText(UserName);
	}
    }  
}
