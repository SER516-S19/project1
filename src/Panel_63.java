import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Panel_63 extends JPanel {
	public Panel_63() {

		createPanel();
		
	}

	private void createPanel(){
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 250, 60);	//setting co-ordinates and size of the panel
		panel.setBackground(Color.cyan);	//setting background color to cyan
		panel.setBorder(BorderFactory.createLineBorder(Color.black, 1));	//setting border of the panel
		
		JLabel name = new JLabel("DHRUV PATEL"); 	//creating label with my name
		name.setFont(new Font("Courier", Font.BOLD, 26));	//setting font to the label 
		
		panel.add(name);	//adding label into the panel
		
	}
}
