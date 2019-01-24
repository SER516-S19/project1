import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;


/*
 * Author: Bhawana Prasad
 * This program returns panel with a name on it. It also displays name and hi at periodic interval.
 * ID: 67
 */

public class Panel_67 extends JPanel implements PanelInterface{
	
	Panel_67(){   	
		JLabel jlabel = new JLabel();
		jlabel.setFont(new Font("Algeria",1,20));
		setBorder(new LineBorder(Color.BLACK));
		setBackground(Color.GREEN);
		setBounds(10,10,200,60);
		setVisible(true);
		add(jlabel);
	}
	
	@Override
    	public void sayHi(boolean flag){
        	JLabel jlabel = (JLabel)getComponent(0);
        	if(flag){
            		jlabel.setText("<html>Bhawana Prasad<br/><center/>Hi!</html>");
            		jlabel.setHorizontalAlignment(SwingConstants.CENTER);
        	}else{
            		jlabel.setText("<html>Bhawana Prasad</html>");
            		jlabel.setHorizontalAlignment(SwingConstants.CENTER);
        	}
    	}
}
