
public class Series extends javax.swing.JPanel {

   
    public Series() {
        initComponents();
        setSize(600, 600);
        setVisible(true);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl1 = new javax.swing.JLabel();
        tff = new javax.swing.JTextField();
        btt = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 51, 0));
        setLayout(null);

        lbl1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbl1.setForeground(new java.awt.Color(255, 255, 0));
        lbl1.setText("jLabel1");
        add(lbl1);
        lbl1.setBounds(120, 10, 130, 40);

        tff.setBackground(new java.awt.Color(255, 255, 244));
        tff.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tff.setForeground(new java.awt.Color(0, 204, 255));
        tff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tffActionPerformed(evt);
            }
        });
        add(tff);
        tff.setBounds(10, 70, 280, 90);

        btt.setBackground(new java.awt.Color(0, 0, 0));
        btt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btt.setForeground(new java.awt.Color(255, 255, 255));
        btt.setText("Fetch Matches");
        add(btt);
        btt.setBounds(100, 200, 130, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void tffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tffActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tffActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btt;
    public javax.swing.JLabel lbl1;
    public javax.swing.JTextField tff;
    // End of variables declaration//GEN-END:variables
}
