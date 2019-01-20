import java.awt.*;
import javax.swing.*;

class Panel_41 extends JPanel {

    public Panel_41() {
        panel41();
    }

    private void panel41() {

    	/* SETTING THE COORDINATES WHERE THE PANEL SHOULD BE PLACED */
    	/* SETTING THE HEIGHT AND WIDTH OF THE PANNEL */
        int coorX = 20;
        int coorY = 30;
        int height = 100;
        int width = 200;

       // JFrame jFrame = new JFrame();
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Harika Kolli");

        /* SET THE FONT STYLE AND SIZE FOR THE GIVEN TEXT IN THE PANEL */
        label.setFont(new Font("Calibri",Font.ITALIC,14));
        panel.add(label);
        panel.setBounds(coorX, coorY, height, width);
        panel.setBackground(Color.YELLOW);
    }
}
