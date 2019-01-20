import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

/* Objective of this class is to create a panel with label
Label contains First name & Last name of the student */

//Author :  Krishna Gurram


 class Panel_30 {

   Panel_30() {

     createPanel(); //creates the Panel with Name
   }

   public void createPanel() {

    // JFrame frame = new JFrame();
     JPanel panel_30 = new JPanel();
     JLabel name = new JLabel("Krishna Gurram");

     panel_30.setBackground(Color.WHITE);
     panel_30.add(name);
     name.setFont(new Font("Osaka",Font.PLAIN,15));

  /*  For testing

     frame.add(panel_30);
     frame.setSize(200,200);
     frame.setVisible(true);
   }

 public static void main(String[] args) {
  Panel_30 panel = new Panel_30();
} */
 }
