  	import java.awt.*;
	import javax.swing.*;
	@SuppressWarnings("serial")
	/*
	 * Class name: Panel_24
	 * Name: Gadde Vijaya Mounika 
	 * ASU ID-1213038097
	 */
	public class Panel_24 extends JPanel implements PanelInterface {
		
		JLabel greeting=new JLabel("Hi",JLabel.CENTER); 
				public Panel_24() {
					createPanel();
				}
				public void createPanel() {	
					 // Create the label to display name and set the font and color.
					JLabel name=new JLabel("Vijaya Mounika Gadde",JLabel.CENTER); 		
					name.setBounds(100,100,100,100);  
					name.setForeground(Color.BLACK); 
					name.setFont(new Font("Arial",Font.BOLD, 20));
					// Set properties of second label that displays 'Hi'.
					greeting.setBounds(100,100,100,100);  
					greeting.setForeground(Color.BLACK); 
					greeting.setFont(new Font("Arial",Font.BOLD, 15));	
					this.setPreferredSize(new Dimension(400, 400));
				    	this.setBackground(Color.CYAN);	
				   	// Add the labels to panel.
				    	this.add(name);
				   	this.add(greeting);
				    	greeting.setVisible(false);
					}
				public void sayHi(boolean flag){ 
					greeting.setVisible(flag);
			    		} 

			}
