import java.awt.*;  
import javax.swing.*;
import javax.swing.border.LineBorder;


/* 
 * @author:  Lehar Bhatt
 * @gitID:   12
 */


public class Panel_12 extends JPanel
{
	
	Panel_12()  
    {  
	    
	    JLabel jlabel = new JLabel("Lehar Bhatt");
	    jlabel.setFont(new Font("Verdana",1,20));
	    
        setBackground(Color.LIGHT_GRAY);
        setBorder(new LineBorder(Color.red));
        setVisible(true);
        add(jlabel);	    
    }
}
