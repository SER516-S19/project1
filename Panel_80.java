import java.awt.*;
import javax.swing.*;

/** 
 * For SER 516
 * Panel 80 with name and hi Labels
 * @author Sajith Thattazhi
 * @version 1.3
 * @since 01-18-2019
 * 
 */

public class Panel_80 extends JPanel implements PanelInterface
{    
	private JLabel nameLabel = new JLabel("Sajith Thattazhi", JLabel.CENTER);
	private JLabel hiLabel = new JLabel("Hi", JLabel.CENTER);

    /**
	 * Constructor to Stylize Label
	 */
	public Panel_80()
	{

        this.setBackground(new Color(255, 204, 102));
		this.setLayout(null);
		
        nameLabel.setFont(new java.awt.Font("Algerian", 0, 24));
        nameLabel.setForeground(new java.awt.Color(204, 0, 0));
		nameLabel.setBounds(5, 20, 300, 30);
		
		this.add(nameLabel);
		
		hiLabel.setFont(new java.awt.Font("Algerian", 0, 48));
        hiLabel.setForeground(new java.awt.Color(204, 0, 0));
		hiLabel.setBounds(5, 60, 300, 30);
		
		this.add(hiLabel);
		
		hiLabel.setVisible(false);
    }
	
	/**
	 * Display "Hi" with Name on Panel
	 * @param flag  Holding true/false values
	 */
	public void sayHi(boolean flag) {
        this.hiLabel.setVisible(flag);
    }
}