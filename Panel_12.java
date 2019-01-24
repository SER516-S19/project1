import java.awt.*;  
import javax.swing.*;
import javax.swing.border.LineBorder;

/* 
 * @author:  Lehar Bhatt
 * @gitID:   12
 */

public class Panel_12 extends JPanel implements PanelInterface
{
	
	Panel_12()  
    	{
		JLabel lblName = new JLabel();
		lblName.setText("Lehar Bhatt");
		lblName.setFont(new Font("Verdana",1,20));
	        setBackground(Color.LIGHT_GRAY);
        	setBorder(new LineBorder(Color.red));
	        setVisible(true);
        	add(lblName);	   	 
	}
	
	@Override
	public void sayHi(boolean flag) {
		JLabel lblName = (JLabel)getComponent(0);
		if(flag)
		{
			lblName.setText("<html>Lehar Bhatt<br/>Hi!</html>");
		}
		else
		{
			lblName.setText("Lehar Bhatt");
		}
	}
}
