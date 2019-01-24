import java.awt.*;  
import javax.swing.*;
@SuppressWarnings("serial")
public class Panel_17 extends JPanel implements PanelInterface {
	private JLabel message_label;
	private JLabel name_label;
	
    public Panel_17() 
    {
    name_label = new JLabel("Manikanta Chintakunta");
    name_label.setFont(new Font("TimesRoman", Font.BOLD ,25));
	this.add(name_label);
	
	message_label = new JLabel("<html><br />Hi</html>",JLabel.CENTER);
	message_label.setFont(new Font("TimesRoman", Font.BOLD ,15));
	this.add(message_label);
	this.setBackground(Color.GRAY);
	message_label.setVisible(true);
	}
	public void sayHi(boolean flag){
		this.message_label.setVisible(flag);
	}
	
	
}
    
