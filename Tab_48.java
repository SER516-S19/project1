// This class Tab_48 contains 20 panels.

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tab_48 extends JPanel implements TabInterface {

    private static String[] myTeamPanels = {"Panel_04", "Panel_10", "Panel_11",
            "Panel_23", "Panel_30", "Panel_35", "Panel_41", "Panel_43", "Panel_46",
            "Panel_56", "Panel_61", "Panel_63", "Panel_79","Panel_90",
            "", "", "", "", "", "",};

    String name = "Hsin-Jung Lee";

    int timeTicker = 0;

    // constructor
    public Tab_48() {
        this.setLayout(new GridLayout(5, 4, 4, 4));
        addMyTeamPanels();
    }

    public String getName() {
        return name;
    }

   ActionListener myTask = new ActionListener() {
        //@Override
        public void actionPerformed(ActionEvent actionEvent) {
            //timer
            PanelInterface currentPanelIndex, previousPanelIndex;
            int index = 0;
            try{
                timeTicker += 1;
                index = (timeTicker - 1 ) % 14;
                currentPanelIndex = (PanelInterface) getComponent(index);
                currentPanelIndex.sayHi(true);

                if (index - 1 >= 0){
                    previousPanelIndex = (PanelInterface) getComponent(index-1);
                    previousPanelIndex.sayHi(false);
                }
                //used to fix last hi do not update 
                 if(timeTicker > 13 &&index == 0) {
           		 previousPanelIndex = (PanelInterface) getComponent(index+13);
                    previousPanelIndex.sayHi(false);
           		
           	}
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    };

    Timer myTimer = new Timer(1000,myTask);

    public void startSayingHi() {
        myTimer.setRepeats(true);
        myTimer.start();
    }

    public void stopSayingHi() {
        timeTicker = 0;
        myTimer.stop();
    }

    private void addMyTeamPanels() {
        for (int k = 0; k < myTeamPanels.length; k++) {
            try {
                Class<?> myClass = Class.forName(myTeamPanels[k]);
                Object myPanel = myClass.getDeclaredConstructor().newInstance();
                this.add((JPanel) myPanel);
            } catch (Exception e) {
                JPanel myNewPanels = new JPanel();
                //myNewPanels.add(new JLabel("" + myTeamPanels[k]));
                this.add(myNewPanels);
            }
        }
    }
}


