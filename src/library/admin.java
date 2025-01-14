/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library;

import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import java.sql.PreparedStatement;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author install
 */
public class admin extends javax.swing.JFrame {

    /**
     * Creates new form admin
     */
    Color mouseEnterColor = new Color(0, 0, 0);
    Color mouseExitColor = new Color(51, 51, 51);

    public admin() {
        initComponents();
        showPieChart();
        setBookTableData();
        setStudentTableData();
        nbData();
        nsData();
        niData();
    }
    
                                  


    public void showPieChart() {

        //create dataset
        //create dataset 
        DefaultPieDataset barDataset = new DefaultPieDataset();
        //explain

        barDataset.setValue("IPhone 5s", new Double(20));
        barDataset.setValue("SamSung Grand", new Double(20));
        barDataset.setValue("MotoG", new Double(40));
        barDataset.setValue("Nokia Lumia", new Double(10));

        //create chart
        JFreeChart piechart = ChartFactory.createPieChart("mobile sales", barDataset, false, true, false);
        PiePlot piePlot = (PiePlot) piechart.getPlot();

        //changing pie chart blocks colors
        piePlot.setSectionPaint("IPhone 5s", new Color(255, 255, 102));
        piePlot.setSectionPaint("SamSung Grand", new Color(102, 255, 102));
        piePlot.setSectionPaint("MotoG", new Color(255, 102, 153));
        piePlot.setSectionPaint("Nokia Lumia", new Color(0, 204, 204));

        piePlot.setBackgroundPaint(Color.white);

        //create chartPanel to display chart(graph)
        ChartPanel barChartPanel = new ChartPanel(piechart);
        p.removeAll();
        p.add(barChartPanel, BorderLayout.CENTER);
        p.validate();
    }

