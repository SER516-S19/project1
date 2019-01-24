import java.awt.*;  
import javax.swing.*;
 
 /**
 * A panel that displays a name is created in this Class
 * Author : Srivan Reddy Gutha, sgutha3@asu.edu ,GitID : 31
 */
 
public class Panel_31 extends JPanel implements PanelInterface
{
	public Panel_31()
	{

	JLabel j_label = new JLabel();
	JLabel j_labelHi = new JLabel();
				
	this.setBackground(Color.RED);		
	
	j_label.setFont(new Font("Arial",1,40));
	j_label.setText("Srivan Reddy");	
	
	j_labelHi.setFont(new Font("Arial",1,40));
	j_labelHi.setText("Hi");

	this.add(j_label);
	this.add(j_labelHi);


	j_labelHi.setVisible(false);
	
	}

	public void sayHi(boolean flag) {
        this.j_labelHi.setVisible(flag);
    }

	private JLabel j_labelHi;

}