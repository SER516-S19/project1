  	import java.awt.*;
	import javax.swing.*;
	/*
	 * Class name: Panel_24
	 * Name: Gadde Vijaya Mounika 
	 * ASU ID-1213038097
	 */
	public class Panel_24 extends JPanel implements PanelInterface {
		
		public Panel_24() {
			JLabel name = new JLabel();
	    		name.setText("Vijaya Mounika Gadde");
	     		name.setFont(new Font("Arial", Font.BOLD,20)); 
			this.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
	       		this.add(name);
	       		this.setBackground(Color.cyan);
	      		this.setVisible(true);
			}
	      @Override
	   	public void sayHi(boolean flag){ 
	     	JLabel hilabel = (JLabel)getComponent(0);
	     	if(flag){
		     hilabel.setText("<html>Vijaya Mounika Gadde<br/>Hi</html>");
	     		}
	     	else{
		     hilabel.setText("Vijaya Mounika Gadde");
	     		}
	   	}	

	}
