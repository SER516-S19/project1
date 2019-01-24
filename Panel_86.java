/*
 @author Aditya Vikram
 @Panel 86
 */

import javax.swing.*;
import java.awt.*;

public class Panel_86 extends JPanel implements PanelInterface{
	
	/*
	 Class Constructor
	 */
	private JLabel timerLabel;
	public Panel_86() {
		initPanel();
	}

	/*
	 The below method is used to create the panel with name
	 */
	
	private void initPanel() {
		String name = "Aditya Vikram";
		String message = "Hi";
		
		//JFrame frame = new JFrame(); //To test the panel
		//JPanel panel = new JPanel(); //To test the panel

		JLabel label = new JLabel(name);
		timerLabel = new JLabel(message);
		
		this.add(label);
		this.add(timerLabel);
		this.setBackground(Color.CYAN);

		label.setFont(new Font("Papyrus", Font.BOLD, 30));
		timerLabel.setFont(new Font("Papyrus", Font.BOLD, 30));
		
		label.setVisible(true);
		timerLabel.setVisible(false);
				
		/* To test the panel
		 frame.add(panel);
		 frame.setSize(300, 150);
         	 frame.setVisible(true);
		 */
		
	}
	
	@Override
	public void sayHi(boolean flag) {
		this.timerLabel.setVisible(flag);
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
