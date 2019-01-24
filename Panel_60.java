//Author: Amit Pandey
//Created: January 20, 2019 11:23PM

import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
public class Panel_60 extends JPanel{
	Panel_60()
	{	JPanel p= new JPanel();
		JLabel l=new JLabel("Amit Pandey",JLabel.CENTER);
		//frame
		this.setVisible(true);
		this.setSize(800,450);
		this.add(p);
		this.setSize(160,90);
		//this.setLayout(null);
		this.setVisible(true);
		//panel
		this.setBounds(40,80,160,50);
		this.add(l);
		this.setBorder(new LineBorder(Color.BLACK));
	}
	/*public static void main(String args[])	for testing
	{
		new Panel_60();
	}*/ 
}	
