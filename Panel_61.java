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
        JPanel panel61 = new JPanel();
        JLabel label = new JLabel(user_name);
        label.setFont(new Font("Calibri",Font.PLAIN,12));
        // Panel styling
        panel61.add(label);
        panel61.setBounds(20, 25, 30, 50);
        panel61.setBackground(Color.gray);

    }
}
