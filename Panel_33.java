import java.awt.*;
import javax.swing.*;

/**
* This Panel displays "Paul Horton" in wavy text using HTML sub and super text
* and implements a method to say hello. This is for SER 516
*
* @author  Paul Horton
* @version 1.1
* @since   2019-01-24
*/
public class Panel_33 extends JPanel implements PanelInterface{
    public Panel_33() {
        setLayout(new GridBagLayout());
        JLabel name = new JLabel("<html><center>P<sub>a</sub>u<sup>l</sup>" +
        "H<sub>o</sub>r<sup>t</sup>o<sub>n</sub></center></html>");
        name.setFont(new Font("Monospaced",Font.BOLD,32));
        add(name);
    }
    /**
    * Adds "Hi!" below "Paul Horton" if told to
    * @param showHi if we should show "Hi!"
    */
    public void sayHi(boolean showHi) {
        JLabel name = (JLabel)getComponent(0);
        if(showHi) {
            name.setText("<html><center>P<sub>a</sub>u<sup>l</sup>" +
            "H<sub>o</sub>r<sup>t</sup>o<sub>n</sub><br />Hi!</center></html>");
        }
        else {
            name.setText("<html><center>P<sub>a</sub>u<sup>l</sup>" +
            "H<sub>o</sub>r<sup>t</sup>o<sub>n</sub></center></html>");
        }
    }

    /**
    * Repaints the panel with a gradient with code by Radiodef:
    * https://stackoverflow.com/questions/19613955/netbeans-jpanel-gradient-background
    **/
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g.create();
        int w = getWidth();
        int h = getHeight();
        GradientPaint gp = new GradientPaint(
            0, 0, Color.yellow,
            0, h, Color.green);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
        g2d.dispose();
    }
}
