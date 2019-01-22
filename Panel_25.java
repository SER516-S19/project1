import java.awt.*;  
import javax.swing.*;  
public class Panel_25 extends JPanel {  
     Panel_25()  
        {  
    //    JFrame f25= new JFrame("Panel_25");    
        JPanel p25=new JPanel(); 
        JLabel l25 = new JLabel("Sai Vinay. G");
        l25.setFont(new Font("Valencia",Font.HANGING_BASELINE,25));
        l25.setForeground(Color.CYAN);
        p25.setBounds(25,50,300,300); 
        p25.setAlignmentX(CENTER_ALIGNMENT);
        p25.setAlignmentY(CENTER_ALIGNMENT);
        p25.setBackground(Color.DARK_GRAY);
        p25.add(l25);     
    //    f25.add(p25);  
      //          f25.setSize(450,450);    
        //        f25.setLayout(null);    
          //      f25.setVisible(true);    
        }  
   /*     public static void main(String args[])  
        {  
        new Panel_25();  
        }  */
    }

