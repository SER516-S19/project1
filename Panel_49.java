/**
 * @author Archana Madhavan
 *
 * Description :Creating a class Panel_49 which extends JPanel class and displays the name using 
 * label in a Panel. Temporary frame is created.
 */
import java.awt.*;
import javax.swing.*;

public class Panel_49 extends JPanel{
Panel_49()
{
	//Creating Temporary Frame object
	JFrame Tmp_Frame= new JFrame();
	
	JPanel panel_49 = new JPanel();
	
	//Creating Label with necessary specifications
	JLabel L = new JLabel("Archana Madhavan");
	L.setFont(new Font("Verdana",Font.BOLD,24));
	
	//setting Panel specifications
	panel_49.add(L);
	panel_49.setBackground(Color.YELLOW);	
	panel_49.setAlignmentX(L.CENTER_ALIGNMENT);
	panel_49.setPreferredSize(new Dimension(300,200));
	
	
	//Temporary Frame     
	Tmp_Frame.add(panel_49);
	Tmp_Frame.setSize(400, 400);
	Tmp_Frame.setVisible(true);  
	
		
	
}

public static void main(String[] args)
{
	new Panel_49();
	
}
}
