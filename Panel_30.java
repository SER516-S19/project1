import java.awt.*;
import javax.swing.*;


/* Objective of this class is to create a panel with label
Label contains First name & Last name of the student */

//Author :  Krishna Gurram


 class Panel_30 extends JPanel implements PanelInterface {

   private String myName = "Krishna Gurram";
   private JLabel nameLabel = new JLabel(myName);

   Panel_30() {
     createPanel(); //creates the Panel with Name
   }

   public void sayHi(boolean flag) {
     if(flag){
       nameLabel.setText(myName+" Hi");
     }
     else {
       nameLabel.setText(myName);
     }
   }

   public void createPanel() {
     add(nameLabel);
     nameLabel.setFont(new Font("Osaka",Font.PLAIN,15));
     setBackground(Color.WHITE);
   }
 }
