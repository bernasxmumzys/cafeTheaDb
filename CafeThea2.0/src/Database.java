
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bryce
 */
public class Database extends javax.swing.JFrame {

    /**
     * Creates new form Database
     */
    public Database() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ordersPanel = new javax.swing.JPanel();
        inventPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        itemNameTF = new javax.swing.JTextField();
        quantityTF = new javax.swing.JTextField();
        supplierTF = new javax.swing.JTextField();
        statusCB = new javax.swing.JComboBox<>();
        createBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        invPanelBtn = new javax.swing.JButton();
        ordersSummBtn = new javax.swing.JButton();
        servicesSummBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 450));
        setResizable(false);

        javax.swing.GroupLayout ordersPanelLayout = new javax.swing.GroupLayout(ordersPanel);
        ordersPanel.setLayout(ordersPanelLayout);
        ordersPanelLayout.setHorizontalGroup(
            ordersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ordersPanelLayout.setVerticalGroup(
            ordersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(ordersPanel, java.awt.BorderLayout.CENTER);

        inventPanel.setPreferredSize(new java.awt.Dimension(600, 450));
        inventPanel.setLayout(new java.awt.BorderLayout());

        jPanel3.setPreferredSize(new java.awt.Dimension(250, 250));

        itemNameTF.setForeground(new java.awt.Color(204, 204, 204));
        itemNameTF.setText("Item Name");
        itemNameTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                itemNameTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                itemNameTFFocusLost(evt);
            }
        });

        quantityTF.setForeground(new java.awt.Color(204, 204, 204));
        quantityTF.setText("Quantity");
        quantityTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                quantityTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                quantityTFFocusLost(evt);
            }
        });

        supplierTF.setForeground(new java.awt.Color(204, 204, 204));
        supplierTF.setText("Supplier");
        supplierTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                supplierTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                supplierTFFocusLost(evt);
            }
        });

        statusCB.setForeground(new java.awt.Color(204, 204, 204));
        statusCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Not Available" }));

        createBtn.setText("Create");

        editBtn.setText("Edit");

        deleteBtn.setText("Delete");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(statusCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(supplierTF, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(quantityTF, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(itemNameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(itemNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(quantityTF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(supplierTF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(statusCB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        inventPanel.add(jPanel3, java.awt.BorderLayout.EAST);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Item", "Quantity", "Supplier", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel4.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        inventPanel.add(jPanel4, java.awt.BorderLayout.CENTER);

        getContentPane().add(inventPanel, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(50, 50));

        invPanelBtn.setText("Inventory");
        invPanelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invPanelBtnActionPerformed(evt);
            }
        });

        ordersSummBtn.setText("Orders");
        ordersSummBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordersSummBtnActionPerformed(evt);
            }
        });

        servicesSummBtn.setText("Services");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(invPanelBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ordersSummBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(servicesSummBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(515, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(servicesSummBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(ordersSummBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(invPanelBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.NORTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemNameTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_itemNameTFFocusGained
        // TODO add your handling code here:
        if(itemNameTF.getText().equals("Item Name"))
        {
            itemNameTF.setText("");
            itemNameTF.setForeground(new Color(153,153,153));
        }        
    }//GEN-LAST:event_itemNameTFFocusGained

    private void itemNameTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_itemNameTFFocusLost
        // TODO add your handling code here:
        if(itemNameTF.getText().equals(""))
        {
            itemNameTF.setText("Item Name");
            itemNameTF.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_itemNameTFFocusLost

    private void quantityTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_quantityTFFocusGained
        // TODO add your handling code here:
        if(quantityTF.getText().equals("Quantity"))
        {
            quantityTF.setText("");
            quantityTF.setForeground(new Color(153,153,153));
        }
        
    }//GEN-LAST:event_quantityTFFocusGained

    private void quantityTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_quantityTFFocusLost
        // TODO add your handling code here:
        if(quantityTF.getText().equals(""))
        {
            quantityTF.setText("Quantity");
            quantityTF.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_quantityTFFocusLost

    private void supplierTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_supplierTFFocusGained
        // TODO add your handling code here:    
        if(supplierTF.getText().equals("Status"))
        {
            supplierTF.setText("");
            supplierTF.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_supplierTFFocusGained

    private void supplierTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_supplierTFFocusLost
        // TODO add your handling code here:
        if(supplierTF.getText().equals(""))
        {
            supplierTF.setText("Status");
            supplierTF.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_supplierTFFocusLost

    private void invPanelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invPanelBtnActionPerformed
        // TODO add your handling code here:
        ordersPanel.setVisible(false);
        inventPanel.setVisible(true);
    }//GEN-LAST:event_invPanelBtnActionPerformed

    private void ordersSummBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordersSummBtnActionPerformed
        // TODO add your handling code here:
        ordersPanel.setVisible(true);
        inventPanel.setVisible(false);
    }//GEN-LAST:event_ordersSummBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Database().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JButton invPanelBtn;
    private javax.swing.JPanel inventPanel;
    private javax.swing.JTextField itemNameTF;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel ordersPanel;
    private javax.swing.JButton ordersSummBtn;
    private javax.swing.JTextField quantityTF;
    private javax.swing.JButton servicesSummBtn;
    private javax.swing.JComboBox<String> statusCB;
    private javax.swing.JTextField supplierTF;
    // End of variables declaration//GEN-END:variables
}
