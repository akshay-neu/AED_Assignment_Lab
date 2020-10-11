/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Car;
import Business.CarDirectory;
import java.awt.CardLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Akshay
 */
public class AddCarJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
   private JPanel userProcessContainerJPanel;
   private CarDirectory carDirectory;
    

    AddCarJPanel(JPanel userProcessContainerJPanel, CarDirectory carDirectory) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        initComponents();
        this.userProcessContainerJPanel = userProcessContainerJPanel;
        this.carDirectory = carDirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtBrandName = new javax.swing.JTextField();
        txtModelNumber = new javax.swing.JTextField();
        txtSeatCapacity = new javax.swing.JTextField();
        txtManufacturingYear = new javax.swing.JTextField();
        txtExpirationDate = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        txtSerialNumber = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        checkBoxAvailable = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 255, 204));
        setMaximumSize(new java.awt.Dimension(900, 600));
        setPreferredSize(new java.awt.Dimension(900, 600));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CAR DETAILS");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Serial Number");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Model Number");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Brand Name");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Seat Capacity");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Year of Manufacturing");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Availability Status");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Maintenance Certificate Expiration Date");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("City");

        txtManufacturingYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtManufacturingYearActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(153, 102, 0));
        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel10.setText("*Unique");

        checkBoxAvailable.setText("  Available");
        checkBoxAvailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxAvailableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(125, 125, 125)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkBoxAvailable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBrandName, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addComponent(txtModelNumber)
                    .addComponent(txtSeatCapacity)
                    .addComponent(txtManufacturingYear)
                    .addComponent(txtExpirationDate)
                    .addComponent(txtCity)
                    .addComponent(txtSerialNumber, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addGap(153, 153, 153))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(406, 406, 406)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel1)
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtBrandName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtSeatCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtManufacturingYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(checkBoxAvailable)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtExpirationDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdd)
                .addGap(94, 94, 94))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        
        
        String serialNumber = txtSerialNumber.getText();
        String modelNumber = txtModelNumber.getText();
        String brandName = txtBrandName.getText();
        String seatNo = txtSeatCapacity.getText();
        int seatNumber = 0;
        String manufYear = txtManufacturingYear.getText();
        int manufacturingYear = 0;
        String city = txtCity.getText();
        String availabilityStatus = "No";
        if(checkBoxAvailable.isSelected()){
            availabilityStatus = "Yes";
        }
        
    /*
      
      */  
        
        if(serialNumber.isEmpty() || modelNumber.isEmpty() || brandName.isEmpty() || seatNo.isEmpty() || manufYear.isEmpty() || city.isEmpty()  )
        {
        JOptionPane.showMessageDialog(null,"SORRY! Kindly provide all the details!");
        }
        
        else if(cityPatternChecker(city) == false)
        {
            JOptionPane.showMessageDialog(null,"City Name should only contain Characters! ");
        }
            
        else {
        try{    
         seatNumber   = Integer.parseInt(seatNo);
         manufacturingYear = Integer.parseInt(manufYear);
        Date certificateExpiration = null;
        try {
            certificateExpiration = new SimpleDateFormat("MM/DD/YYYY").parse(txtExpirationDate.getText());
        } catch (ParseException ex) {
            Logger.getLogger(AddCarJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if( serialNumber.equals(carDirectory.searchSerialNumber(serialNumber)) )
        {JOptionPane.showMessageDialog(null,"SORRY!! Kindly assign an unused Unique Serial Number!");}
        else
        {
        Car car = carDirectory.addCar();
        car.setSerialNumber(serialNumber);
        car.setModelNumber(modelNumber);
        car.setBrandName(brandName);
        car.setSeatNumber(seatNumber);
        car.setManufacturingYear(manufacturingYear);
        car.setCity(city);
        car.setAvailabilityStatus(availabilityStatus);
        car.setCertificateExpiration(certificateExpiration);
        
        JOptionPane.showMessageDialog(null,"Car Details Added Successfully!");
        }}
        
        catch (NumberFormatException e)
    {
            JOptionPane.showMessageDialog(null, "Invalid Data!");}               
    }                                
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtManufacturingYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtManufacturingYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtManufacturingYearActionPerformed
    private boolean cityPatternChecker(String s)
    {
            Pattern p = Pattern.compile("^[a-zA-Z]+$");
            Matcher m = p.matcher(s);
            boolean b = m.matches();
            return b;
    }
    
    private void checkBoxAvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxAvailableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxAvailableActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JCheckBox checkBoxAvailable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtBrandName;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtExpirationDate;
    private javax.swing.JTextField txtManufacturingYear;
    private javax.swing.JTextField txtModelNumber;
    private javax.swing.JTextField txtSeatCapacity;
    private javax.swing.JTextField txtSerialNumber;
    // End of variables declaration//GEN-END:variables
}