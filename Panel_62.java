/* @author: Sumanth Paranjape	 
 * @gitID: 62 
 */

import java.awt.*;  
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Panel_62 extends JPanel {
	Panel_62(){  
		JLabel label = new JLabel("Sumanth Paranjape");
		label.setFont(new Font("Segoe UI",Font.PLAIN,20)); 
		setBorder(new LineBorder(Color.orange));
		setBackground(Color.lightGray);
		setVisible(true);
		add(label);	    
	}
}
