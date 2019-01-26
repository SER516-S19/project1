// This class Tab_48 contains 20 panels.

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tab_48 extends JPanel implements TabInterface {

    private static String[] myTeamPanels = {"Panel_04", "Panel_10", "Panel_11",
            "Panel_23", "Panel_30", "Panel_35", "Panel_41", "Panel_43",
            "Panel_46", "Panel_56", "Panel_61", "Panel_63", "Panel_79",
            "Panel_90", "", "", "", "", "", "",};

    String name = "Hsin-Jung Lee";

    // constructor
    public Tab_48() {
        this.setLayout(new GridLayout(5, 4, 4, 4));
        addMyTeamPanels();
    }

    public String getName() {
        return name;
    }


/*
    Thread myThread;
    Boolean myFlag = true;

    @Override
    public void startSayingHi() {
        myFlag = true;
        myThread = new Thread(){
            @Override
            public void run() {
                super.run();
                int index = 0;
                while (myFlag = true){
                    index = index % 14;
                    try {
                        PanelInterface myTeamPanelInterface = (PanelInterface) getComponent(index);
                        myTeamPanelInterface.sayHi(true);
                        Thread.sleep(1000);
                        myTeamPanelInterface.sayHi(false);
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    index ++;

                }
                myThread.interrupt();
            }
        };

        myThread.start();
    }

    @Override
    public void stopSayingHi() {
        if (myThread != null){
            myFlag = false;
        }
    }
*/
    /*Thread myThread ;
    Boolean myFlag = true;

            @Override
            public void startSayingHi() {
                if (myThread != null){
                    myFlag = true;
                }
            }

            @Override
            public void stopSayingHi() {
                myFlag = true;
                myThread = new Thread (){
                    public  void run (){
                        int index = 0;
                        while (myFlag = true){
                            index = index % 14;
                            try {
                                PanelInterface myTeamPanelInterface = (PanelInterface) getComponent(index);
                                myTeamPanelInterface.sayHi(true);
                                sleep(500);
                                myTeamPanelInterface.sayHi(false);
                            } catch (Exception e){
                                e.printStackTrace();
                            }
                            index ++;
                        }
                        myThread.interrupt();
                    }
                };
                myThread.start();
            }
*/


   int timeTicker = 0;

   ActionListener myTask = new ActionListener() {
        //@Override
        public void actionPerformed(ActionEvent actionEvent) {
            //timer
            PanelInterface currentPanelIndex, previousPanelIndex;
            int index = 0;
            try{
                timeTicker += 1;
                index = (timeTicker - 1 ) % 14;
                currentPanelIndex = (PanelInterface) getComponent(index);
                currentPanelIndex.sayHi(true);

                if (index - 1 >= 0){
                    previousPanelIndex = (PanelInterface) getComponent(index-1);
                    previousPanelIndex.sayHi(false);
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    };
    Timer myTimer = new Timer(1000,myTask);

    public void startSayingHi() {
        myTimer.setRepeats(true);
        myTimer.start();
    }

    public void stopSayingHi() {
        timeTicker = 0;
        myTimer.stop();
    }

    private void addMyTeamPanels() {
        for (int k = 0; k < myTeamPanels.length; k++) {
            try {
                Class<?> myClass = Class.forName(myTeamPanels[k]);
                Object myPanel = myClass.getDeclaredConstructor().newInstance();
                this.add((JPanel) myPanel);
            } catch (Exception e) {
                JPanel myNewPanels = new JPanel();
                //myNewPanels.add(new JLabel("" + myTeamPanels[k]));
                this.add(myNewPanels);
            }
        }
    }


}


