import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;


/*
 * Author: Aneesh Dalvi
 * ID: 19
 */


public class Panel_19 extends JPanel implements PanelInterface
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

     @Override
    public void sayHi(boolean flag) {
        JLabel labelName = (JLabel)getComponent(0);
        if(flag)
        {
            labelName.setText("<html>Aneesh Dalvi<br/>Hi!</html>");
        }
        else
        {
            labelName.setText("Aneesh Dalvi");
        }
    }



}
