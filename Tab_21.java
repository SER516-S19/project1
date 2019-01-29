/*  
    Class to create the Tab 21 and to contain all of the panels on Gold Team
    Author: Joshua Drumm
    E-Mail: jkdrumm@asu.edu
    Date:   1/19/2019
*/

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tab_21 extends JPanel implements TabInterface, Runnable
{
    Thread timerThread;
    boolean interrupted;
    private static String[] panelNums = {"53", "82", "29", "87", "40", "02", "22", "57", "34", "15", "77", "44", "83", "28"};

    
    public Tab_21()
    {
        this.setLayout(new GridLayout(5, 4, 5, 5));
        addPanels();
    }

    public Tab_21(String name)
    {
        this();
        this.setName(name);
    }
    
    @Override
    public String getName()
    {
        return "Josh Drumm";
    }

    private void addPanel(String panelClassNum)
    {
        try
        {
            Class<?> clazz = Class.forName("Panel_" + panelClassNum);
            Object newTab = clazz.getDeclaredConstructor().newInstance();
            this.add((JPanel)newTab);
        }
        catch (Exception e)
        {
            JPanel newPanel;
            if(panelClassNum != "")
                newPanel = new BlankPanel(panelClassNum);
            else
                newPanel = new BlankPanel();
            this.add(newPanel);
        }
    }
    
    public void addPanels()
    {
        for(int i = 0; i < panelNums.length; i++)
            addPanel(panelNums[i]);
        for(int i = 0; i < 20 - panelNums.length; i++)
            addPanel("");
    }

    @Override
    public void startSayingHi()
    {
        interrupted = false;
        timerThread = new Thread(this);
        timerThread.start();
    }

    @Override
    public void stopSayingHi()
    {
        interrupted = true;
        timerThread.interrupt();
    }

    @Override
    public void run()
    {
        int hiPanel = 0;
        int lastPanel = -1;
        while(!interrupted)
        {
            try
            {
                Object o = this.getComponent(hiPanel);
                while(!(o instanceof PanelInterface))
                {
                    if(++hiPanel >= this.getComponentCount())
                        hiPanel = 0;
                    o = this.getComponent(hiPanel);
                }
                ((PanelInterface) (o)).sayHi(true);
                if(hiPanel != lastPanel && lastPanel != -1)
                    ((PanelInterface) (this.getComponent(lastPanel))).sayHi(false);
                lastPanel = hiPanel;
                if(++hiPanel >= this.getComponentCount())
                    hiPanel = 0;
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                ((PanelInterface) (this.getComponent(lastPanel))).sayHi(false);
            }
            catch(Exception e)
            {
                e.printStackTrace();
                if(++hiPanel >= this.getComponentCount())
                    hiPanel = 0;
            }
        }
    }
    
    private class BlankPanel extends JPanel //implements PanelInterface
    {
        String panelText;
        JLabel label;
        JLabel hiLabel;
        
        public BlankPanel()
        {
            /*
            this.setLayout(new GridBagLayout());
            label = new JLabel("<html><center>Panel Missing<br></center></html>");
            add(label);
            panelText = "";
            */
        }
        
        public BlankPanel(String panelNum)
        {
            /*
            this();
            panelText = ": " + panelNum;
            sayHi(false);
            */
        }
        
        //@Override
        public void sayHi(boolean flag)
        {
            /*
            if(flag)
                label.setText("<html><center>Panel Missing" + panelText + "<br>HI</center></html>");
            else
                label.setText("<html><center>Panel Missing" + panelText + "<br></center></html>");
            */
        }
        
    }
}
