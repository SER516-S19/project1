import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Panel_66() creates panel 66 for tab 5 in this application
 * The panel displays the Full name of the author
 * 
 * @author $Darshan Prakash
 */

public class Panel_66 {
	
	public Panel_66() {
		
		createPanel_66();
	}
	
	private JPanel createPanel_66() {
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel();
		label.setText("Darshan Prakash");
		label.setForeground(new Color(255, 198, 39));
		panel.setBackground(new Color(140, 29, 64));
        panel.add(label);
        return panel;
	}

	public static void main(String[] args) {
		
		Panel_66 panel_66 = new Panel_66();
		JFrame frame = new JFrame();
		frame.add(panel_66.createPanel_66());
		frame.setSize(new Dimension(300,300));
		frame.setVisible(true);
	}

}
