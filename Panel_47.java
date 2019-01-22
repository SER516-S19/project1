/*
 * Author: Cecilia La Place
 * Course: SER516
 * Assignment: Project 1:
 * Summary: This is panel 47 which implements a JPanel containing my name.
*/

import java.awt.*;
import javax.swing.*;

public class Panel_47 extends JPanel{
	public Panel_47(){
		JLabel name = new JLabel("Cecilia La Place");
		// Edits
		name.setForeground(Color.RED);
		name.setFont(new Font("Garamond", Font.PLAIN, 20));
        this.add(name);
        this.setBackground(Color.BLACK);
	}
}