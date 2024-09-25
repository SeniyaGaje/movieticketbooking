import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import moviebooking.DBticketbooking;



public class movie extends javax.swing.JFrame {

    
    public movie() {
        initComponents();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        MovieComboBox = new javax.swing.JComboBox<>();
        theatreComboBox2 = new javax.swing.JComboBox<>();
        dateComboBox3 = new javax.swing.JComboBox<>();
        timeComboBox4 = new javax.swing.JComboBox<>();
        txt_tickets = new javax.swing.JTextField();
        btn_submit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(925, 575));
        getContentPane().setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jLabel6, gridBagConstraints);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Algerian", 1, 36), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(850, 550));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SELECT MOVIE:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 120, 203, 29);

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SELECT THEATRE:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 180, 251, 33);

        jLabel3.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SELECT TIME:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 300, 190, 33);

        jLabel4.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NO OF TICKETS:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 400, 220, 29);

        jLabel12.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Enter Username");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(20, 60, 220, 40);

        jLabel5.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SELECT DATE:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 240, 210, 33);

        jLabel10.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 51));
        jLabel10.setText("Price of a ticket = RS 500");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(110, 350, 280, 30);

        txt_username.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txt_username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_usernameMouseEntered(evt);
            }
        });
        jPanel1.add(txt_username);
        txt_username.setBounds(300, 60, 200, 35);

        MovieComboBox.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        MovieComboBox.setForeground(new java.awt.Color(255, 255, 255));
        MovieComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Nice Guys", "Civil War", "X MEN", "Angry Birds" }));
        MovieComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MovieComboBoxMouseClicked(evt);
            }
        });
        jPanel1.add(MovieComboBox);
        MovieComboBox.setBounds(310, 120, 188, 35);

        theatreComboBox2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        theatreComboBox2.setForeground(new java.awt.Color(255, 255, 255));
        theatreComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "WTC", "CCC", "OGF", "PVR" }));
        theatreComboBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                theatreComboBox2MouseClicked(evt);
            }
        });
        jPanel1.add(theatreComboBox2);
        theatreComboBox2.setBounds(310, 170, 185, 35);

        dateComboBox3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        dateComboBox3.setForeground(new java.awt.Color(255, 255, 255));
        dateComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "2023-10-05", "2023-10-06", "2023-10-07", "2023-10-08", "2023-10-09" }));
        dateComboBox3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dateComboBox3MouseClicked(evt);
            }
        });
        dateComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateComboBox3ActionPerformed(evt);
            }
        });
        jPanel1.add(dateComboBox3);
        dateComboBox3.setBounds(310, 230, 185, 35);

        timeComboBox4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        timeComboBox4.setForeground(new java.awt.Color(255, 255, 255));
        timeComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "9:00", "11:00", "14:00", "18.00" }));
        timeComboBox4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timeComboBox4MouseClicked(evt);
            }
        });
        jPanel1.add(timeComboBox4);
        timeComboBox4.setBounds(310, 290, 185, 35);

        txt_tickets.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txt_tickets.setForeground(new java.awt.Color(0, 0, 0));
        txt_tickets.setCaretColor(new java.awt.Color(0, 0, 0));
        txt_tickets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_ticketsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_ticketsMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txt_ticketsMouseReleased(evt);
            }
        });
        jPanel1.add(txt_tickets);
        txt_tickets.setBounds(320, 390, 130, 35);

        btn_submit.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        btn_submit.setText("SUBMIT");
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });
        jPanel1.add(btn_submit);
        btn_submit.setBounds(180, 450, 131, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 33, 28));
        jLabel7.setText("MOVIE DETAILS");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 0, 370, 50);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\seniy\\OneDrive\\Pictures\\Project\\giphy.gif")); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(450, 0, 470, 510);

        jLabel8.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 51));
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\seniy\\OneDrive\\Pictures\\Wallpapers\\223719.jpg")); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(-140, 0, 1060, 540);

        jLabel11.setText("jLabel11");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(100, 70, 45, 16);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 919;
        gridBagConstraints.ipady = 539;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 1, 3);
        getContentPane().add(jPanel1, gridBagConstraints);
        jPanel1.getAccessibleContext().setAccessibleName("Movie Details");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed

        workWithDatabase();
        }
        public void workWithDatabase()
        {
            String a=(String) MovieComboBox.getSelectedItem();
            String b=(String) theatreComboBox2.getSelectedItem();
            String e=(String) timeComboBox4.getSelectedItem();
            String f=(String) dateComboBox3.getSelectedItem();
            String d=txt_tickets.getText();
            String g = txt_username.getText();

            Connection c=null;
            Statement  s=null;

            ResultSet rs=null;
            int flag = 0;

            //if(!a.equals(""))
            String N=txt_tickets.getText();
            int N1=Integer.parseInt(N);
            int N2=N1;
            N1*=500;
            //new recepit(a,b,e,d,N1,f).setVisible(true);

            if(N2<10 && N2>0)

            {
                this.setVisible(false);  new recepit(a,b,e,d,N1,f,g).setVisible(true);

                try
                {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    c=DriverManager.getConnection("jdbc:mysql://localhost/java_dbmovies","root","");
                   
                    s=c.createStatement();
                    b=(String) theatreComboBox2.getSelectedItem();
                    e=(String) timeComboBox4.getSelectedItem();
                    String q1=b;
                    String q2=e;
                    
                    rs = s.executeQuery("select tickets from movie where theatre="+"'"+q1+"'"+" and time="+"'"+q2+"'");
                    String bid=txt_tickets.getText();
                    int id = Integer.parseInt(bid);
                    
                    rs=s.executeQuery("select tickets from movie where theatre="+"'"+q1+"'"+" and time="+"'"+q2+"'");
                    while(rs.next())
                    {
                        String id1=rs.getString("tickets");
                        int id2=Integer.parseInt(id1);

                        id2=id2-N2;

                        s.executeUpdate("Update movie set tickets="+id2+" where theatre="+"'"+q1+"'"+" and time="+"'"+q2+"'");
                    }
                    //new recepit(a,b,e,d).setVisible(true);
                    while(rs.next())
                    {
                        String tickets1=rs.getString("tickets");
                        String q3 = tickets1;


                    }                    
                }
                catch(Exception e1)
                {
                    System.out.println(e1);
                }

            }

            // TODO add your handling code here:
    }//GEN-LAST:event_btn_submitActionPerformed

    private void dateComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateComboBox3ActionPerformed
       
          

    }//GEN-LAST:event_dateComboBox3ActionPerformed

    private void MovieComboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MovieComboBoxMouseClicked
              
        String username = txt_username.getText();

    if (username == null || username.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Username cannot be empty.");
    } else if (!username.matches("[a-zA-Z]*")) {
        JOptionPane.showMessageDialog(this, "Username can only contain alphabetical characters.");
    } else {
        // Continue with your logic here
    }
            
    }//GEN-LAST:event_MovieComboBoxMouseClicked

    private void theatreComboBox2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_theatreComboBox2MouseClicked
        String selectedMovie = (String) MovieComboBox.getSelectedItem();

    if (selectedMovie == " " || selectedMovie.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please select a movie.");
    } else {
        // Continue with your logic here
    }
