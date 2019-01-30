import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Panel_90 creation
 * 
 * @author Xiangwei Zheng
 * @version 1.2
 */

/*Panel 90, used to show "Xiangwei Zheng" and "Hi" on panel with format
 * 
 * */
public class Panel_90 extends JPanel implements PanelInterface{

    JLabel labelHi;
    /*Panel 90, constructor, initialize nameLabel and setting
     * 
     * */
    public Panel_90() {
        JLabel nameLabel = new JLabel("Xiangwei Zheng");
        nameLabel.setFont(new Font("Verdana", Font.BOLD,20));
        this.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        this.add(nameLabel);
        this.setBackground(Color.cyan);
        this.setVisible(true);
    }

    @Override
    /*sayHi function, show Hi on panel based on the timer setting
     * @para: flag, flag to show Hi or not.
     * flag = 0, will show "Xiangwei Zheng" only
     * flag = 1, will show ""Xiangwei Zheng Hi "
     * 
     */
	public void sayHi(boolean flag)
	{
		JLabel hiLabel=(JLabel)getComponent(0);
		if(flag) {
			hiLabel.setText("<html>Xiangwei Zheng<br/>Hi</html>");
		    }
		else {
			hiLabel.setText("Xiangwei Zheng");
		    }


      }


}
