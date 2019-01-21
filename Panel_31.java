import java.awt.*;  
import javax.swing.*;
 
 /**
 * A panel that displays a name is created in this Class
 * Author : Srivan Reddy Gutha, sgutha3@asu.edu ,GitID : 31
 */
 
public class Panel_31 extends JPanel
{
	public Panel_31()
	{
        initPanel();
    }
	
	private void initPanel()
    {
	 
	JLabel j_label = new JLabel();	

	this.add(j_label);		
	this.setBackground(Color.RED);		
	
	j_label.setFont(new Font("Arial",1,20));
	j_label.setText("Srivan Reddy");
	
	}

}