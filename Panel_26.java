/*
Author: Sakshi Gautam, GitID:26, Git username:sakshi7373
Description: Created panel 26 which displays name of student for SER516 Project1.
*/
package Project1;
import javax.swing.*;
import java.awt.*;
public class Panel_26 extends JPanel 
{
public Font font1;   
	public Panel_26()
	{
    	createPanel();
	}
	//Initialize the panel by adding label.
	public void createPanel()
	{
		//Creating a new label
		JLabel newLabel= new JLabel("Sakshi Gautam",JLabel.CENTER); 
		//Label Design
		font1= new Font("Cooper black", Font.BOLD, 25);
		newLabel.setFont(font1);
		newLabel.setForeground(Color.black);
		this.setBounds(100,100,100,100);  
		//add the label to a Panel
		this.add(newLabel);
		this.setBackground(Color.red);
	}
}
