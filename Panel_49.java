
/**
 * @author Archana Madhavan
 *
 * Description :Creating a class Panel_49 which extends JPanel class and displays the name using 
 * label in a Panel. Temporary frame is created.
 */
import java.awt.*;
import javax.swing.*;

public class Panel_49 extends JPanel {
	public Panel_49() {
		
		//Calling function to create panel
		AddPanel_49();
		
	}
	
	
	//adding panel		
	public void AddPanel_49() {
		
		//JPanel panel_49 = new JPanel();
		/*
		 * // Creating Temporary Frame object JFrame Tmp_Frame= new JFrame();
		 * 
		 * //Temporary Frame
		 * Tmp_Frame.add(panel_49); 
		 * Tmp_Frame.setSize(400, 400);
		 * Tmp_Frame.setVisible(true);
		 */
		// Creating Label with necessary specifications
		JLabel L = new JLabel("Archana Madhavan");
		L.setFont(new Font("Verdana", Font.BOLD, 24));

		// setting Panel specifications
		this.add(L);
		this.setBackground(Color.YELLOW);
		//panel_49.setBounds(10, 10, 200, 200);
		
	}

		 
	 
}
