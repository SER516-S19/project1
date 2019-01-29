import java.awt.*;
import javax.swing.*;

public class Panel_63 extends JPanel implements PanelInterface{

	private String name = "Dhruv Patel";
	JLabel label_63 = new JLabel();

	public Panel_63() {

		label_63.setText(name);
		label_63.setFont(new Font("Lucida Handwriting", Font.BOLD, 20));

		add(label_63);
		setLayout(new GridBagLayout());
		setBackground(Color.cyan);
		setBorder(BorderFactory.createLineBorder(Color.black, 1));

	}

	@Override
	public void sayHi(boolean flag) {
		if(flag){
			label_63.setText("Dhruv Patel said Hi!!");
		}
		else{
			label_63.setText("Dhruv Patel");
		}
	}
}
