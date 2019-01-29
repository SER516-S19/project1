import java.awt.*;
import javax.swing.*;

/**
* For SER 516 Project
* @author Aprajita Thakur
* @version 1.2
* @since 01-17-2019
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
    * Display "HI" with label name on the Panel. 
    *
    * @param  flag  To display HI with name or not
    * flag = true wil display HI with name
    * flag = false will display just the name 
    * 
    */
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
