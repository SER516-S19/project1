import java.awt.*;
import javax.swing.*;

/*
 * Author: Ruby (Qianru) Zhao - qrzhao
 * ID: 89
 * Class producing a single panel that prints out the student's
 * name, to be placed in Tab_69.
 */

public class Panel_89 extends JPanel {
	
	//Class constructor
	public Panel_89() {
		constructPanel();
	}
	
	//Private method creating the panel
	private void constructPanel() {		
		JLabel label = new JLabel("Qianru Zhao");
        label.setFont(new Font("Georgia", Font.PLAIN, 16));
        
        JPanel panel = new JPanel();
        panel.add(label);
        panel.setBackground(Color.white);  
        panel.setVisible(true);
	}
}
