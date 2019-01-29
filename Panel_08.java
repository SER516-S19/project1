
//This file displays author's name on the JPanel.
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 * This class is responsible for displaying author's name on the JPanel . It
 * also displays a second label 'Hi'.
 * 
 * @author Pallavi,Bahl
 */
@SuppressWarnings("serial")
public class Panel_08 extends JPanel implements PanelInterface {
	/**
	 * Constructor calls the method to display the panel.
	 */
	public Panel_08() {
		// Set Panel's properties.
		this.setBackground(Color.ORANGE);
		Border border = new LineBorder(Color.RED);
		this.setBorder(border);

		// Create the label to display name and set the font and color.
		JLabel labelName = new JLabel("Pallavi Bahl");
		Font font = new Font("Times New Roman", Font.BOLD, 50);
		labelName.setFont(font);
		labelName.setForeground(Color.white);

		// Set properties of second label that displays 'Hi'.
		labelHi = new JLabel("Hi");
		labelHi.setFont(font);
		labelHi.setForeground(Color.RED);
		labelHi.setVisible(false);

		// Add the labels to panel.
		this.add(labelName);
		this.add(labelHi);
	}

	// Create the second label to display 'Hi'.
	private JLabel labelHi;

	/**
	 * This method sets the visibility of label that displays 'Hi' based on boolean
	 * parameter passed.
	 */

	@Override
	public void sayHi(boolean flag) {

		this.labelHi.setVisible(flag);
	}
}
