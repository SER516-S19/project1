import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**  
*    Class to create the Tab 21 and to contain all of the panels on Gold Team
*    @author: Joshua Drumm
*    @version 2.0
*    @since   1/29/2019
*/

public final class Tab_21 extends JPanel implements TabInterface, Runnable
{
    private static final int THREAD_SLEEP_TIME = 1000;
    
    private Thread timerThread;
    private boolean threadInterrupted;
    
    //Panel # corresponding to the assigned GitID
    private static String[] panelNums = {"53", "82", "29", "87", "40", "02",
                                         "22", "57", "34", "15", "77", "44",
                                         "83", "28"};
    
    public Tab_21()
    {
        this.setLayout(new GridLayout(5, 4, 5, 5));
        for(int i = 0; i < panelNums.length; i++)
            addPanel(panelNums[i]);
        for(int i = 0; i < 20 - panelNums.length; i++)
            addPanel("");
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
            Class<?> panelClass = Class.forName("Panel_" + panelClassNum);
            Object newPanel = panelClass.getDeclaredConstructor().newInstance();
            this.add((JPanel) newPanel);
        }
        catch (Exception e)
        {
            JPanel newPanel = new JPanel();
            if(panelClassNum != "")
            {
                newPanel = new JPanel();
                newPanel.setLayout(new GridBagLayout());
                newPanel.add(new JLabel("<html><center>Panel Missing: " +
                                         panelClassNum +
                                         "<br></center></html>"));
            }
            this.add(newPanel);
        }
    }

    @Override
    public void startSayingHi()
    {
        threadInterrupted = false;
        timerThread = new Thread(this);
        timerThread.start();
    }

    @Override
    public void stopSayingHi()
    {
        threadInterrupted = true;
        timerThread.interrupt();
    }

    @Override
    public void run()
    {
        int currentHiPanelIndex = 0; //Current panel to say hi
        int lastHiPanelIndex = -1;   //Last panel that said hi
        while(!threadInterrupted)
        {
            try
            {
                Object currentHiPanel = this.getComponent(currentHiPanelIndex);
                while(!(currentHiPanel instanceof PanelInterface))
                {
                    if(++currentHiPanelIndex >= this.getComponentCount())
                        currentHiPanelIndex = 0;
                    currentHiPanel = this.getComponent(currentHiPanelIndex);
                }
                ((PanelInterface) (currentHiPanel)).sayHi(true);
                if(currentHiPanelIndex != lastHiPanelIndex &&
                        lastHiPanelIndex != -1)
                    ((PanelInterface)
                        (this.getComponent(lastHiPanelIndex))).sayHi(false);
                lastHiPanelIndex = currentHiPanelIndex;
                if(++currentHiPanelIndex >= this.getComponentCount())
                    currentHiPanelIndex = 0;
                Thread.sleep(THREAD_SLEEP_TIME);
            }
            catch(InterruptedException e)
            {
                ((PanelInterface)
                    (this.getComponent(lastHiPanelIndex))).sayHi(false);
            }
            catch(Exception e)
            {
                e.printStackTrace();
                if(++currentHiPanelIndex >= this.getComponentCount())
                    currentHiPanelIndex = 0;
            }
        }
    }
}
