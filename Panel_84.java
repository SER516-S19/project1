import javax.swing.*;
import java.awt.*;  
import javax.swing.border.*;
@SuppressWarnings("serial")
public class Panel_84 extends JPanel implements PanelInterface {

/**
 * panel which displays name as "Shashidhar Reddy" is created in this Class
 * Author : Shashidhar, Panel 84, svanter1@asu.edu
 */
	
    public Panel_84() {
    	JLabel label_Name = new JLabel("Shashidhar reddy",JLabel.CENTER); 
    	Color color= new java.awt.Color(0,255,255);
    	Border line_border=new LineBorder(Color.GRAY);
    	Font font_setter = new Font("TimesRoman", Font.BOLD+Font.ITALIC, 22);
    	this.add(label_Name);
    	label_Name.setFont(font_setter);
    	
    	label_Hi = new JLabel("<html><br>Hi</html>",JLabel.CENTER); 
    	 this.add(label_Hi);
    	 label_Hi.setVisible(false);
    	 label_Hi.setFont(font_setter);
        this.setBackground(color);
        this.setForeground(Color.BLACK); 
        this.setBorder(line_border); 
    }
 public void sayHi(boolean flag) {
	 this.label_Hi.setVisible(flag);

}
	private JLabel label_Hi;
 }