/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library;

import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ABHIRAMI
 */
public class managestudents extends javax.swing.JFrame {

    /**
     * Creates new form managestudents
     */
    public managestudents() {
        initComponents();
        resetData();
        setPersonTableData();
    }

   private int s_id;

private void resetData(){
     n.setText("");
     br.getSelectedItem().toString();
     bt.setText("");
    
    }
    
   public static Connection myConnection(){
    Connection con = null;
    try{
        Class.forName("com.mysql.jdbc.Driver");
        String connectionUrl="jdbc:mysql://localhost:3306/library?"+"user=root&&password=";
        con=DriverManager.getConnection(connectionUrl);
        }   catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
}
      
      
   public static int okcancel(String theMessage){
       int result = JOptionPane.showConfirmDialog((Component)null, theMessage,"alert",JOptionPane.OK_CANCEL_OPTION);
        return result;
    }

   private void setPersonTableData(){

    Connection con = myConnection();

       try{

           PreparedStatement prest;

           String sql ="select * from newstudent";

           prest= con.prepareStatement(sql);

           ResultSet rs = prest.executeQuery(sql);

           while(rs.next()){

                   String id  = String.valueOf(rs.getInt("std_id"));

                   String nm = rs.getString("sname");

                   String bch = rs.getString("sbranch");

                  String bct = rs.getString("sbatch");
                 // String y  = String.valueOf(rs.getInt("byear"));
            

                  String tbData[]={id,nm,bch,bct};

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

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        n = new app.bolivia.swing.JCTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        bt = new app.bolivia.swing.JCTextField();
        jLabel2 = new javax.swing.JLabel();
        br = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rSTableMetro1 = new rojeru_san.complementos.RSTableMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 204, 204));
        jLabel3.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel3.setText(" Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 112, -1));

        jLabel4.setBackground(new java.awt.Color(255, 204, 204));
        jLabel4.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel4.setText("Branch");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 130, 30));

        jLabel5.setBackground(new java.awt.Color(255, 204, 204));
        jLabel5.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel5.setText("Batch");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 140, -1));

        n.setFont(new java.awt.Font("Sylfaen", 3, 14)); // NOI18N
        n.setPlaceholder("Enter name...");
        n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nActionPerformed(evt);
            }
        });
        jPanel1.add(n, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 210, 30));

        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jButton2.setText("ADD");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 90, 30));

        jButton3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 490, 90, 30));

        bt.setFont(new java.awt.Font("Sylfaen", 3, 14)); // NOI18N
        bt.setPlaceholder("Enter batch...");
        jPanel1.add(bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 210, 30));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Sylfaen", 3, 24)); // NOI18N
        jLabel2.setText("STUDENT DETAILS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 360, -1));

        br.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        br.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MCA", "BTech", "Food and Technology", "Civil", "IMCA", "BSC", "BBA", "MBA", "MCom", "BCom", "BA", "MSC", " " }));
        jPanel1.add(br, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 302, 210, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 700));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(java.awt.Color.red);
        jLabel1.setFont(new java.awt.Font("Sylfaen", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("MANAGE LIBRARIANS");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 460, -1));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 390, 10));

        rSTableMetro1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "s_id", "sname", "sbranch", "sbatch"
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

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 600, 260));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 680, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        new admin().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Connection con = myConnection();
        try{
            String name = n.getText();
            String batch = br.getSelectedItem().toString();
            String branch = bt.getText();
            PreparedStatement prest;
            String lib = "INSERT INTO newstudent(sname,sbatch,sbranch) VALUES('"+name+"','"+batch+"','"+branch+"') ";
            prest = con.prepareStatement(lib);

            int count = prest.executeUpdate();
            if (count>0)
            {
                int i = okcancel("Student has been added.");
                System.out.println("ret" +i);
                dispose();
                new managestudents().setVisible(true);
                con.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(newbook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Connection con = myConnection();

        if(s_id!=0){
            try{
                PreparedStatement prest;

                String sql ="delete from newstudent where std_id="+s_id;

                prest= con.prepareStatement(sql);

                prest.execute(sql);

                new managelib().setVisible(true);

                dispose();

                con.close();

                resetData();

            }       catch (SQLException ex) {
                Logger.getLogger(managebooks.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void rSTableMetro1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSTableMetro1MouseClicked
        // TODO add your handling code here:

        s_id=Integer.parseInt(rSTableMetro1.getValueAt(rSTableMetro1.getSelectedRow(),0).toString());

        //System.out.println(id);

        Connection con = myConnection();

        try{

            PreparedStatement prest;

            String sql ="select * from newstudent where std_id="+s_id;

            prest= con.prepareStatement(sql);

            ResultSet rs = prest.executeQuery(sql);// PreparedStatement object’s executeQuery () method is called to execute the SQL SELECT statement, returning a ResultSet into rs.

            while(rs.next()){

                n.setText(rs.getString(2));// Retrieves value of the second column in the current row, which is the username field

                br.getSelectedItem().toString();
                bt.setText(rs.getString(4));

                

            }

            rs.close();

            prest.close();

        } catch (SQLException ex) {

            Logger.getLogger(managebooks.class.getName()).log(Level.SEVERE, null, ex);

        }
    }//GEN-LAST:event_rSTableMetro1MouseClicked

    private void nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nActionPerformed

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
            java.util.logging.Logger.getLogger(managestudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(managestudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(managestudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(managestudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new managestudents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> br;
    private app.bolivia.swing.JCTextField bt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private app.bolivia.swing.JCTextField n;
    private rojeru_san.complementos.RSTableMetro rSTableMetro1;
    // End of variables declaration//GEN-END:variables
}
