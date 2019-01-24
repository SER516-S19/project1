import javax.swing.*;
import java.awt.*;

/**
 * Panel class for GIT ID - 65
 */
public class Panel_65 extends JPanel implements PanelInterface {

    private Container container;

    public Panel_65() {
        container = Box.createVerticalBox();
        container.setBackground(Color.lightGray);
        container.add(createJLabel());
        this.add(container);
    }

    private JLabel createJLabel() {
        JLabel myJLabel = new JLabel();
        myJLabel.setText("Lakshmi Kala Pedarla");
        myJLabel.setFont(new Font("monaco", Font.BOLD, 24));
        return myJLabel;
    }

    @Override
    public void sayHi(boolean flag) {
        JLabel myJLabel = new JLabel();
        myJLabel.setText("         Hi");
        myJLabel.setForeground(Color.BLUE);
        myJLabel.setFont(new Font("monaco", Font.BOLD, 24));
        myJLabel.setVisible(true);

        if (flag) {
            myJLabel.setVisible(true);
            container.add(myJLabel);
            container.setBackground(Color.lightGray);
        }
    }
}
