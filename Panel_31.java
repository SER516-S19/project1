import java.awt.*;  
import javax.swing.*;
 
 /**
 * A panel that displays a name is created in this Class
 * Author : Srivan Reddy Gutha, sgutha3@asu.edu
 */
 
public class Panel_31 extends JPanel
{
	public Panel_31()
	{
        initPanel();
    }
	
	private void initPanel()
    {
	
//	JFrame j_frame= new JFrame("Sample Panel");	//		To test the code for myself
	
	//JPanel j_panel=new JPanel();  
	JLabel j_label = new JLabel();	

	this.add(j_label);		
	this.setBackground(Color.RED);		
//	j_panel.setBounds(20,20,450,80);	
	
	j_label.setFont(new Font("Arial",1,20));
	j_label.setText("Srivan Reddy");
	
/*
	j_frame.add(j_panel);  
	j_frame.setSize(750,450);
    j_frame.setVisible(true);
*/
	}
/*	
	public static void main(String args[])
    {
        new Panel_31();		//		To test the code for myself
    }
*/
}