import javax.swing.*;
import java.awt.*;

public class Panel_55 extends JPanel implements PanelInterface{
	public Panel_55() {
		initComponents();
	}
	private JLabel hiLabel;
private void initComponents() {
	
	
	JLabel label = new JLabel("Narendra Mohan");
	hiLabel = new JLabel("Hi");
	hiLabel.setFont(new Font("Calibri",10,50));
	hiLabel.setVisible(false);
	
	label.setFont(new Font("Calibri",10,50));
	this.add(label);
	this.add(hiLabel);
	
	this.setBackground(Color.blue);
	



}

public void sayHi(boolean flag) 

{ 	this.hiLabel.setVisible(flag);
}
}