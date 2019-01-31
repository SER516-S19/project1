import java.awt.*;
import javax.swing.*;
import javax.swing.event.*; 
import java.io.File;
import java.lang.reflect.Method;


/**
 * Class to create Frame and add all the tabs in the frame
 * @author: Sarthak Tiwari
 * @since:  1/19/2019
*/
public class Frame_81 extends JFrame {
    
    //title of the Frame
    private static final String FRAME_TITLE = "Sarthak";

    //name of all the tab class names that needs to be added
    private static final String[] TAB_NAMES =  {"21", "27", "45", "48", "69"};

    //stores the tabIndex of the previously selected tab
    private int previousTabIndex = -1;

    
    Frame_81() {
        
        //setup Frame UI
        this.setTitle(FRAME_TITLE);
        this.setMinimumSize(new Dimension(600, 500));
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTabbedPane tabbedPane = new JTabbedPane();

        //add event handler to tab pane to manage tab notifications
        tabbedPane.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent ce) {

                int currentTabIndex = tabbedPane.getSelectedIndex();

                if(previousTabIndex != currentTabIndex) {
                    try {

                        //stop timer on previous tab
                        if(previousTabIndex != -1)
                            ((TabInterface)tabbedPane
                                .getComponentAt(previousTabIndex))
                                .stopSayingHi();
                    }
                    catch(Exception e) {
                        System.out.println(e);
                    }
                        
                    try {

                        //start timer on selected tab
                        ((TabInterface)tabbedPane
                            .getComponentAt(currentTabIndex))
                            .startSayingHi();
                    }
                    catch(Exception e) {
                        System.out.println(e);
                    }

                    previousTabIndex = currentTabIndex; 
                }
            }
        });

        addTabs(tabbedPane);

        fixChildSizes(tabbedPane);

        this.getContentPane().add(tabbedPane);
 
        //Display the Frame
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    /**
     * The function adds all the tabs mentioned in the TAB_NAMES
     * variable to the passed tabbedPane
     * @param tabPane name of the pane containing tabs
     */
    private static void addTabs(JTabbedPane tabPane){

        for(int i=0; i<TAB_NAMES.length; i++){
            try{
                Class<?> tabClass = Class.forName("Tab_" + TAB_NAMES[i]);
                Method tabMethod = tabClass.getMethod("getName");
                Object newTab = tabClass.getDeclaredConstructor().newInstance();
                String tabName = tabMethod.invoke(newTab).toString();
                tabPane.addTab(tabName, (JPanel)newTab);
            }
            catch (Exception e){
                JPanel newTab = new JPanel();
                JPanel namePanel = new JPanel();
                namePanel.add(new JLabel("Class Missing " + TAB_NAMES[i]));
                newTab.add(namePanel);
                tabPane.addTab(TAB_NAMES[i], newTab);
            }
        }
    }


    /**
     * The function is to fix size formatting in all the panels containg
     * names. This is required as many students have given too big a size
     * for their panels. The function can be removed once all the child
     * panels have been fixed.
     * @param tabPane name of the pane containing tabs
     */
    private static void fixChildSizes(JTabbedPane tabPane) {

        Component[] tabs = tabPane.getComponents();
        for(int i=0; i<tabs.length; i++) {

            Component[] panels = ((JPanel)tabs[i]).getComponents();
            for(int j=0; j<panels.length; j++) {
                ((JPanel)panels[j]).setMaximumSize(new Dimension(100, 100));
                ((JPanel)panels[j]).setMinimumSize(new Dimension(100, 100));
                ((JPanel)panels[j]).setSize(new Dimension(100, 100));
                ((JPanel)panels[j]).setPreferredSize(new Dimension(300, 125));
                ((JPanel)panels[j]).setBounds(0, 0, 100, 100);
            }
        }
    }
 
    public static void main(String[] args) {

        new Frame_81();
    }
}