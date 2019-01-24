import javax.swing.*;
import java.awt.*;  

/* Author: Manisha Miriyala
 panel id: 52 
 GitHub username: MiriyalaM
*/

public class Panel_52 extends JPanel implements PanelInterface {
   
JLabel HiLabel = new JLabel("HI",JLabel.CENTER);
 public Panel_52() {
        initComp();
    }
    private void initComp() 
    {
    JLabel label = new JLabel("Manisha Miriyala", JLabel.CENTER);
	this.setBackground(Color.GRAY);
	this.add(label);
	label.setFont(new Font("GEORGIA",10,40));
	this.add(HiLabel);
	HiLabel.setFont(new Font("GEORGIA",10,40));
	HiLabel.setVisible(false);
   
}

public void sayHi(boolean flag){
HiLabel.setVisible(flag);
}
}
