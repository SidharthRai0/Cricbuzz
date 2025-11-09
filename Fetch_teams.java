
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import org.json.JSONArray;
import org.json.JSONObject;


public class Fetch_teams extends javax.swing.JFrame {

   
    public Fetch_teams() {
        initComponents();
        JLabel lb4;
        lb4=new JLabel();
       
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        int x=(int) d.getWidth();
        int y=(int) d.getHeight();
        setSize(x, y);
        lb4.setBounds(0, 0, x, y);
        ImageIcon ic=new ImageIcon("src/MyUploads/cbg.jpg");
        Image ic1=ic.getImage().getScaledInstance(lb4.getWidth(), lb4.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ic2=new ImageIcon(ic1);
        lb4.setIcon(ic2);
        add(lb4);
                setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                setVisible(true);
        getTeams();
    }
    void getTeams()
    {
    try
        {
        HttpResponse<String> response = Unirest.get("https://cricbuzz-cricket.p.rapidapi.com/teams/v1/international")
	.header("x-rapidapi-key", "340f801646msh9f4da9cc4eafcbfp18dd78jsndb07b1605794")
	.header("x-rapidapi-host", "cricbuzz-cricket.p.rapidapi.com")
	.asString();
        int x=10,y=10;
        if(response.getStatus()==200)
        {
            String ans=response.getBody();
            System.out.println(ans);
            JSONObject mainobj=new JSONObject(ans);
            JSONArray arr=mainobj.getJSONArray("list");
              for(int i=0;i<arr.length();i++)
            {
                JSONObject obj=(JSONObject)arr.get(i);
                if(obj.has("teamId"))
                {
                String name=obj.getString("teamName");
                String sname=obj.getString("teamSName");
                int id=(int)obj.get("teamId");
               Fetch t1=new Fetch();
                t1.jlbb.setText(name);
                t1.jlbb1.setText(sname);
                t1.jButton1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                    All_Data ad= new All_Data(id);
                    }
                });
                    t1.setBounds(x, y, 230, 256);
                t1.setVisible(true);
                jPanel1.add(t1);
                if(x<480)
                {
                x=x+240;
                }
                else
                {
                y=y+277;
                x=10;
                }
                
                
                jPanel1.repaint();
                jPanel1.revalidate();
                jPanel1.setBackground(Color.black);
                
                
                
            }
            jPanel1.setPreferredSize(new Dimension(898, y+436));
        }
        
        
                }}
       catch(Exception ex)
     {
         ex.printStackTrace();
     }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1148, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 528, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(310, 130, 750, 540);

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("Fetch  Teams");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(510, 50, 410, 60);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyUploads/output-onlinegiftools.gif"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 40, 56, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        User_Home uh=new User_Home();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fetch_teams().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
