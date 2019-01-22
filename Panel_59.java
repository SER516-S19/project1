import java.awt.*; 
import javax.swing.*; 

public class Panel_59 extends JPanel {
	Panel_59() {
		myPanel();
	}
	private void myPanel() {
		this.setBackground(Color.yellow);
		JLabel l = new JLabel("Bijayalaxmi Panda");
		Font font = new Font("Verdana", Font.BOLD, 16);
		l.setFont(font);
		this.add(l);
	}
}
