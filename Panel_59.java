import java.awt.*; 
import javax.swing.*;

/** 
 * @author:  Bijayalaxmi Panda
 * @version: 3.0
 */

/**
 * Implements the PanelInterface to show 'Hi' in the panel
 * @see PanelInterface
 */

public class Panel_59 extends JPanel implements PanelInterface {
	
	final String labelText = "<html>Bijayalaxmi Panda</html>";
	final String labelTextWithGreeting = "<html>Bijayalaxmi Panda <br> Hi! </html>";
	
	Panel_59() {
		initPanel();
	}
	
	/**
	 * A method to set the Text, Background color, font in the panel
	 */
	private void initPanel() {
		JLabel panelInfo = new JLabel();
		panelInfo.setText(labelText);
		panelInfo.setVerticalTextPosition(SwingConstants.CENTER);
		panelInfo.setFont(new Font("Verdana", Font.BOLD, 18));
		panelInfo.setHorizontalAlignment(JLabel.CENTER);
		panelInfo.setVerticalTextPosition(JLabel.CENTER);
		
		this.setBackground(Color.yellow);
		this.add(panelInfo);
	}
	
	/**
	 * OverRide method to show 'Hi' or not in the panel
	 * depending on the hiFlag value
	 * @param hiFlag
	 * @see PanelInterface
	 */
	@Override
	public void sayHi(boolean hiFlag) {
		JLabel panelInfo = (JLabel)getComponent(0);
		
		if (hiFlag) {
			panelInfo.setText(labelTextWithGreeting);
		} else {
			panelInfo.setText(labelText);
		}
		
	}	
	
}
