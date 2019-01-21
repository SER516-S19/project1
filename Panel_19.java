import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;


/*
 * Author: Aneesh Dalvi
 * ID: 19
 */


public class Panel_19 extends JPanel
{


    Panel_19()
    {

        JLabel jlabel = new JLabel("Aneesh Dalvi");
        jlabel.setFont(new Font("Verdana",1,20));
        setBorder(new LineBorder(Color.blue));
        setBounds(10,10,170,60);
        setVisible(true);
        setBackground(Color.LIGHT_GRAY);
        add(jlabel);


    }



}
