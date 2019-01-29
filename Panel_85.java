import javax.swing.*;
import java.awt.*;

/**  The below class implements Panel 85
*
* @author : Shivam Verma
* @version : 2.0
* @GitId : 85
*/

public class Panel_85 extends JPanel implements PanelInterface {

	private static final long serialVersionUID = 1L;
	private JLabel displayMessageLabel;
    
	public Panel_85() {
		initPanel();
    }
    
	/*
	 * The below method is used to create the panel with name
	 */
	
	private void initPanel() {
		
        JLabel label = new JLabel("Shivam Verma");
        displayMessageLabel = new JLabel("Hi");
        setBackground(Color.LIGHT_GRAY);	
        add(label);
        add(displayMessageLabel);
        displayMessageLabel.setVisible(false);
    }

	
    @Override
	public void sayHi(boolean isDisplayMessageVisible) {
		displayMessageLabel.setVisible(isDisplayMessageVisible);
	}
}
