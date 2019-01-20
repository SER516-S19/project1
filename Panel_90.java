import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

/**
 * Panel_90 creation
 * 
 * @author Xiangwei Zheng
 * @version 1.0
 */

public class Panel_90 extends JPanel{
	
	//constructor
	public Panel_90() {
		createMyPanel();
	}
	
	//panel creation
	private void createMyPanel() {
		
		JPanel panel41= new JPanel();
		JLabel myLabel = new JLabel("Xiangwei Zheng");
		
		panel41.add(myLabel);
		
		//styling the Panel
		panel41.setBounds(20,30,50,60);
		panel41.setBackground(Color.ORANGE);
		panel41.setForeground(Color.RED);
		
		//styling the Label
		myLabel.setFont(new Font("Arial",Font.ITALIC,15));
		
	}
}
