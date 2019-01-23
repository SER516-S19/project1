import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class Tab_45 extends JPanel implements TabInterface{
    
    //The gitIds of the students involved
    private String[] panelNumbers = {
        "47", "60", "71", "38", 
        "54", "74", "09", "76", 
        "33", "07", "03", "68", 
        "25", "42", "86", "13", 
        "85", "58", "36", "73"
    };
    //Allows me to easily iterate over panels in my tab
    private JPanel[] panels = new JPanel[20];

    public Tab_45(){
        this.setLayout(new GridLayout(5, 4));
        //add panels
        for (int i = 0; i < panelNumbers.length; i++ ){
            try{
                Class<?> panelClass = Class.forName("Panel_" + panelNumbers[i]);
                JPanel panel = (JPanel) panelClass.getDeclaredConstructor().newInstance();
                this.panels[i] = panel;
                this.add(panel);
            } catch (Exception e){
                this.addError(panelNumber);
            }
        }
    }
    
    private void addError(String panelName){
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Panel " + panelName + " Error");
        panel.add(label);
        this.add(panel);
    }
    
    //part of TabInterface, returns name for tab.
    public String getName(){
        return "David Lahtinen";
    }

    public void startSayingHi(){
        //TODO: implement method
    }

    public void sropSayingHi(){
        //TODO: implement method
    }

    
    
}