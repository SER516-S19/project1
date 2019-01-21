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
public class Panel_74 extends JPanel {

	private static final long serialVersionUID = -1520421067253545136L;
	
	//TODO: Should be moved to constants file
	private String name_74 = "Ishan Sarangi";

	//Class constructor
	public Panel_74() {
		createPanel();
	}

	//Private method creating the panel with attributes
	private void createPanel() {	
		this.setLayout(new GridBagLayout());
		this.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		JLabel nameLabel = new JLabel(name_74);
		nameLabel.setFont(new Font("Georgia", Font.BOLD, 16));
		this.add(nameLabel);

		this.setBackground(Color.LIGHT_GRAY);
		this.setVisible(true);
	}

}
