import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel_10 extends JPanel implements PanelInterface {
	
	/**
	 * @author Ankita
	 */
	private String name = "Ankita Shivanand";
	private JLabel jlabelObj = new JLabel();
	

	public Panel_10() {
		jlabelObj.setText(name);
		/* Set Font*/
		jlabelObj.setFont(new Font("Courier",Font.BOLD,20));
		add(jlabelObj);
		/*Set background color*/
		setBackground(Color.YELLOW);
		
	}

	/* Implementing the method from PaneInterface */
	 @Override
		public void sayHi(boolean flag) {
			if(flag) {
				jlabelObj.setText(name + " " + "HI");
	        } 
	        else {
	        	jlabelObj.setText(name);
			}
		}
				
	
}
