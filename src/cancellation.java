import moviebooking.DBticketbooking;
import javax.swing.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;


public class cancellation extends javax.swing.JFrame {

   
    public cancellation() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        lbl_username = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        btn_cancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(730, 430));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setBackground(new java.awt.Color(255, 51, 51));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("WE ARE SAD TO SEE YOU LEAVE !!");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 79;
        gridBagConstraints.ipady = 31;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(70, 170, 0, 0);
        getContentPane().add(jLabel1, gridBagConstraints);

        lbl_username.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_username.setForeground(new java.awt.Color(255, 0, 0));
        lbl_username.setText("Please Enter Your UserName For Confirmation");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.ipady = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(50, 50, 0, 0);
        getContentPane().add(lbl_username, gridBagConstraints);

        txt_username.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txt_username.setForeground(new java.awt.Color(255, 0, 51));
        txt_username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txt_usernameMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 116;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(50, 30, 0, 0);
        getContentPane().add(txt_username, gridBagConstraints);

        btn_cancel.setBackground(new java.awt.Color(255, 51, 0));
        btn_cancel.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        btn_cancel.setForeground(new java.awt.Color(0, 0, 0));
        btn_cancel.setText("CANCEL");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 39;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(60, 290, 0, 0);
        getContentPane().add(btn_cancel, gridBagConstraints);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\seniy\\OneDrive\\Pictures\\Wallpapers\\526.jpg")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.ipadx = -1750;
        gridBagConstraints.ipady = -1200;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 2);
        getContentPane().add(jLabel2, gridBagConstraints);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
      
         this.setVisible(false);
        new CANCEL().setVisible(true);
        
                 try {
        Connection conn = DBticketbooking.ConnecrDb();

        // Create a statement
        PreparedStatement pstmt = conn.prepareStatement("DELETE FROM movie WHERE name = ?");

       
        pstmt.setString(1, txt_username.getText());

        
        int rowsAffected = pstmt.executeUpdate();

        // Print how many rows were deleted
        System.out.println(rowsAffected + " row(s) deleted.");

    } catch (SQLException e) {
        // Print any SQL exceptions that occur
        System.out.println(e.getMessage());
    }
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void txt_usernameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_usernameMouseReleased
            String nameToDelete = txt_username.getText();

        if (nameToDelete == null || nameToDelete.trim().isEmpty()) {
            // Show an error message
            JOptionPane.showMessageDialog(null, "Please enter a name.");
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameMouseReleased

    }   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cancellation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
