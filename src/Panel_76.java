import java.awt.*;  
import javax.swing.*;
public class Panel_76 extends JPanel {
    public Panel_76() {
        initComponents();
    }
    private void initComponents() 
    {
//    Frames are commented out, they were used just to check the code and error
//    JFrame f = new JFrame("Panel Example");
    JPanel p = new JPanel();
    JLabel l = new JLabel("Vaibhav Singhal");
    
    l.setFont(new Font("Calibri",1,20));
    
    p.add(l);
    p.setBounds(10,10,250,60);
    p.setBackground(Color.YELLOW);
//    f.add(p);  
//    f.setSize(300,150);    
//    f.setLayout(null);
//    f.setVisible(true);        
    }
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public static void main(String args[])
    {
        new Panel_76();
    }
}
