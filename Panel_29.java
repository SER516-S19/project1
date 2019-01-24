import javax.swing.*;
import java.awt.*;

/**Panel Class Panel_29
 * Author: Abhishek Gupta
 * Created: 1/19/2019
 */
public class Panel_29 extends JPanel implements PanelInterface {
    public Panel_29() {
        this.setLayout(new GridBagLayout());
        JLabel nameLabel = new JLabel("Abhishek Gupta");
        this.add(nameLabel);
        this.setBackground(Color.lightGray);
        this.setVisible(true);
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
