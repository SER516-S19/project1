import java.awt.*;
import javax.swing.*;

/**
 *       Class: Panel_33
 * Description: A panel with my name on it for the course panel list
 *      Author: Paul Horton
 *      Course: SER 516
 *        Date: 1/22/19
 *     Project: 1
**/
public class Panel_33 extends JPanel {
  public Panel_33() {
    init();
  }

  private void init() {
    this.setLayout(new GridBagLayout());
    JLabel label = new JLabel("<html> P<sub>a</sub>u<sup>l</sup> H<sub>o</sub>r<sup>t</sup>o<sub>n</sub> </html>");
    label.setFont(new Font("Monospaced",Font.BOLD,32));
    this.add(label);
  }

  /**
   * Gradient Paint found from here by Radiodef:
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
