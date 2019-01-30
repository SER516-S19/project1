import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Panel_54
 * Author: Sabyasachi Mohanty (1215188091) 
 * Created: 1/21/2019
 * Panel Id: 54
 */
public class Panel_54 extends JPanel implements PanelInterface {

	private JLabel labelName;
	private JLabel labelNameWithHi;

	private static final long serialVersionUID = 1L;

	public Panel_54() {
		labelName = new JLabel("Sabyasachi");
		labelNameWithHi = new JLabel("Sabyasachi  Hi");
		this.setLayout(new GridBagLayout());
		this.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		labelName.setFont(new Font("Arial", Font.BOLD, 14));
		labelNameWithHi.setFont(new Font("Arial", Font.BOLD, 14));
		this.add(labelName);
		this.setBackground(Color.gray);
		this.setVisible(true);
	}

	@Override
	public void sayHi(boolean flag) {
		if (flag) {
			this.remove(labelName);
			this.add(labelNameWithHi);

		} else {
			this.remove(labelNameWithHi);
			this.add(labelName);
		}
		
		this.validate();
		this.repaint();
	}
	
}
