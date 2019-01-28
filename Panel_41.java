import java.awt.*;
import javax.swing.*;

/**
 * Creation of Panel_41 with formatted name
 * @author Harika Kolli
 * @version 3.0
 */

class Panel_41 extends JPanel implements PanelInterface 
{
	private JLabel label = new JLabel();
	private String panel_name = "Harika Kolli";
	
	/**
    	*  Panel_41 constructor to create and style the panel 
    	*/	
    
    	public Panel_41() 
    	{
    		label.setText(panel_name);
        	label.setFont(new Font("Calibri",Font.ITALIC,18));
        	add(label);
        	setBackground(Color.YELLOW);
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
    			label.setText(panel_name+ " HI");
    		}
    		else
    		{
    			label.setText(panel_name);
    		}	
    	}
}
