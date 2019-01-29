import java.awt.*;
import javax.swing.*;

/**
* This is panel 47 which implements a JPanel containing my name for SER516.
* @author Cecilia La Place
* @version: 1.2
*/
public class Panel_47 extends JPanel implements PanelInterface{
    private JLabel greeting = new JLabel("HI");
    /**
    * This constructor initializes a panel with labels containing
    * my name and a greeting with custom formatting.
    * @param Nothing
    * @return Nothing
    */
    public Panel_47(){
        JLabel name = new JLabel("Cecilia La Place");
        // Customization
        name.setForeground(Color.RED);
        greeting.setForeground(Color.RED);
        greeting.setFont(new Font("Garamond", Font.BOLD, 20));
        name.setFont(new Font("Garamond", Font.PLAIN, 20));
        // Adding components to this panel instance
       	this.add(name);
        this.add(greeting);
       	this.setBackground(Color.BLACK);
    }
    
    /**
    * This is the implementation of PanelInterface's sayHi method.
    * @param visible This boolean determines greeting's visiblility
    * @return Nothing
    */
    public void sayHi(boolean visible){
        greeting.setVisible(visible);
        this.repaint();
    }
}
