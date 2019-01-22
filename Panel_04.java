import java.awt.*;
import javax.swing.*;

/**
 * @author Pradeep AJ
 * @version 1.0
 */

class Panel_04 extends JPanel {
    public Panel_04() {
        String name = "Pradeep Ambalam Jawaharlal";
        JLabel label = new JLabel(name);
        label.setFont(new Font("Papyrus",Font.BOLD,20));
        add(label);
        setBackground(Color.LIGHT_GRAY);
    }
}
