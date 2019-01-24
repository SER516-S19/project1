import java.awt.*;  
import javax.swing.*;
import javax.swing.border.LineBorder;


/*  Author Mayank Batra 
 * This class returns a panel on object creation 
 * panel creation is carried out under constructor
 */

@SuppressWarnings("serial")
public class Panel_09 extends JPanel implements PanelInterface
{
	private JLabel jlabel;
	Panel_09()  
    {  
     jlabel = new JLabel("Mayank ID 09");
    // Font defined for label
 	jlabel.setFont(new Font("Calibri",2,20));
    this.add(jlabel);
    }

	@Override
	public void sayHi(boolean flag) 
	{
		// Public function to implement the Hi functionality with normal if else comparison 
		if (flag==true)
		{
			// if condition evaluates to true show hi at the end 
			jlabel.setText("Mayank ID 09 HI ");
		}
		else
		{	// if condition is not true then show normal text
			jlabel.setText("Mayank ID 09 ");
		}	 
		}		
}


