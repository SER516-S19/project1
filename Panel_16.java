import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;


/*
 * @author:  Subhradeep Biswas
 * Creating panel 16
 */


public class Panel_16 extends JPanel
{

    Panel_16()
    {

        JLabel jlabel = new JLabel("Subhradeep Biswas");
        jlabel.setFont(new Font("Arial", Font.PLAIN, 20));

        setBackground(Color.LIGHT_GRAY);
        setBorder(new LineBorder(Color.BLACK));
        setVisible(true);
        add(jlabel);
    }
}