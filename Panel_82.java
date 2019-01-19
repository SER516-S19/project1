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
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Tsao Yu-Ting");
		
		label.setFont(new Font("Calibri", Font.BOLD, 18));
		label.setForeground(Color.decode("#800000"));// Maroon
		panel.setBackground(Color.decode("#FFD700"));// Gold
		panel.add(label);
		
//		JFrame frame = new JFrame();
//		frame.add(panel);
//		frame.setSize(250, 60);
//		frame.setVisible(true);
	}

//	public static void main(String args[]) {
//		new Panel_82();
//	}
}
