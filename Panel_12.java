import java.awt.*;  
import javax.swing.*;
import javax.swing.border.LineBorder;


/* 
 * @author:  Lehar Bhatt
 * @gitID:   12
 */


public class Panel_12 extends JPanel implements PanelInterface
{
	String panelName = "Lehar Bhatt";
	Panel_12()  
    {  
	    
	    JLabel jlabel = new JLabel(panelName);
	    jlabel.setFont(new Font("Verdana",1,20));
	   setBounds(10,10,200,60); 
        setBackground(Color.LIGHT_GRAY);
        setBorder(new LineBorder(Color.red));
        setVisible(true);
        add(jlabel);	    
    }
    
    @Override
	public void sayHi(boolean flag) {
		// TODO Auto-generated method stub
		if(flag){
			panelName = "Lehar Bhatt, Hi!!";
		}else{
			panelName = "Lehar Bhatt";
		}
	}
}
