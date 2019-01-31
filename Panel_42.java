import java.awt.*;
import javax.swing.*;
/**
 * Class name: Panel_42
 * Author Name: Naren kumar Konchada (1215113614)
 * @author nkonchad
 * 
 * Class for creating Panel that contains a student name
 *
 */
public class Panel_42 extends JPanel implements PanelInterface {
	
	private String name = "Naren kumar Konchada";
	private JLabel nameLabel;
	/**
	*  Panel_42 constructor to create and style the panel 
	*/
	public Panel_42() {
		nameLabel = new JLabel(name);
		nameLabel.setFont(new Font("Arial", Font.ITALIC, 20));
		this.add(nameLabel);
		this.setBackground(Color.lightGray);
		this.setVisible(true);
	}
	/**
	* Display name with "HI" based on flag. 
	*
	* @param flag, To display name with HI or not
	* flag = true will display name with HI
	* flag = false will display just the name 
	* 
	*/
	@Override
	public void sayHi(boolean flag) {
		if (flag) {
			nameLabel.setText(name + " " + "HI");
		}
		else {
			nameLabel.setText(name);
		}
	}
}