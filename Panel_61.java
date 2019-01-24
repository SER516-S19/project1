import java.awt.*;
import javax.swing.*;


/**
 * Panel 61
 * @author Yuvan Pradeep
 * @version 1.0
 */

public class Panel_61 extends  JPanel{
    
    public Panel_61()
    {
        create_Panel_61();
    }

    private void create_Panel_61()
    {
        String user_name = "Yuvan Pradeep";
        
        JLabel label = new JLabel(user_name);
        label.setFont(new Font("Calibri",Font.PLAIN,12));
        // Panel styling
        add(label);
        setBackground(Color.gray);

    }
}
