import javax.swing.*;
import java.awt.*;

public class Panel_03 extends JPanel implements PanelInterface{
    private JLabel name_label;
    private JLabel hi_label;

    Panel_03() {
        name_label = new JLabel("John Alden");
        hi_label = new JLabel("Hi");
        hi_label.setVisible(false);

        this.setBackground(Color.PINK);
        this.setLayout(new BorderLayout());
        this.add(name_label, BorderLayout.CENTER);
        this.add(hi_label, BorderLayout.SOUTH);

    }

    @Override
    public void sayHi(boolean flag) {
        hi_label.setVisible(flag);
    }
}
