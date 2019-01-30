import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;


/*
 * @author: Aneesh Dalvi
 * @gitID: 19
 */

/**
 *  Creates a panel and adds a label with the user's name
 */
public class Panel_19 extends JPanel implements PanelInterface
{

    /**
    *   Constructor used to create and add a label with the user
    *   name and assign the label properties to Panel_19
    */
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

    /**
    *   When the hiFlag is set to true, the panel_19 shows
    *   the user name along with a Hi! message.
    *   If the hiFlag is false, then only the user name is shown.
    *   @param hiFlag
    */
    @Override
    public void sayHi(boolean hiFlag)
    {
        JLabel labelName = (JLabel)getComponent(0);
        if(hiFlag)
        {
            labelName.setText("<html>Aneesh Dalvi<br/>Hi!</html>");
        }
        else
        {
            labelName.setText("Aneesh Dalvi");
        }
    }



}
