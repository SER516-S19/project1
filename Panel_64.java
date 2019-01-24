import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

/**
 *
 * @author jinalPatel
 * @gitUserID : jspatel5
 * gitID: 64
 */

public class Panel_64 extends JPanel implements PanelInterface{
	String panelName = "Jinal Patel";
    Panel_64()  
    {   
	    JLabel jlabel = new JLabel(panelName);
	    jlabel.setFont(new Font("Brush Script MT",1,20));
	    setBounds(10,10,200,60);
      setBackground(Color.YELLOW);
      setBorder(new LineBorder(Color.BLACK));
      setVisible(true);
      add(jlabel);	    
    }
    
	@Override
	public void sayHi(boolean flag) {
		// TODO Auto-generated method stub
		if(flag){
			panelName = "Jinal Patel, Hi!!";
		}else{
			panelName = "Jinal Patel";
		}
	}
	
}
