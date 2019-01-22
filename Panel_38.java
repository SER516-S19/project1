/**
 *
 * @author Kumar Prabhu Kalyan
 * gitID: 38
 */



import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.border.LineBorder;

public class Panel_38 extends JPanel {

	private static final long serialVersionUID = 1L;

	Panel_38() {

		JLabel name = new JLabel("Kumar Prabhu Kalyan");
		name.setFont(new Font("Arial", 1, 20));
		setBounds(10, 10, 200, 60);
		name.setForeground(Color.BLUE);
		setBackground(Color.WHITE);
		add(name);
		setBorder(new LineBorder(Color.BLACK));
		setVisible(true);

	}

}
