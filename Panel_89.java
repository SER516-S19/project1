import java.awt.*;
import javax.swing.*;

/*
 * Author: Ruby (Qianru) Zhao - qrzhao
 * ID: 89
 * Class producing a single panel that prints out the student's
 * name, to be placed in Tab_69. Prints "Hi" when True is passed
 * into the sayHi method
 */

public class Panel_89 extends JPanel implements PanelInterface {
	
	//Class constructor
	public Panel_89() {
		JLabel label = new JLabel("Qianru Zhao");
    	label.setFont(new Font("Georgia", Font.PLAIN, 20));
    
    	setBackground(Color.LIGHT_GRAY);  
    	setVisible(true);
    	add(label);
	}
	
	//Method to allow "Hi" message to be printed
	public void sayHi(boolean flag) {
		JLabel hiLabel = (JLabel)getComponent(0);
		
		if(flag)
			hiLabel.setText("<html>Qianru Zhao<br/>Hi!</html>");
		else
			hiLabel.setText("Qianru Zhao");
	}
	
}
