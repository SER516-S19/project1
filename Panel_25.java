import java.awt.*;  
import javax.swing.border.LineBorder;
import javax.swing.*;  
public class Panel_25 extends JPanel {  
     Panel_25()  
        {  
   //     JFrame f25= new JFrame("Panel_25");    
     //   JPanel p25=new JPanel(); 
        this.setBackground(Color.CYAN);
        this.setBounds(15, 30, 250, 250);
        this.setBorder(new LineBorder(Color.BLUE));
        this.setAlignmentX(CENTER_ALIGNMENT);
        this.setAlignmentY(CENTER_ALIGNMENT);
        this.add(new JLabel("SAI VINAY. G"),new Font("Valencia",Font.HANGING_BASELINE,30));
   /*    f25.add(this);  
                f25.setSize(450,450);    
                f25.setLayout(null);    
                f25.setVisible(true);    */
        }  
   /*    public static void main(String args[])  
        {  
        new Panel_25();  
        }  */
    }

