import java.awt.*;  
import javax.swing.*;

/* This class creates a Panel with specified properties.
 * @author:  Palak Chugh
 * @version: 2.0
 * @date:    1/23/2018
 * @gitID:   18
 */


public class Panel_18 extends JPanel implements PanelInterface {
	
	JLabel label2=new JLabel("Hi",JLabel.CENTER); 
	
	public Panel_18()  
    {  
		mypanel();
    }
	
	public void mypanel()
	{
		JLabel label1=new JLabel("Palak Chugh",JLabel.CENTER); 		
		label1.setBounds(100,100,100,100);  
		label1.setForeground(Color.BLUE); 
		label1.setFont(new Font("Verdana",Font.BOLD, 36));	
		label2.setBounds(100,100,100,100);  
		label2.setForeground(Color.red); 
		label2.setFont(new Font("Verdana",Font.BOLD, 36));	
		this.setPreferredSize(new Dimension(300, 300));
	    this.setBackground(Color.ORANGE);	
	    this.add(label1);
	    this.add(label2);
	    label2.setVisible(false);	 
    }  
	
	public void sayHi(boolean flag)
    { 
		
			label2.setVisible(flag);
		}
    } 
