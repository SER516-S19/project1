
import java.awt.*;  
import javax.swing.border.LineBorder;
import javax.swing.*;  
public class Panel_25 extends JPanel implements PanelInterface{  
   JLabel l25 = new JLabel("Sai Vinay. G");
	Panel_25()  
        {  
   //     JFrame f25= new JFrame("Panel_25");    
     //   JPanel p25=new JPanel(); 
        this.setBackground(Color.CYAN);
        this.setBounds(15, 30, 250, 250);
        this.setBorder(new LineBorder(Color.BLUE));
        this.setAlignmentX(CENTER_ALIGNMENT);
        this.setAlignmentY(CENTER_ALIGNMENT);
        this.add(l25);
   /*    f25.add(this);  
                f25.setSize(450,450);    
                f25.setLayout(null);    
                f25.setVisible(true);    */
       
        } 
	 public void sayHi(boolean flag) {
     	if(flag) {
     		l25.setText("SAI VINAY. G" + "HI");
     	}
     	else {
     		l25.setText("SAI VINAY. G");
     	}
     }
   /*    public static void main(String args[])  
        {  
        new Panel_25();  
        }  */
    }
