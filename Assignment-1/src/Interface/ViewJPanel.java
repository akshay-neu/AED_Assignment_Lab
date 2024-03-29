/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Business.Person;
import java.awt.Image;
import javax.swing.ImageIcon;
/**
 *
 * @author Akshay
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    private Person person;
    public ViewJPanel(Person person) {
        initComponents();
        this.person= person;
        displayProfile(person);
    }
    private void displayProfile(Person person){
        
    
    nameTextField.setText(person.getName());
    addressTextField.setText(person.getAddress());
    dobTextField.setText(person.getDob());
    telephoneTextField.setText(String.valueOf(person.getTelephone()));
    faxTextField.setText(person.getFaxNo());
    emailTextField.setText(person.getEmailId());
    ssnTextField.setText(person.getSsn());
    medicalRecordTextField.setText(person.getMedicalRecordNo());
    healthPlanTextField.setText(person.getHealthPlanNo());
    bankAccTextField.setText(String.valueOf(person.getBankAccNo()));
    certificateTextField.setText(person.getCertificateNo());
    vehicleTextField.setText(person.getVehicleIdentifier());
    deviceTextField.setText(person.getDeviceIdentifier());
    linkedInTextField.setText(person.getLinkedIn());
    internetProtocolTextField.setText(person.getLinkedIn());
    internetProtocolTextField.setText(person.getInternetProtocolAdd());
    uniqueIdTextField.setText(person.getUniqueIndentifier());
    photoTextField.setText(person.getImagePath());
    biometricTextField.setText(person.getBiometricIdentifier());
    
    ImageIcon icon1 = new ImageIcon(person.getImagePath());
         Image image1 = icon1.getImage();
         photoLabel.setIcon(icon1);
         
    ImageIcon icon2 = new ImageIcon(person.getBiometricIdentifier());
         Image image2 = icon2.getImage();
         biometricLabel.setIcon(icon2);
    
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        linkedInTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        internetProtocolTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        uniqueIdTextField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        photoTextField = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        biometricTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        addressTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dobTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        telephoneTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        faxTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        ssnTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        medicalRecordTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        healthPlanTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        bankAccTextField = new javax.swing.JTextField();
        certificateTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        vehicleTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        deviceTextField = new javax.swing.JTextField();
        photoLabel = new javax.swing.JLabel();
        biometricLabel = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        linkedInTextField.setEditable(false);
        linkedInTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkedInTextFieldActionPerformed(evt);
            }
        });

        jLabel12.setText("Certificate/License Number");

        internetProtocolTextField.setEditable(false);

        jLabel13.setText("Vehicle identifiers");

        uniqueIdTextField.setEditable(false);

        jLabel14.setText("Device identifiers");

        jLabel15.setText("LinkedIn");

        jLabel16.setText("Internet Protocol Address");

        jLabel17.setText("Any unique identifying number");

        jLabel18.setText("Biometric identifier");

        photoTextField.setEditable(false);
        photoTextField.setEnabled(false);
        photoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                photoTextFieldActionPerformed(evt);
            }
        });

        jLabel19.setText("Full face photo");
        jLabel19.setToolTipText("");

        biometricTextField.setEditable(false);
        biometricTextField.setEnabled(false);

        nameTextField.setEditable(false);
        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("VIEW PROFILE");

        addressTextField.setEditable(false);

        jLabel2.setText("Name");

        dobTextField.setEditable(false);

        jLabel3.setText("Address");

        telephoneTextField.setEditable(false);

        jLabel4.setText("Date Of Birth");

        faxTextField.setEditable(false);

        jLabel5.setText("Telephone Number");

        emailTextField.setEditable(false);
        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });

        ssnTextField.setEditable(false);

        jLabel6.setText("Fax Number");

        medicalRecordTextField.setEditable(false);

        jLabel7.setText("Email ID");

        healthPlanTextField.setEditable(false);
        healthPlanTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                healthPlanTextFieldActionPerformed(evt);
            }
        });

        jLabel8.setText("Social Security Number");

        jLabel9.setText("Medical Record Number");

        bankAccTextField.setEditable(false);

        certificateTextField.setEditable(false);

        jLabel10.setText("Health Plan Beneficiary Number");

        vehicleTextField.setEditable(false);

        jLabel11.setText("Bank Account Number");

        deviceTextField.setEditable(false);

        photoLabel.setText("                  Photo will be displayed here");

        biometricLabel.setText("         Fingerprint will be displayed here");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(photoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel2)
                        .addGap(141, 141, 141)
                        .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel10)
                        .addGap(26, 26, 26)
                        .addComponent(healthPlanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(biometricLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(88, 88, 88)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(70, 70, 70)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dobTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(telephoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(faxTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ssnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(medicalRecordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(72, 72, 72)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel15)
                                        .addComponent(jLabel16)
                                        .addComponent(jLabel17)
                                        .addComponent(jLabel18))
                                    .addGap(32, 32, 32)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(biometricTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(uniqueIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(internetProtocolTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(linkedInTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(deviceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(vehicleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(certificateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bankAccTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(117, 117, 117)
                                    .addComponent(jLabel1))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel19)
                            .addGap(96, 96, 96)
                            .addComponent(photoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(89, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(healthPlanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 379, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(photoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(biometricLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(254, 254, 254))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(63, 63, 63)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(bankAccTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(dobTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(certificateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(24, 24, 24)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(telephoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)
                        .addComponent(vehicleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(faxTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)
                        .addComponent(deviceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)
                        .addComponent(linkedInTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(ssnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16)
                        .addComponent(internetProtocolTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(medicalRecordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17)
                        .addComponent(uniqueIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19)
                        .addComponent(photoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18)
                        .addComponent(biometricTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(483, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void linkedInTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkedInTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_linkedInTextFieldActionPerformed

    private void photoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_photoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_photoTextFieldActionPerformed

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextFieldActionPerformed

    private void healthPlanTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_healthPlanTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_healthPlanTextFieldActionPerformed

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTextField;
    private javax.swing.JTextField bankAccTextField;
    private javax.swing.JLabel biometricLabel;
    private javax.swing.JTextField biometricTextField;
    private javax.swing.JTextField certificateTextField;
    private javax.swing.JTextField deviceTextField;
    private javax.swing.JTextField dobTextField;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextField faxTextField;
    private javax.swing.JTextField healthPlanTextField;
    private javax.swing.JTextField internetProtocolTextField;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField linkedInTextField;
    private javax.swing.JTextField medicalRecordTextField;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel photoLabel;
    private javax.swing.JTextField photoTextField;
    private javax.swing.JTextField ssnTextField;
    private javax.swing.JTextField telephoneTextField;
    private javax.swing.JTextField uniqueIdTextField;
    private javax.swing.JTextField vehicleTextField;
    // End of variables declaration//GEN-END:variables
}
