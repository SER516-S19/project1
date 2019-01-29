import java.awt.*;  
import javax.swing.border.LineBorder;
import javax.swing.*;  
/*
SER-516
Author 		: Sai Vinay. G
Version		: 1.0
Start Date	: 01/20/2019
*/
public class Panel_25 extends JPanel implements PanelInterface{  
   JLabel label_25 = new JLabel("Sai Vinay. G");
	// Creating a panel that displays a name.
	Panel_25()  {   
        this.setBackground(Color.CYAN);
        this.setBounds(15, 30, 250, 250);
        this.setBorder(new LineBorder(Color.BLUE));
        this.add(label_25);
        } 
	public void sayHi(boolean flag) {
     		if(flag) {
     			label_25.setText("SAI VINAY. G" + "HI");
     		}
     		else {
     			label_25.setText("SAI VINAY. G");
     		}
     	}
}
