import java.awt.*;
import javax.swing.*;

/**
 * This class creates Panel_30 with my name
 * @author Krishna Gurram
 * @version 1.1
 */

 class Panel_30 extends JPanel implements PanelInterface {

   private String name = "Krishna Gurram";
   private JLabel nameLabel = new JLabel(name);
/**
* Calls a method that creates the Panel with name
*/
   Panel_30() {
     createPanel(); 
   }
  /**
  * This method returns name and Hi if @param flag is true and
  * returns only name if it is false
  */

   public void sayHi(boolean flag) {
     if(flag){
       nameLabel.setText(name+" Hi");
     }
     else {
       nameLabel.setText(name);
     }
   }

   public void createPanel() {
     add(nameLabel);
     nameLabel.setFont(new Font("Osaka",Font.PLAIN,15));
     setBackground(Color.WHITE);
   }
 }
