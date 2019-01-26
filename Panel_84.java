import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

@SuppressWarnings("serial")

/**
 * Only For SER 516, Panel 84 with name and Hi Labels
 * 
 * @author Shashidhar Reddy Vanteru
 * @since 01-18-2019
 * 
 */

public class Panel_84 extends JPanel implements PanelInterface {
	private JLabel labelName = new JLabel("Shashidhar reddy", JLabel.CENTER);
	private JLabel labelMessage = new JLabel("<html><br>Hi</html>", JLabel.CENTER);

	// Constructor to style label and Panel
	public Panel_84() {

		Color color = new java.awt.Color(0, 255, 255);
		Border lineBorder = new LineBorder(Color.GRAY);
		Font fontSetter = new Font("TimesRoman", Font.BOLD + Font.ITALIC, 22);

		this.setBackground(color);
		this.setForeground(Color.BLACK);
		this.setBorder(lineBorder);

		labelName.setFont(fontSetter);
		this.add(labelName);

		labelMessage.setVisible(false);
		labelMessage.setFont(fontSetter);
		this.add(labelMessage);
	}

	/**
	 * Method for displaying "Hi" message with @param flag which can be false or
	 * true
	 */
	public void sayHi(boolean flag) {
		this.labelMessage.setVisible(flag);

	}

}