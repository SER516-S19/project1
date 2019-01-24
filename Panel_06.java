import java.awt.*;  
import javax.swing.*;
import javax.swing.border.BevelBorder;

/*
 * Author: Shefali Anand
 * GitID: 06
 * GitUser: shefaliAJ7
 * Date: 19 Jan 2019
 */

@SuppressWarnings("serial")
public class Panel_06 extends JPanel implements PanelInterface{
	
	JLabel label_name;
	JLabel label_hi;
	
	Panel_06(){
		
		this.setBackground(Color.PINK);
		this.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
 		
		label_name = new JLabel("<HTML> Shefali Anand <HTML>", JLabel.CENTER);
		label_name.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		label_name.setForeground(Color.BLUE);
		
		this.add(label_name);
		
		label_hi = new JLabel("<HTML> <BR> Hi </HTML>", JLabel.CENTER);
		label_hi.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		label_hi.setForeground(Color.BLUE);
		
		this.add(label_hi);
		
		label_hi.setVisible(false);
	}

	@Override
	public void sayHi(boolean flag) {
		label_hi.setVisible(flag);	
	}
	
}
