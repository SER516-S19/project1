import java.awt.*;  
import javax.swing.*; 

/**
 * Author: Yuti Desai
 * GitID: 20
 * GitUser: yrdesai
 * Created Date: 19 Jan 2019
 */

public class Panel_20 extends JPanel implements PanelInterface {
	
	JLabel labelName=new JLabel("Yuti Desai",JLabel.CENTER); 	
	JLabel labelHi=new JLabel("Hi",JLabel.CENTER); 
	
	public Panel_20()  
    	{		
		labelName.setBounds(100,100,100,100);  
		labelName.setForeground(Color.red); 
		labelName.setFont(new Font("Courier",Font.BOLD, 40));	
		labelHi.setBounds(100,100,100,100);  
		labelHi.setForeground(Color.red); 
		labelHi.setFont(new Font("Courier",Font.BOLD, 40));	
		this.setPreferredSize(new Dimension(300, 300));
	    	this.setBackground(Color.orange);	
	    	this.add(labelName);
	    	this.add(labelHi);
	    	labelHi.setVisible(false);
	 
    	}  
	
/* Displays Label saying "Hi" when flag is true */
	@Override
	public void sayHi(boolean flag)
    	{ 
		labelHi.setVisible(flag);
    	} 
}
