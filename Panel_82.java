import javax.swing.*;
import java.awt.*;

/*--------------------------
This Panel belongs to Tab_21.
Author: Tsao Yu-Ting
E-Mail: ytsao2@asu.edu
Date:   1/19/2019
----------------------------*/

public class Panel_82 extends JPanel {

	public Panel_82() {
        initComponents();
    }
	
	private void initComponents() {
		
		JLabel label = new JLabel("Tsao Yu-Ting");
		label.setFont(new Font("TimesRoman", Font.BOLD, 18));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.decode("#800000"));// Maroon
		this.setBackground(Color.decode("#FFD700"));// Gold
		this.setLayout(new BorderLayout());
		this.add(label);
	}
}
