import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;


/*
 * Author: Sourabh Siddharth
 * ID: 75
 */


public class Panel_75 extends JPanel{
	Panel_75(){   	
		JLabel jlabel = new JLabel("Sourabh Siddharth");
		jlabel.setFont(new Font("Verdana",Font.PLAIN,15));
		setBorder(new LineBorder(Color.yellow));
		setBackground(Color.LIGHT_GRAY);
		setVisible(true);
		add(jlabel);
	}
}
