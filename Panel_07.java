import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

/**
 *
 * @author Suraj Atmakuri gitID: 07
 */
/*interface PanelInterface{//FOR TESTING
        public void sayHi(boolean a);
}*/
public class Panel_07 extends JPanel implements PanelInterface {
	
	Panel_07() {
		JLabel label = new JLabel();
		label.setFont(new Font("Arial", 1, 20));
		label.setText("Suraj Atmakuri");
		add(label);
		setBorder(new LineBorder(Color.YELLOW));
		setBounds(10, 10, 250, 60);
		setBackground(Color.RED);
	}
	public void sayHi(boolean flag)
	{
		JLabel label = (JLabel)getComponent(0);
		if(flag)
		{
			label.setText("<html>Suraj Atmakuri <br/> <p 'text-align:center;'>Hi!</p>/html>");
		}
		else
		{
			label.setText("Suraj Atmakuri");
		}
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
		
}
