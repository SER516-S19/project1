import java.awt.*;

import javax.swing.*;
public class Panel_76 extends JPanel implements PanelInterface
{
    private javax.swing.JLabel l;
    private javax.swing.JLabel msg;
    
	public Panel_76()
    {
        l = new JLabel("Vaibhav Singhal",JLabel.CENTER);
        l.setFont(new Font("Calibri",Font.BOLD + Font.ITALIC,25));
        this.add(l);

        msg = new JLabel("<html><br> Hi </br></html>");
        msg.setFont(new Font("Calibri",Font.BOLD + Font.ITALIC,20));
        this.add(msg);
        
        this.setBounds(10,10,250,60);
        this.setBackground(Color.YELLOW);
 
        msg.setVisible(false);
    }
    public void sayHi(boolean flag)
    {
    	this.msg.setVisible(flag);
    }

}
