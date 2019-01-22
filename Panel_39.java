import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
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
}
