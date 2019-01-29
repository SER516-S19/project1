import java.awt.*;
import javax.swing.*;

/**
 * Personal Panel which ID is 15 
 * @author Meng-Ze Chen
 * @version 1.0
 */

public class Panel_15 extends JPanel implements PanelInterface{
	JLabel nameLabel;
	public Panel_15() {
		nameLabel = new JLabel("Meng-Ze Chen");
		nameLabel.setFont(new Font("Rage Italic",Font.BOLD, 20));
		nameLabel.setForeground(Color.PINK);
		nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		this.setBackground(Color.BLACK);
		this.setLayout(new BorderLayout());
		this.add(nameLabel);
	}

     @Override
        public void sayHi(boolean flag) {
        if(flag) {
            nameLabel.setText("Meng-Ze Chen HI!");
        }else {
            nameLabel.setText("Meng-Ze Chen");
        }
    }
}
