import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author Kumar Prabhu Kalyan Description - The class is a panel which displays
 *         a label.
 */
public class Panel_38 extends JPanel implements PanelInterface {

	private static final long serialVersionUID = 1L;
	private JLabel nameLabel;
	private JLabel nameOnSwitchLabel;

	Panel_38() {
		nameLabel = new JLabel("Kumar");
		nameOnSwitchLabel = new JLabel("Kumar says Hi.");
		nameLabel.setFont(new Font("Arial", 1, 20));
		nameOnSwitchLabel.setFont(new Font("Arial", 1, 20));
		setBounds(10, 10, 200, 60);
		nameLabel.setForeground(Color.BLUE);
		nameOnSwitchLabel.setForeground(Color.GREEN);
		setBackground(Color.WHITE);
		add(nameLabel);
		setBorder(new LineBorder(Color.BLACK));
		setVisible(true);
	}

	@Override
	public void sayHi(boolean flag) {
		if (flag) {

			this.remove(nameLabel);
			this.add(nameOnSwitchLabel);
		} else {
			this.remove(nameOnSwitchLabel);
			this.add(nameLabel);
		}
		this.validate();
		this.repaint();

	}

}
