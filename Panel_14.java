/* 
 * @author: Sakshi Chaudhary	 
 * @gitID: 14 
 */

import java.awt.*;  
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Panel_14 extends JPanel
{
  Panel_14()  
   {  
     JLabel mylabel = new JLabel("Sakshi Chaudhary");
     mylabel.setFont(new Font("Calibri",1,20)); 
     setBorder(new LineBorder(Color.black));
     setBackground(Color.pink);
     setVisible(true);
     add(mylabel);	    
    }
}
