import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;


/*
 * @author: Prashansa
    GIT Id: 58
 * Creating panel 58
 */


public class Panel_58 extends JPanel
{

    Panel_58()
    {

        JLabel jlabel = new JLabel("Prashansa");
        jlabel.setFont(new Font("Arial", Font.PLAIN, 40));
        setBackground(Color.CYAN);
        setBorder(new LineBorder(Color.GREEN));
        setVisible(true);
        add(jlabel);
    }
}