import javax.swing.*;
import java.awt.*;  

/* Author: Manisha Miriyala
 panel id: 52 
 GitHub username: MiriyalaM
*/

public class Panel_52 extends JPanel {
    public Panel_52() {
        initComponents();
    }
    private void initComponents() 
    {
	//Creating the frame, panel and label 
    //JFrame frame = new JFrame("Student Frame");
    JPanel panel = new JPanel();
    JLabel label = new JLabel("Manisha Miriyala");
	    
    //Setting font to the label
	label.setFont(new Font("GEORGIA",10,40));
    //Adding the label to the particular panel and setting boundary and background values
    
  /* frame.add(panel);  
    frame.setSize(350,350);    
    frame.setLayout(null);
    frame.setVisible(true);
	*/
	
	panel.add(label);
    //panel.setBounds(10,10,350,300);
    panel.setBackground(Color.GRAY);
    }
   
 /* public static void main(String args[]){
      new Panel_52();
  }*/
}
