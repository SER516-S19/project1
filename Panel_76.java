import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * SER 516
 *
 * @author: Vaibhav Singhal
 * @GitID: 76
 * @GitUser: vsinghal3737
 * @version: 1.3
 * @Date: 27 Jan 2019
 */

@SuppressWarnings("serial")
/* class Panel_76 is used to create a panel on the given ID slot */
public class Panel_76 extends JPanel implements PanelInterface {
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelMsg;

    /* Constructor for panel */
    public Panel_76() {
        labelName = new JLabel("Vaibhav Singhal", JLabel.CENTER);
        labelName.setFont(new Font("Calibri", Font.BOLD + Font.ITALIC, 25));
        this.add(labelName);

        labelMsg = new JLabel("<html><br> Hi </br></html>");
        labelMsg.setFont(new Font("Calibri", Font.BOLD + Font.ITALIC, 20));
        this.add(labelMsg);

        this.setBounds(10, 10, 250, 60);
        this.setBackground(Color.YELLOW);

        labelMsg.setVisible(false);
    }

    @Override
    /* public function sayHi, used to set the visibility of the labelMsg */
    public void sayHi(boolean flag) {
        this.labelMsg.setVisible(flag);
    }

}
