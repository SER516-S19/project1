import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
/**
*SER 516
* Date: 27 Jan 2019
* @author: Amit Pandey
* @GitID: 60
*/
public class Panel_60 extends JPanel implements PanelInterface{
	JLabel lm=new JLabel("HI :D",JLabel.CENTER);
	/*class constructor*/
	Panel_60()
	{	JPanel p= new JPanel();
		JLabel l=new JLabel("Amit Pandey",JLabel.CENTER);
		/*frame setup*/
		this.setVisible(true);
		this.setSize(800,450);
		this.add(p);
		this.setSize(160,90);
		this.setVisible(true);
		/*panel setup*/
		this.setBounds(40,80,160,50);
		this.add(l);
		this.add(lm);
		this.setBorder(new LineBorder(Color.BLACK));
	}
	/*Hi function call*/
	public void sayHi(boolean flag)
	{
		this.lm.setVisible(flag);
	}
}	
