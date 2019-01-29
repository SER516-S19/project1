import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;


/** The below class implements Panel 58
 * This panel is a part of tab no 45
 * It displays student's name Prashansa
 * @author: Prashansa
 *  GIT Id: 58
 * Creating panel 58
 */


public class Panel_58 extends JPanel implements PanelInterface 
{

    Panel_58()
    {

        JLabel jlabel = new JLabel();
        jlabel.setFont(new Font("Arial", Font.PLAIN, 40));
        setBackground(Color.CYAN);
        setBorder(new LineBorder(Color.GREEN));
		jlabel.setText("Prashansa");
        add(jlabel);
    }
    
	/*
	 * The below method is used to display Hi 
	 * below the student name when flag is true
	 */
    
    public void sayHi(boolean flag)
	{
		JLabel label = (JLabel)getComponent(0);
		if(flag)
		{
			label.setText("<html>Prashansa<br/><center/>Hi!</html>");
		}
		else
		{
			label.setText("Prashansa");
		}
	}
}