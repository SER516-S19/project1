import javax.swing.*;
import java.awt.*;

/*--------------------------
This Panel belongs to Tab Jashua Drumm.
Author: Sai Ram Eadala
----------------------------*/


@SuppressWarnings("serial")
public class Panel_22 extends JPanel implements PanelInterface{
	JLabel label;
	String Name="VenkataSairamEadala";
    
	public Panel_22() {
        this.setLayout(new GridBagLayout());
       label = new JLabel(Name);
        label.setFont(new Font("Italic", Font.ITALIC, 20));
        label.setForeground(Color.LIGHT_GRAY);
        this.setBackground(Color.WHITE);
        this.add(label);
       
}
    
    public void sayHi(boolean flag) {

    if(flag) {
this.label.setText("<html>"+Name+"<br>"+"HI"+"</html>");
    }
	else {

        this.label.setText(Name); 
    }

}
}