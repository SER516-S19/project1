import javax.swing.*;
import java.awt.*;

/**Panel Class Panel_53
 * Author: Abhinab Mohanty
 * Created: 1/18/2019
 */
public class Panel_53 extends JPanel implements PanelInterface{
    public Panel_53() {
        this.setLayout(new GridBagLayout());
        this.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        JLabel nameLabel = new JLabel("Abhinab Mohanty");
        nameLabel.setFont(new Font("Arial", Font.BOLD,20));
        this.add(nameLabel);
        this.setBackground(Color.cyan);
        this.setVisible(true);
    }

    /**
     * Overriden Method to display "HI" on queue
     */

     @Override
        public void sayHi(boolean flag) {
        JLabel greetingLabel  = new JLabel("HI");
        greetingLabel.setFont(new Font("Arial",Font.BOLD,25));
        if(flag) {
            this.add(greetingLabel);
        }else {
            this.remove(greetingLabel);
        }
    }



}
