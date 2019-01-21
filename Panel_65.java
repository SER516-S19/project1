import javax.swing.*;
import java.awt.*;

/**
 * Panel class for GIT ID - 65
 */
public class Panel_65 {

    /**
     * This method creates the panel.
     */
    public JPanel createPanel(){
        JPanel jPanel = new JPanel();
        jPanel.setBackground(Color.lightGray);
        jPanel.setSize(100,100);
        jPanel.add(createJLabel());
        return jPanel;
    }

    /**
     * This method create a label.
     */
    private JLabel createJLabel(){
        JLabel jLabel = new JLabel();
        jLabel.setText("Lakshmi Kala Pedarla");
        jLabel.setFont(new Font("monaco", Font.BOLD, 24));
        return jLabel;
    }

//    public static void main(String[] args){
//        Panel_65 panel_65 = new Panel_65();
//        JFrame jFrame = new JFrame();
//        jFrame.add(panel_65.createPanel());
//        jFrame.setSize(new Dimension(500, 500));
//        jFrame.setVisible(true);
//    }
}
