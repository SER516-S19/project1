import java.awt.*;
import javax.swing.*;
/**
 * Class name: Panel_74
 * Author Name: Ishan Sarangi (1215200116)
 * @author ishansarangi
 * 
 * Class creates a panel with student's name
 *
 */
public class Panel_74 extends JPanel implements PanelInterface {
	
	private JLabel nameLabel;
	
	//TODO: Should be moved to constants file or should be used to pass names in future to make this class generic
	private String name74Text = "Ishan Sarangi";

	//Class constructor
	public Panel_74() {	
		this.setLayout(new GridBagLayout());
		this.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		nameLabel = new JLabel(name74Text);
		nameLabel.setFont(new Font("Georgia", Font.BOLD, 16));
		this.add(nameLabel);

		this.setBackground(Color.LIGHT_GRAY);
		this.setVisible(true);
	}
	
	@Override
	public void sayHi(boolean flag) {
		if (flag) {
			this.nameLabel.setText(name74Text + " HI");

		} else {
			this.nameLabel.setText(name74Text);
		}
	}
	
}
