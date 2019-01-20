/** Tab5 containing 20 panel
 * Author: Jahnvi Rai jrai4
 */

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Tab_69 extends MainTab {

    public String getName() {
        return tabName;
    }

    public void setTabName(String tabName) {
        this.tabName = tabName;
    }

    String tabName = "Jahnvi";

    Tab_69() {
        super("Jahnvi");
        // Creating empty panels to check the creation of 20 panels as per the grid layout
        // Will be adding the panel class object of the students.
        for(int i=0;i<20;i++){
            JPanel panel = new JPanel();
            panel.setSize(50,50);
            panel.setBackground(Color.LIGHT_GRAY);
            panel.setBorder(new LineBorder(Color.yellow));
            panel.setVisible(true);
            this.add(panel);
        }

    }
}
