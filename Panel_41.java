import java.awt.*;
import javax.swing.*;

class Panel_41 extends JPanel implements PanelInterface {

	private JLabel label = new JLabel();
	private String panel_name = "Harika Kolli";
	
    public Panel_41() {
        panel41();
    }

    private void panel41() {
    	
       // JFrame jFrame = new JFrame();
    	label.setText(panel_name);

        /* SET THE FONT STYLE AND SIZE FOR THE GIVEN TEXT IN THE PANEL */
        label.setFont(new Font("Calibri",Font.ITALIC,18));
        add(label);
        setBackground(Color.YELLOW);
    }
    @Override
    public void sayHi(boolean flag)
    {
    	if(flag)
    	{
    		label.setText(panel_name+ " HI");
    	}
    	else
    	{
    		label.setText(panel_name);
    	}
    	
    }
}
