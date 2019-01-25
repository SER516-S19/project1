import java.awt.*;
import javax.swing.*;

/**
* For SER 516 
* @author Aprajita Thakur
* @version 1.0
* @since 01-17-2019
*/

public class Panel_79 extends JPanel implements PanelInterface
{
    private String name = "Aprajita Thakur";
    private JLabel label = new JLabel();
    
    public Panel_79() 
    {
        label.setText(name);
        label.setFont(new Font("Papyrus",Font.BOLD,20));
        add(label);
        setBackground(Color.GREEN);
    }
    /**
    * Display "HI" with label name on the Panel. 
    *
    * @param  flag   Checking for true/false conditions 
    * 
    */
    @Override
    public void sayHi(boolean flag)
    {
        if (flag){
            label.setText(name + " "+ "HI");
        }
        else{
            label.setText(name);
        }
    }
}
