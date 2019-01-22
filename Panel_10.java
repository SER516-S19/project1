import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel_10 extends JPanel {
	
	//String name = "Ankita";
	

	public Panel_10() {
		getPanel();
	}

/* Creating the Panel*/
	private void getPanel()
	{
		//JPanel jpanelObj = new JPanel();
		JLabel jlabelObj = new JLabel("Ankita Shivanand Bhandari");
		/* Set Font*/
		jlabelObj.setFont(new Font("Courier",Font.BOLD,20));
		add(jlabelObj);
		/*Set background color*/
		setBackground(Color.BLUE);
		
		
	}

}
