/*
 @author Aditya Vikram
 @Panel 86
 */

import javax.swing.*;
import java.awt.*;

public class Panel_86 extends JPanel {
	
	/*
	 Class Constructor
	 */
	
	public Panel_86() {
		initPanel();
	}

	/*
	 The below method is used to create the panel with name
	 */
	
	private void initPanel() {
		String name = "Aditya Vikram";
		
		//JFrame frame = new JFrame(); //To test the panel
		//JPanel panel = new JPanel(); //To test the panel
		JLabel label = new JLabel(name);
		
		this.add(label);
		this.setBackground(Color.CYAN);

		label.setFont(new Font("Papyrus", Font.BOLD, 20));
				
		/* To test the panel
		 frame.add(panel);
		 frame.setSize(300, 150);
         	 frame.setVisible(true);
		 */
		
	}
	
	/*
	 Main Function
	 */
	
	/* To test the panel
	public static void main(String args[]) {
		Panel_86 panel = new Panel_86();
	}
	 */
	
}
