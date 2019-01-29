import java.awt.*;  
import javax.swing.*;
 
 /**
 * SER - 516 - Software Agility
 * Panel_31 that displays name along with Hi label
 * @author Srivan Reddy Gutha , sgutha3@asu.edu 
 * @version 1.3
 * @since 01-18-2019
 */
 
public class Panel_31 extends JPanel implements PanelInterface
{
	
  	private JLabel labelName = new JLabel("Srivan Reddy");
	private JLabel labelHi = new JLabel("Hi");

	/**
	 * Stylizing the Label using constructor
	 */
	public Panel_31()
	{

		this.setBackground(Color.RED);		
	
		labelName.setFont(new Font("Arial",1,40));
	
		this.add(labelName);	
	
		labelHi.setFont(new Font("Arial",1,40));
	
		this.add(labelHi);

		labelHi.setVisible(false);
	}

	/**
	 * Visibility of "Hi" label is set based on flag
	 * @param flag holds the values either true or false
	 */
	public void sayHi(boolean flag) {
        this.labelHi.setVisible(flag);
    }
}