import java.awt.*;
import javax.swing.*;

class Panel_11 extends JPanel {

    public Panel_11() {
        panel11();
    }

    private void panel11() {
    	
       // JFrame jFrame = new JFrame();
        JLabel label = new JLabel("Vaibhav Bhasin");

        /* SET THE FONT STYLE AND SIZE FOR THE GIVEN TEXT IN THE PANEL */
        label.setFont(new Font("Verdana",Font.BOLD,20));
        add(label);
        setBackground(Color.GRAY);
        label.setForeground(Color.WHITE);
        setLayout(new GridBagLayout());
    }
}
