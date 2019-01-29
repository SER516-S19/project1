import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author Archana Madhavan
 * @version 3.0 SER516 Project1
 */

/**
 * Creating a Panel to show name and a label saying Hi.
 */
public class Panel_49 extends JPanel implements PanelInterface {

	// Creating Label for "Hi"
	JLabel hiLabel = new JLabel("Hi");

	Panel_49() {

		// Creating Label to display name
		JLabel nameLabel = new JLabel("Archana Madhavan");
		nameLabel.setFont(new Font("Verdana", Font.BOLD, 24));

		// setting Panel specifications
		this.add(nameLabel);
		this.setBackground(Color.YELLOW);

		hiLabel.setFont(new Font("Verdana", Font.BOLD, 24));
		hiLabel.setPreferredSize(new Dimension(50, 50));
		this.add(hiLabel);
		hiLabel.setVisible(false);

	}

	@Override
	/*
	 * method to set the visibility of the label depending on flag value.
	 */
	public void sayHi(boolean flag) {

		hiLabel.setVisible(flag);

	}

}
