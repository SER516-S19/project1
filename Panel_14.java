/* 
 * @author: Sakshi Chaudhary	 
 * @gitID: 14
 */

import java.awt.*;  
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Panel_14 extends JPanel implements PanelInterface
{
  Panel_14()  
   {  
     JLabel mylabel = new JLabel();
     mylabel.setText("Sakshi Chaudhary");
     mylabel.setFont(new Font("Calibri",1,20)); 
     setBorder(new LineBorder(Color.black));
     setBackground(Color.pink);
     setVisible(true);
     add(mylabel);	    
    }

   @Override
   public void sayHi(boolean flag)
   { 
     JLabel mylabel = (JLabel)getComponent(0);
     if(flag)
     {
	     mylabel.setText("<html>Sakshi Chaudhary<br/>Hi!</html>");
     }
     else
     {
	     mylabel.setText("Sakshi Chaudhary");
     }
   }	
}
