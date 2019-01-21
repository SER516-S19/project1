import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;


/*
 * @author:  Muhammad Sami
    GIT Id: 73
 * Creating panel 73
 */


public class Panel_73 extends JPanel
{

    Panel_73()
    {

        JLabel jlabel = new JLabel("Muhammad Sami");
        jlabel.setFont(new Font("Arial", Font.PLAIN, 20));
        setBackground(Color.LIGHT_GRAY);
        setBorder(new LineBorder(Color.BLACK));
        setVisible(true);
        add(jlabel);
    }
}