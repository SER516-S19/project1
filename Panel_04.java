import java.awt.*;
import javax.swing.*;

/**
 * @author Pradeep AJ
 * @version 1.0
 */

class Panel_04 extends JPanel implements PanelInterface {
    private JLabel label = new JLabel();
    private String name = "Pradeep AJ";
    public Panel_04() {
        label.setText(name);
        label.setFont(new Font("Papyrus",Font.BOLD,20));
        add(label);
        setBackground(Color.LIGHT_GRAY);
    }

    @Override
	public void sayHi(boolean flag) {
		if(flag) {
			label.setText(name + " " + "HI");
        } 
        else {
			label.setText(name);
		}
	}
}
