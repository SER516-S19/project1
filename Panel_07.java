import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

/**
 *
 * @author Suraj Atmakuri gitID: 07
 */
/*class panel_07 extends JPanel to create a panel displaying name
 *class panel_07 implements PanelInterface to display 'hi' 
 */
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
	/*
	 *calling the function sayHi from the PanelInterface
	 *displays hi only when flag=1
	 */
	public void sayHi(boolean flag)
	{
		JLabel label = (JLabel)getComponent(0);
		if(flag)
		{
		   label.setText("<html>Suraj Atmakuri <br/> <p 'text-align:center;'>Hi!</p></html>");
		}
		else
		{
		   label.setText("Suraj Atmakuri");
		}
	}


	
		
}
