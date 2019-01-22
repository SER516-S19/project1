//Author: Amit Pandey
//Created: January 20, 2019 11:23PM

import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
public class Panel_60 extends JPanel{
	Panel_60()
	{	JPanel p= new JPanel();
		JLabel l=new JLabel("Amit Pandey");
		JFrame f=new JFrame();
		JTextField name = new JTextField(50);
		//frame
		f.setVisible(true);
		f.setSize(800,450);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(p);
		f.add(l);
		f.setSize(160,90);
		f.setLayout(null);
		f.setVisible(true);
		//panel
		p.setBounds(40,80,320,180);
		p.add(l);
		p.setBorder(new LineBorder(Color.BLACK));
	}
	public static void main(String args[])
	{
		new Panel_60();
	}
}	