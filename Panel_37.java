import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

/** panel_37 creation for displaying panel name with 'Hi'
 * @author: Harshita Kajal
 * @ID: 37
 * @gitUserID: HarshitaKAM
 * @version 1.1
 */

public class Panel_37 extends JPanel implements PanelInterface
{

// Constructor for buildPanel attributes
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
  
  @Override
	public void sayHi(boolean flag) {
		JLabel myLabel = (JLabel)getComponent(0);
		if(flag)
		{
			myLabel.setText("<html>Harshita Kajal<br/>Hi!</html>");
		}
		else
		{
			myLabel.setText("Harshita Kajal");
		}
	}

}
