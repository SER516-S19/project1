import java.awt.*;  
import javax.swing.*;
public class Panel_28 extends JPanel {
    public Panel_28() {
        initializeComponents();
    }
    private void initializeComponents() 
    {

    JPanel p = new JPanel();
    JLabel l = new JLabel("Raju Koushik Gorantla");
    
    l.setFont(new Font("Papyrus",Font.PLAIN,15));
    
    p.add(l);
    p.setBounds(10,10,250,60);
    p.setBackground(Color.LIGHT_GRAY);
       
    }
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public static void main(String args[])
    {
        new Panel_28();
    }
}
