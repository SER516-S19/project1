import javax.swing.*;
import java.awt.*;

/**Panel Class Panel_50
 * Author: Siva Pranav Mandadi
 * Created: 1/20/2019
 */
public class Panel_50 extends JPanel {
    public Panel_50() {

        JLabel name = new JLabel("Siva Pranav Mandadi \n ID:50");
        name.setFont(new Font("Verdana", Font.BOLD,20));
        this.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        this.add(name);
        this.setBackground(Color.cyan);
        this.setVisible(true);
    }


}
