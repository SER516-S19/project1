
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

/* panel_37
 * @author: Harshita Kajal
 * ID: 37
 */

public class Panel_37 extends JPanel
{
  Panel_37()  
   {  
	  buildPanel_37();
   }
  
  private JPanel buildPanel_37()
  {  
	  	 JLabel label = new JLabel("Harshita Kajal");
	  	 JPanel myPanel = new JPanel();
	     label.setFont(new Font("Arial",1,25)); 
	     myPanel.setBackground(Color.BLUE);
	     label.setForeground(Color.MAGENTA);
	     myPanel.add(label);
	     return myPanel;
	  
  }
}