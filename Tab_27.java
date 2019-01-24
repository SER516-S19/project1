import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

/** Tab 27 with 19 panels + 1 blank
 * Author: Bharat Goel
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

    private int tick = 0;

    private static Timer timer;

    Tab_27() {
        this.setLayout(new GridLayout(5,4));

        myPanels = new String[]{"Panel_06", "Panel_18", "Panel_20", "Panel_59", "Panel_84", "Panel_05", "Panel_70",
                "Panel_80", "Panel_17", "Panel_49", "Panel_55", "Panel_52", "Panel_65", "Panel_31", "Panel_16", "Panel_26",
                "Panel_08", "Panel_39", "Panel_24", "Panel_XX"};

        for(int i = 0; i<myPanels.length; i++){
            try{
                Class<?> c = Class.forName(myPanels[i]);
                Object newPanel = c.getDeclaredConstructor().newInstance();
                this.add((JPanel)newPanel);
            }
            catch (Exception e){
                JPanel blankPanel = new JPanel();
                //blankPanel.add(new JLabel(myPanels[i] + " unavailable"));
                this.add(blankPanel);
            }
        }

    }

    @Override
    public void startSayingHi() {
        timer = new Timer();
        Component[] allPanels = this.getComponents();
        tick = 0;
        timer.scheduleAtFixedRate(new TimerTask() {
            //@Override
            public void run() {
                try{
                    if(tick > 0 && tick < 19){
                        ((PanelInterface)allPanels[tick]).sayHi(true);
                        ((PanelInterface)allPanels[tick-1]).sayHi(false);
                    }
                    else if (tick == 0) {
                        ((PanelInterface)allPanels[tick]).sayHi(true);
                        ((PanelInterface)allPanels[19]).sayHi(false);
                    }
                    else if (tick == 19) {
                        ((PanelInterface)allPanels[tick]).sayHi(true);
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


    @Override
    public void stopSayingHi() {
        timer.cancel();
        tick = 0;
    }

    public static void main(String[] args) {
        JFrame f;
        f = new JFrame();
        JPanel tab1 = new Tab_27();
        JTabbedPane tp = new JTabbedPane();
        tp.addTab( tab1.getName(),tab1);
        f.getContentPane().add(tp);
        f.setSize(800, 800);
        f.setVisible(true);
        ((Tab_27) tab1).startSayingHi();
    }
}