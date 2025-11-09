
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import org.json.JSONArray;
import org.json.JSONObject;


public class All_Data extends javax.swing.JFrame {

   JSONObject players;
    public All_Data(int id) {
        initComponents();
         JLabel lb4;
        lb4=new JLabel();
        setVisible(true);
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
        String filePath = "src/MyUploads/players.txt"; 
        StringBuilder jsonData = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                jsonData.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        JSONObject jsonObject = new JSONObject(jsonData.toString());
        players = jsonObject.getJSONObject("players");
        
        getTeams(id);
        
    }
     public static String searchPlayer(JSONObject players, String name) {
        Iterator<String> keys = players.keys();

        while (keys.hasNext()) {
            String key = keys.next();
            JSONObject player = players.getJSONObject(key);

            if (player.has("fullname") && player.get("fullname").toString().equalsIgnoreCase(name)) {
                if (player.has("image_path")) {
                    return player.get("image_path").toString();
                }
            }
        }
        return null; // Return null if the player is not found or does not have an image_path
    }
      public static BufferedImage scale(BufferedImage src, int w, int h) {
        BufferedImage img
                = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        int x, y;
        int ww = src.getWidth();
        int hh = src.getHeight();
        int[] ys = new int[h];
        for (y = 0; y < h; y++) {
            ys[y] = y * hh / h;
        }
        for (x = 0; x < w; x++) {
            int newX = x * ww / w;
            for (y = 0; y < h; y++) {
                int col = src.getRGB(newX, ys[y]);
                img.setRGB(x, y, col);
            }
        }
        return img;
    }
      

    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("PLAYERS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(530, 30, 240, 50);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1018, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 688, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(180, 110, 970, 700);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyUploads/output-onlinegiftools.gif"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 30, 60, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Fetch_teams ft =new Fetch_teams();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
void getTeams(int id)
    {
    try
        {
            HttpResponse<String> response = Unirest.get("https://cricbuzz-cricket.p.rapidapi.com/teams/v1/"+id+"/players")
	.header("x-rapidapi-key", "340f801646msh9f4da9cc4eafcbfp18dd78jsndb07b1605794")
	.header("x-rapidapi-host", "cricbuzz-cricket.p.rapidapi.com")
	.asString();
            
       
            
        if(response.getStatus()==200)
            {
               
            String ans=response.getBody();
            System.out.println(ans);
            int x=10,y=10;
                JSONObject mainobj=new JSONObject(ans);
                JSONArray arr=mainobj.getJSONArray("player");
                  String type="";
                for(int i=0;i<arr.length();i++)
                {
                JSONObject obj=(JSONObject)arr.get(i);
              
                if(!obj.has("id"))
                    {
                    type=obj.getString("name");
                    }
                
                if(obj.has("id")){
                    String name=obj.getString("name");
                    Players_Info p1=new Players_Info();
                    
                 String photoPath = searchPlayer(players, name);
        if (photoPath != null) {
            //System.out.println("Photo Path: " + photoPath);
             BufferedImage bi = ImageIO.read(new URL(photoPath));

                bi = scale(bi, p1.jLabel1.getWidth(), p1.jLabel1.getHeight());

                p1.jLabel1.setIcon(new ImageIcon(bi));
        } else {
            p1.jLabel1.setIcon(new ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\CRICKETBUZZ Priyaaz\\src\\MyUploads\\dummy-image.jpg"));
            System.out.println("Player not found with the name: " + name);
        }   
                    
                    
                    
                    p1.kl.setText(name);
                    p1.kl1.setText(type);
                    p1.setBounds(x, y, 298 , 308);
                    
                    if(x<616)
                    {
                    x=x+318;
                    }
                    else
                    {
                    y=y+316;
                    x=10;
                    }
                    jPanel1.add(p1);
                    jPanel1.setBackground(Color.black);
                    jPanel1.repaint();
                    jPanel1.revalidate();
                } 
                
                }
                jPanel1.setPreferredSize(new Dimension(1000, y+308));
          
         }
        else
        {
            JOptionPane.showMessageDialog(this, "No Data founf for this team");
        }
        }
    catch(Exception ex)
        {
        ex.printStackTrace();
        }
    }
 
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new All_Data(0).setVisible(true);
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
