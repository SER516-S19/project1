import java.awt.Color;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 * @author Hari
 *
 */
public class Panel_68 extends JPanel implements PanelInterface {

	public Panel_68(){
		get_panel();
	}
	private JLabel label;
	private void get_panel(){
		label = new JLabel("<html><span style='font-size:18px;font-weight:600;'>Hari Krishnan </span></html>");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		this.setBackground(Color.LIGHT_GRAY);
		this.add(label);
		this.setLayout(new GridBagLayout());
	}
	
	@Override
	public void sayHi(boolean flag) {
		if (flag) {
		       	label.setText("<html><span style='font-size:18px;font-weight:600;'>Hari Krishnan <br> Hi </span> </html>");
		} else {
			label.setText("<html><span style='font-size:18px;font-weight:600;'>Hari Krishnan</span> </html>");
		}
	}
}
