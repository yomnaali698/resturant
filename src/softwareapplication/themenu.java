/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareapplication;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.*;
/**
 *
 * @author Firefox
 */
public class themenu extends javax.swing.JFrame {
private static final String username="root";
private static final String password="1234";
private static final String dataConn="jdbc:mysql://localhost:3306/resturant?useSSL=false";
Connection sqlConn =null;
PreparedStatement pst=null;
ResultSet rs=null;
int i,id,q,deleteItem;
    /**
     * Creates new form themenu
     */
    public themenu() {
        initComponents();
         jComboBox3.setSelectedItem(null);
         jComboBox2.setSelectedItem(null);
         jComboBox1.setSelectedItem(null);
      

        // Initialize dish prices
        dishPrices = new HashMap<>();
        dishPrices.put("Tomoto Soup", 80.0);
        dishPrices.put("Fattoush Salad", 90.5);
        dishPrices.put("Mini Samosa", 80.0);
        dishPrices.put("Seafood Appetizer", 200.0);
        dishPrices.put("Kunafa", 50.0);
        dishPrices.put("Basbousa", 50.0);
        dishPrices.put("Cheesecake", 50.5);
        dishPrices.put("Ice Cream", 20.5);
        dishPrices.put("Chicken Mandi", 300.0);
        dishPrices.put("Grilled Steak", 300.0);
        dishPrices.put("Pesto Pasta", 200.0);
        dishPrices.put("Beef Shawarma", 500.0);
        dishPrices.put("VIP", 100.0); // Example table price
        dishPrices.put("Regular", 20.0);
        dishPrices.put("Outdoor", 50.0);
    
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabel1.setText("Welcome to our resturant");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel2.setText("Select Catagrory");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel3.setText("Select Items");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel4.setText("Table");

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 153, 0));
        jComboBox1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 0), new java.awt.Color(255, 153, 0)));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox2.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(255, 153, 0));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VIP", "Regular", "Outdoor" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jComboBox3.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox3.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(255, 153, 0));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Appetizers", "Main Dash", "Desserts", " " }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 153, 0));
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 153, 0), new java.awt.Color(255, 153, 0), new java.awt.Color(255, 153, 0), new java.awt.Color(255, 153, 0)));
        jScrollPane1.setViewportView(jTextArea1);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 153, 0));
        jButton2.setText("Submit");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 0), new java.awt.Color(255, 153, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/softwareapplication/spider-plant_5075931.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("X");
        jLabel12.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(82, 82, 82)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        try{
            if(jComboBox3.getSelectedItem().equals("Appetizers")){
                jComboBox1.removeAllItems();
                jComboBox1.addItem("Tomoto Soup");
                jComboBox1.addItem("Fattoush Salad");
                jComboBox1.addItem("Mini Samosa");
                jComboBox1.addItem("Seafood Appetizer");
                jComboBox1.setSelectedItem(null);

            }else

            if (jComboBox3.getSelectedItem().equals("Desserts")){
                jComboBox1.removeAllItems();

                jComboBox1.addItem("Kunafa");
                jComboBox1.addItem("Basbousa");
                jComboBox1.addItem("cheese cake");
                jComboBox1.addItem("Ice Cream");
                jComboBox1.setSelectedItem(null);
            }

            else

            if (jComboBox3.getSelectedItem().equals("Main Dash")){
                jComboBox1.removeAllItems();

                jComboBox1.addItem("Chicken Mandi");
                jComboBox1.addItem("Grilled Steak");
                jComboBox1.addItem("Pesto Pasta");
                jComboBox1.addItem("Beef Shawarma");
                jComboBox1.setSelectedItem(null);
            }
            if( jComboBox2.getSelectedItem().equals("Table")){

            jComboBox2.removeAllItems();
            jComboBox1.addItem("VIP");
            jComboBox1.addItem("Normal");
            jComboBox1.addItem("Outdoor");

            jComboBox1.setSelectedItem(null);
    }       
            
        }
        catch(Exception e){

            System.out.println(e);
        
        }
    }
            public void upDateDB(){
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            sqlConn =DriverManager.getConnection(dataConn,username,password);
            pst =sqlConn.prepareStatement("select * from  `order` ");
            rs =pst.executeQuery();
            ResultSetMetaData stData =rs.getMetaData();
            q= stData.getColumnCount();
            jComboBox2.removeAllItems();
        jComboBox3.removeAllItems();
        jComboBox1.removeAllItems();
           // DefaultTableModel RecordTable=(DefaultTableModel)jTable1.getModel(); 
                  //  RecordTable.setRowCount(0);
                   while(rs.next()){
                       
                        int  idd = rs.getInt("id");
                        String tapl=rs.getString("Table");
                          jComboBox2.addItem(tapl);
                          String cato=rs.getString("select catogrey");
                          jComboBox3.addItem(cato);
                          String ite=rs.getString("select item");
                          jComboBox1.addItem(ite);
               
                         
                        //jComboBox2.addItem(rs.getString("Table"));
                         //jComboBox3.addItem(rs.getString("select catogrey"));
                        //jComboBox1.addItem(rs.getString("select item"));
                         
                        
                        
                       // RecordTable.addRow(ColumnData);
                    }
        }
        catch(Exception ex){
          JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            
        }

           
            
         
            
    }//GEN-LAST:event_jComboBox3ActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     String combo1 =(String)jComboBox3.getSelectedItem();
        String combo2 =(String)jComboBox1.getSelectedItem();
          String combo3 =(String)jComboBox2.getSelectedItem();
        try{

                Class.forName("com.mysql.jdbc.Driver");
                sqlConn =DriverManager.getConnection(dataConn,username,password);
             
                pst = sqlConn.prepareStatement("INSERT INTO `order`(`Table`, `select catogrey`, `select item`) VALUES(?, ?, ?)");//  pst =sqlConn.prepareStatement("insert into order(Table,select catogrey,select item)value(?,?,?) ");
                // con = DriverManager.getConnection(url);
                pst.setString(1, combo3);
         
                 pst.setString(2, combo1); //1
                  pst.setString(3, combo2);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "record Added");
                  
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
        

