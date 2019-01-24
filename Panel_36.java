import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 * Asu Id: 1215180915
 * @author akashkadam
 * 
 *
 */
public class Panel_36 extends JPanel {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//Class constructor
	public Panel_36() {
		addPanel();
	}

	//method creating the panel
	private void addPanel() {	

		JLabel label = new JLabel("Akash Kadam");
		label.setFont(new Font("Arial", Font.BOLD, 20));
		this.add(label);
		this.setBorder(new LineBorder(Color.BLUE));
		this.setBackground(Color.ORANGE);
		this.setVisible(true);
	}

}
