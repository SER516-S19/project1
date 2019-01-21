import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;


/*
 * Author: Bhawana Prasad
 * This program returns panel with a name on it.
 * ID: 67
 */

public class Panel_67 extends JPanel{
	
	Panel_67(){   	
		JLabel jlabel = new JLabel("Bhawana Prasad");
		jlabel.setFont(new Font("Verdana",1,20));
		setBorder(new LineBorder(Color.BLACK));
		setBackground(Color.GREEN);
		setBounds(10,10,200,60);
		setVisible(true);
		add(jlabel);
	}
}