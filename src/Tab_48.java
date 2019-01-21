// This class Tab_48 contains 20 panels.

import javax.swing.*;
import java.awt.*;

public class Tab_48 extends JPanel {

    private static String[] myTeamPanels = {"Panel_23", "Panel_30", "Panel_90",
            "Panel_41", "Panel_10", "Panel_46", "Panel_61", "Panel_04", "Panel_79",
            "Panel_??", "Panel_??", "Panel_??", "Panel_??", "Panel_??", "Panel_??",
            "Panel_??", "Panel_??", "Panel_??", "Panel_??", "Panel_??"};

    String name = "Hsin-Jung Lee";

    public Tab_48() {
        this.setLayout(new GridLayout(5, 4, 3, 3));
        addMyTeamPanels();
    }


//    public void setName(String name) {
//        this.name = name;
//    }

    public String getName() {
        return name;
    }

    private void addMyTeamPanels() {
        for (int k = 0; k < myTeamPanels.length; k++) {
            try {
                Class<?> clazz = Class.forName(myTeamPanels[k]);
                Object myPanel = clazz.getDeclaredConstructors().newInstance();
                this.add((JPanel) myPanel);
            } catch (Exception e) {
                JPanel myNewPanels = new JPanel();
                myNewPanels.add(new JLabel("Panel is missing: " + myTeamPanels[k]));
                this.add(myNewPanels);
            }
        }
    }

}


//    public static void main (String[] args){
//        JFrame frame = new JFrame(" GridLayout");
//
//        JPanel p1 = new JPanel( );
//
//        JButton button = new JButton("1");
//        p1.add(button);
//
//        frame.add(p1, BorderLayout.SOUTH);
//        frame.pack();
//        frame.setVisible(true);
//    }
//}


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
