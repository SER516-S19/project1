import java.awt.*;

import javax.swing.*;

/**
 * Panel_90 creation
 * 
 * @author Xiangwei Zheng
 * @version 1.0
 */

public class Panel_90 extends JPanel implements PanelInterface{
	
    private JLabel hiLabel;
    private JLabel nameLabel;

    /**
     * Panel 90 Constructor
        */
    public Panel_90() {
        
        hiLabel = new JLabel("HI");
        nameLabel = new JLabel("Xiangwei Zheng");
        hiLabel.setHorizontalAlignment(JLabel.CENTER);
        nameLabel.setHorizontalAlignment(JLabel.CENTER);

        setLayout(new BorderLayout());

        add(nameLabel);
        setBackground(Color.CYAN);
    }
    /**
     * add and remove Hi
        */
    public void sayHi(boolean sayHi) {
        if (sayHi) {
            add(hiLabel, BorderLayout.SOUTH);
        } else {
            remove(hiLabel);
        }
        validate();
    }
	
	
}
