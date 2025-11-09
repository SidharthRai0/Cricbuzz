
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import vmm.DBloader;

public class User_Home extends javax.swing.JFrame {

    public User_Home() {
        initComponents();
        JLabel lb4;
        lb4 = new JLabel();

        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) d.getWidth();
        int y = (int) d.getHeight();
        setSize(x, y);
        lb4.setBounds(0, 0, x, y);
        ImageIcon ic = new ImageIcon("src/MyUploads/bg11.jpg");
        Image ic1 = ic.getImage().getScaledInstance(lb4.getWidth(), lb4.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ic2 = new ImageIcon(ic1);
        lb4.setIcon(ic2);
        add(lb4);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        jb22.setIcon(new ImageIcon("src/MyUploads/bg11.jpg"));
        
        
        jb25.setIcon(new ImageIcon("src/MyUploads/bg11.jpg"));
        setVisible(true);
        getData();
    }

    void getData()
    {
        
        try{
            ResultSet rs = DBloader.executeSql("Select * from user where email = '"+upcoming.useremail+"' ");
            if(rs.next())
            {
                String photo = rs.getString("photo");
                System.out.println(photo);
//                jb2.setIcon(new ImageIcon(photo));
                
                ImageIcon ic=new ImageIcon(photo);
            Image ic1=ic.getImage().getScaledInstance(105, 70, Image.SCALE_SMOOTH);
            ImageIcon ic2=new ImageIcon(ic1);
            jb2.setIcon(ic2);
            }
       }catch(Exception ex)
       {
           ex.printStackTrace();
       }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbb1 = new javax.swing.JLabel();
        jbb = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        lbb = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jb2 = new javax.swing.JButton();
        jb22 = new javax.swing.JLabel();
        jb25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lbb1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbb1.setForeground(new java.awt.Color(255, 255, 255));
        lbb1.setText("TOP  RECENT  SERIES");
        getContentPane().add(lbb1);
        lbb1.setBounds(400, 160, 300, 80);

        jbb.setBackground(new java.awt.Color(0, 0, 0));
        jbb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbb.setForeground(new java.awt.Color(255, 255, 255));
        jbb.setText("Fetch");
        jbb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbbActionPerformed(evt);
            }
        });
        getContentPane().add(jbb);
        jbb.setBounds(780, 180, 140, 40);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Fetch");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(780, 240, 140, 40);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TOP  UPCOMING  SERIES");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(400, 210, 300, 100);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Change Password");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(30, 160, 150, 40);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FETCH  TEAMS");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(400, 300, 230, 50);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Fetch");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(780, 300, 140, 40);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("SEARCH  PLAYERS");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(400, 350, 230, 60);

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Fetch");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(780, 360, 140, 40);

        lbb.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lbb.setForeground(new java.awt.Color(0, 255, 255));
        lbb.setText("WELCOME");
        getContentPane().add(lbb);
        lbb.setBounds(500, 40, 270, 80);

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Log OUT");
        jButton6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(1150, 30, 140, 40);

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Manage Profile");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(30, 110, 150, 40);

        jb2.setBackground(new java.awt.Color(204, 204, 204));
        jb2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jb2.setForeground(new java.awt.Color(204, 0, 0));
        jb2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jb2.setFocusCycleRoot(true);
        jb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb2ActionPerformed(evt);
            }
        });
        getContentPane().add(jb2);
        jb2.setBounds(70, 30, 70, 70);
        getContentPane().add(jb22);
        jb22.setBounds(0, 230, 380, 500);
        getContentPane().add(jb25);
        jb25.setBounds(940, 230, 420, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbbActionPerformed
        // TODO add your handling code here:
        try {

            HttpResponse<String> response = Unirest.get("https://cricbuzz-cricket.p.rapidapi.com/matches/v1/recent")
                    .header("x-rapidapi-key", "b6967f1b84msh35d29429ab4db85p19ecf0jsncbeadcdd583f")
                    .header("x-rapidapi-host", "cricbuzz-cricket.p.rapidapi.com")
                    .asString();
            if (response.getStatus() == 200) {
                String ans = response.getBody();
                upcoming.upcoming = ans;
                Upcoming_Matches obj = new Upcoming_Matches();
                dispose();
            }
        } catch (Exception ex) {

            ex.printStackTrace();
        }
    }//GEN-LAST:event_jbbActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        try {

            HttpResponse<String> response = Unirest.get("https://cricbuzz-cricket.p.rapidapi.com/matches/v1/upcoming")
                    .header("x-rapidapi-key", "b6967f1b84msh35d29429ab4db85p19ecf0jsncbeadcdd583f")
                    .header("x-rapidapi-host", "cricbuzz-cricket.p.rapidapi.com")
                    .asString();
            if (response.getStatus() == 200) {
                String ans = response.getBody();
                upcoming.upcoming = ans;
                Upcoming_Matches obj = new Upcoming_Matches();
                dispose();
            }
        } catch (Exception ex) {

            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     Reset_Password res =new Reset_Password();
     dispose();
     
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Fetch_teams fft=new Fetch_teams();
        fft.setVisible(true);
        dispose();
        
        
               
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Search_Player sp=new Search_Player();
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        upcoming.useremail="";
         CRIC cc = new CRIC();
        dispose(); 
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Manage_Profile mf= new Manage_Profile();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb2ActionPerformed
        // TODO add your handling code here:

        File ph;
        JFileChooser jfc=new JFileChooser();
        int ans=jfc.showOpenDialog(this);
        if(ans==JFileChooser.APPROVE_OPTION)
        {
            ph=jfc.getSelectedFile();
            ImageIcon ic=new ImageIcon(ph.getPath());
            Image ic1=ic.getImage().getScaledInstance(jb2.getWidth()+10, jb2.getHeight(), ans);
            ImageIcon ic2=new ImageIcon(ic1);
            jb2.setIcon(ic2);
            
            try{
            ResultSet rs = DBloader.executeSql("Select * from user where email = '"+upcoming.useremail+"' ");
            if(rs.next())
            {
                String photoPath = SaveFile.saveFile(ph);
                rs.updateString("photo", photoPath);
                rs.updateRow();
            }
       }catch(Exception ex)
       {
           ex.printStackTrace();
       }
            
        }
    }//GEN-LAST:event_jb2ActionPerformed
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(User_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jb2;
    private javax.swing.JLabel jb22;
    private javax.swing.JLabel jb25;
    private javax.swing.JButton jbb;
    private javax.swing.JLabel lbb;
    private javax.swing.JLabel lbb1;
    // End of variables declaration//GEN-END:variables
}
