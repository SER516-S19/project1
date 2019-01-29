import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 * @author Raju Koushik Gorantla 
 * GitID 28
 */

public class Panel_28 extends JPanel implements PanelInterface {

	JLabel nameLabel;

	public Panel_28() {
		this.setLayout(new GridBagLayout());
		nameLabel = new JLabel("Raju Koushik Gorantla");
		nameLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		this.add(nameLabel);
		this.setBackground(Color.yellow);
		this.setVisible(true);
	}

	@Override
	public void sayHi(boolean flag) {
		if (flag)
			this.nameLabel.setText("<html><center>Raju Koushik Gorantla<br>HI</center></html>");
		else
			this.nameLabel.setText("<html><center>Raju Koushik Gorantla</center></html>");
	}

}
