import javax.swing.*;
import java.awt.*;

/**
 * This Panel belongs to Tab_21.
 * @author Tsao Yu-Ting
 * @email ytsao2@asu.edu
 * @date 1/19/2019
 */

@SuppressWarnings("serial")
public class Panel_82 extends JPanel implements PanelInterface {

	private JLabel label;
	private String myName = "Tsao Yu-Ting";
	
	public Panel_82() {
		
		label = new JLabel(myName);
		label.setFont(new Font("TimesRoman", Font.BOLD, 18));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.decode("#800000"));// Maroon
		this.setBackground(Color.decode("#FFD700"));// Gold
		this.setLayout(new BorderLayout());
		this.add(label);
    }

	@Override
	public void sayHi(boolean flag) {
		if (flag == true) {
			this.label.setText(myName + " HI!");
		} else {
			this.label.setText(myName);
		}
	}
}
