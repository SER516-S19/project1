import javax.swing.*;
import java.awt.*;

/** Panel Class Panel_50
 * @author: Siva Pranav Mandadi
 * @gitID : 50
 * @since : 1/20/2019
 */
public class Panel_50 extends JPanel implements PanelInterface {
    public Panel_50() {

        JLabel nameLabel = new JLabel("Siva Pranav Mandadi");
        nameLabel.setFont(new Font("Verdana", Font.BOLD,20));
        this.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        this.add(nameLabel);
        this.setBackground(Color.cyan);
        this.setVisible(true);
    }
	
	/**
	* Override method to say 'HI!
	*/
	
    @Override
	public void sayHi(boolean flag)
	{

		
		JLabel hiLabel=(JLabel)getComponent(0);
		if(flag) {
			hiLabel.setText("<html>Siva Pranav Mandadi<br/>Hi!</html>");
		    }
		else {
			hiLabel.setText("Siva Pranav Mandadi");
		    }


      }


}
