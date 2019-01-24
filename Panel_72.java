import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import java.awt.*;

/**
 *
 * @author Alsha Samantaray
 * gitID: 72
 */
 public class Panel_72 extends JPanel{

     Panel_72(){
         JLabel label = new JLabel("Alsha Samantaray",SwingConstants.CENTER);
         label.setVerticalAlignment(SwingConstants.CENTER);
         label.setFont(new Font("Serif",Font.PLAIN,25));
         setBorder(BorderFactory.createLineBorder(Color.black));
         setBackground(Color.GRAY);
         setVisible(true);
         add(label);
     }
 }