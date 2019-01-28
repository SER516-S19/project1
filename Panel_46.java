import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

/**
 * Creation of Panel_46 with formatted name
 * @author Sneha Lakshminarasimhan
 * @version 3.0
 */

public class Panel_46 extends JPanel implements PanelInterface {
	
	private String myName = "Sneha Lakshminarasimhan";
	private JLabel myLabel = new JLabel(myName);
	
	/**
    	*  Panel_46 constructor to create and style the panel 
    	*/
	
	public Panel_46() 
	{
		myLabel.setText(myName);
		myLabel.setFont(new Font("Arial Bold Italic", Font.BOLD,15));
		add(myLabel);
		myLabel.setHorizontalAlignment(SwingConstants.CENTER);
		setBackground(Color.pink);
		setBorder(BorderFactory.createLineBorder(Color.black, 1));
	}
	
    	/**
    	* Display name with "HI" based on flag. 
    	*
    	* @param flag, To display name with HI or not
    	* flag = true wil display name with HI
    	* flag = false will display just the name 
   	* 
    	*/
	
	@Override
	public void sayHi(boolean flag) 
	{
		if(flag) 
		{
			myLabel.setText(myName+" "+"Hi");
		}
		else 
		{
			myLabel.setText(myName);
		}
	}
}
