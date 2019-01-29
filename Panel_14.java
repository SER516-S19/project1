import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

/*
 * @author: Sakshi Chaudhary
 * @gitID: 14
 */

public class Panel_14 extends JPanel implements PanelInterface {
    Panel_14() {
        JLabel labelName = new JLabel();
        labelName.setText("Sakshi Chaudhary");
        labelName.setFont(new Font("Calibri", 1, 20));
        setBorder(new LineBorder(Color.black));
        setBackground(Color.pink);
        setVisible(true);
        add(labelName);
    }

    @Override
    public void sayHi(boolean timer) {
        JLabel labelName = (JLabel) getComponent(0);
        if (timer) {
            labelName.setText("<html>Sakshi Chaudhary<br/>Hi!</html>");
        } else {
            labelName.setText("Sakshi Chaudhary");
        }
    }
}
