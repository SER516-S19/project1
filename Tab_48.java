// This class Tab_48 contains 20 panels.

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tab_48 extends JPanel implements TabInterface {

    private static String[] myTeamPanels = {"Panel_04", "Panel_10", "Panel_11",
            "Panel_23", "Panel_30", "Panel_35", "Panel_41", "Panel_43",
            "Panel_46", "Panel_56", "Panel_61", "Panel_63", "Panel_79",
            "Panel_90", "Panel_missing 1", "Panel_missing 2", "Panel_missing 3",
            "Panel_missing 4", "Panel_missing 5", "Panel_missing 6"};

    private String name = "Hsin-Jung Lee";
    private int timer_tick_count = 0;
    
    private ActionListener taskPerformer = new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            //...Timer tick event...
        	PanelInterface previousPanel, currentPanel;
        	int currentIndex = 0;
        	try {
        		timer_tick_count += 1;
        		currentIndex = (timer_tick_count - 1) % 20;
        		
        		//deselecting previously selected panel
            	if (currentIndex - 1 >= 0) {
            		previousPanel = (PanelInterface) getComponent(currentIndex - 1);
            		previousPanel.sayHi(false);
            	}
            	
            	//selecting current panel
            	currentPanel = (PanelInterface) getComponent(currentIndex);
            	currentPanel.sayHi(true);
        	}
        	catch (Exception e) {
        		System.out.println("Panel at index "+ currentIndex + " has not implemented the PanelInterface");
        	}
        }
    };
    private Timer timer = new Timer(1000 ,taskPerformer);

    // constructor
    public Tab_48() {
        this.setLayout(new GridLayout(5, 4, 4, 4));
        addMyTeamPanels();
    }

    public String getName() {
        return name;
    }

    private void addMyTeamPanels() {
        for (int k = 0; k < myTeamPanels.length; k++) {
            try {
                Class<?> myClass = Class.forName(myTeamPanels[k]);
                Object myPanel = myClass.getDeclaredConstructor().newInstance();
                this.add((JPanel) myPanel);
            } catch (Exception e) {
                JPanel myNewPanels = new JPanel();
                myNewPanels.add(new JLabel("Panel is missing: " + myTeamPanels[k]));
                this.add(myNewPanels);
            }
        }
    }
    
    
	@Override
	public void startSayingHi() {
		timer.setRepeats(true);
	    timer.start();
	}

	@Override
	public void stopSayingHi() {
		timer.stop();
	}
}


