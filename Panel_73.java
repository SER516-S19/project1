import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;


/*  The below class implements Panel 73
*
* @author : Muhammad Sami
* @version : 2.0
* @GitId : 73
*/


public class Panel_73 extends JPanel implements PanelInterface {
	private javax.swing.JLabel labelName;

	/* Constructor for panel */
    Panel_73() {  

      labelName = new JLabel("Muhammad Sami");
      labelName.setFont(new Font("Arial", Font.PLAIN, 20));
      setBackground(Color.LIGHT_GRAY);
      setBorder(new LineBorder(Color.BLACK));
      setVisible(true);
      this.add(labelName);
    }
    
    
	@Override
	public void sayHi(boolean flag) {
		JLabel labelMessage =(JLabel)getComponent(0);
		if(flag) {
			labelMessage.setText("<html>Muhammad Sami<br/>Hi!</html>");
		}
		else {
			labelMessage.setText("Muhammad Sami");
		}
		
	}
}