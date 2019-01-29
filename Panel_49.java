
/**
 * @author Archana Madhavan
 *
 * Description :Creating a class Panel_49 which extends JPanel class and displays the name using 
 * label in a Panel. 
 */
import java.awt.*;
import javax.swing.*;

public class Panel_49 extends JPanel implements PanelInterface {
	
	//Creating Label for "Hi"
	JLabel HiLabel= new JLabel("Hi");
	Panel_49() {
				
		//Creating Label with necessary specifications
		JLabel myName = new JLabel("Archana Madhavan");
		myName.setFont(new Font("Verdana", Font.BOLD, 24));

		//setting Panel specifications
		this.add(myName);
		this.setBackground(Color.YELLOW);
		
		//Setting the Label to false initially
		HiLabel.setFont(new Font("Verdana",Font.BOLD,24));
		HiLabel.setPreferredSize(new Dimension(50, 50));
		this.add(HiLabel);
		HiLabel.setVisible(false);
		
	}

	@Override
	public void sayHi(boolean flag) {
			
		if(flag)
			HiLabel.setVisible(true);
		else
			HiLabel.setVisible(false);
	}
		
	
}
