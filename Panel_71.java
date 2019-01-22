
/*
 * @author:  Aditya Samant
 * GitID:   71
 * Create a panel that shows the name of a student 
 */

import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JLabel;





public class Panel_71 extends JPanel
{
    //Constructor
    public Panel_71()
    {
        setBackground(Color.gray);
        JLabel label  = new JLabel("Aditya Samant");
        //Alignment should be center
        label.setFont(new Font(Font.SERIF, Font.BOLD , 12));
        setVisible(true); 
        add(label);  
    }
}