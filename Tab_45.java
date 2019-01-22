import javax.swing.*;
import java.awt.*;

public class Tab_45 extends JPanel{
    
    public Tab_45(){
        //2 rows * 5 columns = 20 name panels
        this.setLayout(new GridLayout(4, 5));
        
        try {
            Class<?> c47 = Class.forName("Panel_47");
            JPanel p47 = (JPanel) c47.getDeclaredConstructor().newInstance();
            this.add(p47);
        } catch (Exception e){
            addError("47");
        }
        try {
            Class<?> c60 = Class.forName("Panel_60");
            JPanel p60 = (JPanel) c60.getDeclaredConstructor().newInstance();
            this.add(p60);
        } catch (Exception e){
            addError("60");
        }
        try {
            Class<?> c71 = Class.forName("Panel_71");
            JPanel p71 = (JPanel) c71.getDeclaredConstructor().newInstance();
            this.add(p71);
        } catch (Exception e){
            addError("71");
        }
        addError("GitId unknown");
        try{
            Class<?> c54 = Class.forName("Panel_54");
            JPanel p54 = (JPanel) c54.getDeclaredConstructor().newInstance();
            this.add(p54);
        } catch (Exception e){
            addError("54");
        }
        //Ishan
        try{
            Class<?> c74 = Class.forName("Panel_74");
            JPanel p74 = (JPanel) c74.getDeclaredConstructor().newInstance();
            this.add(p74);
        } catch(Exception e){
            addError("74");
        }
        //Mayank
        try{
            Class<?> c09 = Class.forName("Panel_09");
            JPanel p09 = (JPanel) c09.getDeclaredConstructor().newInstance();
            this.add(p09);
        } catch (Exception e){
            addError("09");
        }
        //Vaibhav
        try{
            Class<?> c76 = Class.forName("Panel_76");
            JPanel p76 = (JPanel) c76.getDeclaredConstructor().newInstance();
            this.add(p76);
        } catch(Exception e){
            addError("76");
        }
        try{
            Class<?> c33 = Class.forName("Panel_33");
            JPanel p33 = (JPanel) c33.getDeclaredConstructor().newInstance();
            this.add(p33);
        } catch (Exception e){
            addError("33");
        }
        try{
            Class<?> c07 = Class.forName("Panel_07");
            JPanel p07 = (JPanel) c07.getDeclaredConstructor().newInstance();
            this.add(p07);
        } catch (Exception e) {
            addError("07");
        }
        try{
            Class<?> c03 = Class.forName("Panel_03");
            JPanel p03 = (JPanel) c03.getDeclaredConstructor().newInstance();
            this.add(p03);
        } catch (Exception e){
            addError("03");
        }
        //Hari
        try{
            Class<?> c68 = Class.forName("Panel_68");
            JPanel p68 = (JPanel) c68.getDeclaredConstructor().newInstance();
            this.add(p68);
        } catch (Exception e){
            addError("68");
        }
        //Sai
        try{
            Class<?> c25 = Class.forName("Panel_25");
            JPanel p25 = (JPanel) c25.getDeclaredConstructor().newInstance();
            this.add(p25);
        } catch(Exception e){
            addError("25");
        }
        addError("GitID not known");
        try{
            Class<?> c86 = Class.forName("Panel_86");
            JPanel p86 = (JPanel) c86.getDeclaredConstructor().newInstance();
            this.add(p86);
        } catch(Exception e){
            addError("86");
        }
        try{
            Class<?> c13 = Class.forName("Panel_13");
            JPanel p13 = (JPanel) c13.getDeclaredConstructor().newInstance();
            this.add(p13);
        } catch (Exception e){
            addError("13");
        }
        try{
            Class<?> c85 = Class.forName("Panel_85");
            JPanel p85 = (JPanel) c85.getDeclaredConstructor().newInstance();
            this.add(p85);
        } catch (Exception e){
            addError("85");
        }
        try{
            Class<?> c58 = Class.forName("Panel_58");
            JPanel p58 = (JPanel) c58.getDeclaredConstructor().newInstance();
            this.add(p58);
        } catch (Exception e){
            addError("58");
        }
        try{
            Class<?> c36 = Class.forName("Panel_36");
            JPanel p36 = (JPanel) c36.getDeclaredConstructor().newInstance();
            this.add(p36);
        } catch (Exception e){
            addError("36");
        }
        try{
            Class<?> c73 = Class.forName("Panel_73");
            JPanel p73 = (JPanel) c73.getDeclaredConstructor().newInstance();
            this.add(p73);
        } catch (Exception e){
            addError("73");
        }
        
    }
    
    private void addError(String panelName){
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Panel " + panelName + " Error");
        panel.add(label);
        this.add(panel);
        
    }
    
    
    //called by frame to set tab name
    public String getName(){
        return "David Lahtinen";
    }
    
}