/*  Class to create Frame and add all the tabs in the frame
    Author: Sarthak Tiwari
    E-Mail: sarthak-tiwari@asu.edu
    Date:   1/19/2019
*/

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*; 
import java.io.File;
import java.lang.reflect.Method;
 
public class Frame_81 extends JFrame {
    
    //title of the tab
    private String frameTitle = "Sarthak";

    //all the tab class names that needs to be added
    private String[] tabNames =  {"Tab_21", "Tab_27", "Tab_45",
                                    "Tab_48", "Tab_69"};

    //tabIndex of the previously selected tab
    private int previousTabIndex = 0;

    Frame_81(){
        
        //setup Frame UI
        this.setTitle(frameTitle);
        this.setMinimumSize(new Dimension(600, 500));
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //initialize tab pane
        JTabbedPane tabbedPane = new JTabbedPane();

        //add event handler to tab pane to manage tab notifications
        tabbedPane.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent ce) {

                int currentTabIndex = tabbedPane.getSelectedIndex();

                try{

                    if(previousTabIndex != currentTabIndex){
                        //stop timer on previous tab
                        ((TabInterface)tabbedPane
                            .getComponentAt(previousTabIndex))
                            .stopSayingHi();

                        //start timer on selected tab
                        ((TabInterface)tabbedPane
                            .getComponentAt(currentTabIndex))
                            .startSayingHi();
                    }
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Error in " + 
                        tabbedPane.getComponentAt(currentTabIndex)
                                                        .getName()
                        + " " + e.toString());
                }
                finally{
                    previousTabIndex = currentTabIndex;
                }
            }
        });

        //Add tabs to tab pane
        for(int i=0; i<tabNames.length; i++){
            
            // takes the class name as parameter and if the class 
            // exists then adds its object to the passed tabbedPane
            try{
                Class<?> clazz = Class.forName(tabNames[i]);
                Method method = clazz.getMethod("getName");
                Object newTab = clazz.getDeclaredConstructor()
                                                .newInstance();
                tabbedPane.addTab(method.invoke(newTab).toString(),
                                                 (JPanel)newTab);
            }
            catch (Exception e){
                JPanel newTab = new JPanel();
                JPanel namePanel = new JPanel();
                namePanel.add(new JLabel("Class Missing "
                                            + tabNames[i]));
                newTab.add(namePanel);
                tabbedPane.addTab(tabNames[i], newTab);
            }
        }

        fixChildSizes(tabbedPane);

        //Add tabbedPane to frame
        this.getContentPane().add(tabbedPane);
 
        //Display the window.
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }


    private static void fixChildSizes(JTabbedPane tabPane){
        //goes in the hierarchy to fix size issues in name panels
        Component[] tabs = tabPane.getComponents();

        for(int i=0; i<tabs.length; i++){

            Component[] panels = ((JPanel)tabs[i]).getComponents();
            for(int j=0; j<panels.length; j++){
                ((JPanel)panels[j]).setMaximumSize(
                                        new Dimension(100, 100));
                ((JPanel)panels[j]).setMinimumSize(
                                        new Dimension(100, 100));
                ((JPanel)panels[j]).setSize(
                                        new Dimension(100, 100));
                ((JPanel)panels[j]).setPreferredSize(
                                        new Dimension(300, 125));
                ((JPanel)panels[j]).setBounds(0, 0, 100, 100);
            }
        }
    }
 
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Frame_81();
            }
        });
    }
}