// TODO add your handling code here:
try{
       
       
            double price1 = dishPrices.getOrDefault(combo1, 0.0);
            double price2 = dishPrices.getOrDefault(combo2, 0.0);
            double price3 = dishPrices.getOrDefault(combo3, 0.0);

            double totalPrice = price1 + price2 + price3;
            // Add to the running total
        totalOrderPrice += totalPrice;
          jTextArea1.append("\nSelected Category: " + combo1 +
                    "\nSelected Item: " + combo2 + " (Price: $" + price2 + ")" +
                    "\nSelected Table: " + combo3 + " (Price: $" + price3 + ")" +
                    "\nTotal Price: $" + totalPrice + "\n"+  "\nTotal for All Orders: $" + totalOrderPrice + "\n");
          
           String word = "you "; 
           
        paymentproxy paymentProxy = new paymentproxy();
        paymentProxy.processPayment(word,  totalOrderPrice);

   
     

        
        // Notify the user of payment success
        JOptionPane.showMessageDialog(null, 
                "Payment is $" +  totalOrderPrice+ " for " + word + " has been successfully processed Thank  ",
                "Payment Confirmation", JOptionPane.INFORMATION_MESSAGE);
                
        //After the order is taken, the combo boxes will be reset, ensuring no items remain selected.
           jComboBox3.setSelectedItem(null);
        jComboBox1.setSelectedItem(null);
        jComboBox2.setSelectedItem(null);
        
}
        

    catch (Exception e) {
            System.out.println("Error processing selection: " + e.getMessage());
        }
 jComboBox3.setSelectedItem(null);
jComboBox1.setSelectedItem(null);
jComboBox2.setSelectedItem(null);
      
    
    }//GEN-LAST:event_jButton2ActionPerformed

   
    

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
            java.util.logging.Logger.getLogger(themenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(themenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(themenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(themenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new themenu().setVisible(true);
            }
        });
    }
     
     private double totalOrderPrice = 0.0;
 private final HashMap<String, Double> dishPrices;
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
