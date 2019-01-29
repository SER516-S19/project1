import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Tab_45 is meant to contain the tabs of 20 people (gitIDs below)
 * it creates a wave of "Hi"s when the tab is openend
 *
 * @author David Lahtinen
 * @version 2.0
 * @since 2019-01-24
 */

public class Tab_45 extends JPanel implements TabInterface {
    
    private Timer hiTimer;
    private int hiDelay = 0;
    private int hiLength = 1000;
    //The gitIds of the students involved
    private String[] panelNumbers = {
            "47", "60", "71", "38",
            "54", "74", "09", "76",
            "33", "07", "03", "68",
            "25", "42", "86", "13",
            "85", "58", "36", "73"
    };
    private JPanel[] panels = new JPanel[20];
    //index of next panel to display "hi"
    private int hiDisplayIndex = 0;
    
    public Tab_45() {
        hiTimer = new Timer();
        setLayout(new GridLayout(5, 4));
        for (int i = 0; i < panelNumbers.length; i++) {
            try {
                Class<?> panelClass = Class.forName("Panel_" + panelNumbers[i]);
                JPanel panel = (JPanel) panelClass.getDeclaredConstructor().newInstance();
                panels[i] = panel;
                add(panel);
            } catch (Exception e) {
                addError(panelNumbers[i]);
            }
        }
    }
    
    private void addError(String panelNumber) {
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Panel " + panelNumber + " Error");
        panel.add(label);
        add(panel);
    }

    @Override
    public String getName() {
        return "David Lahtinen";
    }
    
    private int nextHiDisplayIndex() {
        return hiDisplayIndex + 1 >= panels.length ? 0 : (hiDisplayIndex + 1);
    }
    
    private int previousHiDisplayIndex() {
        return hiDisplayIndex - 1 < 0 ? (panels.length - 1) : (hiDisplayIndex - 1);
    }
    
    @Override
    public void startSayingHi() {
        hiDisplayIndex = 0;
        if (hiTimer != null){
            try {
                hiTimer.cancel();
            }catch(IllegalStateException e){
                //timer was already cancelled; this is good
            }
        }
        hiTimer = new Timer();
        hiTimer.scheduleAtFixedRate(new HiWave(), hiDelay, hiLength);
    }
    
    @Override
    public void stopSayingHi() {
        hiDisplayIndex = 0;
        if (hiTimer != null) {
            try {
                hiTimer.cancel();
            } catch (IllegalStateException e) {
                //In this case, the timer was already cancelled.
            }
        } else {
            System.out.println("[WARN]: stopSayingHi() called before startSayingHi() in Tab_45.");
        }
        for (JPanel p : panels) {
            if (p instanceof PanelInterface) {
                try {
                    ((PanelInterface) p).sayHi(false);
                }catch(Exception e){
                    e.printStackTrace();
                }
            } else {
                System.out.println("[ERROR]: Panel does not implement panelInterface");
            }
        }
    }

    /* Task to be executed by hiTimer
      Causes each panel to say "hi" in turn, one after the other
      panel ceases to say "hi" as the next starts.
    */
    private class HiWave extends TimerTask {
        public void run() {
            try {
                int prev = previousHiDisplayIndex();
                if (panels[prev] instanceof PanelInterface) {
                    try {
                        ((PanelInterface) panels[prev]).sayHi(false);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("[ERROR]: Panel_" + panelNumbers[prev] + " does not implement PanelInterface");
                }
    
                if (panels[hiDisplayIndex] instanceof PanelInterface) {
                    try {
                        ((PanelInterface) panels[hiDisplayIndex]).sayHi(true);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("[ERROR]: Panel_" + panelNumbers[hiDisplayIndex] +
                            " does not implement PanelInterface");
                }
                hiDisplayIndex = nextHiDisplayIndex();
    
            }  catch (Exception e) {
                System.out.println("[ERROR]: Exception in Tab_45 task timer execution");
                e.printStackTrace();
            }
        }
    }
}