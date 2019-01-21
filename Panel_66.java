import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 * Panel_66() creates panel 66 for tab 5 in this application
 * The panel displays the Full name of the author
 * 
 * @author $Darshan Prakash
 */

public class Panel_66 extends JPanel {
	
	public Panel_66() {
		
		createPanel_66();
	}
	
	private void createPanel_66() {
		
	JLabel label = new JLabel();
	label.setText("Darshan Prakash");
	label.setForeground(new Color(255, 198, 39));
	setBackground(new Color(140, 29, 64));
	setBorder(new LineBorder(new Color(255, 198, 39)));
	setVisible(true);
        add(label);

	}

}
