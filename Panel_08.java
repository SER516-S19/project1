
//This file displays author's name on the JPanel.
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

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
		//Set Panel's properties.		
		this.setBackground(Color.ORANGE);
		Border border=new LineBorder(Color.RED);
	    this.setBorder(border);
	    this.setPreferredSize(new Dimension(300, 300));
		// panel.setBounds(50, 60, 300, 90);

		// Create the label and set the font and color.
		JLabel labelName = new JLabel("Pallavi Bahl");
		Font font = new Font("Times New Roman", Font.BOLD, 50);
		labelName.setFont(font);
		labelName.setForeground(Color.white);

		// Add the label to panel.
		this.add(labelName);

	}
	/*
	 * For testing purpose. 
	 * public static void main(String args[]) 
	 * { Panel_08 panel = new Panel_08();
	 */ 
	 /* For testing purpose. Create the frame and add the panel to frame.
	 * JFrame frame = new JFrame(); frame.add(panel); frame.setSize(400, 200);
	 * frame.setVisible(true);
	 * }
	*/
}
