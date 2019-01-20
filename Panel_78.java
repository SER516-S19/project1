import java.awt.*;  
import javax.swing.*;
import javax.swing.border.LineBorder;


/* 
 * @author:  Viraj Talaty
 * @gitID:   78
 */


public class Panel_78 extends JPanel
{
	
	JPanel panel;
	
	Panel_78()  
    {  
	    panel=new JPanel();  
	    
	    JLabel jlabel = new JLabel("Viraj Talaty");
	    jlabel.setFont(new Font("Verdana",1,20));
	    
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setBorder(new LineBorder(Color.yellow));
        panel.setVisible(true);
        panel.add(jlabel);
	    
    }

	public JPanel getPanel() {
		return panel;
	}

}