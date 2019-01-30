import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

/*
 * Author: Sourabh Siddharth
 * ID: 75
 */

public class Panel_75 extends JPanel implements PanelInterface{
	
	/**
	 * Adds label named labelName to the tab
	 */
	Panel_75(){
		JLabel labelName = new JLabel("Sourabh Siddharth");
		labelName.setFont(new Font("Verdana",Font.PLAIN,15));
		setBorder(new LineBorder(Color.yellow));
		setBackground(Color.LIGHT_GRAY);
		setVisible(true);
		add(labelName);
		
	}

	@Override
	public void sayHi(boolean sayHiFlag) {
		JLabel newLabelName  = (JLabel)this.getComponent(0);
		if(sayHiFlag) {
			newLabelName.setText("<html>Sourabh Siddharth<br><br>"
					+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Hi!</html>");
		}else {
			newLabelName.setText("Sourabh Siddharth");
		}
	}
}
