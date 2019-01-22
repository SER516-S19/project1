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
        init();
    }

    /**
    * This method creates the panel with name label
     * @param	coordinateX describes the X coordinate of the Panel boundary
     * @param	coordinateY describes the Y coordinate of the Panel boundary
     * @param	panelHeight describes the height of the Panel created.
     * @param	panelWidth describes the width of the Panel boundary
     */
    private void init() {

        int coordinateX = 10;
        int coordinateY = 10;
        int panelHeight = 60;
        int panelWidth = 250;
        
        this.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        JLabel label = new JLabel("Koushik Kotamraju");
        this.setLayout(new GridBagLayout());
        label.setFont(new Font("Papyrus",Font.PLAIN,15));
        panel.setBounds(coordinateX, coordinateY, panelWidth, panelHeight);
        this.setVisible(true);
        this.setBackground(Color.LIGHT_GRAY);
        this.add(label);
    }
}
