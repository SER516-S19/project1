import javax.swing.*;
import java.awt.*;

/**  The below class implements Panel 86
 *
 * @author : Aditya Vikram
 * @version : 2.0
 * @GitId : 86
 */

public class Panel_86 extends JPanel implements PanelInterface {
	
	private static final long serialVersionUID = 1L;
	private JLabel timerLabel;
	
	public Panel_86() {
		
		initPanel();
	}

	
	/*
	 * The below method is used to create the panel with name
	 */
	
	private void initPanel() {
		
		String name = "Aditya Vikram";
		String dispMessage = "Hi";

		JLabel label = new JLabel(name);
		timerLabel = new JLabel(dispMessage);
		
		add(label);
		add(timerLabel);
		setBackground(Color.CYAN);

		label.setFont(new Font("Papyrus", Font.BOLD, 30));
		timerLabel.setFont(new Font("Papyrus", Font.BOLD, 30));
		
		label.setVisible(true);
		timerLabel.setVisible(false);
	}
	
	
	@Override
	public void sayHi(boolean isTimerLabelVisible) {
		timerLabel.setVisible(isTimerLabelVisible);
	}		
}
