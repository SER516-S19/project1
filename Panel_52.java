import javax.swing.*;
import java.awt.*;  

/** 
 * SER-516 Project
 * Panel id: 52 
 * @author Manisha Miriyala
 * @version 1.5
 * @since 01-18-2019
 */

public class Panel_52 extends JPanel implements PanelInterface {
   
JLabel hiLabel = new JLabel("HI",JLabel.CENTER);

/*
Decorating the panel and label using constructor
*/
 public Panel_52() {
	    JLabel nameLabel = new JLabel("Manisha Miriyala", JLabel.CENTER);
		this.setBackground(Color.GRAY);
		nameLabel.setFont(new Font("GEORGIA",10,40));
		this.add(nameLabel);
		this.add(hiLabel);
		hiLabel.setFont(new Font("GEORGIA",10,40));
		hiLabel.setVisible(false);
	     }
/**
* Function to display Hi message
* @param flag holds true/false values
*/
	@Override
public void sayHi(boolean flag){
hiLabel.setVisible(flag);
}
}
