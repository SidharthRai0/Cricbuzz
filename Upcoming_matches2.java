
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import org.json.JSONArray;
import org.json.JSONObject;


public class Upcoming_matches2 extends javax.swing.JFrame {

    String ans=upcoming.upcoming;
    public Upcoming_matches2(String match, String series) {
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
        getMatches(match, series);
    }
void getMatches(String match,String name1){
      
            int x=10,y=10;
            
               JSONObject mainobj=new JSONObject(ans);
               JSONArray arr=mainobj.getJSONArray("typeMatches");
               
               for(int i=0;i<arr.length();i++)
               {
                   JSONObject obj=(JSONObject)arr.get(i);
                   String matchType=obj.get("matchType").toString();
                  
                   if(match.equals(matchType))
                    {
                        
                        int a=10,b=10;
                        JSONArray subarr=obj.getJSONArray("seriesMatches");
                        System.out.println(subarr);
                        
                        for(int j=0;j<subarr.length();j++)
                        {
                        JSONObject subobj=(JSONObject)subarr.get(j);
                         
                        if(subobj.has("seriesAdWrapper")){
                            
                        JSONObject subsubobj=(JSONObject)subobj.get("seriesAdWrapper");
                        String name=subsubobj.get("seriesName").toString();
                        
                        if(name.equals(name1)){
                           JSONArray matches=subsubobj.getJSONArray("matches");
                            System.out.println("----");
                           matches( matches);
                            
                        }
                            
                        }
                        
                        }
                        
                    }
                   
               }
        }
      void matches(JSONArray matches)
      {
          int x=10;
          int y=10;
          System.out.println("Inside function");
          System.out.println(matches);
          int count=matches.length();
          for(int i=0;i<matches.length();i++)
          {
           JSONObject obj=matches.getJSONObject(i).getJSONObject("matchInfo");
           String seriesName = obj.getString("seriesName");
           String matchDesc = obj.getString("matchDesc");
           String matchFormat = obj.getString("matchFormat");
           long startdate=Long.parseLong(obj.getString("seriesStartDt"));
           long enddate=Long.parseLong(obj.getString("seriesEndDt"));
           String status = obj.getString("status");
           Instant instant = Instant.ofEpochMilli(startdate);

        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());

        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of("GMT"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String formattedLocalDateTime = localDateTime.format(formatter);
        System.out.println("Formatted LocalDateTime: " + formattedLocalDateTime);

        Instant instant1 = Instant.ofEpochMilli(enddate);

        LocalDateTime localDateTime1 = LocalDateTime.ofInstant(instant1, ZoneId.systemDefault());

        ZonedDateTime zonedDateTime1 = instant.atZone(ZoneId.of("GMT"));

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String formattedLocalDateTime1 = localDateTime1.format(formatter);
            JSONObject team1=obj.getJSONObject("team1");
            String teamname1=team1.getString("teamName");
            
            JSONObject team12=obj.getJSONObject("team1");
            String teamname2=team1.getString("teamName");
            
            JSONObject venue=obj.getJSONObject("venueInfo");
            String city=venue.getString("city");
            String ground=venue.getString("ground");
            
          matches obj1=new matches();
            obj1.jbl1.setText(seriesName);
            obj1.jbl2.setText(teamname1);
            obj1.jbl3.setText(teamname2);
            obj1.jbl5.setText(ground);
            obj1.jbl6.setText(city);
            obj1.jbl7.setText(formattedLocalDateTime1);
            obj1.jbl9.setText(formattedLocalDateTime);
            obj1.jbl4.setText(status);
            obj1.setBounds(x, y, 500, 400);
            if(x<1000)
            {
                x+=520;
            }
            else
            {
                y+=420;
                x=10;
            }
            jp.add(obj1);
            obj1.repaint();
            jp.repaint();
          }
          jp.setPreferredSize(new Dimension(900,500*count));
      }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jp = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Algerian", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 51, 0));
        jLabel4.setText("  matches");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(490, 20, 300, 70);
        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 2, 2);

        jp.setBackground(new java.awt.Color(0, 0, 0, 50)
        );

        javax.swing.GroupLayout jpLayout = new javax.swing.GroupLayout(jp);
        jp.setLayout(jpLayout);
        jpLayout.setHorizontalGroup(
            jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpLayout.setVerticalGroup(
            jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(jp);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(370, 110, 530, 400);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyUploads/output-onlinegiftools.gif"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(60, 50, 56, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Upcoming_Matches upm=new Upcoming_Matches();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Upcoming_matches2("","").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jp;
    // End of variables declaration//GEN-END:variables
}
