import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 * 
 * @author : akashkadam
 * @version : 2.0
 * GitId : 36
 */
public class Panel_36 extends JPanel implements PanelInterface {

	private static final long serialVersionUID = 1L;
	private JLabel additionalLabel;

	
	public Panel_36() {
		addPanel();
	}

	/*
	 * method creating the panel
	 */
	private void addPanel() {	
	
		JLabel label = new JLabel("Akash Kadam");
		additionalLabel = new JLabel("Hi");
		
		label.setFont(new Font("Arial", Font.BOLD, 20));
		additionalLabel.setFont(new Font("Arial", Font.BOLD, 20));
		
		add(label);
		add(additionalLabel);
		
		setBorder(new LineBorder(Color.BLUE));
		setBackground(Color.ORANGE);
		
		label.setVisible(true);
		additionalLabel.setVisible(false);
	}
	
	@Override
	public void sayHi(boolean isadditionalLabelVisible) {
		additionalLabel.setVisible(isadditionalLabelVisible);
	}
	
	
}
