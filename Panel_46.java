import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

/**
 * Panel_46 creation
 * 
 * @author Sneha Lakshminarasimhan
 * @version 2.0
 *@gitID 46
 */

public class Panel_46 extends JPanel implements PanelInterface {
	
	private String myName = "Sneha Lakshminarasimhan";
	JLabel myLabel = new JLabel(myName);
	
	//constructor
	public Panel_46() 
	{
		createMyPanel();
	}
	
	//panel creation
	private void createMyPanel() 
	{
		
		myLabel.setFont(new Font("Arial Bold Italic", Font.BOLD,15));
		add(myLabel);
		
		//styling the Label
		myLabel.setHorizontalAlignment(SwingConstants.CENTER);
		setBackground(Color.pink);	//setting background color to orange
		setBorder(BorderFactory.createLineBorder(Color.black, 1));		
	}
	
	@Override
	public void sayHi(boolean flag) 
	{
		// TODO Auto-generated method stub
		if(flag) 
		{
			myLabel.setText(myName+" "+"Hi");
		}
		else 
		{
			myLabel.setText(myName);
		}
	}
}
