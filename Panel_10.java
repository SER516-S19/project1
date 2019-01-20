import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel_10 extends JPanel {
	
	String name = "Ankita";
	

	public Panel_10(String name) {
		getPanel(name);
	}

/* Creating the Panel*/
	private JPanel getPanel(String name)
	{
		JPanel jpanelObj = new JPanel();
		JLabel jlabelObj = new JLabel(name);
		/* Set Font*/
		jlabelObj.setFont(new Font("Calibri",10,50));
		jpanelObj.add(jlabelObj);
		/*Set Co-ordinates*/
		jpanelObj.setBounds(30, 30, 70, 80);
		/*Set background color*/
		jpanelObj.setBackground(Color.GRAY);
		return jpanelObj;
		
	}

}