    public static Connection myConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String connectionUrl = "jdbc:mysql://localhost:3306/library?" + "user=root&&password=";
            con = DriverManager.getConnection(connectionUrl);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
    private void nbData(){
         Connection con = myConnection();

        try {

            java.sql.PreparedStatement prest;

            String sql = "select count(*) from addbook";

            prest = con.prepareStatement(sql);

            ResultSet rs = prest.executeQuery(sql);

            rs.next();
            int count = rs.getInt(1);
            System.out.println("ret:" + count);

               

                    // bid.setText(String.valueOf(rs.getInt("b_id")));//
                
                    nb.setText(String.valueOf(count));
        }
         catch (SQLException ex) {
            Logger.getLogger(issuebook.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    
    private void nsData(){
         Connection con = myConnection();

        try {

            java.sql.PreparedStatement prest;

            String sql = "select count(*) from newstudent";

            prest = con.prepareStatement(sql);

            ResultSet rs = prest.executeQuery(sql);

            rs.next();
            int count = rs.getInt(1);
            System.out.println("ret:" + count);

               

                    // bid.setText(String.valueOf(rs.getInt("b_id")));//
                
                    ns.setText(String.valueOf(count));
        }
         catch (SQLException ex) {
            Logger.getLogger(issuebook.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    private void niData(){
         Connection con = myConnection();

        try {

            java.sql.PreparedStatement prest;

            String sql = "select count(*) from issue";

            prest = con.prepareStatement(sql);

            ResultSet rs = prest.executeQuery(sql);

            rs.next();
            int count = rs.getInt(1);
            System.out.println("ret:" + count);

               

                    // bid.setText(String.valueOf(rs.getInt("b_id")));//
                
                    ni.setText(String.valueOf(count));
        }
         catch (SQLException ex) {
            Logger.getLogger(issuebook.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 

    private void setStudentTableData() {

        Connection con = myConnection();

        try {

            PreparedStatement prest;

            String sql = "select * from newstudent";

            prest = con.prepareStatement(sql);

            ResultSet rs = prest.executeQuery(sql);

            while (rs.next()) {

                String id = String.valueOf(rs.getInt("std_id"));

                String nm = rs.getString("sname");

                String bch = rs.getString("sbranch");

                String bct = rs.getString("sbatch");
                // String y  = String.valueOf(rs.getInt("byear"));

                String tbData1[] = {id, nm, bch, bct};

                DefaultTableModel tblModel1 = (DefaultTableModel) rSTableMetro3.getModel();

                tblModel1.addRow(tbData1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(managestudents.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void setBookTableData() {

        Connection con = myConnection();

        try {

            java.sql.PreparedStatement prest;

            String sql = "select * from addbook";

            prest = con.prepareStatement(sql);

            ResultSet rs = prest.executeQuery(sql);

            while (rs.next()) {

                String id = String.valueOf(rs.getInt("s_id"));

                String fn = rs.getString("bname");

                String mn = rs.getString("bauthor");

                String st = rs.getString("bcategory");
                String y = String.valueOf(rs.getInt("byear"));

                String tbData[] = {id, fn, mn, st, y};

                DefaultTableModel tblModel = (DefaultTableModel) rSTableMetro1.getModel();

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

        jPanel5 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        ni = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        ns = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        nb = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        p = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rSTableMetro1 = new rojeru_san.complementos.RSTableMetro();
        jScrollPane3 = new javax.swing.JScrollPane();
        rSTableMetro3 = new rojeru_san.complementos.RSTableMetro();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        p3 = new javax.swing.JPanel();
        l2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        p7 = new javax.swing.JPanel();
        l7 = new javax.swing.JLabel();
        p9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        p8 = new javax.swing.JPanel();
        l8 = new javax.swing.JLabel();
        p10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBorder(javax.swing.BorderFactory.createMatteBorder(20, 0, 0, 0, new java.awt.Color(255, 0, 0)));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ni.setBackground(new java.awt.Color(102, 102, 102));
        ni.setFont(new java.awt.Font("Segoe UI Black", 0, 50)); // NOI18N
        ni.setForeground(new java.awt.Color(102, 102, 102));
        ni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/icons8_Book_26px.png"))); // NOI18N
        ni.setText("0");
        ni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                niMouseClicked(evt);
            }
        });
        jPanel13.add(ni, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 100, 50));

        jPanel5.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 180, 130));

        jPanel11.setBorder(javax.swing.BorderFactory.createMatteBorder(20, 0, 0, 0, new java.awt.Color(255, 0, 0)));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ns.setBackground(new java.awt.Color(102, 102, 102));
        ns.setFont(new java.awt.Font("Segoe UI Black", 0, 50)); // NOI18N
        ns.setForeground(new java.awt.Color(102, 102, 102));
        ns.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/icons8_Conference_26px.png"))); // NOI18N
        ns.setText("0");
        ns.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nsMouseClicked(evt);
            }
        });
        jPanel11.add(ns, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 100, 50));

        jPanel5.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 180, 130));

        jLabel11.setBackground(new java.awt.Color(102, 102, 102));
        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Issued Books");
        jLabel11.setToolTipText("");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 160, -1));

        jPanel12.setBorder(javax.swing.BorderFactory.createMatteBorder(20, 0, 0, 0, new java.awt.Color(255, 0, 0)));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nb.setBackground(new java.awt.Color(102, 102, 102));
        nb.setFont(new java.awt.Font("Segoe UI Black", 0, 50)); // NOI18N
        nb.setForeground(new java.awt.Color(102, 102, 102));
        nb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/icons8_Book_Shelf_50px.png"))); // NOI18N
        nb.setText("0");
        nb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nbMouseClicked(evt);
            }
        });
        jPanel12.add(nb, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 100, 50));

        jPanel5.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 180, 130));

        jLabel14.setBackground(new java.awt.Color(102, 102, 102));
        jLabel14.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel14.setText("Book Details");
        jLabel14.setToolTipText("");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 160, -1));

        jLabel15.setBackground(new java.awt.Color(102, 102, 102));
        jLabel15.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("No. Of Students");
        jLabel15.setToolTipText("");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 160, -1));

        jLabel17.setBackground(new java.awt.Color(102, 102, 102));
        jLabel17.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("No. Of Books");
        jLabel17.setToolTipText("");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 160, -1));

        jLabel16.setBackground(new java.awt.Color(102, 102, 102));
        jLabel16.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel16.setText("Students Details");
        jLabel16.setToolTipText("");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 160, -1));

        p.setLayout(new java.awt.BorderLayout());
        jPanel5.add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, 280, 270));

        rSTableMetro1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "b_id", "title", "author", "category", "year"
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

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 510, 140));

        rSTableMetro3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "s_id", "sname", "sbranch", "sbatch"
            }
        ));
        rSTableMetro3.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        rSTableMetro3.setFuenteFilas(new java.awt.Font("Yu Gothic Medium", 3, 12)); // NOI18N
        rSTableMetro3.setFuenteFilasSelect(new java.awt.Font("Yu Gothic Medium", 3, 12)); // NOI18N
        rSTableMetro3.setFuenteHead(new java.awt.Font("Yu Gothic Medium", 3, 12)); // NOI18N
        rSTableMetro3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSTableMetro3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(rSTableMetro3);

        jPanel5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 510, 150));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 870, 830));

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/icons8_menu_48px_1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 70));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p3.setBackground(new java.awt.Color(51, 51, 255));
        p3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p3MouseExited(evt);
            }
        });
        p3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l2.setBackground(new java.awt.Color(255, 255, 255));
        l2.setFont(new java.awt.Font("SimSun", 3, 14)); // NOI18N
        l2.setForeground(new java.awt.Color(255, 255, 255));
        l2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/icons8_Exit_26px_2.png"))); // NOI18N
        l2.setText("Log Out");
        l2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l2MouseEntered(evt);
            }
        });
        p3.add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, -1));

        jPanel2.add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 210, 40));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("SimSun", 2, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Features");
        jLabel3.setToolTipText("");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 170, -1));

        jPanel4.setBackground(new java.awt.Color(232, 39, 39));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("SimSun", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/home_24px.png"))); // NOI18N
        jLabel4.setText("Dashboard");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 170, 30));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 210, 40));

        p7.setBackground(new java.awt.Color(51, 51, 51));
        p7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p7MouseExited(evt);
            }
        });
        p7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l7.setBackground(new java.awt.Color(255, 255, 255));
        l7.setFont(new java.awt.Font("SimSun", 3, 14)); // NOI18N
        l7.setForeground(new java.awt.Color(255, 255, 255));
        l7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/icons8_Read_Online_26px.png"))); // NOI18N
        l7.setText("Manage Librarians");
        l7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l7MouseExited(evt);
            }
        });
        p7.add(l7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 210, -1));

        jPanel2.add(p7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 210, 40));

        p9.setBackground(new java.awt.Color(51, 51, 51));
        p9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p9MouseExited(evt);
            }
        });
        p9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("SimSun", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/icons8_Books_26px.png"))); // NOI18N
        jLabel9.setText("Manage Books");
        p9.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, -1));

        jPanel2.add(p9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 210, 40));

        jPanel6.setBackground(new java.awt.Color(232, 39, 39));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("SimSun", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/home_24px.png"))); // NOI18N
        jLabel6.setText("Dashboard");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, -1));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 210, 40));

        p8.setBackground(new java.awt.Color(51, 51, 51));
        p8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p8MouseExited(evt);
            }
        });
        p8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l8.setBackground(new java.awt.Color(153, 153, 153));
        l8.setFont(new java.awt.Font("SimSun", 3, 14)); // NOI18N
        l8.setForeground(new java.awt.Color(255, 255, 255));
        l8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/icons8_People_50px.png"))); // NOI18N
        l8.setText("Manage Students");
        l8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l8MouseExited(evt);
            }
        });
        p8.add(l8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 200, 30));

        jPanel2.add(p8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 210, 40));

        p10.setBackground(new java.awt.Color(51, 51, 51));
        p10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p10MouseExited(evt);
            }
        });
        p10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("SimSun", 3, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/icons8_Book_Shelf_50px.png"))); // NOI18N
        jLabel10.setText("View Records");
        p10.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 30));

        jPanel2.add(p10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 210, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 230, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void l7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l7MouseClicked
        // TODO add your handling code here:
        managelib lib = new managelib();
        lib.setVisible(true);
        dispose();

    }//GEN-LAST:event_l7MouseClicked

    private void l8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l8MouseClicked
        // TODO add your handling code here:
        managestudents stud = new managestudents();
        stud.setVisible(true);
        dispose();


    }//GEN-LAST:event_l8MouseClicked

    private void p9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p9MouseClicked
        // TODO add your handling code here:
        managebooks book = new managebooks();
        book.setVisible(true);
        dispose();
    }//GEN-LAST:event_p9MouseClicked

    private void p10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p10MouseClicked
        // TODO add your handling code here:
        viewrecords view = new viewrecords();
        view.setVisible(true);
        dispose();
    }//GEN-LAST:event_p10MouseClicked

    private void l2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l2MouseClicked
        // TODO add your handling code here:
        dispose();
        login l = new login();
        l.show();
    }//GEN-LAST:event_l2MouseClicked

    private void rSTableMetro3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSTableMetro3MouseClicked
        // TODO add your handling code here:

        /*     s_id=Integer.parseInt(rSTableMetro1.getValueAt(rSTableMetro1.getSelectedRow(),0).toString());

        //System.out.println(id);

        Connection con = myConnection();

        try{

            PreparedStatement prest;

            String sql ="select * from newstudent where s_id="+s_id;

            prest= con.prepareStatement(sql);

            ResultSet rs = prest.executeQuery(sql);// PreparedStatement object’s executeQuery () method is called to execute the SQL SELECT statement, returning a ResultSet into rs.

            while(rs.next()){

                n.setText(rs.getString(2));// Retrieves value of the second column in the current row, which is the username field

                br.setText(rs.getString(3));

                bt.setText(rs.getString(4));

            }

            rs.close();

            prest.close();

        } catch (SQLException ex) {

            Logger.getLogger(managebooks.class.getName()).log(Level.SEVERE, null, ex);

        }*/
    }//GEN-LAST:event_rSTableMetro3MouseClicked

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

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
        dispose();
        new admin().setVisible(true);

    }//GEN-LAST:event_jPanel4MouseClicked

    private void l7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l7MouseEntered
        // TODO add your handling code here:

        l7.setBackground(mouseEnterColor);
    }//GEN-LAST:event_l7MouseEntered

    private void l7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l7MouseExited
        // TODO add your handling code here:
        l7.setBackground(mouseExitColor);
    }//GEN-LAST:event_l7MouseExited

    private void l8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l8MouseEntered
        // TODO add your handling code here:
        l8.setBackground(mouseEnterColor);
    }//GEN-LAST:event_l8MouseEntered

    private void l8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l8MouseExited
        // TODO add your handling code here:
        l8.setBackground(mouseExitColor);
    }//GEN-LAST:event_l8MouseExited

    private void p9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p9MouseEntered
        // TODO add your handling code here:
        p9.setBackground(mouseEnterColor);
    }//GEN-LAST:event_p9MouseEntered

    private void p9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p9MouseExited
        // TODO add your handling code here:
        p9.setBackground(mouseExitColor);
    }//GEN-LAST:event_p9MouseExited

    private void p10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p10MouseEntered
        // TODO add your handling code here:
        p10.setBackground(mouseEnterColor);
    }//GEN-LAST:event_p10MouseEntered

    private void p10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p10MouseExited
        p10.setBackground(mouseExitColor);        // TODO add your handling code here:
    }//GEN-LAST:event_p10MouseExited

    private void l2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l2MouseEntered
        l2.setBackground(mouseEnterColor);        // TODO add your handling code here:
    }//GEN-LAST:event_l2MouseEntered

    private void p7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p7MouseClicked
        // TODO add your handling code here:
        managelib lib = new managelib();
        lib.setVisible(true);
        dispose();


    }//GEN-LAST:event_p7MouseClicked

    private void p7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p7MouseEntered
        // TODO add your handling code here:
        p7.setBackground(mouseEnterColor);

    }//GEN-LAST:event_p7MouseEntered

    private void p7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p7MouseExited
        // TODO add your handling code here:
        p7.setBackground(mouseExitColor);
    }//GEN-LAST:event_p7MouseExited

    private void p8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p8MouseClicked
        // TODO add your handling code here:
        managestudents stud = new managestudents();
        stud.setVisible(true);
        dispose();
    }//GEN-LAST:event_p8MouseClicked

    private void p8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p8MouseEntered
        // TODO add your handling code here:
        p8.setBackground(mouseEnterColor);

    }//GEN-LAST:event_p8MouseEntered

    private void p8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p8MouseExited
        // TODO add your handling code here:
        p8.setBackground(mouseExitColor);
    }//GEN-LAST:event_p8MouseExited

    private void p3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p3MouseEntered
        // TODO add your handling code here:
        /*   p3.setBackground(mouseEnterColor);  */
    }//GEN-LAST:event_p3MouseEntered

    private void p3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p3MouseExited
        // TODO add your handling code here:
        /*   p3.setBackground(mouseExitColor);  */
    }//GEN-LAST:event_p3MouseExited

    private void nbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nbMouseClicked
        // TODO add your handling code here:
      
    }//GEN-LAST:event_nbMouseClicked

    private void nsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nsMouseClicked
        // TODO add your handling code here:
         
       
    }//GEN-LAST:event_nsMouseClicked

    private void niMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_niMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_niMouseClicked

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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JLabel nb;
    private javax.swing.JLabel ni;
    private javax.swing.JLabel ns;
    private javax.swing.JPanel p;
    private javax.swing.JPanel p10;
    private javax.swing.JPanel p3;
    private javax.swing.JPanel p7;
    private javax.swing.JPanel p8;
    private javax.swing.JPanel p9;
    private rojeru_san.complementos.RSTableMetro rSTableMetro1;
    private rojeru_san.complementos.RSTableMetro rSTableMetro3;
    // End of variables declaration//GEN-END:variables
}
