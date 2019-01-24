import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
/**
 * Panel_90 creation
 * 
 * @author Xiangwei Zheng
 * @version 1.2
 */



class Panel_90 extends JPanel implements PanelInterface {

    public Panel_90() {
        JLabel panelLabel = new JLabel("Xiangwei Zheng");
        panelLabel.setFont(new Font("Verdana",0,20));
        setBackground(Color.gray);
        panelLabel.setForeground(Color.BLUE);
        setLayout(new GridBagLayout());
        setVisible(true);
        add(panelLabel);
    }

    @Override
    public void sayHi(boolean flag) {
        JLabel labelForHi = (JLabel)getComponent(0);
        if(flag){
            labelForHi.setText("Xiangwei Zheng Hi");
            labelForHi.setFont(new Font("Verdana", 0, 35));
           
        }
        else{
            labelForHi.setText("Xiangwei Zheng");
            labelForHi.setFont(new Font("Verdana", 0, 20));
        }
    }
}
