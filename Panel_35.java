import java.awt.*;
import java.sql.SQLOutput;

import javax.swing.*;
import javax.swing.border.Border;

/*
* Create a panel with self-defined label
* @author Hongfei Ju
* @version 1/20/2019
* */

public class Panel_35 extends JPanel implements PanelInterface {
	private JLabel label = null;
	public Panel_35() {
		//initialize
		label = new JLabel("Hongfei Ju");
		//sylize
		setBackground(Color.orange);
		label.setFont(new Font("Arial", Font.PLAIN, 18));
		//assemble
		add(label);
	}

	@Override
	public void sayHi(boolean flag) {
		if(flag) {
			label.setText("Hongfei Ju Hi");
		} else {
			label.setText("Hongfei Ju");
		}
	}
}
