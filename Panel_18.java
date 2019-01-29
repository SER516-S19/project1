import java.awt.*;  
import javax.swing.*;

/* This class creates a Panel with specified properties.
 * @author:  Palak Chugh
 * @version: 2.1
 * @date:    1/23/2018
 * @gitID:   18
 */


public class Panel_18 extends JPanel implements PanelInterface 
{
	
	JLabel labelHi=new JLabel("Hi",JLabel.CENTER);                                       
	JLabel labelName=new JLabel("Palak Chugh",JLabel.CENTER); 
	
	public Panel_18()  
    {  
		labelName.setBounds(100,100,100,100);  
		labelName.setForeground(Color.BLUE); 
		labelName.setFont(new Font("Verdana",Font.BOLD, 36));	
		labelHi.setBounds(100,100,100,100);  
		labelHi.setForeground(Color.red); 
		labelHi.setFont(new Font("Verdana",Font.BOLD, 36));	
		this.setPreferredSize(new Dimension(300, 300));
	    	this.setBackground(Color.ORANGE);	
	    	this.add(labelName);
	    	this.add(labelHi);
	    	labelHi.setVisible(false);
    }
	
/* Displays Hi Label when the flag is set to True
 */
	@Override
	public void sayHi(boolean flag)                                                              
    { 
		labelHi.setVisible(flag);		
	
    }
	
} 
