import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import java.awt.*;

/**
 *
 * @author Alsha Samantaray
 * gitID: 72
 */
 public class Panel_72 extends JPanel implements PanelInterface{
	 
	 Panel_72(){
         JLabel label = new JLabel("Alsha Samantaray",SwingConstants.CENTER);
         label.setVerticalAlignment(SwingConstants.CENTER);
         Font labelFont = new Font("Serif",Font.PLAIN,25);
         label.setFont(labelFont);
         setBorder(BorderFactory.createLineBorder(Color.black));
         setBackground(Color.GRAY);
         setVisible(true);
         add(label);
        
     }
	 
	@Override
	public void sayHi(boolean flag) {
		JLabel panelLabel = (JLabel)getComponent(0);
		if(flag)
		{
			panelLabel.setText("<html>Alsha Samantaray<br/>Hi!</html>");
		}
		else
		{
			panelLabel.setText("Alsha Samantaray");
		}
	}
	
 }