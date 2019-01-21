import javax.swing.*;
import java.awt.*;

/*
    Author - Jainish Soni
    GitID - 77

 */
public class Panel_77 extends JPanel {
    public Panel_77(){
        init();
    }
    private void init(){
        this.setLayout(new GridBagLayout());
        JLabel label = new JLabel("Jainish Soni");
        label.setAlignmentX(CENTER_ALIGNMENT);
        this.add(label);
        this.setAlignmentX(CENTER_ALIGNMENT);
    }
}
