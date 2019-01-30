import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

/**
 * @author Vaibhav Bhasin
 * version 2
 * Description: Panel class to display inside tab for Vaibhav Bhasin
 */

class Panel_11 extends JPanel implements PanelInterface {

    public Panel_11() {
        JLabel panelLabel = new JLabel("Vaibhav Bhasin");
        panelLabel.setFont(new Font("Verdana",0,20));
        setBackground(Color.gray);
        panelLabel.setForeground(Color.WHITE);
        setLayout(new GridBagLayout());
        setVisible(true);
        add(panelLabel);
    }

    @Override
    public void sayHi(boolean flag) {
        JLabel labelForHi = (JLabel)getComponent(0);
        if(flag){
            labelForHi.setText("Vaibhav Bhasin Hi");
        }
        else{
            labelForHi.setText("Vaibhav Bhasin");
        }
    }
}

