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
		
		//JPanel panel46= new JPanel();
		JLabel myLabel = new JLabel("Sneha Lakshminarasimhan");
		myLabel.setFont(new Font("Arial Bold Italic", Font.BOLD,15));
		add(myLabel);
		//styling the Label
		//panel46.setBounds(20,30,50,60);
		myLabel.setHorizontalAlignment(SwingConstants.CENTER);
		setBackground(Color.pink);	//setting background color to orange
		setBorder(BorderFactory.createLineBorder(Color.black, 1));

		
	}
}
