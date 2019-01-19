import javax.swing.*;
import java.awt.*;

public class Panel_53 extends JPanel {
    public Panel_53() {
        init();
    }

    private void init() {
        this.setLayout(new GridBagLayout());
        this.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        JLabel nameLabel = new JLabel("Abhinab Mohanty");
        nameLabel.setFont(new Font("Arial", Font.BOLD,20));
        this.add(nameLabel);
        this.setBackground(Color.cyan);
        this.setVisible(true);

    }



}
