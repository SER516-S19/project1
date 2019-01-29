
/*
 * @author:  Aditya Samant
 * GitID:   71
 * Create a panel that shows the name of a student 
 */

import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.Box;
import javax.swing.JLabel;





public class Panel_71 extends JPanel implements PanelInterface
{
    private JLabel label = new JLabel();
    private JLabel hiLabel = new JLabel(); //Modification Hi Label needs to be on the next line 
    //Constructor
    public Panel_71()
    {
        this.setBackground(Color.gray);
        //Create a vertical Box in the Panel
        Box box = Box.createVerticalBox();
        //Initial Value of Label
        label.setText("Aditya Samant");
        hiLabel.setText("Hi");
        //Alignment should be center
        label.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        label.setAlignmentY(JLabel.CENTER_ALIGNMENT);
        label.setFont(new Font(Font.SERIF, Font.BOLD, 18));
        box.add(label);
        //Hi Label needs to be on a new line
        hiLabel.setFont(new Font(Font.SERIF, Font.BOLD, 18));
        hiLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        hiLabel.setVisible(false);
        box.add(hiLabel);
        //This will always be there
        this.add(box); 
    }
    /**
     *  Depending on whether value is true or false Hi will show on Bottom or not
     * Overrides Panel Interface method
     * */
    @Override
    public void sayHi(boolean flag){
       
       this.hiLabel.setVisible(flag);
    }
}