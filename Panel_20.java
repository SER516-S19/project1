import java.awt.*;  
import javax.swing.*; 

public class Panel_20 extends JPanel implements PanelInterface {
	
	JLabel l2=new JLabel("Hi",JLabel.CENTER); 
	
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
		l2.setBounds(100,100,100,100);  
		l2.setForeground(Color.red); 
		l2.setFont(new Font("Courier",Font.BOLD, 40));	
		this.setPreferredSize(new Dimension(300, 300));
	    this.setBackground(Color.orange);	
	    this.add(l1);
	    this.add(l2);
	    l2.setVisible(false);
	 
    }  
	
	public void sayHi(boolean flag)
    { 
			l2.setVisible(flag);
    } 
}
