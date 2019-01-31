import java.awt.*;  
import javax.swing.*;
import javax.swing.border.LineBorder;

/** 
 *	Used to create a panel with a label having the users name.
 *
 * @author:  Viraj Talaty
 * @gitID:   78
 */

public class Panel_78 extends JPanel implements PanelInterface
{
	/**
	*	Constructor used to add a label with the user 
	*	name and set the label properties
	*/
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
	
	/**
	*	When the hiFlag is set to true user name along with a Hi! is shown.
	*	If the hiFlag is false only user name is shown.
	*
	*	@param hiFlag
	*/
	@Override
	public void sayHi(boolean hiFlag) {
		JLabel lblName = (JLabel)getComponent(0);
		if(hiFlag)
			lblName.setText("<html>Viraj Talaty<br/>Hi!</html>");
		else
			lblName.setText("Viraj Talaty");
	}
}