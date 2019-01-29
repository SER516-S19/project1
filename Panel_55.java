
import javax.swing.*;
import java.awt.*;

/*	SER 516
 *	Panel 55 with name and hi Labels
 * @author Narendra Mohan Murali Mohan
 * @version 1.3
 * 
 * 
 */

public class Panel_55 extends JPanel implements PanelInterface{
	
	/**
	 * Constructor for Label
	 */
	private JLabel hiLabel;
	public Panel_55() {
	
	
	
	JLabel label = new JLabel("Narendra Mohan");
	hiLabel = new JLabel("Hi");
	hiLabel.setFont(new Font("Calibri",10,50));
	hiLabel.setVisible(false);
	
	label.setFont(new Font("Calibri",10,50));
	this.add(label);
	this.add(hiLabel);
	
	this.setBackground(Color.blue);
	



}
	/**
	 * Display "Hi" with Name on Panel
	 * @param flag  Holding true/false values
	 */
	public void sayHi(boolean flag) 

	{ 		hiLabel.setVisible(flag);
	}

}