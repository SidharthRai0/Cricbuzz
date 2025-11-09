
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import vmm.DBloader;
import java.sql.*;
import javax.swing.*;

public class user_sign_up extends javax.swing.JFrame {

    public user_sign_up() {
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
        lb9.setIcon(new ImageIcon("src/MyUploads/bg11.jpg"));
        jbl.setIcon(new ImageIcon("src/MyUploads/bg11.jpg"));
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        lb1 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        pf = new javax.swing.JPasswordField();
        lb5 = new javax.swing.JLabel();
        bt = new javax.swing.JButton();
        tf3 = new javax.swing.JTextField();
        tf2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lb9 = new javax.swing.JLabel();
        jbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Sign up");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(540, 40, 210, 64);

        lb2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lb2.setForeground(new java.awt.Color(255, 255, 255));
        lb2.setText("Email");
        getContentPane().add(lb2);
        lb2.setBounds(460, 160, 60, 40);

        tf1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf1ActionPerformed(evt);
            }
        });
        getContentPane().add(tf1);
        tf1.setBounds(590, 130, 250, 20);

        lb1.setBackground(new java.awt.Color(0, 102, 102));
        lb1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lb1.setForeground(new java.awt.Color(255, 255, 255));
        lb1.setText("Username");
        getContentPane().add(lb1);
        lb1.setBounds(460, 120, 90, 40);

        lb3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lb3.setForeground(new java.awt.Color(255, 255, 255));
        lb3.setText("Contact");
        getContentPane().add(lb3);
        lb3.setBounds(460, 200, 90, 30);

        pf.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(pf);
        pf.setBounds(590, 250, 250, 20);

        lb5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lb5.setForeground(new java.awt.Color(255, 255, 255));
        lb5.setText("Password");
        getContentPane().add(lb5);
        lb5.setBounds(460, 240, 110, 30);

        bt.setBackground(new java.awt.Color(0, 0, 0));
        bt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        bt.setForeground(new java.awt.Color(255, 255, 255));
        bt.setText("Continue");
        bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActionPerformed(evt);
            }
        });
        getContentPane().add(bt);
        bt.setBounds(460, 290, 380, 30);

        tf3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(tf3);
        tf3.setBounds(590, 210, 250, 20);

        tf2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(tf2);
        tf2.setBounds(590, 170, 250, 20);

        jButton2.setBackground( new java.awt.Color(0,0,0,50));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 255, 255));
        jButton2.setText("Log In");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(730, 360, 80, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Already have an Account?");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(510, 360, 210, 30);
        getContentPane().add(lb9);
        lb9.setBounds(0, 130, 430, 670);
        getContentPane().add(jbl);
        jbl.setBounds(880, 0, 460, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf1ActionPerformed
        
    }//GEN-LAST:event_tf1ActionPerformed

    private void btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActionPerformed
        

        String un = tf1.getText();
        String email = tf2.getText();

        String con = tf3.getText();
//            String photo=tf4.getText();
        String pass = pf.getText();
        //String cpass = tf5.getText();
        try {
            
            ResultSet rs = DBloader.executeSql("Select * from user where email= '" +email+ "' ");
            if(rs.next()){
            JOptionPane.showMessageDialog(this, "Email Already Exist!!");
            }
            else{
            rs.moveToInsertRow();
            rs.updateString("username", un);
            rs.updateString("email", email);
            rs.updateString("contact", con);
            rs.updateString("password", pass);
            rs.updateString("photo", "src/MyUploads/dummy2.png");
            rs.insertRow();
            JOptionPane.showMessageDialog(this, "SignUp Successful");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
}
    }//GEN-LAST:event_btActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Login_Page pg = new Login_Page();
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    
    
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new user_sign_up().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jbl;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb9;
    private javax.swing.JPasswordField pf;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    // End of variables declaration//GEN-END:variables
}


