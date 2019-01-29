import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

/** Tab 27 with 19 panels + 1 blank
 * Author: Bharat Goel
 * This class takes 20 panels and wrap them into a tab with 4x5 grid layout
 */

public class Tab_27 extends JPanel implements TabInterface {

    String myTab = "Bharat";

    public String getName() {
        return myTab;
    }

    public void setTabName(String tabName) {
        this.myTab = myTab;
    }

    public String[] myPanels;

    private int tick = 0;       //to make a second clock tick functions

    private static Timer timer;

    Tab_27() {
        this.setLayout(new GridLayout(5,4));

        myPanels = new String[]{"Panel_06", "Panel_18", "Panel_20", "Panel_59", "Panel_84", "Panel_05", "Panel_70",
                "Panel_80", "Panel_17", "Panel_49", "Panel_55", "Panel_52", "Panel_65", "Panel_31", "Panel_16",
                "Panel_26", "Panel_08", "Panel_39", "Panel_24", "Panel_XX"};

        //Add all the panels to tab and add blank panel if nothing found
        for(int i = 0; i < myPanels.length; i++){
            try{
                Class<?> clas = Class.forName(myPanels[i]);
                Object newPanel = clas.getDeclaredConstructor().newInstance();
                this.add((JPanel)newPanel);
            }
            catch (Exception e){
                JPanel blankPanel = new JPanel();
                this.add(blankPanel);
            }
        }

    }

    //Make every panel say Hi each second one by one when Tab is active
    @Override
    public void startSayingHi() {
        timer = new Timer();
        Component[] allPanels = this.getComponents();
        tick = 0;
        timer.scheduleAtFixedRate(new TimerTask() {
            //@Override
            public void run() {
                try{
                    ((PanelInterface)allPanels[tick]).sayHi(true);
                    if(tick > 0 && tick < 18){
                        ((PanelInterface)allPanels[tick-1]).sayHi(false);
                    }
                    else if (tick == 0) {
                        ((PanelInterface)allPanels[18]).sayHi(false);
                    }
                    else if (tick == 18) {
                        ((PanelInterface)allPanels[tick-1]).sayHi(false);
                        tick = -1;
                    }
                } catch (Exception e) {
                    //
                }
                tick++;
            }
        }, 0, 1000);
    }

    //Stop the Hi loop when Tab is not active
    @Override
    public void stopSayingHi() {
        timer.cancel();
        tick = 0;
    }
}