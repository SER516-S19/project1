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
		JPanel panel_47 = new JPanel(new BorderLayout());
		JLabel name = new JLabel("Cecilia La Place");
		// Edits
		name.setForeground(Color.RED);
		name.setFont(new Font("Garamond", Font.PLAIN, 20));
        panel_47.add(name, BorderLayout.CENTER);
        panel_47.setBackground(Color.BLACK);
	}

	public static void main(String[] args){
		new Panel_47();
	}
}