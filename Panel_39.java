import javax.swing.*;
import java.awt.*;

public class Panel_39 extends JPanel {
    public Panel_39() {
        makePanel();
    }

    private void makePanel() {
        JLabel label = new JLabel("Aman Kaushik (39)", JLabel.CENTER);
        label.setFont(new Font("SANS_SERIF", Font.PLAIN, 12));
        label.setForeground(Color.GRAY);
        this.setPreferredSize(new Dimension(300, 300));
        this.setBackground(Color.BLACK);
        this.add(label);
    }

   /*
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(600, 600);
        frame.add(new Panel_39());
        frame.setVisible(true);
    }
    */
}
