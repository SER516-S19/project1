import java.awt.*;
import javax.swing.*;


/* Objective of this class is to create a panel with label
Label contains First name & Last name of the student */

//Author :  Krishna Gurram


 class Panel_30 extends JPanel {

   Panel_30() {

     createPanel(); //creates the Panel with Name
   }

   public void createPanel() {


     JLabel name = new JLabel("Krishna Gurram");
     add(name);
     name.setFont(new Font("Osaka",Font.PLAIN,15));
     setBackground(Color.WHITE);

   }

 }
