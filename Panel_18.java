import java.awt.*;  
import javax.swing.*;
import javax.swing.border.LineBorder;                                         // Package to add line border

/* This class creates a Panel with specified properties.
 * @author:  Palak Chugh
 * @version: 1.0
 * @date:    1/19/2018
 * @gitID:   18
 */

public class Panel_18 extends JPanel{
	
	   public Panel_18() {
	        
		   createPanel_18();
	    
	   }
	private void createPanel_18() {  
       
	    JLabel label=new JLabel("Palak Chugh",JLabel.CENTER);  
	    this.setBounds(0,0,400,400);    
	    this.setBackground(Color.CYAN);     
	    label.setBounds(10,10,250,400);  
	    label.setForeground(Color.black); 
	    label.setFont(new Font("Verdana",Font.BOLD,36));
	    this.setBorder(new LineBorder(Color.BLACK));
	    this.add(label);
               
    }  
	
}

