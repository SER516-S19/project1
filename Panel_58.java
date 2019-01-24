import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;


/*
 * @author: Prashansa
    GIT Id: 58
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
    public void sayHi(boolean flag)
	{
		JLabel label = (JLabel)getComponent(0);
		if(flag)
		{
			label.setText("<html>Prashansa <br/> <p 'text-align:center;'>Hi!</p>/html>");
		}
		else
		{
			label.setText("Prashansa");
		}
}