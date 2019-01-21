import java.awt.*;
import java.swing.*;

/*
Author: Sai Vinay Gangadharabhatla
*/
public class Panel_25 extends JPanel{

  public Panel_25(){
  Panel25();
  }
  private void Panel25(){
 // Frame f= new Frame("Panel 25");    
        JPanel panel=new JPanel();
    	JLabel label=new JLabel("Sai Vinay G");
    	label.setFont(new Font("Arial",15,45));
    	panel.add(label);
        panel.setBounds(45,90,300,300);    
        panel.setBackground(Color.YELLOW);  
    
  }
}

