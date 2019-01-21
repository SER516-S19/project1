import javax.swing.*;
import java.awt.*;

/**Panel Class Panel_54
 * Author: Sabyasachi Mohanty (1215188091)
 * Created: 1/21/2019
 */
public class Panel_54 extends JPanel {

    private static final long serialVersionUID = 1L;
    public Panel_54() {
        init();
    }

    /**
     * Method to Initialize components of the JPanel
     */
    private void init() {
        this.setLayout(new GridBagLayout());
        this.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        JLabel nameLabel = new JLabel("Sabyasachi Mohanty");
        nameLabel.setFont(new Font("Arial", Font.BOLD,20));
        this.add(nameLabel);
        this.setBackground(Color.CYAN);
        this.setVisible(true);

    }



}

