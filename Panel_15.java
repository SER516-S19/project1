import java.awt.*;
import javax.swing.*;

/**
 * Personal Panel which ID is 15 
 * @author Meng-Ze Chen
 * @version 1.0
 * @email mchen149@asu.edu.
 */

public class Panel_15 extends JPanel implements PanelInterface{
	private JLabel nameLabel;
	private String nameStr = "Meng-Ze Chen";

	public Panel_15() {
		nameLabel = new JLabel(nameStr);
		nameLabel.setFont(new Font("Rage Italic",Font.BOLD, 20));
		nameLabel.setForeground(Color.PINK);
		nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		this.setBackground(Color.BLACK);
		this.setLayout(new BorderLayout());
		this.add(nameLabel);
	}

     @Override
        public void sayHi(boolean flag) {
        if (flag) {
            nameLabel.setText(nameStr + " HI!");
        } else {
            nameLabel.setText(nameStr);
        }
    }
}
