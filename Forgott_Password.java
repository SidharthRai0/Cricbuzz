
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import vmm.DBloader;

public class Forgott_Password extends javax.swing.JFrame {

   String otp;
    ResultSet rs;
    String pass;
    public Forgott_Password() {
        initComponents();
         JLabel lb4;
        lb4=new JLabel();
       
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        int x=(int) d.getWidth();
        int y=(int) d.getHeight();
        setSize(x, y);
        lb4.setBounds(0, 0, x, y);
        ImageIcon ic=new ImageIcon("src/MyUploads/bg2.jpg");
        Image ic1=ic.getImage().getScaledInstance(lb4.getWidth(), lb4.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ic2=new ImageIcon(ic1);
        lb4.setIcon(ic2);
        add(lb4);
        setSize(450,390);
        setLocationRelativeTo(null);
                setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        tf2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 255));
        jLabel1.setText("Forgot  Password");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 20, 170, 40);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Email");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 80, 60, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Enter OTP");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 170, 80, 20);
        getContentPane().add(tf1);
        tf1.setBounds(50, 102, 160, 30);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Send OTP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(220, 103, 110, 27);
        getContentPane().add(tf2);
        tf2.setBounds(50, 190, 160, 30);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Verify");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(220, 190, 110, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String email=tf1.getText();
        try {
              rs=DBloader.executeSql("select * from user where email='"+email+"' ");
            if(rs.next())
            {
                  otp =  (int) (1000+(9999-1000)*Math.random())+"";
                sendemail obj=new sendemail(email, "Password Recovery", "Your OTP is "+otp);
                obj.sendemail();
                JOptionPane.showMessageDialog(this, "OTP sent Succesfuuly");

                
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Email not registered");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
String otp2=tf2.getText();
                            
                if(otp.equals(otp2))
                {
                               
                            try {
                                pass = rs.getString("password");
                                JOptionPane.showMessageDialog(this, "Your password is "+pass);
                            } catch (Exception ex) {
                                ex.printStackTrace();
                            }
                JOptionPane.showMessageDialog(this,"Your password is "+pass);
                Login_Page obj1=new Login_Page();
                obj1.setVisible(true);
                dispose();
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Invalid Otp");
                }// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Forgott_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Forgott_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Forgott_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Forgott_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Forgott_Password().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    // End of variables declaration//GEN-END:variables
}
