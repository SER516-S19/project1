import java.awt.*;
import javax.swing.*;

/**
 * Class name: Panel_42
 * Author Name: Naren kumar Konchada (1215113614)
 * GitHub username: nkonchad
 * 
 * Class for creating Panel that contains a student name
 *
 */
public class Panel_42 extends JPanel {

	//Constructor
	public Panel_42() {
		createPanel();
	}

	public void createPanel() {	

		JLabel name = new JLabel("Naren kumar Konchada");
		name.setFont(new Font("Arial", Font.ITALIC, 30));
		this.add(name);

		this.setBackground(Color.lightGray);
		this.setVisible(true);
	}

}