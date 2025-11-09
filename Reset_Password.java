
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import vmm.DBloader;


public class Reset_Password extends javax.swing.JFrame {

 
    public Reset_Password() {
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
        jLabel4 = new javax.swing.JLabel();
        ttf1 = new javax.swing.JTextField();
        ttf2 = new javax.swing.JTextField();
        ttf3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jjb = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 255));
        jLabel1.setText("RESET PASSWORD");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 20, 180, 60);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Old Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 110, 130, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Confirm New Password ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 190, 180, 20);
        getContentPane().add(ttf1);
        ttf1.setBounds(230, 110, 150, 22);
        getContentPane().add(ttf2);
        ttf2.setBounds(230, 150, 150, 22);
        getContentPane().add(ttf3);
        ttf3.setBounds(230, 190, 150, 22);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("New Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 150, 130, 20);

        jjb.setBackground(new java.awt.Color(0, 0, 0));
        jjb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jjb.setForeground(new java.awt.Color(255, 255, 255));
        jjb.setText("Change");
        jjb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jjbActionPerformed(evt);
            }
        });
        getContentPane().add(jjb);
        jjb.setBounds(160, 260, 120, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jjbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jjbActionPerformed
        String op =ttf1.getText();
         String np =ttf2.getText();
          String cnp =ttf3.getText();
         try{
             String query  = "Select * from user where password= '" +op+ "' and email = '"+upcoming.useremail+"' ";
             System.out.println(query);
         ResultSet rs = DBloader.executeSql(query);
         if(rs.next()){
             if(np.equals(cnp))
             {
                   rs.updateString("password",np);
             rs.updateRow();
              JOptionPane.showMessageDialog(this, "Password Changed");
              upcoming.useremail = "";
              Login_Page obj = new Login_Page();
              dispose();
                   
             
             }
             else{
                  JOptionPane.showMessageDialog(this, "Password not match");
                 
             }
             
           
         } 
         else {
             JOptionPane.showMessageDialog(this, "Incorrect Old Password");
            }
         }
         catch (Exception ex){
             ex.printStackTrace();
         }
    }//GEN-LAST:event_jjbActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reset_Password().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jjb;
    private javax.swing.JTextField ttf1;
    private javax.swing.JTextField ttf2;
    private javax.swing.JTextField ttf3;
    // End of variables declaration//GEN-END:variables
}
