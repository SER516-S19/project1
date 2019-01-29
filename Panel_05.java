import java.awt.*;  
import javax.swing.*;
import javax.swing.border.LineBorder;
/**
  *@author Janani Anand, Git ID- 05
  *SER516-Software Agility
  *Project 1: 
  *The class displays the name and a secong label msg- 'Hi'
  */

@SuppressWarnings("serial")
public class Panel_05 extends JPanel implements PanelInterface
   {
           /*creating a label for Hi timer display*/
          JLabel labelMsg = new JLabel("Hi", JLabel.CENTER);  

          public Panel_05() 
              {
                  /*creating a label for name display and setting specifications*/                              
         	  JLabel labelName = new JLabel("JANANI ANAND_05",JLabel.CENTER);
	  labelName.setForeground(Color.white);
	  labelName.setFont(new Font("Berlin Sanas FB",Font.BOLD,25));
	     
	  this.add(labelName);
	  this.setBackground(Color.blue);
 	  this.setBorder(new LineBorder(Color.BLACK));

 	  this.add(labelMsg);
                  labelMsg.setForeground(Color.ORANGE);
                  labelMsg.setFont(new Font("Calibri", Font.ITALIC, 25));
                  labelMsg.setVisible(false); 
              }
	  
/**
    * This method sets label visibility, displays 'Hi' based on boolean parameter passed.
    */
                public void sayHi(boolean flag){
       	labelMsg.setVisible(flag);
                }
   }