import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;


/*
 * @author:  Gangadhara Matti
 * @gitID:   51
 * To create a panel
 */


public class Panel_51 extends JPanel implements PanelInterface
{
    public String panelName = "Gangadhar Matti";

    Panel_51()
    {

        JLabel jlabel = new JLabel();
        jlabel.setText("Gangadhar Matti");
        jlabel.setFont(new Font("Verdana",1,20));

        setBackground(Color.LIGHT_GRAY);
        setBorder(new LineBorder(Color.red));
        setVisible(true);
        add(jlabel);
    }

    @Override
    public void sayHi(boolean flag) {
        JLabel jLabel = (JLabel)getComponent(0);
        if(flag)
            jLabel.setText("<html>Gangadhar Matti<br/> Hi!</html>");
        else
            jLabel.setText("Gangadhar Matti");
    }


}