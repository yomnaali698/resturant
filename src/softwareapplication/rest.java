/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareapplication;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JTable;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
/**
 *
 * @author Firefox
 */
public class rest extends javax.swing.JFrame {
private static final String username="root";
private static final String password="1234";
private static final String dataConn="jdbc:mysql://localhost:3306/resturant?useSSL=false";
Connection sqlConn =null;
PreparedStatement pst=null;
ResultSet rs=null;
int i,id,q,deleteItem;
    /**
     * Creates new form rest
     */

    public rest() {
        initComponents();
    }
public void upDateDB(){
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            sqlConn =DriverManager.getConnection(dataConn,username,password);
            pst =sqlConn.prepareStatement("select * from  rest ");
            rs =pst.executeQuery();
            ResultSetMetaData stData =rs.getMetaData();
            q= stData.getColumnCount();
           // DefaultTableModel RecordTable=(DefaultTableModel)jTable1.getModel(); 
                  //  RecordTable.setRowCount(0);
                   while(rs.next()){
                        Vector ColumnData = new Vector();
                        for(i=1;i<=q;i++){
                         ColumnData.add(rs.getString("id"));
                         ColumnData.add(rs.getString("cusname"));
                         ColumnData.add(rs.getInt("cusphone"));
                         
                         ColumnData.add(rs.getString("cuspayment"));
                         ColumnData.add(rs.getString("cusfav"));
                         ColumnData.add(rs.getString("password"));
                           ColumnData.add(rs.getString("confirmpass"));
                        }
                       // RecordTable.addRow(ColumnData);
                    }
        }
        catch(Exception ex){
          JOptionPane.showMessageDialog(null,ex);
            
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

        jPanel3 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        usernameseller = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        addinseller = new javax.swing.JButton();
        clearbuttonseller = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        ageseller = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        ageseller1 = new javax.swing.JTextField();
        ageseller2 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        passwordseller = new javax.swing.JTextField();
        confirmpassword1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        loginbutton1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setForeground(new java.awt.Color(255, 255, 255));

        usernameseller.setBackground(new java.awt.Color(255, 255, 255));
        usernameseller.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        usernameseller.setForeground(new java.awt.Color(255, 102, 51));
        usernameseller.setToolTipText("");
        usernameseller.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 0), new java.awt.Color(255, 153, 0)));

        jLabel25.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 153, 0));
        jLabel25.setText("User name");
        jLabel25.setToolTipText("");

        jLabel47.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 153, 0));
        jLabel47.setText("Password");
        jLabel47.setToolTipText("");

        jLabel49.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 153, 0));
        jLabel49.setText("Phone Number");
        jLabel49.setToolTipText("");

        addinseller.setBackground(new java.awt.Color(255, 153, 0));
        addinseller.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        addinseller.setForeground(new java.awt.Color(255, 255, 255));
        addinseller.setText("Add");
        addinseller.setToolTipText("");
        addinseller.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 0), new java.awt.Color(255, 153, 0)));
        addinseller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addinsellerActionPerformed(evt);
            }
        });

        clearbuttonseller.setBackground(new java.awt.Color(255, 153, 0));
        clearbuttonseller.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        clearbuttonseller.setForeground(new java.awt.Color(255, 255, 255));
        clearbuttonseller.setText("Clear");
        clearbuttonseller.setToolTipText("");
        clearbuttonseller.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 0), new java.awt.Color(255, 153, 0)));
        clearbuttonseller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbuttonsellerActionPerformed(evt);
            }
        });

        jLabel50.setBackground(new java.awt.Color(255, 255, 255));
        jLabel50.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 153, 0));
        jLabel50.setText("MANGE CUSTMER");
        jLabel50.setToolTipText("");

        jLabel52.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 153, 0));
        jLabel52.setText("payment");
        jLabel52.setToolTipText("");

        ageseller.setBackground(new java.awt.Color(255, 255, 255));
        ageseller.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ageseller.setForeground(new java.awt.Color(255, 153, 0));
        ageseller.setToolTipText("");
        ageseller.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 0), new java.awt.Color(255, 153, 0)));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/softwareapplication/pizza (4).png"))); // NOI18N

        ageseller1.setBackground(new java.awt.Color(255, 255, 255));
        ageseller1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ageseller1.setForeground(new java.awt.Color(255, 153, 0));
        ageseller1.setToolTipText("");
        ageseller1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 0), new java.awt.Color(255, 153, 0)));

        ageseller2.setBackground(new java.awt.Color(255, 255, 255));
        ageseller2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ageseller2.setForeground(new java.awt.Color(255, 153, 0));
        ageseller2.setToolTipText("");
        ageseller2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 0), new java.awt.Color(255, 153, 0)));

        jLabel48.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 153, 0));
        jLabel48.setText("favority");
        jLabel48.setToolTipText("");

        jLabel53.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 153, 0));
        jLabel53.setText("confpass");
        jLabel53.setToolTipText("");

        passwordseller.setBackground(new java.awt.Color(255, 255, 255));
        passwordseller.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        passwordseller.setForeground(new java.awt.Color(255, 153, 0));
        passwordseller.setToolTipText("");
        passwordseller.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 51), new java.awt.Color(255, 153, 0)));

        confirmpassword1.setBackground(new java.awt.Color(255, 255, 255));
        confirmpassword1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        confirmpassword1.setForeground(new java.awt.Color(255, 153, 0));
        confirmpassword1.setToolTipText("");
        confirmpassword1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 0), new java.awt.Color(255, 153, 0)));
        confirmpassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmpassword1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/softwareapplication/pizza (1).png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/softwareapplication/pizza (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addGap(28, 28, 28)))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel52)
                            .addComponent(jLabel48))
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel53)
                            .addComponent(jLabel47))
                        .addGap(55, 55, 55)))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ageseller2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageseller, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageseller1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordseller, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmpassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameseller, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(320, 320, 320))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(addinseller, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(230, 230, 230)
                        .addComponent(clearbuttonseller, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(jLabel50)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(741, Short.MAX_VALUE)))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel50)
                        .addGap(43, 43, 43)))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel25))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(usernameseller, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageseller, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(ageseller2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel52)))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ageseller1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(passwordseller, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel47)
                        .addGap(21, 21, 21)))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(confirmpassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53))
                .addGap(76, 76, 76)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearbuttonseller, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addinseller, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(163, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                    .addContainerGap(657, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)))
        );

        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/softwareapplication/spider-plant_5075931.png"))); // NOI18N

        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/softwareapplication/spider-plant_5075931.png"))); // NOI18N

        jLabel68.setBackground(new java.awt.Color(255, 102, 0));
        jLabel68.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setText(" Can't  Wait ");
        jLabel68.setToolTipText("");

        loginbutton1.setBackground(new java.awt.Color(255, 102, 0));
        loginbutton1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        loginbutton1.setForeground(new java.awt.Color(255, 255, 255));
        loginbutton1.setText("Login");
        loginbutton1.setToolTipText("");
        loginbutton1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                loginbutton1MouseDragged(evt);
            }
        });
        loginbutton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginbutton1MouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("X");
        jLabel12.setToolTipText("");

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/softwareapplication/love_9090410.png"))); // NOI18N

        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/softwareapplication/spider-plant_5075931.png"))); // NOI18N

        jLabel67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/softwareapplication/spider-plant_5075931.png"))); // NOI18N

        jLabel69.setBackground(new java.awt.Color(255, 102, 0));
        jLabel69.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setText(" To See You ");
        jLabel69.setToolTipText("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(907, 907, 907))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel60)
                        .addGap(44, 44, 44))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel69)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)))
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addComponent(jLabel64)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginbutton1)
                .addGap(19, 19, 19)
                .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginbutton1)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel62, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel63, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(66, 66, 66)
                                .addComponent(jLabel60)
                                .addGap(172, 172, 172))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1351, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 945, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addinsellerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addinsellerActionPerformed

        String un=usernameseller.getText();
 String pay=ageseller2.getText();
  String fav=ageseller1.getText();
        String pass=passwordseller.getText();
        String confirmpassword=confirmpassword1.getText();
        int phone=Integer.parseInt(ageseller.getText());
        if(usernameseller.getText().isEmpty()||ageseller.getText().isEmpty()||passwordseller.getText().isEmpty()||confirmpassword1.getText().isEmpty()||ageseller2.getText().isEmpty()||ageseller1.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Missing Information!!!");
        }

        if( !pass.equals(confirmpassword))
        {
            JOptionPane.showMessageDialog(this,"your passwords dont match !!!");
            return;
        }

        else{
            try{

                Class.forName("com.mysql.jdbc.Driver");
                sqlConn =DriverManager.getConnection(dataConn,username,password);
                pst =sqlConn.prepareStatement("insert into rest(cusname,cusphone,cuspayment,cusfav,password,confirmpass)"+"value(?,?,?,?,?,?) ");
                // con = DriverManager.getConnection(url);
                pst.setString(1, usernameseller.getText());
                pst.setString(5, passwordseller.getText());
                pst.setString(6, confirmpassword1.getText());
                pst.setString(2, ageseller.getText());
                 pst.setString(3, ageseller2.getText()); //1
                  pst.setString(4, ageseller1.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "record Added");
                   loginrest pi = new loginrest();
                pi.setVisible(true);
                this.setVisible(false);
                upDateDB();

                //String query = "INSERT INTO seller VALUES ('"+prodid+"','"+name+"'"
                // + ",'"+quntity+"','"+price+"'"+",'"+catgare+"')";
                //  int affectsRows = stmt.executeUpdate(query);

            }catch(ClassNotFoundException ex)
            {
                java.util.logging.Logger.getLogger(Softwareapplication.class.getName()).log(java.util.logging.Level.SEVERE,
                    null , ex);}
            catch(SQLException ex){
                java.util.logging.Logger.getLogger(Softwareapplication.class.getName()).log(java.util.logging.Level.SEVERE,
                    null , ex);

            }

            /* finally
            {
                if(con !=null ){ try{ con.close(); }catch(Exception ex){}}
                if(stmt !=null ){ try{ stmt.close(); }catch(Exception ex){}}
            }*/
        }
    }//GEN-LAST:event_addinsellerActionPerformed

    private void clearbuttonsellerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbuttonsellerActionPerformed

        usernameseller.setText(" ");
        passwordseller.setText(" ");
        confirmpassword1.setText(" ");
        ageseller.setText(" ");
          ageseller1.setText(" ");
            ageseller2.setText(" ");
            
    }//GEN-LAST:event_clearbuttonsellerActionPerformed

    private void loginbutton1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbutton1MouseDragged

    }//GEN-LAST:event_loginbutton1MouseDragged

    private void loginbutton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbutton1MouseClicked
        new loginrest().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_loginbutton1MouseClicked

    private void confirmpassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmpassword1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmpassword1ActionPerformed

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
            java.util.logging.Logger.getLogger(rest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addinseller;
    private javax.swing.JTextField ageseller;
    private javax.swing.JTextField ageseller1;
    private javax.swing.JTextField ageseller2;
    private javax.swing.JButton clearbuttonseller;
    private javax.swing.JTextField confirmpassword1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel loginbutton1;
    private javax.swing.JTextField passwordseller;
    private javax.swing.JTextField usernameseller;
    // End of variables declaration//GEN-END:variables
}
