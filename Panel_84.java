import javax.swing.*;
import java.awt.*;  
import javax.swing.border.*;
public class Panel_84 extends JPanel {

/**
 * panel which displays name as "Shashidhar Reddy" is created in this Class
 * Author : Shashidhar, Panel 84, svanter1@asu.edu
 */

    public Panel_84() {
        GUI_panel();
    }

    private void GUI_panel() 
    {
    JLabel label_object = new JLabel("Shashidhar reddy",JLabel.CENTER); 
    this.add(label_object);
    Color color= new java.awt.Color(0,255,255);
    Font font_setter = new Font("TimesRoman", Font.BOLD+Font.ITALIC, 22);
    label_object.setFont(font_setter);
    this.setBackground(color);
    this.setForeground(Color.BLACK);
    Border line_border=new LineBorder(Color.GRAY);
    this.setBorder(line_border); 
        
    }
   
}