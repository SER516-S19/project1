import java.awt.Color;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 * @author Hari
 *
 */
public class Panel_68 extends JPanel{

	public Panel_68(){
		get_pane();
	}
	
	private void get_pane(){
		JLabel label = new JLabel("<html><span style='font-size:18px;font-weight:600;'>Hari Krishnan </span></html>");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		this.setBackground(Color.LIGHT_GRAY);
		this.add(label);
		this.setLayout(new GridBagLayout());
		
	}

}
