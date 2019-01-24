import javax.swing.*;
import java.awt.*;

/**
 * Panel class for GIT ID - 65
 */
public class Panel_65 extends JPanel implements PanelInterface {

    private Container container;
    private JLabel myNameJLabel;
    private JLabel myHiJLabel;

    public Panel_65() {
        myNameJLabel = new JLabel("Lakshmi Kala Pedarla");
        myNameJLabel.setFont(new Font("monaco", Font.BOLD, 24));

        myHiJLabel = new JLabel("     Hi");
        myHiJLabel.setForeground(Color.BLUE);
        myHiJLabel.setFont(new Font("monaco", Font.BOLD, 40));
        myHiJLabel.setVisible(false);

        container = Box.createVerticalBox();
        container.setBackground(Color.lightGray);
        container.add(myNameJLabel);
        container.add(myHiJLabel);
        this.add(container);
    }

    @Override
    public void sayHi(boolean flag) {
        if (flag) {
            myHiJLabel.setVisible(true);
        } else {
            myHiJLabel.setVisible(false);
        }
    }
}
