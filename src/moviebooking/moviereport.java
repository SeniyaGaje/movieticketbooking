/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package moviebooking;

import moviebooking.DBticketbooking;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class moviereport extends javax.swing.JFrame {
             
    public moviereport() {
        initComponents();
    }
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        btn_report = new javax.swing.JButton();
        btn_register = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(580, 390));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        btn_report.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        btn_report.setText("Generate Movie Report");
        btn_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reportActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 90, 0, 0);
        getContentPane().add(btn_report, gridBagConstraints);

        btn_register.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        btn_register.setText("Genrate register report");
        btn_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 80, 0, 0);
        getContentPane().add(btn_register, gridBagConstraints);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\seniy\\OneDrive\\Pictures\\Project\\cinema-4609877_640.jpg")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = -80;
        gridBagConstraints.ipady = -89;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 1);
        getContentPane().add(jLabel1, gridBagConstraints);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportActionPerformed
        try{ 
            
        JasperDesign jasperdesign = JRXmlLoader.load("C:\\Users\\seniy\\OneDrive\\Documents\\NIBM\\Semester 3\\EAD\\movieticketbooking\\src\\moviebooking\\moviereport.jrxml");

        JRDesignQuery designQuery = new JRDesignQuery();

        designQuery.setText("select * from movie");


        jasperdesign.setQuery(designQuery);
        JasperReport report = JasperCompileManager.compileReport(jasperdesign);
        JasperPrint print = JasperFillManager.fillReport(report, null, DBticketbooking.ConnecrDb());
        JasperViewer.viewReport(print);
                
       }   
       catch(Exception e){
           System.err.println(e.getMessage());
       }
    
    }//GEN-LAST:event_btn_reportActionPerformed

    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerActionPerformed
        
         try{ 
            
        JasperDesign jasperdesign = JRXmlLoader.load("C:\\Users\\seniy\\OneDrive\\Documents\\NIBM\\Semester 3\\EAD\\movieticketbooking\\src\\moviebooking\\register.jrxml");

        JRDesignQuery designQuery = new JRDesignQuery();

        designQuery.setText("select * from register");


        jasperdesign.setQuery(designQuery);
        JasperReport report = JasperCompileManager.compileReport(jasperdesign);
        JasperPrint print = JasperFillManager.fillReport(report, null, DBticketbooking.ConnecrDb());
        JasperViewer.viewReport(print);
                
       }   
       catch(Exception e){
           System.err.println(e.getMessage());
       }
    
// TODO add your handling code here:
    }//GEN-LAST:event_btn_registerActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new moviereport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_register;
    private javax.swing.JButton btn_report;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
