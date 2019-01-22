import java.awt.*;
import javax.swing.*;

class Panel_79 extends JPanel {
    public Panel_79() {
        createPanel();
    }

    private void createPanel() {
        String name = "Aprajita Thakur";
        JPanel panel = new JPanel();
        JLabel label = new JLabel(name);
        label.setFont(new Font("Papyrus",Font.PLAIN,15));
        panel.add(label);
        panel.setBackground(Color.LIGHT_GRAY);
    }
}
