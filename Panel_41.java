import java.awt.*;
import javax.swing.*;

class Panel_41 extends JPanel {

    public Panel_41() {
        panel41();
    }

    private void panel41() {
    	
       // JFrame jFrame = new JFrame();
        JLabel label = new JLabel("Harika Kolli");

        /* SET THE FONT STYLE AND SIZE FOR THE GIVEN TEXT IN THE PANEL */
        label.setFont(new Font("Calibri",Font.ITALIC,14));
        add(label);
        setBackground(Color.YELLOW);
    }
}
