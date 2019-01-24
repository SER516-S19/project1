import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

/**
 * @author Amanjot Singh
 */

class Panel_56 extends JPanel implements PanelInterface {

    public Panel_56() {
        JLabel panelLabel = new JLabel("Amanjot Singh");
        panelLabel.setFont(new Font("Verdana",Font.BOLD,16));
        setBackground(Color.white);
        setBorder(new LineBorder(Color.BLACK));
        setLayout(new GridBagLayout());
        setVisible(true);
        add(panelLabel);
    }

    @Override
    public void sayHi(boolean flag) {
        JLabel labelForHi = (JLabel)getComponent(0);
        if(flag){
            labelForHi.setText("Amanjot Singh Hi");
            labelForHi.setFont(new Font("Verdana", 1, 20));
        }
        else{
            labelForHi.setText("Amanjot Singh");
            labelForHi.setFont(new Font("Verdana", 1, 16));
        }
    }
}
