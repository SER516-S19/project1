import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class Tab_45 extends JPanel implements TabInterface {
    
    private Timer hiTimer;
    
    //time in ms, delay is amount of time before 1st hi appears,
    //hiLength is how long it takes for "hi" to move to next panel.
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
    //Allows me to easily iterate over panels in my tab
    private JPanel[] panels = new JPanel[20];
    
    //index of next panel to display "hi"
    private int hiDisplayIndex = 0;
    
    public Tab_45() {
        hiTimer = new Timer();
        this.setLayout(new GridLayout(5, 4));
        //add panels
        for (int i = 0; i < panelNumbers.length; i++) {
            try {
                Class<?> panelClass = Class.forName("Panel_" + panelNumbers[i]);
                JPanel panel = (JPanel) panelClass.getDeclaredConstructor().newInstance();
                this.panels[i] = panel;
                this.add(panel);
            } catch (Exception e) {
                this.addError(panelNumbers[i]);
            }
        }
    }
    
    private void addError(String panelName) {
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Panel " + panelName + " Error");
        panel.add(label);
        this.add(panel);
    }
    
    //part of TabInterface, returns name for tab.
    public String getName() {
        return "David Lahtinen";
    }
    
    public void startSayingHi() {
        hiDisplayIndex = 0;
        try {
            hiTimer.cancel();
        }catch(IllegalStateException e){
            //timer was already cancelled; this is good
        }catch(NullPointerException npe){
            //first time timer was initialized. No sweat
        }
        hiTimer = new Timer();
        hiTimer.scheduleAtFixedRate(new HiWave(), 0, 1000);
    }
    
    public void stopSayingHi() {
        hiDisplayIndex = 0;
        try {
            hiTimer.cancel();
        } catch (IllegalStateException e){
            //In this case, the timer was already cancelled.
        } catch (NullPointerException npe){
            //in this case, the timer was not yet instantiated.
            //this should never be called, but it's a good failsafe to have
            // if stopSayingHi() is called before startSayingHi
            System.out.println("[WARN]: stopSayingHi() called before startSayingHi() in Tab_45.");
        }
        for (JPanel p : panels) {
            if (p instanceof PanelInterface) {
                ((PanelInterface) p).sayHi(false);
            } else {
                System.out.println("Panel does not implement panelInterface");
            }
        }
    }
    
    private int previousHiDisplayIndex() {
        return hiDisplayIndex - 1 < 0 ? (panels.length - 1) : (hiDisplayIndex - 1);
    }
    
    private int nextHiDisplayIndex() {
        return hiDisplayIndex + 1 >= panels.length ? 0 : (hiDisplayIndex + 1);
    }
    
    //Task to be executed by hiTimer
    //Causes each panel to say "hi" in turn, one after the other
    //panel ceases to say "hi" as the next starts.
    private class HiWave extends TimerTask {
        public void run() {
            try {
                int prev = previousHiDisplayIndex();
                if (panels[prev] instanceof PanelInterface) {
                    ((PanelInterface) panels[prev]).sayHi(false);
                } else {
                    System.out.println("Panel_" + panelNumbers[prev] + " does not implement PanelInterface");
                }
                
                if (panels[hiDisplayIndex] instanceof PanelInterface) {
                    ((PanelInterface) panels[hiDisplayIndex]).sayHi(true);
                } else {
                    System.out.println("Panel_" + panelNumbers[hiDisplayIndex] + 
                        " does not implement PanelInterface");
                }
                hiDisplayIndex = nextHiDisplayIndex();
                
            } catch (Exception e) {
                System.out.println("Exception in Tab_45 task timer execution");
                e.printStackTrace();
            }
        }
    }
    
}