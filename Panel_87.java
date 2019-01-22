import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/*
 * Personal Panel which ID is 87
 * @author Jiayan Wang
 * @version 1.0
 */

public class Panel_87 extends JPanel{
	public Panel_87() {
		init();
	}

	private void init() {
		JLabel name = new JLabel("Jiayan Wang");
		name.setFont(new Font("Rage Italic",Font.BOLD, 30));
		name.setForeground(Color.white);
		name.setHorizontalAlignment(SwingConstants.CENTER);
		this.setBackground(Color.BLACK);
		this.setLayout(new BorderLayout());
		this.add(name);
	}
}
