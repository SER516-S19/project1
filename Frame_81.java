/*  Class to create Frame and add all the tabs in the frame
    Author: Sarthak Tiwari
    E-Mail: sarthak-tiwari@asu.edu
    Date:   1/19/2019
*/

import java.awt.Component;
import java.awt.Dimension;
import javax.swing.*; 
import java.io.File;
import java.lang.reflect.Method;
 
public class Frame_81 {
    
    //all the tab class names that needs to be added
    private static String[] tabNames =  {"Tab_21", "Tab_27", "Tab_45",
                                            "Tab_48", "Tab_69"};

    private static void addTab(String tabClassName, JTabbedPane tabbedPane){
        // takes the class name as parameter and if the class exists then adds 
        // its object to the passed tabbedPane
        try{
            Class<?> clazz = Class.forName(tabClassName);
            Method method = clazz.getMethod("getName");
            Object newTab = clazz.getDeclaredConstructor().newInstance();
            tabbedPane.addTab(method.invoke(newTab).toString(),
                                            (JPanel)newTab);
        }
        catch (Exception e){
            JPanel newTab = new JPanel();
            JPanel namePanel = new JPanel();
            namePanel.add(new JLabel("Class Missing " + tabClassName));
            newTab.add(namePanel);
            tabbedPane.addTab(tabClassName, newTab);
        }
    }

    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Sarthak");
        frame.setMinimumSize(new Dimension(600, 500));
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTabbedPane tabbedPane = new JTabbedPane();

        //Add tabs
        for(int i=0; i<tabNames.length; i++){
            addTab(tabNames[i], tabbedPane);
        }

        fixChildSizes(tabbedPane);

        //Add tabbedPane to frame
        frame.getContentPane().add(tabbedPane);
 
        //Display the window.
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static void fixChildSizes(JTabbedPane tabPane){
        //goes in the hierarchy to fix size issues in name panels
        Component[] tabs = tabPane.getComponents();

        for(int i=0; i<tabs.length; i++){

            Component[] panels = ((JPanel)tabs[i]).getComponents();
            for(int j=0; j<panels.length; j++){
                ((JPanel)panels[j]).setMaximumSize(new Dimension(100, 100));
                ((JPanel)panels[j]).setMinimumSize(new Dimension(100, 100));
                ((JPanel)panels[j]).setSize(new Dimension(100, 100));
                ((JPanel)panels[j]).setPreferredSize(new Dimension(300, 125));
                ((JPanel)panels[j]).setBounds(0, 0, 100, 100);
            }
        }

    }
 
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}