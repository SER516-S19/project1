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

	private JLabel jlabelHi = new JLabel("HI");
	
	
	Panel_13()
    {

		
		JLabel jlabel = new JLabel("Subhradeep Biswas");
		jlabel.setFont(new Font("Arial", Font.PLAIN, 20));
		jlabelHi.setFont(new Font("Arial", Font.PLAIN, 20));
		add(jlabel);
		add(jlabelHi);
        setBackground(Color.LIGHT_GRAY);
        setBorder(new LineBorder(Color.BLACK));
        
        
    }
    
    public void sayHi(boolean flag)
    {
    	
    	if (flag == true)
    	{    		
    		jlabelHi.setVisible(true);
    	}
    	else
    	{
    		jlabelHi.setVisible(false);
    	}
    	
    	jlabelHi.repaint();
    }
}