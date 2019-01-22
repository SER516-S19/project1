import javax.swing.*;
import java.awt.*;

/** Tab 27 with 18 panels + 2 blank
 * Author: Bharat Goel
 */

public class Tab_27 extends JPanel {

    String myTab = "Bharat";

    public String getName() {
        return myTab;
    }

    public void setTabName(String tabName) {
        this.myTab = myTab;
    }

    public String[] myPanels;

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
                blankPanel.add(new JLabel(myPanels[i] + " unavailable"));
                this.add(blankPanel);
            }
        }

    }

}