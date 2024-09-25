import java.sql.*;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import moviebooking.DBticketbooking;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class register extends javax.swing.JFrame {
    Connection conn=null;
   
    public register() {
        initComponents();
        conn=DBticketbooking.ConnecrDb();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_password = new javax.swing.JTextField();
        btn_signup = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_number = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 85, 153));
        setForeground(new java.awt.Color(0, 0, 153));
        setPreferredSize(new java.awt.Dimension(850, 520));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("USERNAME");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 42;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(54, 30, 0, 0);
        getContentPane().add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("EMAIL ID");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 26;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 40, 0, 0);
        getContentPane().add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("PASSWORD");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 50, 0, 0);
        getContentPane().add(jLabel3, gridBagConstraints);

        txt_username.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt_username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_usernameMouseExited(evt);
            }
        });
        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.ipadx = 276;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(54, 20, 0, 0);
        getContentPane().add(txt_username, gridBagConstraints);

        txt_email.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt_email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_emailMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_emailMouseExited(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 276;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 20, 0, 0);
        getContentPane().add(txt_email, gridBagConstraints);

        txt_password.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_passwordMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_passwordMouseExited(evt);
            }
        });
        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 186;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 30, 0, 0);
        getContentPane().add(txt_password, gridBagConstraints);

        btn_signup.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        btn_signup.setText("SIGN UP");
        btn_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signupActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 99;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(50, 10, 0, 0);
        getContentPane().add(btn_signup, gridBagConstraints);

        btn_back.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 16;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 27;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(50, 10, 0, 0);
        getContentPane().add(btn_back, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("NEW REGISTER");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.ipady = -6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 0, 0);
        getContentPane().add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setText("PHONE NUMBER");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 30, 0, 0);
        getContentPane().add(jLabel5, gridBagConstraints);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\seniy\\OneDrive\\Pictures\\Project\\register-icon.png")); // NOI18N
        jLabel6.setText("jLabel6");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 16;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.ipadx = -42;
        gridBagConstraints.ipady = -10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(44, 50, 0, 0);
        getContentPane().add(jLabel6, gridBagConstraints);

        txt_number.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt_number.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_numberMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_numberMouseExited(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 216;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 30, 0, 0);
        getContentPane().add(txt_number, gridBagConstraints);

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\seniy\\OneDrive\\Pictures\\Wallpapers\\526.jpg")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 19;
        gridBagConstraints.gridheight = 10;
        gridBagConstraints.ipadx = -1700;
        gridBagConstraints.ipady = -1120;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 0);
        getContentPane().add(jLabel7, gridBagConstraints);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
         
    }//GEN-LAST:event_txt_usernameActionPerformed

    private void btn_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signupActionPerformed
             String a = txt_username.getText();
    String b = txt_email.getText();
    String c = txt_password.getText();
    String d = txt_number.getText();

    if (a.isEmpty() || b.isEmpty() || c.isEmpty() || d.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all fields");
    } else {
        try {
            Statement s = conn.createStatement();
            String s1 = "INSERT INTO register (name, email, password, telephone) VALUES ('" + a + "','" + b + "','" + c + "','" + d + "');"; 
            s.executeUpdate(s1);
           JOptionPane.showMessageDialog(this, "Registration Sucessful");


        } catch (SQLException e) {
            if(e.getErrorCode() == 1062){
                JOptionPane.showMessageDialog(this, "Duplicate entry. Please use different values.");
            } else {
                Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, e);
            }
        }

    
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_signupActionPerformed
 }
    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
          
             this.setVisible(false);        
             new login().setVisible(true); 
             
    }//GEN-LAST:event_btn_backActionPerformed

    private void txt_emailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_emailMouseClicked
        
        String username = txt_username.getText();
        
         // Check if the entered value is a valid string
        if (isValidString(username)) {
       
        
    } else {
        // The input is not a valid string
        JOptionPane.showMessageDialog(this, "Please enter a name containing letters.");
        txt_username.setText(""); // Clear the invalid input
    }
}

    private boolean isValidString(String str) {
         // Check if the input contains only letters (alphabetic characters)
        return str.matches("^[a-zA-Z]+$");       
    }//GEN-LAST:event_txt_emailMouseClicked

    private void txt_numberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_numberMouseClicked
    // Get the entered email address
     String email = txt_email.getText().trim().toLowerCase(); // Trim leading/trailing spaces

    // Check if the entered value is a valid email address
    if (isValidEmail(email)) {
        // Valid email address
    } else {
        // Invalid email address
        JOptionPane.showMessageDialog(this, "Please enter a valid email address. example(seniya@gmail.com).");
    }
}

private boolean isValidEmail(String email) {
    // Modified regular expression pattern to accept emails like "seniya@gmail.com"
    String emailPattern = "^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$";

    // Check if the input matches the updated email pattern
    return email.matches(emailPattern);

    }//GEN-LAST:event_txt_numberMouseClicked

    private void txt_usernameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_usernameMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameMouseExited

    private void txt_emailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_emailMouseExited
         // This event handler is triggered when the user presses Enter in txt_username        
    }//GEN-LAST:event_txt_emailMouseExited

    private void txt_numberMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_numberMouseExited
            
    }//GEN-LAST:event_txt_numberMouseExited

    private void txt_passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_passwordMouseClicked
        String phoneNumber = txt_number.getText().trim();

         String username = txt_username.getText().trim().toLowerCase();
         String password = txt_password.getText().trim();
       if (password.equals(username)) {
        // Invalid password
        JOptionPane.showMessageDialog(this, "Password should not be the same as the username.");
    } 
          else {
        // Valid password
    }
        // Check if the entered value is a valid phone number
        if (isValidPhoneNumber(phoneNumber)) {
    // Valid phone number
}       else 
        {
        JOptionPane.showMessageDialog(this, "Please enter a valid phone number with 9 to 10 digits.ex:0771099318");
}
    }
private boolean isValidPhoneNumber(String phoneNumber)
{
    // Regular expression pattern for a phone number with 9 to 10 digits
    String phonePattern = "^[0-9]{9,10}$";

    // Check if the input matches the phone number pattern
    return phoneNumber.matches(phonePattern);

    }//GEN-LAST:event_txt_passwordMouseClicked

    private void txt_passwordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_passwordMouseExited
      
    }//GEN-LAST:event_txt_passwordMouseExited

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passwordActionPerformed

    public static void main(String args[]) {
        
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_signup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_number;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables

    
}
