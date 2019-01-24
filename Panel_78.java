import java.awt.*;  
import javax.swing.*;
import javax.swing.border.LineBorder;

/* 
 * @author:  Viraj Talaty
 * @gitID:   78
 */

public class Panel_78 extends JPanel implements PanelInterface
{
	
	Panel_78()  
    	{
		JLabel lblName = new JLabel();
		lblName.setText("Viraj Talaty");
		lblName.setFont(new Font("Verdana",1,20));
	        setBackground(Color.LIGHT_GRAY);
        	setBorder(new LineBorder(Color.yellow));
	        setVisible(true);
        	add(lblName);	   	 
	}
	
	@Override
	public void sayHi(boolean flag) {
		JLabel lblName = (JLabel)getComponent(0);
		if(flag)
		{
			lblName.setText("<html>Viraj Talaty<br/>Hi!</html>");
		}
		else
		{
			lblName.setText("Viraj Talaty");
		}
	}
}