import java.awt.*;
import javax.swing.*;

public class Panel_63 extends JPanel {

	private String name = "Dhruv Patel";

	public Panel_63() {

		JLabel label_63 = new JLabel(); 	//creating label with my name
		label_63.setText(name);
		label_63.setFont(new Font("Lucida Handwriting", Font.BOLD, 24));	//setting font to the label

		add(label_63);
		setLayout(new GridBagLayout());		//Align name to center
		setBackground(Color.cyan);	//setting background color to cyan
		setBorder(BorderFactory.createLineBorder(Color.black, 1));	//setting border of the panel

	}
}
