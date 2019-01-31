import java.awt.*;
import javax.swing.*;

/**
*   Panel_79 class for creating a Panel containing 
*   label name "Aprajita Thakur"
*   @author Aprajita Thakur
*   @version 1.3
*   @since 01-17-2019
*/

public class Panel_79 extends JPanel implements PanelInterface
{
    private String name = "Aprajita Thakur";
    private JLabel label = new JLabel();
    
    /**
    *  Panel_79 constructor to set name
    *  and styles 
    */
    public Panel_79() 
    {
        label.setText(name);
        label.setFont(new Font("Papyrus",Font.BOLD,20));
        add(label);
        setBackground(Color.GREEN);
    }
   
    @Override
    /**
    *   Display "HI" with label name on the Panel. 
    *
    *   @param  greet  To display HI with name or not
    *   greet = true wil display HI with name
    *   greet = false will display just the name 
    * 
    */
    public void sayHi(boolean greet)
    {
        if (greet){
            label.setText(name + " "+ "HI");
        }
        else{
            label.setText(name);
        }
    }
}
