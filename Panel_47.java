/*
 * Author: Cecilia La Place
 * Course: SER516
 * Assignment: Project 1:
 * Summary: This is panel 47 which implements a JPanel containing my name.
*/

import java.awt.*;
import javax.swing.*;

public class Panel_47 extends JPanel implements PanelInterface{
	private JLabel greeting = new JLabel("HI");

	public Panel_47(){
		JLabel name = new JLabel("Cecilia La Place");
		// Edits
		name.setForeground(Color.RED);
		greeting.setForeground(Color.RED);
		greeting.setFont(new Font("Garamond", Font.BOLD, 20));
		name.setFont(new Font("Garamond", Font.PLAIN, 20));
        this.add(name);
        this.setBackground(Color.BLACK);

        this.add(greeting);
	}

	public void sayHi(boolean visible){
		greeting.setVisible(visible);
		this.repaint();
	}
}