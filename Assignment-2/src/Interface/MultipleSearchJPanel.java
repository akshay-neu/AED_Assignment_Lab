/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Car;
import Business.CarDirectory;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Akshay
 */


public class MultipleSearchJPanel extends javax.swing.JPanel {

private  JPanel userProcessContainerJPanel;
private  CarDirectory carDirectory; 

public DefaultTableModel dtm;

   
MultipleSearchJPanel(JPanel userProcessContainerJPanel, CarDirectory carDirectory) {
         //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         initComponents();
         this.userProcessContainerJPanel = userProcessContainerJPanel;
        this.carDirectory = carDirectory;        
      
        dtm = (DefaultTableModel)tblCars.getModel();
       
        if(dtm.getRowCount()==0){
            txtModelNumber.setEnabled(false);
            btnSearch.setEnabled(false);
            
            
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCars = new javax.swing.JTable();
        btnCarByBrandName = new javax.swing.JButton();
        txtBrandName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtModelNumber = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCars1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(900, 600));

        tblCars.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial Number", "Brand Name", "Model Number", "Seat Capacity", "Year of Manufacturing", "Certificate Expiration Date", "City", "Availability Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCars);

        btnCarByBrandName.setText("Search");
        btnCarByBrandName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarByBrandNameActionPerformed(evt);
            }
        });

        txtBrandName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBrandNameActionPerformed(evt);
            }
        });

        jLabel1.setText("List of Cars by Model Number:");

        txtModelNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModelNumberActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblCars1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial Number", "Brand Name", "Model Number", "Seat Capacity", "Year of Manufacturing", "Certificate Expiration Date", "City", "Availability Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblCars1);

        jLabel2.setText("List of Cars by Brand Name:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(txtBrandName, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(btnCarByBrandName)
                .addGap(256, 256, 256))
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(txtModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(btnSearch)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCarByBrandName)
                    .addComponent(txtBrandName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(63, 63, 63)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(94, 94, 94)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                .addGap(63, 63, 63))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCarByBrandNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarByBrandNameActionPerformed
        // TODO add your handling code here:
        String x = txtBrandName.getText();
    
       populateTable(x);

    }//GEN-LAST:event_btnCarByBrandNameActionPerformed

    
    
     private void populateTable(String brand){
        //DefaultTableModel dtm = (DefaultTableModel)tblCars.getModel();
        dtm.setRowCount(0);
        for(Car car: carDirectory.getCarList()){
            Object row[] = new Object[8];
            row[0]= car;
            row[1]=car.getBrandName();
            row[2]=car.getModelNumber();
            row[3]=car.getSeatNumber();
            row[4]=car.getManufacturingYear();
            row[5]=car.getCertificateExpiration();
            row[6]=car.getCity();
            row[7]=car.getAvailabilityStatus();
            
            if(brand.equalsIgnoreCase(car.getBrandName())){
               dtm.addRow(row);
            }
        }   
     
        if(dtm.getRowCount() > 0){
            txtModelNumber.setEnabled(true);
            btnSearch.setEnabled(true);
        }
     
     }    
     
     private void searchFunction(DefaultTableModel dtmZ, String model){
         
            DefaultTableModel dtmA = (DefaultTableModel)tblCars1.getModel();
            dtmA.setRowCount(0);
            Object row[] = new Object[8];
            
            for(int i =0; i< dtmZ.getRowCount(); i++){
                 
            row[0]= dtmZ.getValueAt(i, 0);
            row[1]= dtmZ.getValueAt(i, 1);
            row[2]= dtmZ.getValueAt(i, 2);
            row[3]= dtmZ.getValueAt(i, 3);
            row[4]= dtmZ.getValueAt(i, 4);
            row[5]= dtmZ.getValueAt(i, 5);
            row[6]= dtmZ.getValueAt(i, 6);
            row[7]= dtmZ.getValueAt(i, 7);
            
            if(dtmZ.getValueAt(i, 2).equals(model)){
               dtmA.addRow(row);
              }}}
     
     
    private void txtBrandNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBrandNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBrandNameActionPerformed

    private void txtModelNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModelNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModelNumberActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here: 
        
        String model =  txtModelNumber.getText();
        
        
        searchFunction(dtm, model);
       
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCarByBrandName;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblCars;
    private javax.swing.JTable tblCars1;
    private javax.swing.JTextField txtBrandName;
    private javax.swing.JTextField txtModelNumber;
    // End of variables declaration//GEN-END:variables
}
