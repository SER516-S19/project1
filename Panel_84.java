import javax.swing.*;
import java.awt.*;  
import javax.swing.border.*;
public class Panel_84 extends JPanel {
	
//	 public static void main(String args[])         //for testing purpose
//	    {
//	        new Panel_84();
//	    }
	 
	// constructor for invoking method GUI_panel
    public Panel_84() {
        GUI_panel();
    }
    //declaring a method GUI panel which creates our panel and label
    private void GUI_panel() 
    {
   // JFrame frame_object = new JFrame("Shashi's panel");  // for testing purpose
    JPanel panel_object = new JPanel();
    JLabel label_object = new JLabel(); 
    label_object.setText("Shashidhar Reddy Vanteru");
    Font font_setter = new Font("TimesRoman", Font.BOLD+Font.ITALIC, 60);
    label_object.setFont(font_setter);
    panel_object.add(label_object);
    Color color= new java.awt.Color(0,255,255);
    panel_object.setBackground(color);
    panel_object.setBorder(new LineBorder(Color.GRAY)); 
    panel_object.setBounds(0,0,800,300);
    
//    frame_object.add(panel_object);  //existed  for testing purpose														
//    frame_object.setSize(800,700); 
//    //frame_object.setBackground(Color.CYAN);
//    //frame_object.setLayout(new BorderLayout());
//    frame_object.setLayout(null);
//    frame_object.setVisible(true);        
    }
   
}