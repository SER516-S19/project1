// This tab contains 20 panels.

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Tab_48 extends MainTab {


    JPanel Panel_48 = new JPanel();


    JLabel Label_48 = new JLabel("");

    JTabbedPane tabbedPane = new JTabbedPane();

    public Tab_48(){
        Panel_48.add(Label_48);
        tabbedPane.add("Hsin-Jung Lee", Label_48);
        add(tabbedPane);

        //create 20 empty panels
//        for (int j = 0; j < 1; j++){
//            JPanel p = new JPanel();
//            p.setVisible(true);
//            p.setSize(50, 50);
//            p.setBackground(Color.WHITE);
//            p.setBorder(new LineBorder(Color.BLACK));
//            add(p);
//        }


    }

//    public static void main (String[]args){
//
//        Tab_48 tab_48 = new Tab_48();
//        tab_48.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        tab_48.setSize(600,400);
//        tab_48.setLocationRelativeTo(null);
//        tab_48.setVisible(true);
//    }
}

// for test
//public class Tab_48 extends JFrame {
//
//    JPanel Panel_41 = new JPanel();
//    //JPanel Panel_10 = new JPanel();
//
//    JLabel Label_41 = new JLabel("41");
//    //JLabel Label_10 = new JLabel("10");
//
//    JTabbedPane tabbedPane = new JTabbedPane();
//
//    public Tab_48(){
//        Panel_41.add(Label_41);
//        //Panel_10.add(Label_10);
//
//        tabbedPane.add("Panel_41", Label_41);
//        //tabbedPane.add("Panel_10",Label_10);
//        add(tabbedPane);
//    }
//
//    public static void main (String[]args){
//
//        Tab_48 tab_48 = new Tab_48();
//        tab_48.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        tab_48.setSize(600,400);
//        tab_48.setLocationRelativeTo(null);
//        tab_48.setVisible(true);
//    }
//}
