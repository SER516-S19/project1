import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;


/*
 * @author:  Muhammad Sami
    GIT Id: 73
 * Creating panel 73
 */


public class Panel_73 extends JPanel implements PanelInterface
{
	
	
    Panel_73()  
    {  

      JLabel jlabel = new JLabel("Muhammad Sami");
      jlabel.setFont(new Font("Arial", Font.PLAIN, 20));
      setBackground(Color.LIGHT_GRAY);
      setBorder(new LineBorder(Color.BLACK));
      setVisible(true);
      add(jlabel);
    }
	@Override
	public void sayHi(boolean flag)
	{
		JLabel jlabel=(JLabel)getComponent(0);
		if(flag)
		{
			jlabel.setText("<html>Muhammad Sami<br/>Hi!</html>");
		}
		else
		{
			jlabel.setText("Muhammad Sami");
		}
		
	}
}