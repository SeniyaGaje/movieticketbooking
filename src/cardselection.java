 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ButtonGroup;

public class cardselection extends javax.swing.JFrame {

    
    public cardselection() {
        initComponents();
        groupButton();
    }
    private void groupButton() {
        
        ButtonGroup bg1= new ButtonGroup();
    }
    String a;String b;String c;String e;String f;String g;
    int N1;
    
    public cardselection(String p1,String p2,String p3,String p4,int p5,String p6,String p7){
    initComponents();
    this.a=p1;
    this.b=p2;
    this.c=p3;
    this.e=p4;
    this.N1=p5;
    this.f=p6;
    this.g=p7;
    
    lbl_tickets.setText(p4);
    lbl_theatre.setText(p2);
    lbl_movie.setText(p1);
    lbl_date.setText(p6);  
    lbl_fare.setText(String.valueOf(p5));
    lbl_time.setText(p3);
    lbl_username.setText(p7);
    }

    cardselection(String a, String b, String c, String e, String f,String g, int N1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_Agree = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_date = new javax.swing.JLabel();
        lbl_time = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_cancel = new javax.swing.JButton();
        lbl_tickets = new javax.swing.JLabel();
        lbl_movie = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_fare = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbl_theatre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl_username = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 36), new java.awt.Color(0, 0, 255))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(780, 540));
        jPanel1.setLayout(null);

        btn_Agree.setBackground(new java.awt.Color(204, 255, 255));
        btn_Agree.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn_Agree.setForeground(new java.awt.Color(0, 0, 0));
        btn_Agree.setText("BOOK");
        btn_Agree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgreeActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Agree);
        btn_Agree.setBounds(115, 436, 180, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DATE:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(410, 160, 110, 29);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TIME:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(410, 240, 120, 29);

        lbl_date.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_date.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl_date);
        lbl_date.setBounds(570, 160, 180, 40);

        lbl_time.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_time.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl_time);
        lbl_time.setBounds(610, 240, 150, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NO OF TICKETS:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 90, 220, 29);

        btn_cancel.setBackground(new java.awt.Color(255, 51, 51));
        btn_cancel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn_cancel.setForeground(new java.awt.Color(0, 0, 0));
        btn_cancel.setText(" Cancel Order");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cancel);
        btn_cancel.setBounds(450, 430, 200, 40);

        lbl_tickets.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_tickets.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl_tickets);
        lbl_tickets.setBounds(250, 80, 130, 40);

        lbl_movie.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_movie.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl_movie);
        lbl_movie.setBounds(190, 160, 180, 40);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("THEATER:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(410, 90, 140, 29);

        lbl_fare.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_fare.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl_fare);
        lbl_fare.setBounds(220, 240, 160, 40);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("FARE:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(50, 250, 120, 29);

        lbl_theatre.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_theatre.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl_theatre);
        lbl_theatre.setBounds(590, 90, 150, 30);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MOVIE:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 160, 110, 29);

        jLabel6.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("ALL PAYMENTS SHOULD BE DONE AT THE SPECIFIC THEATER");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 340, 730, 60);

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("CHECKOUT");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 0, 150, 40);

        lbl_username.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_username.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl_username);
        lbl_username.setBounds(270, 10, 180, 40);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\seniy\\OneDrive\\Pictures\\Wallpapers\\526.jpg")); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(0, 0, 780, 520);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AgreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgreeActionPerformed
           
        this.setVisible(false);     
        new recepit1(a,b,c,e,N1,f,g).setVisible(true);
    }//GEN-LAST:event_btn_AgreeActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        this.setVisible(false);
        new cancellation().setVisible(true);

        Connection c = null;
        Statement s = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost/java_dbmovies", "root", "");
            s = c.createStatement();

            // Fetch the username from the register table
            ResultSet rs = s.executeQuery("SELECT name FROM register WHERE name = 1");
            String name = "";
            if (rs.next()) {
                name = rs.getString("name");
            }

            // Delete the data from the movie table
            String sql = "DELETE FROM movie WHERE name = ?";
            PreparedStatement pstmt = c.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.executeUpdate();

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_btn_cancelActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cardselection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Agree;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_date;
    private javax.swing.JLabel lbl_fare;
    private javax.swing.JLabel lbl_movie;
    private javax.swing.JLabel lbl_theatre;
    private javax.swing.JLabel lbl_tickets;
    private javax.swing.JLabel lbl_time;
    private javax.swing.JLabel lbl_username;
    // End of variables declaration//GEN-END:variables
}
