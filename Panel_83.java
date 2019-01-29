import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.BorderFactory;


/**
 * --------------------------
 * 
 * @author Bhavana
 * This Panel belongs to Tab Jashua Drumm.(Tab 21)
 *  ----------------------------
 */

public class Panel_83 extends JPanel implements PanelInterface{
       JLabel jLbl ;
       String Name = "Bhavana";

       public Panel_83()
    {
       jLbl = new JLabel(Name);
       Border bdr = BorderFactory.createLineBorder(Color.BLUE); 
       jLbl.setBorder(bdr);
       this.setLayout(new GridBagLayout());
       jLbl.setBounds(10,50,190,60);
       jLbl.setForeground(Color.BLUE);
       this.setBackground(Color.WHITE);
       this.add(jLbl);	
    }

	@Override
	 public void sayHi(boolean flag)
      {
              if(flag)
              {
               //Aligning "HI"
               jLbl.setText(Name + " Hi");
              }
              else 
              {
              jLbl.setText(Name);
              }
       }
   
}

