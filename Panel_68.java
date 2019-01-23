import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author Hari
 *
 */
public class Panel_68 extends JPanel{

	public Panel_68(){
		get_pane();
	}
	
	private void get_pane(){
		JPanel jp = new JPanel();
		JLabel label = new JLabel("Hari Krishnan ");
		label.setHorizontalAlignment(JLabel.CENTER);
	    label.setVerticalAlignment(JLabel.CENTER);
	    jp.setBackground(Color.LIGHT_GRAY);
		jp.add(label);
		
	}

}
