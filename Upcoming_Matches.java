
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import org.json.JSONArray;
import org.json.JSONObject;


public class Upcoming_Matches extends javax.swing.JFrame {

String ans=upcoming.upcoming;
    public Upcoming_Matches() {
        
        
        initComponents();
        jPanel2.setBackground(new java.awt.Color(0, 0, 0, 50));
        
        JLabel jb ;
        jb=new JLabel();
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        int w=(int)d.getWidth();
        int h=(int)d.getHeight();
        setSize(w, h);
        jb.setBounds(0, 0, w, h);
        ImageIcon ic=new ImageIcon("src/MyUploads/cbg.jpg");
        Image ic1=ic.getImage().getScaledInstance(jb.getWidth(),jb.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon ic2=new ImageIcon(ic1);
        jb.setIcon(ic2);
        add(jb);
                setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        getUpcoming();
    }

    void getUpcoming()
{
    try
        {
////            HttpResponse<String> response = Unirest.get("https://cricbuzz-cricket.p.rapidapi.com/matches/v1/upcoming")
////	.header("x-rapidapi-key", "340f801646msh9f4da9cc4eafcbfp18dd78jsndb07b1605794")
////	.header("x-rapidapi-host", "cricbuzz-cricket.p.rapidapi.com")
////	.asString();
////            if(response.getStatus()==200)
////            
////             ans=response.getBody();
             System.out.println(ans);

            
            int x=10,y=10;
               JSONObject mainobj=new JSONObject(ans);
               JSONArray arr=mainobj.getJSONArray("typeMatches");
              
               for(int i=0;i<arr.length();i++)
               {
                   JSONObject obj=(JSONObject)arr.get(i);
                   String matchType=obj.get("matchType").toString();
                   JButton b1=new JButton();
                   b1.setBounds(x, y, 100, 50);
                   b1.setText(matchType);
                   b1.addActionListener(new ActionListener() {
                       @Override
                       public void actionPerformed(ActionEvent e) {
                           getseries(matchType);
                           
                       }
                   });
                   x=x+110;
                   jPanel1.add(b1);
                   jPanel1.repaint();
                   jPanel1.revalidate();
               }
               jPanel1.setPreferredSize(new Dimension(x*arr.length(), 100));
            
        }
        catch(Exception ex)
        {
         ex.printStackTrace();
        }
        
    
}
    
    void getseries(String match)
{
    JOptionPane.showMessageDialog(this, match);
            int x=10,y=10;
               JSONObject mainobj=new JSONObject(ans);
               JSONArray arr=mainobj.getJSONArray("typeMatches");
               for(int i=0;i<arr.length();i++)
               {
                   JSONObject obj=(JSONObject)arr.get(i);
                   String matchType=obj.get("matchType").toString();
                  
                   if(match.equals(matchType))
                    {
                        jPanel2.removeAll();
                        int a=10,b=10;
                        JSONArray subarr=obj.getJSONArray("seriesMatches");
                        System.out.println(subarr);
                        
                        for(int j=0;j<subarr.length();j++)
                        {
                        JSONObject subobj=(JSONObject)subarr.get(j);
                         
                        if(subobj.has("seriesAdWrapper")){
                        JSONObject subsubobj=(JSONObject)subobj.get("seriesAdWrapper");
                        String name=subsubobj.get("seriesName").toString();
                            Series ss=new Series();
                            ss.lbl1.setText(matchType);
                            ss.tff.setText(name);
                            ss.btt.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                              
                               Upcoming_matches2 um=new Upcoming_matches2(match,name);
                            }
                            });
                            ss.setBounds(a, b, 330 , 300);
                            a=a+340;
                            jPanel2.add(ss);
                            jPanel2.repaint();
                            jPanel2.revalidate();
                            
                        }
                        
                        }
                        jPanel2.setPreferredSize(new Dimension(a+340, 300));
                        
                    }
                   
               }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("UPCOMING  MATCHES");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(410, 40, 520, 80);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 688, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(470, 150, 370, 90);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0, 50));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1258, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 308, Short.MAX_VALUE)
        );

        jScrollPane4.setViewportView(jPanel2);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(160, 290, 1030, 310);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyUploads/output-onlinegiftools.gif"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 20, 60, 70);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       User_Home uh= new User_Home();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Upcoming_Matches().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
