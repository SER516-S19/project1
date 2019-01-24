import javax.swing.*;
import java.awt.*;  
import javax.swing.border.*;
@SuppressWarnings("serial")
public class Panel_84 extends JPanel {

/**
 * panel which displays name as "Shashidhar Reddy" is created in this Class
 * Author : Shashidhar, Panel 84, svanter1@asu.edu
 */
    public Panel_84() {
    	JLabel label_object = new JLabel("Shashidhar reddy",JLabel.CENTER); 
    	Color color= new java.awt.Color(0,255,255);
        Font font_setter = new Font("TimesRoman", Font.BOLD+Font.ITALIC, 22);
        Border line_border=new LineBorder(Color.GRAY);
        this.add(label_object);
        label_object.setFont(font_setter);
        this.setBackground(color);
        this.setForeground(Color.BLACK); 
        this.setBorder(line_border); 
    }

}