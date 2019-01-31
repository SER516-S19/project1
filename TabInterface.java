
/**
 * Interface to be implemented by all name panels
 * @author: Sarthak Tiwari
 * @since:  1/22/2019
*/
public interface TabInterface {
    
    /** starts the timer thread on the tab */
    public void startSayingHi();

    /** stops the timer thread on the tab */
    public void stopSayingHi();

    /** returns the name to be shown on the tab */
    public String getName();

}
