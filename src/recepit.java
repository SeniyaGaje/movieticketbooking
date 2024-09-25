import java.sql.*;
import moviebooking.DBticketbooking;


public class recepit extends javax.swing.JFrame {

   
    public recepit() {
        initComponents();
    }
    
    String a;String b;String c;String e;String f;String g;
    int N1;
    
    public recepit(String p1,String p2,String p3,String p4,int p5,String p6,String p7){
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
    lbl_time.setText(p3);
    jLabel11.setText(String.valueOf(p5));
    lbl_date.setText(p6);
    lbl_username.setText(p7);
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_tickets = new javax.swing.JLabel();
        lbl_theatre = new javax.swing.JLabel();
        lbl_movie = new javax.swing.JLabel();
        lbl_time = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbl_username = new javax.swing.JLabel();
        lbl_date = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        btn_book = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(760, 520));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Algerian", 1, 36), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(760, 520));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NO OF TICKETS:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(38, 86, 210, 29);

        jLabel15.setFont(new java.awt.Font("Algerian", 1, 48)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 255, 51));
        jLabel15.setText("BOOKING DETAILS");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(10, 10, 470, 50);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MOVIE:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(38, 214, 150, 29);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("THEATRE:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(38, 151, 161, 29);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PRICE (RS):");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 380, 180, 29);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("SHOW TIME:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 330, 170, 29);

        lbl_tickets.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_tickets.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl_tickets);
        lbl_tickets.setBounds(320, 90, 200, 30);

        lbl_theatre.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_theatre.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl_theatre);
        lbl_theatre.setBounds(300, 150, 200, 30);

        lbl_movie.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_movie.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl_movie);
        lbl_movie.setBounds(300, 210, 210, 30);

        lbl_time.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_time.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl_time);
        lbl_time.setBounds(300, 330, 210, 30);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel11);
        jLabel11.setBounds(300, 380, 200, 30);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("DATE:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(38, 267, 99, 29);

        lbl_username.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 36)); // NOI18N
        lbl_username.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lbl_username);
        lbl_username.setBounds(490, 10, 200, 50);

        lbl_date.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_date.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl_date);
        lbl_date.setBounds(300, 270, 200, 30);

        btn_back.setBackground(new java.awt.Color(255, 0, 0));
        btn_back.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        btn_back.setForeground(new java.awt.Color(0, 0, 0));
        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        jPanel1.add(btn_back);
        btn_back.setBounds(430, 440, 97, 40);

        btn_book.setBackground(new java.awt.Color(0, 204, 204));
        btn_book.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        btn_book.setForeground(new java.awt.Color(0, 0, 0));
        btn_book.setText("Agree");
        btn_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bookActionPerformed(evt);
            }
        });
        jPanel1.add(btn_book);
        btn_book.setBounds(120, 440, 120, 40);

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\seniy\\OneDrive\\Pictures\\Project\\wepik-export-20231004195734emb5.png")); // NOI18N
        jPanel1.add(jLabel14);
        jLabel14.setBounds(0, 0, 750, 490);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 759;
        gridBagConstraints.ipady = 499;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bookActionPerformed
         this.setVisible(false);        
         new cardselection(a,b,c,e,N1,f,g).setVisible(true);
         
         Connection c = null;
         Statement s = null;
         ResultSet rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        c=DriverManager.getConnection("jdbc:mysql://localhost/java_dbmovies","root","");
       
        s = c.createStatement();

        // Fetch the username from the register table
    

        // Insert the data into the movie table
        String sql = "INSERT INTO movie (name, movie, theatre, date, time, tickets) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement pstmt = c.prepareStatement(sql);
        pstmt.setString(1, lbl_username.getText());
        pstmt.setString(2, lbl_movie.getText());
        pstmt.setString(3, lbl_theatre.getText());
        pstmt.setString(4, lbl_date.getText());
        pstmt.setString(5, lbl_time.getText());
        pstmt.setString(6, lbl_tickets.getText());
        pstmt.executeUpdate();

    } catch (Exception ex) {
        System.out.println(ex);
    }

   
     

    }//GEN-LAST:event_btn_bookActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        this.setVisible(false);        
        new movie().setVisible(true);   
        
        
    }//GEN-LAST:event_btn_backActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new recepit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_book;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_date;
    private javax.swing.JLabel lbl_movie;
    private javax.swing.JLabel lbl_theatre;
    private javax.swing.JLabel lbl_tickets;
    private javax.swing.JLabel lbl_time;
    private javax.swing.JLabel lbl_username;
    // End of variables declaration//GEN-END:variables

   
}
