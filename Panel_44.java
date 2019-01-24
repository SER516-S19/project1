import java.awt.*;
import javax.swing.*;

/**
 * Panel_44 describes the panel in a certain tab in the application.
 * The panel consists of FirstName and LastName of the author.
 * @author Koushik Kotamraju
 * @version 2.0
 */

class Panel_44 extends JPanel implements PanelInterface{

    /**
    * Class constructor.
    */
    public Panel_44() {
        init();
    }

    /**
    * This method creates the panel with name label
     */
    private void init() {
        
        JLabel label = new JLabel("Koushik Kotamraju");
        label.setFont(new Font("Papyrus",Font.PLAIN,15));
        this.setLayout(new GridBagLayout());
        this.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        this.setVisible(true);
        this.setBackground(Color.LIGHT_GRAY);
        this.add(label);       
    }
    
    /**
    * This method toggles the text on the panel to show Hi when the flag is true.
     */
    @Override
    public void sayHi(boolean flag)
    {
        if(flag){
            this.label.setText("Hi!");
        }
        else{
            this.label.setText("Koushik Kotamraju");
        }
            
    }
}
