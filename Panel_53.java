import javax.swing.*;
import java.awt.*;

/**Panel Class Panel_53
 * Author: Abhinab Mohanty
 * Created: 1/18/2019
 */
public class Panel_53 extends JPanel implements PanelInterface{
    JLabel displayLabel;
    public Panel_53() {
        this.setLayout(new GridBagLayout());
        this.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        displayLabel = new JLabel();
        displayLabel.setText("Abhinab Mohanty");
        displayLabel.setFont(new Font("Arial", Font.BOLD,20));
        this.add(displayLabel);
        this.setBackground(Color.cyan);
        this.setVisible(true);
    }

    /**
     * Overriden Method to display "HI" on queue
     */

     @Override
        public void sayHi(boolean flag) {
        if(flag) {
            this.displayLabel.setText("HI");
        }else {
            this.displayLabel.setText("Abhinab Mohanty");
        }
    }



}
