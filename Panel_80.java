import javax.swing.*;
import java.awt.*;

public class Panel_80 extends JPanel implements PanelInterface
{
    public Panel_80()
	{

        this.setBackground(new Color(255, 204, 102));
		this.setLayout(null);
		
		jLabel1 = new JLabel("Sajith Thattazhi", JLabel.CENTER);
        jLabel1.setFont(new java.awt.Font("Algerian", 0, 24));
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
		jLabel1.setBounds(5, 20, 300, 30);
		
		this.add(jLabel1);
		
		jLabel2 = new JLabel("Hi", JLabel.CENTER);
        jLabel2.setFont(new java.awt.Font("Algerian", 0, 48));
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
		jLabel2.setBounds(5, 60, 300, 30);
		
		this.add(jLabel2);
		
		jLabel2.setVisible(false);
    }
	
	public void sayHi(boolean flag) {
        this.jLabel2.setVisible(flag);
    }
    
	private JLabel jLabel1;
	private JLabel jLabel2;
}