/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.VitalSignHistory;
import Business.VitalSigns;
import javax.swing.JOptionPane;
/**
 *
 * @author Akshay
 */
public class CreateVitalJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateVitalJPanel
     */
    
    private VitalSignHistory vsh;
            
    public CreateVitalJPanel(VitalSignHistory vsh) {
        initComponents();
        this.vsh = vsh;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTemperature = new javax.swing.JLabel();
        labelBloodPressure = new javax.swing.JLabel();
        labelPulse = new javax.swing.JLabel();
        labelDate = new javax.swing.JLabel();
        textTemperature = new javax.swing.JTextField();
        textBloodPressure = new javax.swing.JTextField();
        textPulse = new javax.swing.JTextField();
        textDate = new javax.swing.JTextField();
        labelCreateVitalSign = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();

        labelTemperature.setText("Temperature");

        labelBloodPressure.setText("Blood Pressure");

        labelPulse.setText("Pulse");

        labelDate.setText("Date");

        labelCreateVitalSign.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelCreateVitalSign.setText("CREATE VITAL SIGN");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTemperature)
                            .addComponent(labelBloodPressure)
                            .addComponent(labelPulse)
                            .addComponent(labelDate))
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textTemperature)
                            .addComponent(textBloodPressure)
                            .addComponent(textPulse)
                            .addComponent(textDate, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(labelCreateVitalSign))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(btnSave)))
                .addContainerGap(301, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(labelCreateVitalSign)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTemperature)
                    .addComponent(textTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBloodPressure)
                    .addComponent(textBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPulse)
                    .addComponent(textPulse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDate)
                    .addComponent(textDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(btnSave)
                .addContainerGap(123, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        double temperature = Double.parseDouble(textTemperature.getText());
        double bloodpressure = Double.parseDouble(textBloodPressure.getText());
        int pulse = Integer.parseInt(textPulse.getText());
        String date = textDate.getText();
        
        //method of VitaLSignHistory class is used, datatype is VitalSigns
        VitalSigns v = vsh.addVitals();
        
        v.setTemperature(temperature);
        v.setBloodPressure(bloodpressure);
        v.setPulse(pulse);
        v.setDate(date);
        
        //info message dialog box
        JOptionPane.showMessageDialog(null, "VitalSigns added successfully!");
        
        //clear the textfields for user to add new vitalsigns
        textTemperature.setText("");
        textBloodPressure.setText("");
        textPulse.setText("");
        textDate.setText("");
                    
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel labelBloodPressure;
    private javax.swing.JLabel labelCreateVitalSign;
    private javax.swing.JLabel labelDate;
    private javax.swing.JLabel labelPulse;
    private javax.swing.JLabel labelTemperature;
    private javax.swing.JTextField textBloodPressure;
    private javax.swing.JTextField textDate;
    private javax.swing.JTextField textPulse;
    private javax.swing.JTextField textTemperature;
    // End of variables declaration//GEN-END:variables
}
