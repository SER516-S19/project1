
//This file displays author's name on the JPanel.
import java.awt.*;
import javax.swing.*;

/**
 * This class is responsible for displaying author's name on the JPanel .
 * 
 * @author Pallavi,Bahl
 */
public class Panel_08 extends JPanel {
	/**
	 * Constructor calls the method to display the panel.
	 */
	public Panel_08() {
		displayPanel_08();
	}

	/**
	 * This method displays the name on Panel.
	 */
	void displayPanel_08() {
		// Create the panel and set its properties.
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		// panel.setBounds(50, 60, 300, 90);

		// Create the label and set the font and color.
		JLabel labelName = new JLabel("Pallavi Bahl");
		Font font = new Font("Times New Roman", Font.BOLD, 50);
		labelName.setFont(font);
		labelName.setForeground(Color.white);

		// Add the label to panel.
		panel.add(labelName);

		/*
		 * For testing purpose. Create the frame and add the panel to frame. JFrame
		 * frame = new JFrame(); frame.add(panel); frame.setSize(400, 200);
		 * frame.setVisible(true);
		 */

	}
	/*
	 * For testing purpose. 
	 * public static void main(String args[]) 
	 * { new Panel_08();
	 * }
	 */

}
