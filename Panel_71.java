
/*
 * @author:  Aditya Samant
 * GitID:   71
 * Create a panel that shows the name of a student 
 */

import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JLabel;





public class Panel_71 extends JPanel implements PanelInterface
{
    private JLabel label = new JLabel();
    //Constructor
    public Panel_71()
    {
        setBackground(Color.gray);
        //Initial Value of Label
        label.setText("Aditya Samant");
        //Alignment should be center
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setFont(new Font(Font.SERIF, Font.BOLD, 18));
        this.setVisible(true); 
        this.add(label);  
    }
    /**
     *  Depending on whether value is true or false Hi will show on Bottom or not
     * Overrides Panel Interface method
     * */
    @Override
    public void sayHi(boolean flag){
        if (flag == true){
           label.setText("Aditya Samant\nHI");
        }else if(flag== false){
            label.setText("Aditya Samant");
        }
    }
}