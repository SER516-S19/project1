import javax.swing.*;
import java.awt.*;

/**Panel Class Panel_53
 * Author: Abhinab Mohanty
 * Created: 1/18/2019
 */
public class Panel_53 extends JPanel implements PanelInterface{
    JLabel nameLabel;
    JLabel greetingLabel;
    public Panel_53() {
        this.setLayout(new FlowLayout( FlowLayout.CENTER));
        this.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        JPanel labelPanel = new JPanel();
        labelPanel.setLayout( new GridLayout( 2 , 1 ) );
        nameLabel = new JLabel();
        greetingLabel = new JLabel("");
        nameLabel.setText("Abhinab Mohanty");
        nameLabel.setFont(new Font("Arial", Font.BOLD,20));
        labelPanel.add(nameLabel);
        labelPanel.add(greetingLabel);
        labelPanel.setBackground(Color.cyan);
        this.add(labelPanel);
        this.setBackground(Color.cyan);
        this.setVisible(true);
    }

    /**
     * Overriden Method to display "HI" on queue
     */

     @Override
        public void sayHi(boolean flag) {
        if(flag) {
            this.greetingLabel.setText("\t"+"HI");
        }else {
            this.greetingLabel.setText("");
        }
    }



}
