import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

/**
 * Panel_46 creation
 * 
 * @author Sneha Lakshminarasimhan
 * @version 1.0
 */

public class Panel_46 extends JPanel{
	
	//constructor
	public Panel_46() {
		createMyPanel();
	}
	
	//panel creation
	private void createMyPanel() {
		
		JPanel panel46= new JPanel();
		JLabel myLabel = new JLabel("Sneha Lakshminarasimhan");
		
		panel46.add(myLabel);
		
		//styling the Panel
		panel46.setBounds(20,30,50,60);
		panel46.setBackground(Color.ORANGE);
		panel46.setForeground(Color.RED);
		
		//styling the Label
		myLabel.setFont(new Font("Calibri",Font.ITALIC,15));
		
	}
}
