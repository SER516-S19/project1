/*  
    Class to create the Tab 21 and to contain all of the panels on Gold Team
    Author: Joshua Drumm
    E-Mail: jkdrumm@asu.edu
    Date:   1/19/2019
*/

import java.awt.GridLayout;
import java.awt.LayoutManager;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tab_21 extends MainTab
{
    private static String[] panelNums = {"53", "82"};
    
    public Tab_21()
    {
        super();
        addPanels();
    }
    
    public Tab_21(String name)
    {
        super(name);
        addPanels();
    }
    
    @Override
    public String getName()
    {
        return "Josh Drumm";
    }

    private void addPanel(String panelClassNum){
        // takes the class name as parameter and if the class exists then adds 
        // its object to the passed tabbedPane
        try{
            Class<?> clazz = Class.forName("Panel_" + panelClassNum);
            Object newTab = clazz.getDeclaredConstructor().newInstance();
            this.add((JPanel)newTab);
        }
        catch (Exception e){
            JPanel newPanel = new JPanel();
            newPanel.add(new JLabel("Panel Missing: " + panelClassNum));
            this.add(newPanel);
        }
    }
    
    public void addPanels()
    {
        for(int i = 0; i < panelNums.length; i++)
            addPanel(panelNums[i]);
        for(int i = 0; i < 20 - panelNums.length; i++)
            addPanel("Blank");
    }
}
