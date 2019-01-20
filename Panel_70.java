import javax.swing.*;
import java.awt.*;

/*
 * Author: Nikhila Saini
 * GitID: 70
*/


public class Panel_70 extends JPanel {

   /*public static void main(String[] args) {
      new Panel_70();    //For Testing
    }*/


    public Panel_70() {
        //JFrame frame = new JFrame("Example Panel"); //For Testing
        JPanel jPanel = new JPanel();
        JLabel jLabel = new JLabel("Nikhila Saini");
   	jLabel.setFont(new Font("Algerian", Font.BOLD, 24));
        jPanel.add(jLabel);

        //frame.setSize(700, 600);
        //frame.add(jPanel);
	    //frame.setVisible(true);

        //jPanel.setBounds(10, 10, 250, 60);
        jPanel.setBackground(Color.CYAN);
        
    }


}