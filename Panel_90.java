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
 * @version 1.0
 */


public class Panel_90 extends JPanel implements PanelInterface{

    JLabel labelHi;

    public Panel_90() {
        JLabel nameLabel = new JLabel("Xiangwei Zheng");
        nameLabel.setFont(new Font("Verdana", Font.BOLD,20));
        this.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        this.add(nameLabel);
        this.setBackground(Color.cyan);
        this.setVisible(true);
    }

    @Override
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
