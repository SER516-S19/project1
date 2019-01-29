import javax.swing.*;
import java.awt.*;

/**Panel Class Panel_29
 * Author: Abhishek Gupta
 * Created: 1/19/2019
 */
public class Panel_29 extends JPanel implements PanelInterface {
    private JLabel label = new JLabel();
    private String name = "Abhishek Gupta";
    public Panel_29() {
        setLayout(new GridBagLayout());
        label.setText(name);
        add(label);
        setBackground(Color.lightGray);
        setVisible(true);
    }
    
    @Override
	public void sayHi(boolean flag) {
		if(flag) {
            label.setText(name + " " + "HI");
        } 
        else {
			label.setText(name);
		}
	}
    
}
