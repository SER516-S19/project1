import javax.swing.*;
import java.awt.*;

/**
 * --------------------------
 * 
 * @author krishnachanduakula
 * This Panel belongs to Tab Jashua Drumm.(Tab 21)
 *  ----------------------------
 */

@SuppressWarnings("serial")
public class Panel_02 extends JPanel implements PanelInterface {
	JLabel lbl;
	String myName = "KRISHNA CHANDU AKULA";

	public Panel_02() {

		this.setLayout(new GridBagLayout());
		lbl = new JLabel(myName);
		lbl.setAlignmentX(CENTER_ALIGNMENT);
		lbl.setFont(new Font("ChandusFont", Font.ITALIC, 19));
		lbl.setForeground(Color.decode("#A7D7C5"));// a7d7c5
		this.setBackground(Color.decode("#5C8D89"));// 5c8d89
		this.add(lbl);
		this.setAlignmentX(CENTER_ALIGNMENT);

	}

	@Override
	public void sayHi(boolean flag) {
		if (flag) {
			// Aligning "HI" to center by styling with div tag in html
			String alignment = "<div style = 'text-align: center;'>";
			lbl.setText("<html>" + myName + "<br>" + alignment + "HI" + "</div>" + "</html>");

		} else {
			lbl.setText(myName);

		}
	}
}