import java.awt.*;  
import javax.swing.*;
@SuppressWarnings("serial")
public class Panel_16 extends JPanel {
    public Panel_16() {
        Init();
    }
    private void Init() 
    {
    	
    //JFrame frame = new JFrame("Panel");
    //JPanel panel = new JPanel();
    JLabel label = new JLabel("Surya Cherukuri",JLabel.CENTER);
    
    label.setFont(new Font("TimesRoman",Font.BOLD,50));
    
    this.add(label);
    //panel.setBounds(10,10,450,410);
    this.setBackground(Color.MAGENTA);
//    frame.add(panel);  
//    frame.setSize(500,500);    
//    frame.setLayout(null);
//    frame.setVisible(true);        
    }
    
    //public static void main(String args[])
    //{
        //new Panel_16();
    //}
}