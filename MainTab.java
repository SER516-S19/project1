import javax.swing.*;
import java.awt.*;

public class MainTab extends JPanel {

    public MainTab(){}

    public  MainTab(String name) {
        this.setLayout(new GridLayout(5,4));
        this.setName(name);

    }

}

