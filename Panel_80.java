import javax.swing.*;

public class Panel_80 extends JPanel 
{

    public Panel_80()
	{
        initComponents();
    }
    
	private void initComponents()
	{

        JPanel jPanel1 = new JPanel();
        JLabel jLabel1 = new JLabel();
		//JFrame f = new JFrame();

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setMaximumSize(new java.awt.Dimension(500, 300));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 300));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Algerian", 0, 48));
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Sajith Thattazhi");
		
		GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel1)
                .addContainerGap(129, Short.MAX_VALUE))
        );
		
		//jPanel1.add(jLabel1);
		//f.add(jPanel1);
		//f.setSize(600,450);
		//f.setVisible(true);
    }                       

    
	private javax.swing.JLabel jLabel1;
	private javax.swing.JPanel jPanel1;
	
	//public static void main(String args[])
	//{
	//	new Panel_80();
	//}
	
}