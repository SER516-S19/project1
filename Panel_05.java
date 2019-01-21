import java.awt.*;  
import javax.swing.*;
import javax.swing.border.LineBorder;
/*
  @author Janani Anand, Git ID- 05
  The program displays the given name by calling the JPanel class
  Temporary frame and main class was created for testing the panel display 
 */

public class Panel_05 extends JPanel
   {
	public Panel_05() 
	   {
                                         
         JLabel jlabel = new JLabel("JANANI ANAND_05",JLabel.CENTER);
	     jlabel.setForeground(Color.white);
	     jlabel.setFont(new Font("Berlin Sanas FB",Font.BOLD,30));
	     
	     this.add(jlabel);
	     this.setBackground(Color.blue);
 	     this.setBorder(new LineBorder(Color.BLACK)); 
        }
	  
}