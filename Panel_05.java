import java.awt.*;  
import javax.swing.*;
import javax.swing.border.LineBorder;
/*
  @author Janani Anand, Git ID- 05
  Temporary frame is created for testing the panel display 
 */

public class Panel_05 extends JPanel
   {
	public Panel_05() 
	   {
         JFrame f= new JFrame("Panel Example");  //  For testing  // // 
         
        //JPanel panel_05=new JPanel(); 
         /* frame specifications for testing */
	      /*  f.add(panel_05);  
            f.setSize(500,400);    
            f.setLayout(null);    		 
            f.setVisible(true); */                           
         
         JLabel jlabel = new JLabel("JANANI ANAND_05",JLabel.CENTER);
	     jlabel.setForeground(Color.white);
	     jlabel.setFont(new Font("Berlin Sanas FB",Font.BOLD,30));
	     
	     /* panel_05.add(jlabel);
	     panel_05.setBounds(10,10,230,50); //
 	     panel_05.setBorder(new LineBorder(Color.BLACK)); 
                     panel_05.setBackground(Color.blue);  */
	     
	     this.add(jlabel);
	     //this.setBounds(10,10,230,50); //set according to the frame layout
 	     this.setBorder(new LineBorder(Color.BLACK)); 
                     this.setBackground(Color.blue);
	  }

	/*public static void main(String[] args) //main used from master class
	 {
	 new Panel_05();						//For Testing 
 	 }   */

}