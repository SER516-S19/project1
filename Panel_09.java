import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * SER 516
 * 
 * @author Mayank Batra @Version: 1.3 @Start Date: 01/20/2019
 */

@SuppressWarnings("serial")
public class Panel_09 extends JPanel implements PanelInterface {
	private JLabel jlabel;

	Panel_09() {
		// A default constructor initializes a panel with labels
		jlabel = new JLabel("Mayank ID 09");
		jlabel.setFont(new Font("Calibri", 2, 20));
		this.add(jlabel);
	}

	@Override
	public void sayHi(boolean showHi) {
		// Public function to implement the Hi functionality with normal if else
		// comparison
		if (showHi == true) {
			// if condition evaluates to true show hi at the end
			jlabel.setText("Mayank ID 09 HI ");
		} else { // if condition is not true then show normal text
			jlabel.setText("Mayank ID 09 ");
		}
	}
}
