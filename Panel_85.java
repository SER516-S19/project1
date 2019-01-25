/*
 @author Shivam Verma
 @Panel 85
 */

import javax.swing.*;
import java.awt.*;

public class Panel_85 extends JPanel implements PanelInterface {

    private JLabel tLabel;
	public Panel_85() {
		initPanel();
    }
    
	private void initPanel() {
        JLabel label = new JLabel("Shivam Verma");
        tLabel = new JLabel("Hi");
        this.setBackground(Color.LIGHT_GRAY);	
        this.add(label);
        this.add(tLabel);
        tLabel.setVisible(false);
    }

    @Override
	public void sayHi(boolean flag) {
		this.tLabel.setVisible(flag);
	}
}
