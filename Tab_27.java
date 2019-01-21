import javax.swing.*;
import java.awt.*;

public class Tab_27 extends JPanel {

    Tab_27() {
        this.setLayout(new GridLayout(4,5));
        this.add(new Panel_06());
        this.add(new Panel_18());
        this.add(new Panel_20());
        this.add(new Panel_59());
        this.add(new Panel_84());
        //this.add(new Panel_05());
        this.add(new Panel_70());
        this.add(new Panel_80());
        this.add(new Panel_17());
        this.add(new Panel_49());
        this.add(new Panel_55());
        this.add(new Panel_52());
        //this.add(new Panel_65());
        this.add(new Panel_31());
        //this.add(new Panel_19());
        this.add(new Panel_26());
        this.add(new Panel_08());
        this.add(new Panel_39());
        this.add(new Panel_80());


    }

    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.add(new Tab_27());
        frame.setVisible(true);
        frame.setBounds(0, 0, 500, 500);
    }

}