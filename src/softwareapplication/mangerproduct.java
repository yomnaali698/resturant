/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareapplication;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.DriverManager;

/**
 *
 * @author Firefox
 */
public class mangerproduct extends javax.swing.JFrame {
private final String url="jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=market user=sa;password=1234;";
    /**
     * Creates new form mangerproduct
     */
    public mangerproduct() {
        initComponents();
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
        }catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(this,"Cannot Load JDBC Driver !!!");
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

        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        nameofproduct = new javax.swing.JTextField();
        productid = new javax.swing.JTextField();
        priceofproduct = new javax.swing.JTextField();
        quantityofproduct = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        addproduct = new javax.swing.JButton();
        delectproduct = new javax.swing.JButton();
        clearproduct = new javax.swing.JButton();
        updataproduct = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel24 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        loginbutton = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        updatabutton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel9.setBackground(new java.awt.Color(255, 102, 0));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setForeground(new java.awt.Color(255, 255, 255));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 102, 0));
        jLabel18.setText("PRODUCTS LIST");
        jLabel18.setToolTipText("");

        nameofproduct.setBackground(new java.awt.Color(255, 255, 255));
        nameofproduct.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        nameofproduct.setForeground(new java.awt.Color(255, 102, 51));
        nameofproduct.setToolTipText("");
        nameofproduct.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 102, 51), new java.awt.Color(255, 102, 0)));

        productid.setBackground(new java.awt.Color(255, 255, 255));
        productid.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        productid.setForeground(new java.awt.Color(255, 102, 51));
        productid.setToolTipText("");
        productid.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 102, 51), new java.awt.Color(255, 102, 0)));

        priceofproduct.setBackground(new java.awt.Color(255, 255, 255));
        priceofproduct.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        priceofproduct.setForeground(new java.awt.Color(255, 102, 51));
        priceofproduct.setToolTipText("");
        priceofproduct.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 102, 51), new java.awt.Color(255, 102, 0)));

        quantityofproduct.setBackground(new java.awt.Color(255, 255, 255));
        quantityofproduct.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        quantityofproduct.setForeground(new java.awt.Color(255, 102, 51));
        quantityofproduct.setToolTipText("");
        quantityofproduct.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 102, 51), new java.awt.Color(255, 102, 0)));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 102, 0));
        jLabel19.setText("PRODID");
        jLabel19.setToolTipText("");

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 102, 0));
        jLabel20.setText("NAME");
        jLabel20.setToolTipText("");

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 102, 0));
        jLabel21.setText("CATEGORY");
        jLabel21.setToolTipText("");

        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 102, 0));
        jLabel22.setText("QUANTITY");
        jLabel22.setToolTipText("");

        jLabel23.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 102, 0));
        jLabel23.setText("PRICE");
        jLabel23.setToolTipText("");

        jComboBox2.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(255, 102, 51));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MEAT", "VAGETABLES", "FRUITS", "PILLS", " ", " " }));
        jComboBox2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 102, 0), new java.awt.Color(255, 102, 0)));

        addproduct.setBackground(new java.awt.Color(255, 102, 0));
        addproduct.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        addproduct.setForeground(new java.awt.Color(255, 255, 255));
        addproduct.setText("Add");
        addproduct.setToolTipText("");
        addproduct.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 102, 0), new java.awt.Color(255, 102, 0)));
        addproduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addproductActionPerformed(evt);
            }
        });

        delectproduct.setBackground(new java.awt.Color(255, 102, 0));
        delectproduct.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        delectproduct.setForeground(new java.awt.Color(255, 255, 255));
        delectproduct.setText("Delete");
        delectproduct.setToolTipText("");
        delectproduct.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 102, 0), new java.awt.Color(255, 102, 0)));
        delectproduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delectproductActionPerformed(evt);
            }
        });

        clearproduct.setBackground(new java.awt.Color(255, 102, 0));
        clearproduct.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        clearproduct.setForeground(new java.awt.Color(255, 255, 255));
        clearproduct.setText("Clear");
        clearproduct.setToolTipText("");
        clearproduct.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 102, 0), new java.awt.Color(255, 102, 0)));
        clearproduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearproductActionPerformed(evt);
            }
        });

        updataproduct.setBackground(new java.awt.Color(255, 102, 0));
        updataproduct.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        updataproduct.setForeground(new java.awt.Color(255, 255, 255));
        updataproduct.setText("Update");
        updataproduct.setToolTipText("");
        updataproduct.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 102, 0), new java.awt.Color(255, 102, 0)));
        updataproduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updataproductActionPerformed(evt);
            }
        });

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 102, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "QUANTITY", "PRICE", "CATEGORY"
            }
        ));
        jTable1.setRowHeight(24);
        jTable1.setSurrendersFocusOnKeystroke(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 102, 0));
        jLabel24.setText("MANAGE PRODUCTS");
        jLabel24.setToolTipText("");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/softwareapplication/15107896.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/softwareapplication/15107896.png"))); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(addproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(updataproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)
                        .addComponent(delectproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(clearproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel19))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel20)))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(productid, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameofproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(jLabel22)
                        .addGap(39, 39, 39)
                        .addComponent(quantityofproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(444, 444, 444)
                        .addComponent(jLabel23)
                        .addGap(49, 49, 49)
                        .addComponent(priceofproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(jLabel24)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addGap(27, 27, 27)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel19)
                            .addComponent(productid, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)
                            .addComponent(quantityofproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel20))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel23)
                                    .addComponent(nameofproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(priceofproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updataproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delectproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clearproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel18)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/softwareapplication/flowers_12771895 (3).png"))); // NOI18N

        jLabel41.setBackground(new java.awt.Color(255, 102, 0));
        jLabel41.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("MANAGE PRODUCTS");
        jLabel41.setToolTipText("");

        loginbutton.setBackground(new java.awt.Color(255, 102, 0));
        loginbutton.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        loginbutton.setForeground(new java.awt.Color(255, 255, 255));
        loginbutton.setText("Login");
        loginbutton.setToolTipText("");
        loginbutton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                loginbuttonMouseDragged(evt);
            }
        });
        loginbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginbuttonMouseClicked(evt);
            }
        });

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/softwareapplication/spider-plant_5075931.png"))); // NOI18N

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/softwareapplication/spider-plant_5075931.png"))); // NOI18N

        jLabel46.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("X");
        jLabel46.setToolTipText("");

        jLabel47.setBackground(new java.awt.Color(255, 102, 0));
        jLabel47.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("WELCOME");
        jLabel47.setToolTipText("");

        updatabutton.setBackground(new java.awt.Color(255, 102, 0));
        updatabutton.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        updatabutton.setForeground(new java.awt.Color(255, 255, 255));
        updatabutton.setText("updata");
        updatabutton.setToolTipText("");
        updatabutton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                updatabuttonMouseDragged(evt);
            }
        });
        updatabutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updatabuttonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(updatabutton)
                                    .addComponent(loginbutton))
                                .addGap(39, 39, 39))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel41)
                                    .addComponent(jLabel10))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)))
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(89, 89, 89)
                    .addComponent(jLabel47)
                    .addContainerGap(1051, Short.MAX_VALUE)))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginbutton)
                .addGap(56, 56, 56)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updatabutton)
                .addGap(39, 39, 39))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(174, 174, 174)
                    .addComponent(jLabel47)
                    .addContainerGap(564, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addproductActionPerformed

        String prodid=productid.getText();
        String name=nameofproduct.getText();
        int quntity=Integer.parseInt(quantityofproduct.getText());
        int price=Integer.parseInt(priceofproduct.getText());
        String catgare=jComboBox2.getSelectedItem().toString();
        //selectoneloginlabel.setText(catgare);
        Connection con = null;
        Statement stmt = null;
        ResultSet result = null;

        if(productid.getText().isEmpty()||nameofproduct.getText().isEmpty()||quantityofproduct.getText().isEmpty()||priceofproduct.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Missing Information!!!");
        }else{
            try{
                con = DriverManager.getConnection(url);
                stmt = con.createStatement();
                String query = "INSERT INTO seller VALUES ('"+prodid+"','"+name+"'"
                + ",'"+quntity+"','"+price+"'"+",'"+catgare+"')";
                int affectsRows = stmt.executeUpdate(query);
                if(affectsRows == 1)
                {
                    JOptionPane.showMessageDialog(this, "Successful Registration !!!");
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Error !!!");
                }

            }catch(Exception ex)
            {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
            finally
            {
                if(con !=null ){ try{ con.close(); }catch(Exception ex){}}
                if(stmt !=null ){ try{ stmt.close(); }catch(Exception ex){}}
            }
        }
    }//GEN-LAST:event_addproductActionPerformed

    private void delectproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delectproductActionPerformed
        Connection con = null;
        Statement stmt = null;
        String prodid=productid.getText();

        String name=nameofproduct.getText();
        int quntity=Integer.parseInt(quantityofproduct.getText());
        int price=Integer.parseInt(priceofproduct.getText());
        String catgare=jComboBox2.getSelectedItem().toString();
        if(productid.getText().isEmpty()||nameofproduct.getText().isEmpty()||quantityofproduct.getText().isEmpty()||priceofproduct.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter the Missing you need to Delete!!!");
            return;

        }

        else{
            try{
                con = DriverManager.getConnection(url);
                stmt = con.createStatement();
                String quary="DELETE FROM manager WHERE ID like'" +productid+"'";
                //name of table is manager so he remove only the row that have this ID
                int affectrow= stmt.executeUpdate(quary);

                if(affectrow ==1){
                    JOptionPane.showMessageDialog(this, "Succesfull delete!!1");
                }else{
                    JOptionPane.showMessageDialog(this, "invaild id insert!!!");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,e.getMessage());

            }
            finally{
                {
                    if(con !=null ){ try{ con.close(); }catch(Exception ex){}}
                    if(stmt !=null ){ try{ stmt.close(); }catch(Exception ex){}}
                }
            }

        }
    }//GEN-LAST:event_delectproductActionPerformed

    private void clearproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearproductActionPerformed
        productid.setText(" ");
        nameofproduct.setText(" ");
        quantityofproduct.setText(" ");
        priceofproduct.setText(" ");
    }//GEN-LAST:event_clearproductActionPerformed

    private void updataproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updataproductActionPerformed

    }//GEN-LAST:event_updataproductActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked

    private void loginbuttonMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbuttonMouseDragged
      
    }//GEN-LAST:event_loginbuttonMouseDragged

    private void updatabuttonMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatabuttonMouseDragged
        
    }//GEN-LAST:event_updatabuttonMouseDragged

    private void loginbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbuttonMouseClicked
         new Login().setVisible(true);
      this.dispose();
    }//GEN-LAST:event_loginbuttonMouseClicked

    private void updatabuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatabuttonMouseClicked
      new updataadmin().setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_updatabuttonMouseClicked

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
            java.util.logging.Logger.getLogger(mangerproduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mangerproduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mangerproduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mangerproduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mangerproduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addproduct;
    private javax.swing.JButton clearproduct;
    private javax.swing.JButton delectproduct;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel loginbutton;
    private javax.swing.JTextField nameofproduct;
    private javax.swing.JTextField priceofproduct;
    private javax.swing.JTextField productid;
    private javax.swing.JTextField quantityofproduct;
    private javax.swing.JLabel updatabutton;
    private javax.swing.JButton updataproduct;
    // End of variables declaration//GEN-END:variables
}
