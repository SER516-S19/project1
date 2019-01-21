import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

/**
 *
 * @author jinalPatel
 * gitID: 64
 */
public class Panel_64 extends JPanel {
   
    Panel_64()  
    {   
	    JLabel jlabel = new JLabel("Jinal Patel");
	    jlabel.setFont(new Font("Arial",1,20));
	    setBounds(10,10,200,60);
      setBackground(Color.YELLOW);
      setBorder(new LineBorder(Color.BLACK));
      setVisible(true);
      add(jlabel);	    
    }
}
