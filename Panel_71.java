/**
 * Create a panel that shows the name of a student and 
 * displays "Hi" when the sayHi method is called.
 * @author:  Aditya Samant<ansamant@asu.edu>
 * GitId:   71
 */

import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.Box;
import javax.swing.JLabel;



/**
 * This class creates a Panel Object that extends JPanel and 
 * implements the PanelInterface interface.
 */

public class Panel_71 extends JPanel implements PanelInterface
{
    private JLabel label = new JLabel();
    private JLabel hiLabel = new JLabel(); 
    /**
     * Panel_71() constructor 
     * Initializes the JPanel and sets name as default text.
     * Sets Hi text and ensures it is invisible
     * Hi text must appear below name text thus verticalBox Layout is used.
     */
    public Panel_71()
    {
        setBackground(Color.gray);
        
        Box box = Box.createVerticalBox();
       
        label.setText("Aditya Samant");
        hiLabel.setText("Hi");
        
        label.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        label.setFont(new Font(Font.SERIF, Font.BOLD, 18));
        box.add(label);

        hiLabel.setFont(new Font(Font.SERIF, Font.BOLD, 18));
        hiLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        hiLabel.setVisible(false);
        box.add(hiLabel);

        add(box); 
    }
    /**
     *  Overrides sayHi method to ensure that the hiLabel text is visible when 
     * a true parameter is passed to the method
     * @see PanelInterface.java
     * @param flag Boolean variable sets hiLabel to visible if true
     * */
    @Override
    public void sayHi(boolean flag){
       hiLabel.setVisible(flag);
    }
}