/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.logging.Logger;
import static library.newstudent.okcancel;

/**
 *
 * @author install
 */
public class issuebook extends javax.swing.JFrame {

    private String date;
    private String date1;

    /**
     * Creates new form issue book
     */
    public issuebook() {
        initComponents();
     //   getBookDetails();
       // getStudentDetails();
        
    
    }
     public String loginname;
    public issuebook(String name){
        initComponents();
        this.loginname=name;
    }
    
    
 public static Connection myConnection(){
    Connection con = null;
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String connectionUrl="jdbc:mysql://localhost:3306/library?"+"user=root&&password=";
        con=DriverManager.getConnection(connectionUrl);
        }   catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
}
//  private int book_id;
//  private int student_id;
  
  /*boolean tryParseInt(String value) {  
     try {  
         Integer.parseInt(value);  
         return true;  
      } catch (NumberFormatException e) {  
         return false;  
      }  
}*/
  
 /* int value = -1;
try {
    value = Integer.parseInt(myString);
} catch (NumberFormatException e) {
    // The format was incorrect
}*/
  // book details 
  
 //students detail
 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        by1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        sbt = new javax.swing.JTextField();
        sid = new javax.swing.JTextField();
        sn = new javax.swing.JTextField();
        sbr = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        bid1 = new javax.swing.JTextField();
        bt = new javax.swing.JTextField();
        ba = new javax.swing.JTextField();
        bc = new javax.swing.JTextField();
        by2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        bd = new app.bolivia.swing.JCTextField();
        jLabel22 = new javax.swing.JLabel();
        sd = new app.bolivia.swing.JCTextField();
        jLabel23 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jCTextField3 = new app.bolivia.swing.JCTextField();
        jLabel26 = new javax.swing.JLabel();
        jCTextField4 = new app.bolivia.swing.JCTextField();
        jLabel27 = new javax.swing.JLabel();
        rSDateChooser2 = new rojeru_san.componentes.RSDateChooser();
        jLabel28 = new javax.swing.JLabel();
        I = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        rd = new com.toedter.calendar.JDateChooser();
        id = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(255, 204, 204));
        jLabel8.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel8.setText("Branch               :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 160, -1));

        jLabel10.setBackground(new java.awt.Color(255, 204, 204));
        jLabel10.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel10.setText("Batch                :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 180, -1));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Sylfaen", 3, 24)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/icons8_Student_Registration_100px_2.png"))); // NOI18N
        jLabel11.setText("STUDENT DETAILS");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 330, 90));

        jLabel12.setBackground(new java.awt.Color(255, 204, 204));
        jLabel12.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel12.setText("Student Name    :");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 170, -1));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 200, 2));

        by1.setBackground(new java.awt.Color(255, 204, 204));
        by1.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jPanel2.add(by1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 530, 170, 20));

        jLabel13.setBackground(new java.awt.Color(255, 204, 204));
        jLabel13.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel13.setText("Student id          :");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 180, -1));

        sbt.setFont(new java.awt.Font("SimSun-ExtB", 3, 14)); // NOI18N
        sbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbtActionPerformed(evt);
            }
        });
        jPanel2.add(sbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, 160, 30));

        sid.setFont(new java.awt.Font("SimSun-ExtB", 3, 14)); // NOI18N
        sid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sidActionPerformed(evt);
            }
        });
        jPanel2.add(sid, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 160, 30));

        sn.setFont(new java.awt.Font("SimSun-ExtB", 3, 14)); // NOI18N
        sn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snActionPerformed(evt);
            }
        });
        jPanel2.add(sn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 160, 30));

        sbr.setFont(new java.awt.Font("SimSun-ExtB", 3, 14)); // NOI18N
        sbr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbrActionPerformed(evt);
            }
        });
        jPanel2.add(sbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 160, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 350, 700));

        jPanel5.setBackground(new java.awt.Color(255, 0, 51));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(255, 204, 204));
        jButton3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel14.setBackground(new java.awt.Color(255, 204, 204));
        jLabel14.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel14.setText("Book Year       :");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 140, -1));

        jLabel15.setBackground(new java.awt.Color(255, 204, 204));
        jLabel15.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel15.setText("Book Author    :");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 160, -1));

        jLabel16.setBackground(new java.awt.Color(255, 204, 204));
        jLabel16.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel16.setText("Book category :");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 180, -1));

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Sylfaen", 3, 24)); // NOI18N
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/icons8_Literature_100px_1.png"))); // NOI18N
        jLabel17.setText("BOOK DETAILS");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 310, 90));

        jLabel18.setBackground(new java.awt.Color(255, 204, 204));
        jLabel18.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel18.setText("Book Title        :");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 150, -1));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 200, 2));

        jLabel19.setBackground(new java.awt.Color(255, 204, 204));
        jLabel19.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel19.setText("Book id             :");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 160, -1));

        bid1.setFont(new java.awt.Font("SimSun-ExtB", 3, 14)); // NOI18N
        bid1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bid1ActionPerformed(evt);
            }
        });
        jPanel5.add(bid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 160, 30));

        bt.setFont(new java.awt.Font("SimSun-ExtB", 3, 14)); // NOI18N
        bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActionPerformed(evt);
            }
        });
        jPanel5.add(bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 160, 30));

        ba.setFont(new java.awt.Font("SimSun-ExtB", 3, 14)); // NOI18N
        ba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baActionPerformed(evt);
            }
        });
        jPanel5.add(ba, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 160, 30));

        bc.setFont(new java.awt.Font("SimSun-ExtB", 3, 14)); // NOI18N
        bc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcActionPerformed(evt);
            }
        });
        jPanel5.add(bc, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 160, 30));

        by2.setFont(new java.awt.Font("SimSun-ExtB", 3, 14)); // NOI18N
        by2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                by2ActionPerformed(evt);
            }
        });
        jPanel5.add(by2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 520, 160, 30));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 700));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Sylfaen", 3, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 0, 51));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/icons8_Book_50px_1.png"))); // NOI18N
        jLabel20.setText("BOOK DETAILS");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 360, 90));

        jPanel7.setBackground(new java.awt.Color(255, 0, 51));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 310, 2));

        jLabel21.setBackground(new java.awt.Color(255, 204, 204));
        jLabel21.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel21.setText("Due date   :");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 120, -1));

        bd.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 0, 0)));
        bd.setPlaceholder("book id ..");
        bd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                bdFocusLost(evt);
            }
        });
        bd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdActionPerformed(evt);
            }
        });
        jPanel1.add(bd, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 160, -1));

        jLabel22.setBackground(new java.awt.Color(255, 204, 204));
        jLabel22.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel22.setText("Book id   :");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 130, -1));

        sd.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 0, 0)));
        sd.setPlaceholder("student id ..");
        sd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sdFocusLost(evt);
            }
        });
        sd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sdActionPerformed(evt);
            }
        });
        jPanel1.add(sd, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 170, -1));

        jLabel23.setBackground(new java.awt.Color(255, 204, 204));
        jLabel23.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel23.setText("Student id   :");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 130, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setBackground(new java.awt.Color(0, 0, 0));
        jLabel24.setFont(new java.awt.Font("Sylfaen", 3, 36)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 0, 51));
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/icons8_Book_50px_1.png"))); // NOI18N
        jLabel24.setText("BOOK DETAILS");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 360, 90));

        jPanel8.setBackground(new java.awt.Color(255, 0, 51));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 310, 2));

        jLabel25.setBackground(new java.awt.Color(255, 204, 204));
        jLabel25.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel25.setText("Issue date   :");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 130, -1));

        jCTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 0, 0)));
        jCTextField3.setPlaceholder("book id ..");
        jCTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTextField3ActionPerformed(evt);
            }
        });
        jPanel3.add(jCTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 220, -1));

        jLabel26.setBackground(new java.awt.Color(255, 204, 204));
        jLabel26.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel26.setText("Student id   :");
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 130, -1));

        jCTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 0, 0)));
        jCTextField4.setPlaceholder("student id ..");
        jCTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTextField4ActionPerformed(evt);
            }
        });
        jPanel3.add(jCTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 220, -1));

        jLabel27.setBackground(new java.awt.Color(255, 204, 204));
        jLabel27.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel27.setText("Student id   :");
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 130, -1));

        rSDateChooser2.setBackground(new java.awt.Color(255, 51, 51));
        rSDateChooser2.setColorBackground(new java.awt.Color(255, 51, 51));
        rSDateChooser2.setPlaceholder("issue date");
        jPanel3.add(rSDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, -1, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 390, 700));

        jLabel28.setBackground(new java.awt.Color(255, 204, 204));
        jLabel28.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel28.setText("Issue date   :");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 130, -1));

        I.setFont(new java.awt.Font("Sylfaen", 3, 18)); // NOI18N
        I.setForeground(new java.awt.Color(255, 0, 51));
        I.setText("ISSUE");
        I.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IActionPerformed(evt);
            }
        });
        jPanel1.add(I, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 550, 120, 30));

        jButton1.setText("search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 70, -1));

        jButton2.setText("search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 70, -1));

        rd.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 51)));
        jPanel1.add(rd, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 240, 30));

        id.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 51)));
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 412, 240, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 390, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        dispose();
        new home(loginname).setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void bdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdActionPerformed
        // TODO add your handling code here:
       // getBookDetails();
     //  public void getBookDetails(){
      
       
      
     
     

    }//GEN-LAST:event_bdActionPerformed

    private void sdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sdActionPerformed
        // TODO add your handling code here:
      //  getStudentDetails();
    //  public void getStudentDetails(){
     
     
     
 
    }//GEN-LAST:event_sdActionPerformed

    private void jCTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCTextField3ActionPerformed

    private void jCTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCTextField4ActionPerformed

    private void IActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IActionPerformed
        // TODO add your handling code here:
        Connection con = myConnection();
        try{
            String bid = bd.getText();
            String sid = sd.getText();
            String bookn = bt.getText();
            String student = sn.getText();
            
            
//            String y String ca = id.getText();
//           r = rd.get();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            date = sdf.format(id.getDate());
            date1 = sdf.format(rd.getDate());

            PreparedStatement prest;
            String book = "INSERT INTO issue(book_id,bname,student_id,student_name,i_date,d_date)VALUES('"+bid+"','"+bookn+"','"+sid+"','"+student+"','"+date+"','"+date1+"')";
            prest = con.prepareStatement(book); 
            
            int count = prest.executeUpdate();
            if (count>0)
            {
                int i = okcancel("Book has been added.");
                System.out.println("ret" +i);
                dispose();
                new issuebook().setVisible(true);
                con.close();
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(newbook.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_IActionPerformed

    private void sdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sdFocusLost
        // TODO add your handling code here:
      /*  if(!sd.getText().equals(" ")){
            sdActionPerformed(java.);
        }*/
    }//GEN-LAST:event_sdFocusLost

    private void bdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bdFocusLost
        // TODO add your handling code here:
       /* if(!bd.getText().equals(" ")){
                 getBookDetails();
        }*/
    }//GEN-LAST:event_bdFocusLost

    private void sbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sbtActionPerformed

    private void bid1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bid1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bid1ActionPerformed

    private void btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btActionPerformed

    private void baActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_baActionPerformed

    private void bcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bcActionPerformed

    private void by2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_by2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_by2ActionPerformed

    private void sidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sidActionPerformed

    private void snActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_snActionPerformed

    private void sbrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sbrActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling cConnection con = myConnection();
     Connection con=myConnection();
      
       try {
            PreparedStatement prest;
            int book_id = Integer.parseInt(bd.getText());
             
            String issue ="select * from addbook where b_id= "+book_id;

            prest= con.prepareStatement(issue);
          //  prest.setInt(1,book_id);

            ResultSet rs = prest.executeQuery();// PreparedStatement object’s executeQuery () method is called to execute the SQL SELECT statement, returning a ResultSet into rs.
            
            if (rs.next()) {
                int i = okcancel("Searching...");
                System.out.println("ret:" + i);
            
            while(rs.next()){
                
              // bid.setText(String.valueOf(rs.getInt("b_id")));//
                bid1.setText(rs.getString("b_id"));
                bt.setText(rs.getString("bname"));
                ba.setText(rs.getString("bauthor"));
                bc.setText(rs.getString("bcategory"));
                by2.setText(rs.getString("byear"));
             }
            }
             else {
                int j = okcancel("wrong");
                System.out.println("ret:" + j);
                con.close();
                bd.setText("");
                sd.setText("");
            }
            
            

            rs.close();

            prest.close();
       } catch (SQLException ex) {
            Logger.getLogger(issuebook.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (NumberFormatException e) {
            {
                e.getMessage();  //You can use anyone like printStackTrace() ,getMessage() to handle the Exception
             }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
int student_id = Integer.parseInt(sd.getText());

      
       try {
           Connection con = myConnection();
           PreparedStatement prest1;
            
               
            String issues ="select * from newstudent where s_id="+student_id;
             
            prest1= con.prepareStatement(issues);
           // prest1.setInt(1, student_id);

            ResultSet rs = prest1.executeQuery();// PreparedStatement object’s executeQuery () method is called to execute the SQL SELECT statement, returning a ResultSet into rs.
       
         if (rs.next()) {
                int i = okcancel("Searching...");
                System.out.println("ret:" + i);
                
                // while(rs.next()){
             
               // sid.setText(String.valueOf(rs.getInt("s_id")));// Retrieves value of the second column in the current row, which is the username field
                sid.setText(rs.getString("s_id"));
               sn.setText(rs.getString("sname"));
                sbr.setText(rs.getString("sbranch"));
                sbt.setText(rs.getString("sbatch"));
               // by.setText(rs.getString(6));

             
          // }
            // }
               
//                  String loginname=n.getText();
//                   // new home(loginname).setVisible(true);
//                    dispose();
//                    new home(loginname).setVisible(true);
//                    con.close();
            }
              
//           else if(sd.getText().equals("  ")){
//                  int t = okcancel("Enter any id..");
//                   System.out.println("ret:" + t);
//                   con.close();
//                  bd.setText("");
//                sd.setText("");
//                }
          else {
                int j = okcancel("wrong");
                System.out.println("ret:" + j);
                con.close();
                bd.setText("");
                sd.setText("");
            }
           
//          else{
//               System.out.println("No id exists");
//          }

           /* rs.close();

            prest1.close();*/
       } catch (SQLException ex) {
            Logger.getLogger(issuebook.class.getName()).log(Level.SEVERE, null, ex);
        }
       catch (NumberFormatException e) {
            {
                e.getMessage();  //You can use anyone like printStackTrace() ,getMessage() to handle the Exception
             }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(issuebook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(issuebook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(issuebook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(issuebook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new issuebook().setVisible(true);
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton I;
    private javax.swing.JTextField ba;
    private javax.swing.JTextField bc;
    private app.bolivia.swing.JCTextField bd;
    private javax.swing.JTextField bid1;
    private javax.swing.JTextField bt;
    private javax.swing.JLabel by1;
    private javax.swing.JTextField by2;
    private com.toedter.calendar.JDateChooser id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private app.bolivia.swing.JCTextField jCTextField3;
    private app.bolivia.swing.JCTextField jCTextField4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private rojeru_san.componentes.RSDateChooser rSDateChooser2;
    private com.toedter.calendar.JDateChooser rd;
    private javax.swing.JTextField sbr;
    private javax.swing.JTextField sbt;
    private app.bolivia.swing.JCTextField sd;
    private javax.swing.JTextField sid;
    private javax.swing.JTextField sn;
    // End of variables declaration//GEN-END:variables
}