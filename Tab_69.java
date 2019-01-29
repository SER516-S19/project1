import javax.swing.*;
import java.awt.*;

/**  Fifth tab in the frame containing 20 panels displaying
 * students name and "Hi"
 *
 * @author : Jahnvi Rai
 * @version : 2.0
 * @since : 01/19/2019
 */


public class Tab_69 extends JPanel implements TabInterface{

    private Thread thread;
    private Boolean startStopThread = true;

    @Override
    public void startSayingHi() {
        startStopThread = true;
        thread = new Thread() {
            @Override
            public void run() {

                int panelCount=0;
                while(startStopThread)
                {
                    panelCount=panelCount%20;
                    try
                    {
                        PanelInterface panelInterface = (PanelInterface) getComponent(panelCount);
                        panelInterface.sayHi(true);
                        sleep(1000);
                        panelInterface.sayHi(false);
                    }
                    catch(Exception e)
                    {
                        // If empty panel, move to the next panel
                    }
                    panelCount++;
                }
                thread.interrupt();

            }
        };
        thread.start();

    }

    @Override
    public void stopSayingHi() {
        if (thread != null) {
            startStopThread =false;

        }
    }


    public String getName() {
        return tabName;
    }

    public void setTabName(String tabName) {
        this.tabName = tabName;
    }

    private String tabName = "Jahnvi";

    //List of panel classes to be added
    private String[] panelNames = {"Panel_01","Panel_12","Panel_14","Panel_19","Panel_51","Panel_78",
            "Panel_89","Panel_62","Panel_37","Panel_66","Panel_72","Panel_67","Panel_64","Panel_75",
            "Panel_50", "Panel_XX","Panel_XX","Panel_XX","Panel_XX","Panel_XX"};


    Tab_69() {
        this.setLayout(new GridLayout(5,4));
        addPanel();

   }

    /* Function to check for existing panel classes
    and add them to the tab
     */
    private void addPanel(){
        for(int i =0;i<panelNames.length;i++){
            try{
                Class<?> clazz = Class.forName(panelNames[i]);
                Object newPanel = clazz.getDeclaredConstructor().newInstance();
                this.add((JPanel)newPanel);
            }
            catch (Exception e){
                JPanel newPanel = new JPanel();
                this.add(newPanel);
            }

        }
    }

}
