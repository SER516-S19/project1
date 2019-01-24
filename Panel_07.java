import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

/**
 *
 * @author Suraj Atmakuri gitID: 07
 */
public class Panel_07 extends JPanel {
	
	Panel_07() {
		JLabel label = new JLabel();
		label.setFont(new Font("Arial", 1, 20));
		label.setText("Suraj Atmakuri");
		add(label);
		setBorder(new LineBorder(Color.YELLOW));
		setBounds(10, 10, 250, 60);
		setBackground(Color.RED);
	}

	/*public static void main(String args[]) { //FOR TESTING 
		JFrame frame = new JFrame();
		JPanel mVar = new Panel_07();
		frame.add(mVar);  
        frame.setSize(600,600);    
        frame.setLayout(null);    		
        frame.setVisible(true);
		System.out.println("JPanel program");
	}*/
	
//I am Suraj	
}
