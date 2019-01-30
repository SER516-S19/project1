import javax.swing.*;
import java.awt.*;

/*
 *  Author - Jainish Soni
 *  GitID - 77
 *  This Panel belongs to Joshua Drumm(Tab_21).
 */
public class Panel_77 extends JPanel implements PanelInterface {

    public String myName = "Jainish Soni";
    JLabel label;
    public Panel_77(){

        this.setLayout(new GridBagLayout());
        label = new JLabel(myName);
        label.setAlignmentX(CENTER_ALIGNMENT);
        this.add(label);
        this.setAlignmentX(CENTER_ALIGNMENT);
    }

    @Override
        public void sayHi(boolean flag){
        if (flag){
            label.setText("Hi " + myName);
        }
        else {
            label.setText(myName);
        }
    }
}
