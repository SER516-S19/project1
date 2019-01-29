import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;


 //**************************************************************************
 // Panel 13 implementation for Student "Subhradeep Biswas" Under Tab "David"
 // Prints "Hi Subhradeep" in Panel 13 when sayHi (hiFlag = true), 
 // Otherwise prints "Subhradeep"
 // @author:  Subhradeep Biswas, sbiswa24@asu.edu
 // GitID: 13
 //**************************************************************************


public class Panel_13 extends JPanel implements PanelInterface{

	private JLabel jLabelHi = new JLabel("HI");
	
	Panel_13(){
		JLabel jLabelName = new JLabel("Subhradeep");
		jLabelName.setFont(new Font("Arial", Font.PLAIN, 20));
		jLabelHi.setFont(new Font("Arial", Font.PLAIN, 20));
		add(jLabelName);
		add(jLabelHi);
		jLabelHi.setVisible(false);
		setBackground(Color.LIGHT_GRAY);
		setBorder(new LineBorder(Color.BLACK));
	}
    
    public void sayHi(boolean hiFlag){
    	if (hiFlag == true){    		
    		jLabelHi.setVisible(true);
    	}
    	else{
    		jLabelHi.setVisible(false);
    	}
    	
    	jLabelHi.repaint();
    }
}