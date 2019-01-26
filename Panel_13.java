import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;


/*
 * @author:  Subhradeep Biswas
 * GitID: 13
 * Creating panel_13
 */


public class Panel_13 extends JPanel implements PanelInterface
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 13L;

	Panel_13()
    {

		this.removeAll();
		JLabel jlabel = new JLabel("Subhradeep Biswas");
		jlabel.setFont(new Font("Arial", Font.PLAIN, 20));
		add(jlabel);
        setBackground(Color.LIGHT_GRAY);
        setBorder(new LineBorder(Color.BLACK));
        setVisible(true);
        
    }
    
    public void sayHi(boolean flag)
    {
    	this.removeAll();
    	if (flag == true)
    	{
    		
    		JLabel jlabel = new JLabel("Hi    Subhradeep Biswas");
    		jlabel.setFont(new Font("Arial", Font.PLAIN, 20));
    		add(jlabel);
    	}
    	if (flag == false)
    	{
    		
    		JLabel jlabel = new JLabel("Subhradeep Biswas");
    		jlabel.setFont(new Font("Arial", Font.PLAIN, 20));
    		add(jlabel);
    	}
    }
}