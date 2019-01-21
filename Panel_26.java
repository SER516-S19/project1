/*
Author: Sakshi Gautam,GitID:26, Git username:sakshi7373
Description: Created panel 26 for SER515 Project1.
 */
import javax.swing.*;
import java.awt.*;
public class Panel_26 extends JPanel 
{
public Font font1;
//private javax.swing.JFrame jFrame;    
public Panel_26()
{
    createPanel();
}

public void createPanel()
{
//JFrame newFrame = new JFrame("Frame");
//JPanel newPanel= new JPanel();
JLabel newLabel= new JLabel("Sakshi Gautam",JLabel.CENTER);
//newFrame.add(newPanel);
//newPanel.add(newLabel);

/* Frame Design 
newFrame.setVisible(true);
newFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
newFrame.setLayout(null);
newFrame.setLocation(0,0);
*/
//PANEL design 
//newPanel.setBounds(450,30,940,150);
//newPanel.setBackground(Color.blue);
//Label Design
font1= new Font("Cooper black", Font.BOLD, 50);
newLabel.setFont(font1);
newLabel.setForeground(Color.black);
this.setBounds(100,100,100,100);  
this.add(newLabel);
this.setBackground(Color.red);
}
/*
 public static void main(String[] args) 
{
   
new Panel_26();
    }
*/
}
