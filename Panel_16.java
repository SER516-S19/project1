import java.awt.*;  
import javax.swing.*;
@SuppressWarnings("serial")
public class Panel_16 extends JPanel {
    public Panel_16() {
        Init();
    }
    private void Init() {
    	JLabel label = new JLabel("Surya Cherukuri",JLabel.CENTER);
    	label.setFont(new Font("TimesRoman",Font.BOLD,30));
    	this.add(label);
    	this.setBackground(Color.MAGENTA);      
    }
}