/* Author: Sakshi Gautam, GitID:26, Git username:sakshi7373
Description: Created panel 26 which displays name of student for SER516 Project1.
*/
import javax.swing.*;
import java.awt.*;
public class Panel_26 extends JPanel implements PanelInterface 
{   
	private JLabel labelHi= new JLabel("Hi");
	public Panel_26()
	{
    		//Creating a new label for Panel_26
		JLabel nameLabel= new JLabel("Sakshi Gautam",JLabel.CENTER);
		//Label Design for namelabel 
		nameLabel.setFont(new Font("Cooper black", Font.BOLD, 25));
		nameLabel.setForeground(Color.black); 
		this.add(nameLabel);
		this.setBackground(Color.red);
        	this.setVisible(true);
        	//Label Design for labelHi
        	labelHi.setFont(new Font("Cooper black", Font.BOLD, 25));
		this.add(labelHi);
		labelHi.setVisible(false);
	}
	//function to set visibility of "Hi" label
	@Override
	public void sayHi(boolean flag) 
	{
		if(flag==true)
		{
			labelHi.setVisible(true);
		}
		else
		{
			labelHi.setVisible(false);
		}
	}
} 
