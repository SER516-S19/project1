import java.awt.*;
import javax.swing.*;

/**
 * @author Amanjot Singh
 */

class Panel_56 extends JPanel {

    public Panel_56() {
        panel56();
    }

    private void panel56() {

        // JFrame jFrame = new JFrame();
        JLabel label = new JLabel("Amanjot Singh");

        /* SET THE FONT STYLE AND SIZE FOR THE GIVEN TEXT IN THE PANEL */
        label.setFont(new Font("Verdana",Font.BOLD,16));
        add(label);
        setBackground(Color.white);
        setLayout(new GridBagLayout());
    }
}
