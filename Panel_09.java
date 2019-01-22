import java.awt.*;  
import javax.swing.*;
import javax.swing.border.LineBorder;


/*  Author Mayank Batra 
 * This class returns a panel on object creation 
 * panel creation is carried out under constructor
 */

@SuppressWarnings("serial")
public class Panel_09 extends JPanel
{
	Panel_09()  
    {  
 //   JFrame f= new JFrame("Panel Example");  //    For testing
        // Created a panel
//    JPanel panel=new JPanel();
    // Created label
    JLabel jlabel = new JLabel("Mayank ID 09");
    // Font defined for label
    jlabel.setFont(new Font("Verdana",1,20));
    this.add(jlabel);
    // added label to panel
 //   panel.add(jlabel);
    // boder and background defined for panel
 //   panel.setBorder(new LineBorder(Color.BLACK)); 
    // panel.setBounds(10,10,250,60);    
    // panel.setBackground(Color.WHITE);  
     
//    f.add(panel);  
//            f.setSize(600,600);    
//            f.setLayout(null);    		//For Testing 
//            f.setVisible(true);    
// 
    }  

//	public static void main(String[] args)
//	{
//		new Panel_09();						//For Testing 
//
//	}


}
