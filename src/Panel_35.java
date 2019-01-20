import java.awt.*;
import java.sql.SQLOutput;

import javax.swing.*;
import javax.swing.border.Border;

/*
* Create a panel with self-defined label
* @author Hongfei Ju
* @version 1/20/2019
* */

public class Panel_35 extends JPanel {
	JLabel label = null;
	boolean testMode = false;
	public Panel_35() {
		init();
		stylize();
		assemble();
	}

	private void init() {
		if (testMode) System.out.println("initialize...");
		label = new JLabel("Hongfei Ju");
    }

    private void stylize() {
		if (testMode) System.out.println("stylize...");
		setBackground(Color.orange);
	}

    private void assemble() {
		if (testMode) System.out.println("assemble...");
		add(new JLabel("Hongfei Ju"));
	}


	//testing
/*	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.add(new Panel_35());
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}*/

}
