import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import java.awt.*;

/**
 *This class creates a panel and sets the visible text.
 *
 * @author Alsha Samantaray
 * gitID: 72
 */
 public class Panel_72 extends JPanel implements PanelInterface{
	 
	 Panel_72()
	 {
         JLabel panelText = new JLabel("Alsha Samantaray",SwingConstants.CENTER);
         panelText.setVerticalAlignment(SwingConstants.CENTER);
         int fontSize = 25;
         Font labelFont = new Font("Serif",Font.PLAIN,fontSize);
         panelText.setFont(labelFont);
         setBorder(BorderFactory.createLineBorder(Color.black));
         setBackground(Color.GRAY);
         setVisible(true);
         add(panelText);
        
     }
	 
	 /**
	  * @param flag sets Hi as the panel text when true
	  */
	@Override
	public void sayHi(boolean flag) 
	{
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