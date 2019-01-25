import java.awt.*;  
import javax.swing.*;
import javax.swing.border.BevelBorder;

/**
 * Author: Shefali Anand
 * GitID: 06
 * GitUser: shefaliAJ7
 * Created Date: 19 Jan 2019
 */
     
@SuppressWarnings("serial")
public class Panel_06 extends JPanel implements PanelInterface{
	
	JLabel labelName;
	JLabel labelHi;
	
	Panel_06(){
		
		this.setBackground(Color.PINK);
		this.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
 		
		labelName = new JLabel("<HTML> Shefali Anand <HTML>", JLabel.CENTER);
		labelName.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		labelName.setForeground(Color.BLUE);
		
		this.add(labelName);
		
		labelHi = new JLabel("<HTML> <BR> Hi </HTML>", JLabel.CENTER);
		labelHi.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		labelHi.setForeground(Color.BLUE);
		
		this.add(labelHi);
		
		labelHi.setVisible(false);
	}

	/* Displays Label saying "Hi" when flag is true */
	@Override
	public void sayHi(boolean flag) {
		labelHi.setVisible(flag);	
	}
	
}
