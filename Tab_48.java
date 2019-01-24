// This class Tab_48 contains 20 panels.

import javax.swing.*;
import java.awt.*;

public class Tab_48 extends JPanel implements TabInterface {

    public void startSayingHi() {

    }

    public void stopSayingHi() {

    }

    private static String[] myTeamPanels = {"Panel_04", "Panel_10", "Panel_11",
            "Panel_23", "Panel_30", "Panel_35", "Panel_41", "Panel_43",
            "Panel_46", "Panel_56", "Panel_61", "Panel_63", "Panel_79",
            "Panel_90", "", "", "", "", "", "",};

    String name = "Hsin-Jung Lee";
    int timerCount = 0;

    // constructor
    public Tab_48() {
        this.setLayout(new GridLayout(5, 4, 4, 4));
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


