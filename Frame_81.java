/*  Class to create Frame and add all the tabs in the frame
    Author: Sarthak Tiwari
    E-Mail: sarthak-tiwari@asu.edu
    Date:   1/19/2019
*/

import java.awt.Dimension;
import javax.swing.*; 
import java.io.File;
import java.lang.reflect.Method;
 
public class Frame_81 {
    
    //all the tab class names that needs to be added
    private static String[] tabNames =  {"Tab_21", "Tab_27", "Tab_45",
                                            "Tab_69", "Tab_XX"};

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
            newTab.add(new JLabel("Class Missing " + tabClassName));
            tabbedPane.addTab(tabClassName, newTab);
        }
    }

    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Sarthak");
        frame.setMinimumSize(new Dimension(800, 600));
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTabbedPane tabbedPane = new JTabbedPane();

        //Add tabs
        for(int i=0; i<tabNames.length; i++){
            addTab(tabNames[i], tabbedPane);
        }

        //Add tabbedPane to frame
        frame.getContentPane().add(tabbedPane);
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
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