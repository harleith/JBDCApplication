/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author imam
 */
public class SwingData extends javax.swing.JFrame {

    /**
     * Creates new form SwingData
     */
    public SwingData() {
        initComponents();
        masukinDBKesini();
    }
    public void masukinDBKesini(){
         Connection conn = null;
        Statement stmt = null;
    
        try {
            // TODO code application logic here
            String dburl = "jdbc:derby://localhost:1527/sample";
            String username = "app";
            String password = "app";
            
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            
            conn = DriverManager.getConnection(dburl, username, password);
            stmt = conn.createStatement();
            String sqlquery = "select po.quantity, p.purchase_cost, p.DESCRIPTION\n" +
                                "from purchase_order po\n" +
                                "join product p \n" +
                                "on p.PRODUCT_ID = po.PRODUCT_ID";
            ResultSet result;
            result = stmt.executeQuery(sqlquery);
            Object[] row = new Object[4];
            DefaultTableModel tableModel = 
                    (DefaultTableModel) purchaseTable.getModel();
            
            double totalOrder = 0.0;
            while(result.next()){
                String namaProduk = result.getString("description");
                int quantity = result.getInt("quantity");
                double cost = result.getDouble("purchase_cost");
                double lineCost = quantity * cost;
                row[0] = namaProduk;
                row[1] = quantity;
                row[2] = cost;
                row[3] = lineCost;
                tableModel.addRow(row);
                totalOrder += lineCost;
            } 
            String totalHarga = Double.toString(totalOrder);
            totalLabel.setText(totalHarga);
            //System.out.println("TOTAL ORDER COST = $" + totalOrder);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JDBCApplication.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException err) {
            Logger.getLogger(JDBCApplication.class.getName()).log(Level.SEVERE, null, err);
        } finally {
           try{
            stmt.close();
            conn.close();
        } catch (SQLException ex){
            Logger.getLogger(JDBCApplication.class.getName()).log(Level.SEVERE, null, ex);
        }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        purchaseTable = new javax.swing.JTable();
        totalLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        purchaseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama Produk", "Quantity", "Cost", "Line Cost"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(purchaseTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(292, 292, 292)
                .addComponent(totalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(totalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(SwingData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SwingData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SwingData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SwingData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SwingData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable purchaseTable;
    private javax.swing.JLabel totalLabel;
    // End of variables declaration//GEN-END:variables
}
