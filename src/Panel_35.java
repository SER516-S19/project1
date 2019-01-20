import java.awt.LayoutManager;

import javax.swing.*;

/*
* Create a panel with self-defined label
* @author Hongfei Ju
* @version 1/20/2019
* */

public class Panel_35 extends JPanel {
	JPanel panel = null;
	JLabel label = null;
	public Panel_35() {
       init();
       assemble();
	}

	private void init() {
        panel = new JPanel();
        label = new JLabel("Hongfei Ju");
    }

    private void assemble() {
	    panel.add(label);
    }

	public JPanel getPanel() {
		return panel;
	}


	//testing
/*	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
        Panel_35 panel = new Panel_35();
		frame.add(panel.getPanel());
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}*/

}
