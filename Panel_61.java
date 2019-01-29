import java.awt.*;
import javax.swing.*;


/**
 * Creation of Panel_61 with formatted name
 * @author Yuvan Pradeep
 * @version 3.0
 */
public class Panel_61 extends JPanel implements PanelInterface{
    
    private JLabel label = new JLabel();
    private String name = "Yuvan Pradeep";
    
    /**
    *  Panel_61 constructor to set name
    *  and styles 
    */
    public Panel_61()
    {
        label.setText(name);
        label.setFont(new Font("Calibri",Font.PLAIN,20));
        add(label);
        setBackground(Color.LIGHT_GRAY);
    }
    
    /**
    * Display name with "HI" based on flag. 
    *
    * @param flag, To display name with HI or not
    * flag = true wil display name with HI
    * flag = false will display just the name 
    * 
    */
    @Override
    public void sayHi(boolean flag) 
    {
	if(flag) {
	   label.setText(name + " " + "HI");
	} 
	else {
	   label.setText(name);
	}
    }
}
