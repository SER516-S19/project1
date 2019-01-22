import javax.swing.*;
import java.awt.*;  

/* Author: Manisha Miriyala
 panel id: 52 
 GitHub username: MiriyalaM
*/

public class Panel_52 extends JPanel {
    public Panel_52() {
        initComp();
    }
    private void initComp() 
    {
    JLabel label = new JLabel("Manisha Miriyala");	
	this.add(label);
	this.setBackground(Color.GRAY);
	label.setFont(new Font("GEORGIA",10,40));
    }
}
