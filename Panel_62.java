/* @author: Sumanth Paranjape	 
 * @gitID: 62 
 */

import java.awt.*;  
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Panel_62 extends JPanel implements PanelInterface {
	//Main Tab will automatically call the default constructor.
	Panel_62(){ 
		//Creating new label
		JLabel label = new JLabel("Sumanth Paranjape");
		//Setting label attributes
		label.setFont(new Font("Segoe UI",Font.PLAIN,20)); 
		setBorder(new LineBorder(Color.orange));
		setBackground(Color.lightGray);
		setVisible(true);
		add(label);	    
	}
	
	@Override
	public void sayHi(boolean toggleFlag) {
		JLabel labelName = (JLabel)getComponent(0);
		if(toggleFlag)
		{
			//Using HTML to print Hi! in new line
			labelName.setText("<html>Sumanth Paranjape<br/>Hi!</html>");
		}
		else
		{
			labelName.setText("Sumanth Paranjape");
		}
	}
}
