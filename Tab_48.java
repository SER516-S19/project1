import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class Tab_48 contains 20 panels.
 * Author: Hsin-Jung Lee
 * Version: 10
 */

public class Tab_48 extends JPanel implements TabInterface {

    private static String[] teamPanels = {"Panel_04", "Panel_10", "Panel_11",
            "Panel_23", "Panel_30", "Panel_35", "Panel_41", "Panel_43",
            "Panel_46", "Panel_56", "Panel_61", "Panel_63", "Panel_79",
            "Panel_90", "", "", "", "", "", ""};

    String name = "Hsin-Jung Lee";

    int timeTicker = 0;

    public Tab_48() {
        this.setLayout(new GridLayout(5, 4, 4, 4));
        addTeamPanels();
    }

    public String getName() {
        return name;
    }

    ActionListener actionListener = new ActionListener() {

        public void actionPerformed(ActionEvent actionEvent) {

            PanelInterface currentPanelIndex, previousPanelIndex;
            int index = 0;
            try {
                timeTicker += 1;
                index = (timeTicker - 1) % 14;
                currentPanelIndex = (PanelInterface) getComponent(index);
                currentPanelIndex.sayHi(true);

                if (index - 1 >= 0) {
                    previousPanelIndex =
                            (PanelInterface) getComponent(index - 1);
                    previousPanelIndex.sayHi(false);
                }

                if (timeTicker > 13 && index == 0) {
                    previousPanelIndex = (PanelInterface) getComponent(index + 13);
                    previousPanelIndex.sayHi(false);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    };

    Timer timer = new Timer(1000, actionListener);

    public void startSayingHi() {
        timer.setRepeats(true);
        timer.start();
    }

    public void stopSayingHi() {
        timeTicker = 0;
        timer.stop();
    }

    private void addTeamPanels() {
        for (int k = 0; k < teamPanels.length; k++) {
            try {
                Class<?> forName = Class.forName(teamPanels[k]);
                Object teamPanel =
                        forName.getDeclaredConstructor().newInstance();
                this.add((JPanel) teamPanel);
            } catch (Exception e) {
                JPanel newPanels = new JPanel();
                this.add(newPanels);
            }
        }
    }
}
