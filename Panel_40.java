import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 * @author Trupti Khatavkar GitID 40
 *
 */

public class Panel_40 extends JPanel implements PanelInterface {

	JLabel nameLabel;

	public Panel_40() {
		this.setLayout(new GridBagLayout());
		nameLabel = new JLabel("Trupti Khatavkar");
		nameLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		this.add(nameLabel);
		this.setBackground(Color.yellow);
		this.setVisible(true);
	}

	@Override
	public void sayHi(boolean flag) {
		if (flag)
			this.nameLabel.setText("<html><center>Trupti Khatavkar<br>HI</center></html>");
		else
			this.nameLabel.setText("<html><center>Trupti Khatavkar</center></html>");
	}

}
