import javax.swing.*;
import java.awt.*;

/**
 * Author: Nikhila Saini
 * GitID: 70
*/

public class Panel_70 extends JPanel implements PanelInterface{

    JLabel labelName;
    JLabel labelMessage = new JLabel("Hi");

    public Panel_70() {
        labelName = new JLabel("Nikhila Saini");
        labelName.setFont(new Font("Algerian", Font.BOLD, 24));
	    this.setBackground(Color.CYAN);
        this.add(labelName);

        this.add(labelMessage);
        labelMessage.setFont(new Font("Algerian", Font.BOLD, 24));
        labelMessage.setVisible(false);
    }

    // Visibility of message Hi on Screen is set using boolean parameter flag
    public void sayHi(boolean flag){
        labelMessage.setVisible(flag);
    }

}
