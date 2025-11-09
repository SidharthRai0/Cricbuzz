

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import vmm.DBloader;





public class Login_Page extends javax.swing.JFrame {

  
    public Login_Page() {
        initComponents();
        JLabel lb4;
        lb4=new JLabel();
       
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        int x=(int) d.getWidth();
        int y=(int) d.getHeight();
        setSize(x, y);
        lb4.setBounds(0, 0, x, y);
        ImageIcon ic=new ImageIcon("src/MyUploads/bg11.jpg");
        Image ic1=ic.getImage().getScaledInstance(lb4.getWidth(), lb4.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ic2=new ImageIcon(ic1);
        lb4.setIcon(ic2);
        add(lb4);
                setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                lb77.setIcon(new ImageIcon("src/MyUploads/bg11.jpg"));
                lb78.setIcon(new ImageIcon("src/MyUploads/bg11.jpg"));
               
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl = new javax.swing.JLabel();
        jl1 = new javax.swing.JLabel();
        jtf1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jbt = new javax.swing.JButton();
        jpf = new javax.swing.JPasswordField();
        lb77 = new javax.swing.JLabel();
        lb78 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl.setForeground(new java.awt.Color(255, 255, 255));
        jl.setText("Password :");
        getContentPane().add(jl);
        jl.setBounds(590, 210, 100, 30);

        jl1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl1.setForeground(new java.awt.Color(255, 255, 255));
        jl1.setText("Email :");
        getContentPane().add(jl1);
        jl1.setBounds(590, 120, 100, 30);

        jtf1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jtf1);
        jtf1.setBounds(590, 160, 200, 30);

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("LOGIN");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(620, 50, 170, 40);

        jbt.setBackground(new java.awt.Color(0, 0, 0));
        jbt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbt.setForeground(new java.awt.Color(255, 255, 255));
        jbt.setText("Login");
        jbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtActionPerformed(evt);
            }
        });
        getContentPane().add(jbt);
        jbt.setBounds(650, 320, 90, 40);

        jpf.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jpf);
        jpf.setBounds(590, 250, 200, 30);

        lb77.setText("jLabel2");
        getContentPane().add(lb77);
        lb77.setBounds(7, 256, 540, 450);
        getContentPane().add(lb78);
        lb78.setBounds(837, 6, 510, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtActionPerformed
        
          try {
               String em = jtf1.getText();
        String pw = jpf.getText();
            ResultSet rs = DBloader.executeSql("Select * from user where email='"+em+"' and password='"+pw+"'");
            if(rs.next()){
                upcoming.useremail = em;
                String s= rs.getString("photo");
                
            JOptionPane.showMessageDialog(this, "Login Successful!!");
            User_Home uh =new User_Home();
            dispose();
            
            }
            else{
                  JOptionPane.showMessageDialog(this, "Login Failed");
                
            }}
            catch (Exception ex) {
            ex.printStackTrace();
}
            

    }//GEN-LAST:event_jbtActionPerformed

    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbt;
    private javax.swing.JLabel jl;
    private javax.swing.JLabel jl1;
    private javax.swing.JPasswordField jpf;
    private javax.swing.JTextField jtf1;
    private javax.swing.JLabel lb77;
    private javax.swing.JLabel lb78;
    // End of variables declaration//GEN-END:variables
}
