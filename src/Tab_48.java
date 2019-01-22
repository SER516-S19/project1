// This class Tab_48 contains 20 panels.

import javax.swing.*;
import java.awt.*;

public class Tab_48 extends JPanel {

    private static String[] myTeamPanels = {"Panel_04", "Panel_??", "Panel_10",
            "Panel_23", "Panel_30", "Panel_??", "Panel_41", "Panel_??", "Panel_46",
            "Panel_??", "Panel_??", "Panel_61", "Panel_63", "Panel_??", "Panel_79",
            "Panel_90", "Panel_??", "Panel_??", "Panel_??", "Panel_??"};

    String name = "Hsin-Jung Lee";

    public Tab_48() {
        this.setLayout(new GridLayout(5, 4, 3, 3));
        addMyTeamPanels();
    }

    public String getName() {
        return name;
    }

    private void addMyTeamPanels() {
        for (int k = 0; k < myTeamPanels.length; k++) {
            try {
                Class<?> myClass = Class.forName(myTeamPanels[k]);
                Object myPanel = myClass.getDeclaredConstructor().newInstance();
                this.add((JPanel) myPanel);
            } catch (Exception e) {
                JPanel myNewPanels = new JPanel();
                myNewPanels.add(new JLabel("Panel is missing: " + myTeamPanels[k]));
                this.add(myNewPanels);
            }
        }
    }

}


