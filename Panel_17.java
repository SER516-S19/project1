import java.awt.*;  
import javax.swing.*;
public class Panel_17 extends JPanel {
    public Panel_17() {
        initComponents();
    }
    private void initComponents() 
    {
	    JLabel label = new JLabel("Manikanta Chintakunta");   
	    this.add(label);
	    this.setBackground(Color.GRAY);	
	    label.setFont(new Font("TimesRoman", Font.BOLD ,30));       
    }
}
