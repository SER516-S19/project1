import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Creation of Panel_10 
 * @author Ankita Shivanand
 * @version 3.0
 */

public class Panel_10 extends JPanel implements PanelInterface {
	
	private String name = "Ankita Shivanand";
	private JLabel jlabelObj = new JLabel();
	
	/**
    	*  Panel_10 constructor to create and style the panel 
    	*/

	public Panel_10() 
	{
		jlabelObj.setText(name);
		jlabelObj.setFont(new Font("Courier",Font.BOLD,20));
		add(jlabelObj);
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
			jlabelObj.setText(name + " " + "HI");
	        } 
	        else 
		{
	        	jlabelObj.setText(name);
		}
	}
				
	
}
