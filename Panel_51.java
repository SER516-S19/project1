import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;


/*
 * @author:  Gangadhara Matti
 * @gitID:   51
 * To create a panel
 */


public class Panel_51 extends JPanel
{

    Panel_51()
    {

        JLabel jlabel = new JLabel("Gangadhara Matti");
        jlabel.setFont(new Font("Verdana",1,20));

        setBackground(Color.LIGHT_GRAY);
        setBorder(new LineBorder(Color.red));
        setVisible(true);
        add(jlabel);
    }
}