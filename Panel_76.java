import java.awt.*;

import javax.swing.*;
public class Panel_76 extends JPanel
{
    public Panel_76()
    {
        initComponents();
    }
    public void initComponents()
    {
    //JPanel p = new JPanel();
    JLabel l = new JLabel("Vaibhav Singhal");
    l.setHorizontalAlignment(JLabel.CENTER);
    l.setFont(new Font("Calibri",1,20));

    this.add(l);
    this.setBounds(10,10,250,60);
    this.setBackground(Color.YELLOW);
    }
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;

}
