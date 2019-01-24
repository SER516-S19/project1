import java.awt.*;
import javax.swing.*;

public class Panel_79 extends JPanel implements PanelInterface{
    private String name = "Aprajita Thakur";
    private JLabel label = new JLabel();
    public Panel_79() {
        label.setText(name);
        label.setFont(new Font("Papyrus",Font.BOLD,20));
        add(label);
        setBackground(Color.GREEN);
    }
    @Override
    public void sayHi(boolean flag){
        if (flag){
            label.setText(name + " "+ "HI");
        }
        else{
            label.setText(name);
        }
    }
}
