import javax.swing.*;
import java.awt.*;
/** 
 * For SER 516-Project1, creating Panel_26 with student name label and hi Label.
 * @author Sakshi Gautam
 * @version 1.5
 * @since 01-24-2019
 */
public class Panel_26 extends JPanel implements PanelInterface 
{   
	private JLabel labelHi= new JLabel("Hi");
	/*Creating panel_26 by adding nameLabel and labelHi to it*/
	public Panel_26()
	{
		JLabel nameLabel= new JLabel("Sakshi Gautam",JLabel.CENTER);
		nameLabel.setFont(new Font("Cooper black", Font.BOLD, 25));
		nameLabel.setForeground(Color.black); 
		this.add(nameLabel);
		this.setBackground(Color.red);
        	this.setVisible(true);
        	labelHi.setFont(new Font("Cooper black", Font.BOLD, 25));
		this.add(labelHi);
		labelHi.setVisible(false);
	}
	/* function to set visibility of "Hi" label using flag which can be true or false.
	 * @param flag : Can be true or false
	 */
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
