/*
Author: Sakshi Gautam, GitID:26, Git username:sakshi7373
Description: Created panel 26 which displays name of student for SER516 Project1.
*/
import javax.swing.*;
import java.awt.*;
public class Panel_26 extends JPanel 
{   
	public Panel_26()
	{
    	        //Creating a new label for Panel_26
		JLabel newLabel= new JLabel("Sakshi Gautam",JLabel.CENTER); 
		//Label Design
		newLabel.setFont(new Font("Cooper black", Font.BOLD, 25));
		newLabel.setForeground(Color.black); 
		//add the label to a Panel
		this.add(newLabel);
		this.setBackground(Color.red);
	}
} 
