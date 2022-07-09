/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import static library.viewrecords.myConnection;

/**
 *
 * @author install
 */
public class home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public home() {
         initComponents();
         setViewData();
    }
    
    public String loginname;
    public home(String name){
        initComponents();
        this.loginname=name;
        getusername.setText(String.valueOf(loginname));
    }
 private void setViewData(){

    Connection con = myConnection();

       try{

           java.sql.PreparedStatement prest;

           String sql ="select * from issue";

           prest= con.prepareStatement(sql);

           ResultSet rs = prest.executeQuery(sql);

           while(rs.next()){

                   String iid  = String.valueOf(rs.getInt("issue_id"));

                   String fn = rs.getString("bname");

                   String mn = rs.getString("student_name");
//                   SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//                  String  issuefr = rs.getString("sdf.format(i_date)");
//                  String  issueto = rs.getString("sdf.format(d_date)");

                 String issuedate = rs.getString("i_date");
                 String duedate  = rs.getString("d_date");
            

                  String tbData[]={iid,fn,mn,issuedate,duedate};

                 DefaultTableModel tblModel=(DefaultTableModel)rSTableMetro1.getModel();

                 tblModel.addRow(tbData);
          }
            } catch (SQLException ex) {
            Logger.getLogger(managebooks.class.getName()).log(Level.SEVERE, null, ex);
        }
  }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        getusername = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        rSTableMetro1 = new rojeru_san.complementos.RSTableMetro();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        getusername.setBackground(new java.awt.Color(255, 255, 255));
        getusername.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        getusername.setForeground(java.awt.SystemColor.controlLtHighlight);
        getusername.setText("username");
        getContentPane().add(getusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, -1));

        jButton1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/member-add-on-300x300.png"))); // NOI18N
        jButton1.setText("NEW STUDENT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 170, 50));

        jButton2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/New book.png"))); // NOI18N
        jButton2.setText("NEW BOOK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, 50));

        jButton3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/issue book.png"))); // NOI18N
        jButton3.setText("ISSUE BOOK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 130, 50));

        jButton5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/exit.png"))); // NOI18N
        jButton5.setText("LOG OUT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 20, 140, 50));

        jButton4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/return book png.png"))); // NOI18N
        jButton4.setText("RETURN BOOK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, -1, 50));

        rSTableMetro1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Book Name", "Student Name", "Issue Date", "Due Date"
            }
        ));
        rSTableMetro1.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        rSTableMetro1.setFuenteFilas(new java.awt.Font("Yu Gothic Medium", 3, 12)); // NOI18N
        rSTableMetro1.setFuenteFilasSelect(new java.awt.Font("Yu Gothic Medium", 3, 12)); // NOI18N
        rSTableMetro1.setFuenteHead(new java.awt.Font("Yu Gothic Medium", 3, 12)); // NOI18N
        rSTableMetro1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSTableMetro1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(rSTableMetro1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 900, 300));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/home.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
                     dispose();
                    new newstudent(loginname).setVisible(true);    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        dispose();
        login l = new login();
        l.show();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
                 dispose();
                 new newbook().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
                  dispose();
                 new issuebook().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
                 dispose();
                 new returnbook().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void rSTableMetro1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSTableMetro1MouseClicked
        // TODO add your handling code here:

        /*     b_id=Integer.parseInt(rSTableMetro1.getValueAt(rSTableMetro1.getSelectedRow(),0).toString());

        //System.out.println(id);

        Connection con = myConnection();

        try{

            PreparedStatement prest;

            String sql ="select * from addbook where b_id="+b_id;

            prest= con.prepareStatement(sql);

            ResultSet rs = prest.executeQuery(sql);// PreparedStatement object’s executeQuery () method is called to execute the SQL SELECT statement, returning a ResultSet into rs.

            while(rs.next()){

                t.setText(rs.getString(2));// Retrieves value of the second column in the current row, which is the username field

                a.setText(rs.getString(3));

                c.setText(rs.getString(4));

                y.setText(rs.getString(4));

            }

            rs.close();

            prest.close();

        } catch (SQLException ex) {

            Logger.getLogger(managebooks.class.getName()).log(Level.SEVERE, null, ex);

        }*/
    }//GEN-LAST:event_rSTableMetro1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new home().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel getusername;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private rojeru_san.complementos.RSTableMetro rSTableMetro1;
    // End of variables declaration//GEN-END:variables
}