import java.awt.*;
import javax.swing.*;

public class Panel_63 extends JPanel {

	public Panel_63() {

		createPanel();
		
	}

	private void createPanel(){

		JLabel name = new JLabel("Dhruv Patel"); 	//creating label with my name
		name.setFont(new Font("Courier", Font.BOLD, 20));	//setting font to the label

		add(name);
		setLayout(new GridBagLayout());		//Align name to center
		setBackground(Color.cyan);	//setting background color to cyan
		setBorder(BorderFactory.createLineBorder(Color.black, 1));	//setting border of the panel



	}
}
