  import java.awt.Color;
	import java.awt.Font;
	import javax.swing.JLabel;
	import javax.swing.JPanel;
	/*
	 * Class name: Panel_24
	 * Name: Gadde Vijaya Mounika 
	 * ASU ID-1213038097
	 */
	public class Panel_24 extends JPanel {
		//Constructor
		public Panel_24() {
			createPanel();
		}
		public void createPanel() {	
			JLabel name = new JLabel(“Vijaya Mounika Gadde”);
			name.setFont(new Font("Arial", Font.BOLD, 20));
			this.add(name);
			this.setBackground(Color.CYAN);
			this.setVisible(true);
		}


	}
