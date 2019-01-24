import javax.swing.*;
import java.awt.*;

/**
 * Panel class for GIT ID - 65
 */
public class Panel_65 extends JPanel {


    public Panel_65(){
        createPanel();
    }


    public void createPanel(){
        this.setBackground(Color.lightGray);
        this.add(createJLabel());
    }


    private JLabel createJLabel(){
        JLabel jLabel = new JLabel();
        jLabel.setText("Lakshmi Kala Pedarla");
        jLabel.setFont(new Font("monaco", Font.BOLD, 24));
        return jLabel;
    }


}
