import java.awt.*;  
import javax.swing.*;
public class Panel_17 extends JPanel {
    public Panel_17() {
        initComponents();
    }
    private void initComponents() 
    {
    //Frames are commented out, they were used just to check the code and errors
   // JFrame frame = new JFrame("Panel Example");
	
   // JPanel panel = new JPanel();
    JLabel label = new JLabel("Manikanta Chintakunta");
    
    
    this.add(label);
   // this.setBounds(20,20,450,80);
    this.setBackground(Color.GRAY);
	
	label.setFont(new Font("TimesRoman", Font.BOLD ,30));
//    frame.add(panel);  
//    frame.setSize(750,450);    
//    frame.setVisible(true);        
    }
    //private javax.swing.JLabel jLabel1;
    //private javax.swing.JPanel jPanel1;
//    public static void main(String args[])
//    {
//        new Panel_17();
//    }
}
