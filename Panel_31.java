import java.awt.*;  
import javax.swing.*;
 
 /**
 * A panel that displays a name is created in this Class
 * Author : Srivan Reddy Gutha, sgutha3@asu.edu ,GitID : 31
 */
 
public class Panel_31 extends JPanel implements PanelInterface
{
	
  	private JLabel j_label;
	private JLabel j_labelHi;

	public Panel_31()
	{

	j_label = new JLabel();
	this.setBackground(Color.RED);		
	j_label.setFont(new Font("Arial",1,40));
	j_label.setText("Srivan Reddy");
	this.add(j_label);	
	
	j_labelHi = new JLabel();
	j_labelHi.setFont(new Font("Arial",1,40));
	j_labelHi.setText("Hi");
	this.add(j_labelHi);

	j_labelHi.setVisible(false);
	
	}

	public void sayHi(boolean flag) {
        this.j_labelHi.setVisible(flag);
    }


}