import javax.swing.*;
import java.awt.*;

/**Panel Class Panel_29
 * Author: Abhishek Gupta
 * Created: 1/19/2019
 */
public class Panel_29 extends JPanel {
    public Panel_29() {
        init();
    }
    /**
     * Method to Initialize components of the JPanel
     */
    private void init() {
        this.setLayout(new GridBagLayout());
        this.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        JLabel nameLabel = new JLabel("Abhishek Gupta");
        nameLabel.setFont(new Font("Calibri", Font.BOLD,20));
        this.add(nameLabel);
        this.setBackground(Color.lightGray);
        this.setVisible(true);
    }
}