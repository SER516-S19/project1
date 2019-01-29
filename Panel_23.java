import java.awt.*;
import javax.swing.*;

/**
 * Panel 23
 * Trevor Forrey (tforrey)
 * Ser 516
 */
public class Panel_23 extends JPanel implements PanelInterface {

    private JLabel hiLabel;
    private JLabel nameLabel;

    /**
     * Panel 23 Constructor
     * Creates a JPanel with a hi label and name label
     */
    public Panel_23() {
        setBackground(Color.YELLOW);
        setLayout(new BorderLayout());

        hiLabel = new JLabel("HI");
        nameLabel = new JLabel("Trevor Forrey");
        hiLabel.setHorizontalAlignment(JLabel.CENTER);
        nameLabel.setHorizontalAlignment(JLabel.CENTER);

        add(nameLabel);
        add(hiLabel, BorderLayout.SOUTH);
        hiLabel.setVisible(false);
    }

    /**
     * sayHi
     * Adds/Removes "HI" label visibility from the panel
     */
    public void sayHi(boolean shouldSayHi) {
        hiLabel.setVisible(shouldSayHi);
    }
}