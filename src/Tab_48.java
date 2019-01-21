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
                Object myPanel = clazz.getDeclaredConstructor().newInstance();
                this.add((JPanel) myPanel);
            } catch (Exception e) {
                JPanel myNewPanels = new JPanel();
                myNewPanels.add(new JLabel("Panel is missing: " + myTeamPanels[k]));
                this.add(myNewPanels);
            }
        }
    }

}