// TODO add your handling code here:
    }//GEN-LAST:event_theatreComboBox2MouseClicked

    private void dateComboBox3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateComboBox3MouseClicked
         String selectedMovie = (String) theatreComboBox2.getSelectedItem();

    if (selectedMovie == " " || selectedMovie.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please select a theatre.");
    } else {
    }
    
    }//GEN-LAST:event_dateComboBox3MouseClicked

    private void timeComboBox4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeComboBox4MouseClicked
        String selectedMovie = (String) dateComboBox3.getSelectedItem();

    if (selectedMovie == " " || selectedMovie.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please select a date.");
    } else {
    }// TODO add your handling code here:
    }//GEN-LAST:event_timeComboBox4MouseClicked

    private void txt_ticketsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_ticketsMouseClicked
          String selectedMovie = (String) timeComboBox4.getSelectedItem();

    if (selectedMovie == " " || selectedMovie.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please select a time.");
    } else {
    }
    }//GEN-LAST:event_txt_ticketsMouseClicked
  
    private void txt_ticketsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_ticketsMouseEntered
          txt_tickets.setToolTipText("Only up to 10 tickets can be booked");
    


// TODO add your handling code here:
    }//GEN-LAST:event_txt_ticketsMouseEntered

    private void txt_usernameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_usernameMouseEntered
        
          txt_username.setToolTipText("Enter your registered username");
// TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameMouseEntered

    private void txt_ticketsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_ticketsMouseReleased
           String ticketsText = txt_tickets.getText();

    if (ticketsText.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter a number of tickets less than 10.");
    } else {
        try {
            int tickets = Integer.parseInt(ticketsText);

            if (tickets > 10) {
                JOptionPane.showMessageDialog(this, "You cannot book more than 10 tickets.");
            } else {
                // Continue with your logic here
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid integer number of tickets.");
        }
    }
    
// TODO add your handling code here:
    }//GEN-LAST:event_txt_ticketsMouseReleased

     
    public static void main(String args[]) {
       
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new movie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> MovieComboBox;
    private javax.swing.JButton btn_submit;
    private javax.swing.JComboBox<String> dateComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> theatreComboBox2;
    private javax.swing.JComboBox<String> timeComboBox4;
    private javax.swing.JTextField txt_tickets;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
