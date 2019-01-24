import java.awt.*;  
import javax.swing.*;
import javax.swing.border.BevelBorder;

/*
 * Author: Shefali Anand
 * GitID: 06
 * GitUser: shefaliAJ7
 * Date: 19 Jan 2019
 */

public class Panel_06 extends JPanel{
	
	JLabel label_name;
	JLabel label_hi;
	
	Panel_06(){
		
		this.setBackground(Color.PINK);
		this.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		this.setLayout(null);
 		
		label_name = new JLabel("Shefali Anand", JLabel.CENTER);
		label_name.setFont(new Font("Comic Sans MS", Font.BOLD,30));
		label_name.setForeground(Color.BLUE);
		label_name.setBounds(5, 20, 300, 30);
		
		this.add(label_name);
		
		label_hi = new JLabel("Hi", JLabel.CENTER);
		label_hi.setFont(new Font("Comic Sans MS", Font.BOLD,30));
		label_hi.setForeground(Color.BLUE);
		label_hi.setBounds(5, 60, 300, 30);
		
		this.add(label_hi);
		
	}

	@Override
	public void sayHi(boolean flag) {
		
		if(flag == false)
			label_hi.setVisible(false);	
	}
	
}
