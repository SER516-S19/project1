import javax.swing.*;
import java.awt.*;

/**Panel Class Panel_53
 * @author : Abhinab Mohanty
 * @version : 2.0
 * @since : 1/18/2019
 */
public class Panel_53 extends JPanel implements PanelInterface{
    JLabel greetingLabel;

    public Panel_53() {
        setLayout(new GridBagLayout());
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        JLabel nameLabel = new JLabel();
        Font labelFont = new Font("Arial", Font.BOLD,20);
        nameLabel.setText(" Abhinab Mohanty ");
        nameLabel.setFont(labelFont);

        greetingLabel = new JLabel("");
        greetingLabel.setFont(labelFont);

        add(nameLabel);
        add(greetingLabel);
        setBackground(Color.cyan);
        setVisible(true);
    }

    /**
     * Overriden Method to display "HI" on queue
     * @param flag - boolean value to enable or disable greeting
     */

     @Override
        public void sayHi(boolean flag) {
        if(flag) {
            greetingLabel.setText("HI !");
        }else {
            greetingLabel.setText("");
        }
    }



}
