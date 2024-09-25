


public class recepit1 extends javax.swing.JFrame {

    
    public recepit1() {
        initComponents();
    }
        String a;String b;String c;String e;String f;String g;
            int N1;
            
    public recepit1(String p1,String p2,String p3,String p4,int p5,String p6,String p7){
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
    lbl_price.setText(String.valueOf(p5));
    lbl_date.setText(p6);
    lbl_username.setText(p7);
    }    

    recepit1(String a, String b, String c, String d, String e, int N1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_theatre = new javax.swing.JLabel();
        lbl_tickets = new javax.swing.JLabel();
        lbl_date = new javax.swing.JLabel();
        lbl_movie = new javax.swing.JLabel();
        lbl_time = new javax.swing.JLabel();
        lbl_price = new javax.swing.JLabel();
        btn_cancel = new javax.swing.JButton();
        lbl_username = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NO OF TICKETS:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 36, 210, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("THEATRE:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 96, 158, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MOVIE:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 156, 123, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("DATE:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 216, 108, 37));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("SHOWTIME:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 276, 170, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("FARE:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 356, 96, -1));

        jLabel3.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 0));
        jLabel3.setText("THANKS FOR BOOKING!!");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 436, 440, 40));

        lbl_theatre.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_theatre.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbl_theatre, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 86, 210, 40));

        lbl_tickets.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_tickets.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbl_tickets, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 190, 40));

        lbl_date.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_date.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbl_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 226, 230, 30));

        lbl_movie.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_movie.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbl_movie, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 156, 190, 40));

        lbl_time.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_time.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbl_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 276, 190, 40));

        lbl_price.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_price.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbl_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 346, 160, 40));

        btn_cancel.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        btn_cancel.setForeground(new java.awt.Color(255, 51, 0));
        btn_cancel.setText("CANCEL");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 110, 50));

        lbl_username.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbl_username.setForeground(new java.awt.Color(0, 255, 0));
        getContentPane().add(lbl_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 426, 190, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\seniy\\OneDrive\\Pictures\\Project\\28154642_sl_121019_25870_81.jpg")); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 740, 526));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        this.setVisible(false);
        new cancellation().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancelActionPerformed

    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new recepit1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lbl_date;
    private javax.swing.JLabel lbl_movie;
    private javax.swing.JLabel lbl_price;
    private javax.swing.JLabel lbl_theatre;
    private javax.swing.JLabel lbl_tickets;
    private javax.swing.JLabel lbl_time;
    private javax.swing.JLabel lbl_username;
    // End of variables declaration//GEN-END:variables

    recepit1 getVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
