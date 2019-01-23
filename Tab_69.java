/** Tab5 containing 20 panel
 * Author: Jahnvi Rai jrai4
 */

import javax.swing.*;
import java.awt.*;



public class Tab_69 extends JPanel implements TabInterface{

    private Thread t = new Thread();

    @Override
    public void startSayingHi() {


    }


    @Override
    public void stopSayingHi() {

    }

    private void run() {
        Component[] components = fetchComponents();
        int i =0;
        for( i = i%20;i<components.length;i++) {
            try {
                PanelInterface panelInterface = (PanelInterface) components[i];
                panelInterface.sayHi(true);
                t.sleep(500);
                panelInterface.sayHi(false);
            } catch (Exception e) {
                handleMissingMethodException(components[i]);
            }
        }

    }

    private void handleMissingMethodException(Component component){
        try {
              JLabel label = new JLabel("Hii");
              ((JPanel) component).add(label);
              t.sleep(500);
              ((JPanel) component).remove(label);

        }catch (Exception e){

        }

    }

    //Method called from the main frame to access the tab name
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

    JPanel panel = new JPanel();

    // Default constructor
    Tab_69() {
        this.setLayout(new GridLayout(5,4));
        addPanel();


   }
    //Method to check for existing class panels and add them
    private void addPanel(){
        for(int i =0;i<panelNames.length;i++){
            try{
                Class<?> clazz = Class.forName(panelNames[i]);
                Object newPanel = clazz.getDeclaredConstructor().newInstance();
                this.add((JPanel)newPanel);
            }
            catch (Exception e){
                JPanel newPanel = new JPanel();
                newPanel.add(new JLabel("Panel Missing " + panelNames[i]));
                this.add(newPanel);
            }

        }
    }


    private Component[] fetchComponents(){
       return this.getComponents();
    }

}
