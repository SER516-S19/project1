import java.awt.*;
import javax.swing.*;

/**
 * @author Pradeep AJ
 * @version 1.0
 */

class Panel_04 extends JPanel {

    public Panel_04() {
        initializePanel();
    }

    private void initializePanel() {
        String name = "Pradeep Ambalam Jawaharlal";
        JPanel panel = new JPanel();
        JLabel label = new JLabel(name);
        label.setFont(new Font("Papyrus",Font.PLAIN,15));
        panel.add(label);
        panel.setBackground(Color.LIGHT_GRAY);
    }
}
