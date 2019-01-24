import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

/**
 *
 * @author janiceabraham
 * gitID: 01
 */
public class Panel_01 extends JPanel implements PanelInterface {
    
    
	
    Panel_01()  
    {  
	    
	    JLabel jlabel = new JLabel();
	    jlabel.setText("Janice Abraham");
	    jlabel.setFont(new Font("Arial",1,20));
	    setBounds(10,10,200,60);
      setBackground(Color.CYAN);
      setBorder(new LineBorder(Color.GRAY));
      setVisible(true);
      add(jlabel);	    
    }
	@Override
	public void sayHi(boolean flag)
	{
		JLabel jlabel=(JLabel)getComponent(0);
		if(flag)
		{
			jlabel.setText("<html>Janice Abraham<br/>Hi!</html>");
		}
		else
		{
			jlabel.setText("Janice Abraham");
		}
		
	}
}
