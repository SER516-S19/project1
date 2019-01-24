import java.awt.*;  
import javax.swing.*;
import javax.swing.border.LineBorder;
/*
  @author Janani Anand, Git ID- 05
 */

public class Panel_05 extends JPanel implements PanelInterface
   {
   	JLabel labelmsg = new JLabel("Hi");   //creating a label for Hi

	public Panel_05() 
	   {
         //creating a label for name display                              
         JLabel jlabel_name = new JLabel("JANANI ANAND_05",JLabel.CENTER);
	     jlabel_name.setForeground(Color.white);
	     jlabel_anme.setFont(new Font("Berlin Sanas FB",Font.BOLD,30));
	     
	     this.add(jlabel_name);
	     this.setBackground(Color.blue);
 	     this.setBorder(new LineBorder(Color.BLACK));

 	     this.add(labelmsg);
         labelmsg.setForeground(Color.ORANGE);
         labelmsg.setFont(new Font("Calibri", Font.ITALIC, 22));
         labelmsg.setVisible(false); 
        }
	  
     public void sayHi(boolean flag)
       {
       	this.labelmsg.setVisible(flag);
       }


}
