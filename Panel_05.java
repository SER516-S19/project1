import java.awt.*;  
import javax.swing.*;
import javax.swing.border.LineBorder;
/*
 * @author Janani Anand
 */

public class Panel_05
   {
	public Panel_05() 
	   {
         JFrame f= new JFrame("Panel Example");  //    For testing 
         JPanel panel=new JPanel();  
	     JLabel jlabel = new JLabel("JANANI_05",JLabel.CENTER);
	     jlabel.setForeground(Color.white);
	     jlabel.setFont(new Font("Berlin Sanas FB",Font.BOLD,30));
	     panel.add(jlabel);
	     panel.setBounds(10,10,230,20); 
 	     panel.setBorder(new LineBorder(Color.BLACK)); 
		 panel.setBackground(Color.blue);  
		 f.add(panel);  
         f.setSize(500,400);    
         //f.setLayout(null);    		 
         f.setVisible(true);    
	  }

	public static void main(String[] args)
	   {
		 new Panel_05();						//For Testing 
 	   }

}
