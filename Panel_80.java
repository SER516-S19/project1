import javax.swing.*;

public class Panel_80 extends JPanel 
{

    public Panel_80()
	{
        initComponents();
    }
    
	private void initComponents()
	{

        JLabel jLabel1 = new JLabel();

        this.setBackground(new java.awt.Color(255, 204, 102));
        this.setMaximumSize(new java.awt.Dimension(500, 300));
        this.setMinimumSize(new java.awt.Dimension(500, 300));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Algerian", 0, 48));
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Sajith Thattazhi");
		
		this.add(jLabel1);
    }                       

    
	private javax.swing.JLabel jLabel1;
	private javax.swing.JPanel jPanel1;
	
}