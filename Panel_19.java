import java.awt.*;  
import javax.swing.*;
@SuppressWarnings("serial")
public class Panel_19 extends JPanel {
    public Panel_19() {
        initComponents();
    }
    private void initComponents() 
    {
    	
    JFrame frame = new JFrame("Panel");
    JPanel panel = new JPanel();
    JLabel label = new JLabel("Surya Cherukuri");
    
    label.setFont(new Font("TimesRoman",Font.BOLD,50));
    
    panel.add(label);
    //panel.setBounds(10,10,450,410);
    panel.setBackground(Color.MAGENTA);
    frame.add(panel);  
    frame.setSize(500,500);    
    frame.setLayout(null);
    frame.setVisible(true);        
    }
    
    //public static void main(String args[])
    //{
        //new Panel_19();
    //}
}