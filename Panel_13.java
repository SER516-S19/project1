import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;


/*
 * @author:  Subhradeep Biswas
 * GitID: 13
 * Creating panel_13
 */


public class Panel_13 extends JPanel
{

    Panel_13()
    {

        JLabel jlabel = new JLabel("Subhradeep Biswas");
        jlabel.setFont(new Font("Arial", Font.PLAIN, 20));

        setBackground(Color.LIGHT_GRAY);
        setBorder(new LineBorder(Color.BLACK));
        setVisible(true);
        add(jlabel);
    }
}