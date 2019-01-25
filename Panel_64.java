import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

/**
 * This Class is adding user name in Panel allocated in Tab5
 * and adds Hi according to passed timer flag.
 *
 * @author Jinal Patel
 * @version 1.1
 * @since 01/22/2019
 * @gitUserID : jspatel5
 * @gitID: 64
 */
public class Panel_64 extends JPanel implements PanelInterface{

	//Constructor to initialize Panel attributes
	Panel_64(){   
		JLabel userNameLabel = new JLabel();
		userNameLabel.setText("Jinal Patel");
		userNameLabel.setFont(new Font("Brush Script MT",1,20));
		setBounds(10,10,200,60);
		setBackground(Color.YELLOW);
		setBorder(new LineBorder(Color.BLACK));
		setVisible(true);
		add(userNameLabel);	    
	}

	@Override
	public void sayHi(boolean flag) {
		JLabel userNameLabel = (JLabel)getComponent(0);
		if(flag){
			userNameLabel.setText("<html>Jinal Patel<br/>Hi!</html>");
		}else{
			userNameLabel.setText("Jinal Patel");
		}
	}

}
