import java.awt.*;
import javax.swing.*;

/**
 * Creates a Panel with my name and a method that displays Hi when @param flag=TRUE
 *
 * @author Dhruv Patel
 * @version 1.3
 */

public class Panel_63 extends JPanel implements PanelInterface{

	private String name = "Dhruv Patel";
	JLabel label63 = new JLabel();

	/**
	 * Creates a panel with name and adds style to it
	 */
	public Panel_63() {

		label63.setText(name);
		label63.setFont(new Font("Lucida Handwriting", Font.BOLD, 20));
		setLayout(new GridBagLayout());
		setBackground(Color.cyan);
		setBorder(BorderFactory.createLineBorder(Color.black, 1));
		add(label63);
	}

	/**
	 *Implementation of PanelInterface to displays Hi with name
	 * @param flag, TRUE value will display Hi
	 */
	@Override
	public void sayHi(boolean flag) {
		if(flag){
			label63.setText("Dhruv Patel said Hi!!");
		}
		else{
			label63.setText("Dhruv Patel");
		}
	}
}
