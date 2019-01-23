import java.awt.*;  
import javax.swing.*;
import javax.swing.border.LineBorder;

/* 
 * @author:  Viraj Talaty
 * @gitID:   78
 */

public class Panel_78 extends JPanel implements PanelInterface
{
	String panelName = "Viraj Talaty";
	Panel_78()  
    {  
	    JLabel jlabel = new JLabel(panelName);
	    jlabel.setFont(new Font("Verdana",1,20));
        setBackground(Color.LIGHT_GRAY);
        setBorder(new LineBorder(Color.yellow));
        setVisible(true);
        add(jlabel);	    
    }
	
	@Override
	public void sayHi(boolean flag) {
		if(flag)
		{
			panelName = "Viraj Talaty, Hi!!";
		}
		else
		{
			panelName = "Viraj Talaty";
		}
	}
}