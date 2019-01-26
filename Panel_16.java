import java.awt.*;  
import javax.swing.*;
@SuppressWarnings("serial")
public class Panel_16 extends JPanel implements PanelInterface {
    
    private JLabel Hi_Label;
    private JLabel Name_Label;
	public Panel_16() {
		
		Name_Label = new JLabel("<html>Surya Cherukuri<html>", JLabel.CENTER);
		Hi_Label = new JLabel("<html><br>Hi<html>", JLabel.CENTER);
		
		Name_Label.setFont(new Font("TimesRoman",Font.BOLD,20));
		Hi_Label.setFont(new Font("TimesRoman",Font.BOLD,20));
		this.setBackground(Color.MAGENTA);
		this.add(Name_Label);
		this.add(Hi_Label);
		Hi_Label.setVisible(false);
	}
    @Override
    public void sayHi(boolean flag) {
        this.Hi_Label.setVisible(flag);
    }
}