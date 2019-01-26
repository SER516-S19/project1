import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 * Asu Id: 1215180915
 * @author akashkadam
 * 
 *
 */
public class Panel_36 extends JPanel implements PanelInterface {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel additionalLabel;

	//Class constructor
	public Panel_36() {
		addPanel();
	}

	//method creating the panel
	private void addPanel() {	

		JLabel label = new JLabel("Akash Kadam");
		additionalLabel = new JLabel("Hi");
		
		label.setFont(new Font("Arial", Font.BOLD, 20));
		additionalLabel.setFont(new Font("Arial", Font.BOLD, 20));
		
		this.add(label);
		this.add(additionalLabel);
		
		this.setBorder(new LineBorder(Color.BLUE));
		this.setBackground(Color.ORANGE);
		
		label.setVisible(true);
		additionalLabel.setVisible(false);
	}

	@Override
	public void sayHi(boolean flag) {
		// TODO Auto-generated method stub
		this.additionalLabel.setVisible(flag);
	}
	
	
}
