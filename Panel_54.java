import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Panel_54
 * Author: Sabyasachi Mohanty (1215188091) Created:
 * 1/21/2019
 */
public class Panel_54 extends JPanel implements PanelInterface {

	private JLabel nameLabel;
	private JLabel nameWithHiLabel;

	private static final long serialVersionUID = 1L;

	public Panel_54() {
		nameLabel = new JLabel("Sabyasachi Mohanty");
		nameWithHiLabel = new JLabel("Sabyasachi Mohanty Hi");
		this.setLayout(new GridBagLayout());
		this.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		nameLabel.setFont(new Font("Arial", Font.BOLD, 30));
		nameWithHiLabel.setFont(new Font("Arial", Font.BOLD, 30));
		this.add(nameLabel);
		this.setBackground(Color.gray);
		this.setVisible(true);
	}

	@Override
	public void sayHi(boolean flag) {
		if (flag) {
			this.remove(nameLabel);
			this.add(nameWithHiLabel);

		} else {
			this.remove(nameWithHiLabel);
			this.add(nameLabel);
		}
		

		
		
		this.validate();
		this.repaint();
	}
	
	public static void main(String...args){
		Panel_54 ob = new Panel_54();
	}

}

