/* Author : Narendra Mohan M
*/

import javax.swing.*;
import java.awt.*;

public class Panel_55 extends JPanel implements PanelInterface{
	JLabel hiLabel = new JLabel("Hi");
	public Panel_55() {
		initComponents();
	}
private void initComponents() {
	
	
	JLabel label = new JLabel("Narendra Mohan");
	hiLabel.setVisible(false);
	
	label.setFont(new Font("Calibri",10,50));
	this.add(label);
	this.add(hiLabel);
	
	this.setBackground(Color.blue);
	



}

public void sayHi(boolean flag) 

{ 
	
	this.setVisible(flag);
	
}
}
