import java.awt.*;
import javax.swing.*;

/**
 * Panel_44 describes the panel in a certain tab in the application.
 * The panel consists of FirstName and LastName of the author.
 * @author Koushik Kotamraju
 * @version 1.0
 */

class Panel_44 extends JPanel {

    /**
    * Class constructor.
    */
    public Panel_44() {
        createPanel44();
    }

    /**
    * This method creates the panel with name label
     * @param	coordinateX describes the X coordinate of the Panel boundary
     * @param	coordinateY describes the Y coordinate of the Panel boundary
     * @param	panelHeight describes the height of the Panel created.
     * @param	panelWidth describes the width of the Panel boundary
     */
    private void createPanel44() {

        int coordinateX = 10;
        int coordinateY = 10;
        int panelHeight = 60;
        int panelWidth = 250;

        String name = "Koushik Kotamraju";

        JPanel panel = new JPanel();
        JLabel label = new JLabel(name);

        label.setFont(new Font("Papyrus",Font.PLAIN,15));

        panel.add(label);
        panel.setBounds(coordinateX, coordinateY, panelWidth, panelHeight);
        panel.setBackground(Color.LIGHT_GRAY);

    }
}
