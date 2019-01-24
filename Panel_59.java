import java.awt.*; 
import javax.swing.*;

/* 
 * @author:  Bijayalaxmi Panda
 */

public class Panel_59 extends JPanel implements PanelInterface {
	
	private String myLabelName = "<html>Bijayalaxmi Panda</html>";
	private String myLabelGreeting = "<html>Bijayalaxmi Panda <br> Hi! </html>";
	
	Panel_59() {
		myPanel();
	}
	
	private void myPanel() {
		JLabel myPanelInfo = new JLabel();
		myPanelInfo.setText(myLabelName);
		myPanelInfo.setVerticalTextPosition(SwingConstants.CENTER);
		myPanelInfo.setFont(new Font("Verdana", Font.BOLD, 18));
		myPanelInfo.setHorizontalAlignment(JLabel.CENTER);
		myPanelInfo.setVerticalTextPosition(JLabel.CENTER);
		
		this.setBackground(Color.yellow);
		this.add(myPanelInfo);
	}
	
	@Override
	public void sayHi(boolean hiFlag) {
		JLabel myPanelInfo = (JLabel)getComponent(0);
		if (hiFlag) {
			myPanelInfo.setText(myLabelGreeting);
		} else {
			myPanelInfo.setText(myLabelName);
		}
		
	}	
	
}
