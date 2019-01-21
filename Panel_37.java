
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

/* panel_37 creation for displaying panel name 
 * @author: Harshita Kajal
 * ID: 37
 */

public class Panel_37 extends JPanel
{

/* Constructor for panel */
  public Panel_37()  
   {  
	  buildPanel_37();
   }
  
  private void buildPanel_37()
  {  
	     JLabel label = new JLabel("Harshita Kajal");
	  
	     label.setFont(new Font("Arial",1,25)); 
	     label.setForeground(Color.MAGENTA);
	     setBackground(Color.BLUE);
	     setVisible(true);
	     add(label);	     
	  
  }
}
