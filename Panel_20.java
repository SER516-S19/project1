import java.awt.*;  
import javax.swing.*; 
public class Panel_20 extends JPanel{
	
	public Panel_20()  
    	{  
		mypanel();
    	}
	public void mypanel()
	{
		JLabel l1=new JLabel("Yuti Desai",JLabel.CENTER);    
		l1.setBounds(100,100,100,100);  
		l1.setForeground(Color.red); 
		l1.setFont(new Font("Courier",Font.BOLD, 40));
		this.setPreferredSize(new Dimension(300, 300));
	    this.setBackground(Color.orange);
	    this.add(l1);
	 
    }  
}
