import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 * The {@code Panel_04} class represents a container {@code JPanel} to display a {@code JLabel}
 * initialized with {@literal "Pradeep Ambalam Jawaharlal"}.
 * @author Pradeep Ambalam Jawaharlal
 */
@SuppressWarnings("serial")
public class Panel_04 extends JPanel implements PanelInterface {

    private static final String DISPLAY_NAME = "Pradeep Ambalam Jawaharlal";
    private static final JLabel DISPLAY_NAME_LABEL = new JLabel(DISPLAY_NAME);

    /** Constructs a {@code JPanel} subclass and adds the {@code DISPLAY_NAME_LABEL} to this instance. */
    public Panel_04() {
        add(DISPLAY_NAME_LABEL);
    }

    /**
     * Displays {@code DISPLAY_NAME} with {@literal "HI"} if {@code flag} value is true.
     * Displays {@code DISPLAY_NAME} if {@code flag} value is false.
     */
    @Override
    public void sayHi(boolean flag) {
    	if(flag) {
    		DISPLAY_NAME_LABEL.setText(DISPLAY_NAME + " " + "HI");
        }
    	else {
        	DISPLAY_NAME_LABEL.setText(DISPLAY_NAME);
		}
	}
   
}
