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
	
    Panel_64()  
    {   
	    JLabel jlabel = new JLabel();
	    jlabel.setText("Jinal Patel");
	    jlabel.setFont(new Font("Brush Script MT",1,20));
	    setBounds(10,10,200,60);
      setBackground(Color.YELLOW);
      setBorder(new LineBorder(Color.BLACK));
      setVisible(true);
      add(jlabel);	    
    }
    
	@Override
	public void sayHi(boolean flag) {
		JLabel jlabel = (JLabel)getComponent(0);
		if(flag)
		{
			jlabel.setText("<html>Jinal Patel<br/>Hi!</html>");
		}
		else
		{
			jlabel.setText("Jinal Patel");
		}
	}
	
}
