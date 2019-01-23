
/*  Class to create Interface which is to be used by all tabs
    Author: Sarthak Tiwari
    E-Mail: sarthak-tiwari@asu.edu
    Date:   1/22/2019
*/

public interface TabInterface {
    
    //starts the timer thread on the tab
    public void startSayingHi();

    //stops the timer thread on the tab
    public void stopSayingHi();

    //returns the name to be shown on the tab
    public String getName();

}
