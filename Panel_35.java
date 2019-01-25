import java.awt.*;
import java.sql.SQLOutput;

import javax.swing.*;
import javax.swing.border.Border;

/**
* Create a panel with self-defined label and a method that change the test of the label
* @author Hongfei Ju
* @version 1.3
*/

public class Panel_35 extends JPanel implements PanelInterface {
	private JLabel label = null;

	/*
	* initialize and assemble label, set sytle
	*/
	public Panel_35() {
		label = new JLabel("Hongfei Ju");
		setBackground(Color.orange);
		label.setFont(new Font("Arial", Font.PLAIN, 18));
		add(label);
	}

	/*
	* switch the text in the label
	*/
	@Override
	public void sayHi(boolean flag) {
		if(flag) {
			label.setText("Hongfei Ju Hi");
		} else {
			label.setText("Hongfei Ju");
		}
	}
}
