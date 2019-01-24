import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Panel_39 extends JPanel implements PanelInterface {
    private JLabel nameLabel;
    private JLabel greetingLabel;

    public JLabel getGreetingLabel() {
        return greetingLabel;
    }

    public Panel_39() {
        String nameLabelText = "Aman Kaushik (39)";
        String greetingLabelText = "Hi";

        Font font = new Font("SANS_SERIF", Font.PLAIN, 12);
        Color foreGround = Color.GRAY;
        Color backGround = Color.BLACK;

        this.nameLabel = this.createCustomLabel(nameLabelText, font, foreGround);
        this.greetingLabel = this.createCustomLabel(greetingLabelText, font, foreGround);
        this.greetingLabel.setVisible(false);

        this.setBackground(backGround);

        Box box = Box.createVerticalBox();
        this.add(box);

        box.add(nameLabel);
        box.add(greetingLabel);
    }

    private JLabel createCustomLabel(String name, Font font, Color foreGround) {
        JLabel label= new JLabel(name, JLabel.CENTER);
        label.setFont(font);
        label.setForeground(foreGround);
        return label;
    }

    @Override
    public void sayHi(boolean flag) {
        this.getGreetingLabel().setVisible(flag);
    }
}
