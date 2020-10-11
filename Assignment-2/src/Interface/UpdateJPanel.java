/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Car;
import Business.CarDirectory;
import java.awt.CardLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Akshay
 */
public class UpdateJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainerJPanel;
    private CarDirectory carDirectory;
    private Car carObj;

    //THE GENERAL CONSTRUCTOR
    UpdateJPanel(JPanel userProcessContainerJPanel, CarDirectory carDirectory) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        initComponents();
        this.userProcessContainerJPanel = userProcessContainerJPanel;
        this.carDirectory = carDirectory;
        
        populateTable();
        populateAvailableCount();
        populateUpdateDate();
        
    }

    

    UpdateJPanel(JPanel userProcessContainerJPanel, CarDirectory carDirectory, String brand, String year, String min, String max, String model, String city) {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        initComponents();
        this.userProcessContainerJPanel = userProcessContainerJPanel;
        this.carDirectory = carDirectory;

        int minInt = 0;
       int maxInt = 10;   
        try{ minInt = Integer.parseInt(min);
             maxInt = Integer.parseInt(max);}
       catch(Exception e){  }

        populateTable(brand,year,minInt,maxInt,model,city);
        
    }
    
    //FILTER SEARCH - POPULATE TABLE
    private void  populateTable(String brand, String year, int min, int max, String model, String city){
        
        DefaultTableModel dtm = (DefaultTableModel)tblCars.getModel();
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
            
            
            if(brand.equals(car.getBrandName()) && year.equals(car.getManufacturingYear()) && car.getSeatNumber() >= min && car.getSeatNumber()<=max && model.equals(car.getModelNumber())  && city.equals(car.getCity()) ){
               dtm.addRow(row);
            }}}
      
    
 
    
    private void populateUpdateDate(){
        
    txtUpdateDate.setText(String.valueOf(new Date()));
    }
    private void populateAvailableCount(){
        int countAvailable = 0;
        int countUnavailable = 0;
        for(Car car: carDirectory.getCarList()){
        if(car.getAvailabilityStatus().equalsIgnoreCase("yes"))
        {
        countAvailable = countAvailable + 1;}
        else 
        {
        countUnavailable = countUnavailable +1;     
        }
        }
     txtTotalAvailable.setText(String.valueOf(countAvailable));
     txtTotalUnavailable.setText(String.valueOf(countUnavailable));
    }
    
    //CAR ENTITY ATTRIBUTE CONSTRUCTOR
    UpdateJPanel(JPanel userProcessContainerJPanel, Car result) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        initComponents();
        this.userProcessContainerJPanel = userProcessContainerJPanel;
        this.carObj = result;
        
        //populateTable();
        populateCarDetails(result);
    }

    //LIST OF CARS OF A GIVEN BRAND NAME
    UpdateJPanel(JPanel userProcessContainerJPanel, String x, CarDirectory carDirectory) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        initComponents();
        this.userProcessContainerJPanel = userProcessContainerJPanel;
        this.carDirectory = carDirectory;
        populateTable(x);    
    }
    
    //LIST OF CARS BY YEAR OF MANUFACTURING
    UpdateJPanel(JPanel userProcessContainerJPanel, String manufactureYear, CarDirectory carDirectory, String abc) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        initComponents();
        this.userProcessContainerJPanel = userProcessContainerJPanel;
        this.carDirectory = carDirectory;
        populateTable(manufactureYear, abc);    
    }
    
    //LIST OF CARS BY MIN MAX SEAT CAPACITY
    UpdateJPanel(JPanel userProcessContainerJPanel, CarDirectory carDirectory, int min, int max) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        initComponents();
        this.userProcessContainerJPanel = userProcessContainerJPanel;
        this.carDirectory = carDirectory;
        populateTable(min,max);  
    }

    //CAR SEARCH BY GIVEN SERIAL NUMBER
    UpdateJPanel(JPanel userProcessContainerJPanel, String s, Car result) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        initComponents();
        this.userProcessContainerJPanel = userProcessContainerJPanel;
        this.carObj = result;
        populateCarDetails(result);  
    }

    //LIST OF CARS BY GIVEN MODEL NUMBER
    UpdateJPanel(JPanel userProcessContainerJPanel, CarDirectory carDirectory, String model) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       initComponents();
       int abc = 10; 
       this.userProcessContainerJPanel = userProcessContainerJPanel;
        this.carDirectory = carDirectory;
        System.out.println("HELLO");
        populateTable(model, abc); 
    }
    
    //LIST OF CARS AVAILABLE IN A GIVEN CITY
    UpdateJPanel(JPanel userProcessContainerJPanel, String city, String abc, CarDirectory carDirectory) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        initComponents();
       int xyz=10;
       this.userProcessContainerJPanel = userProcessContainerJPanel;
        this.carDirectory = carDirectory;
        populateTable(xyz, city); 
    }

    //LIST OF CARS HAVING CERTIFICATION EXPIRED
    UpdateJPanel(JPanel userProcessContainerJPanel, CarDirectory carDirectory, int abc) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        initComponents();
       //int xyz=10;
       this.userProcessContainerJPanel = userProcessContainerJPanel;
        this.carDirectory = carDirectory;
        populateTable(abc); 
    }
    
    //LIST OF CARS HAVING CERTIFICATION EXPIRED - POPULATE TABLE
     private void populateTable(int xyz){
        DefaultTableModel dtm = (DefaultTableModel)tblCars.getModel();
        dtm.setRowCount(0);
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
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
            
            if(car.getCertificateExpiration().before(date))
            {
               dtm.addRow(row);
            }
        }        
        
    }
     
     
    //LIST OF CARS AVAILABE IN A GIVEN CITY - POPULATE TABLE
    private void populateTable(int xyz, String city){
        DefaultTableModel dtm = (DefaultTableModel)tblCars.getModel();
        dtm.setRowCount(0);
        for(Car car: carDirectory.getCarList()){
            Object row[] = new Object[8];
            row[0]= car;
            //row[1]=car.getSerialNumber();
            row[1]=car.getBrandName();
            row[2]=car.getModelNumber();
            row[3]=car.getSeatNumber();
            row[4]=car.getManufacturingYear();
            row[5]=car.getCertificateExpiration();
            row[6]=car.getCity();
            row[7]=car.getAvailabilityStatus();
            
            if(city.equals(car.getCity())){
               dtm.addRow(row);
            }
        }        
        
    }
    //CARS BY MODEL NUMBER - POPULATE TABLE
    private void populateTable(String model, int abc){
        DefaultTableModel dtm = (DefaultTableModel) tblCars.getModel();
        dtm.setRowCount(0);
        System.out.println("HIIIIII");
            
        for(Car car: carDirectory.getCarList()){
            Object row[] = new Object[8];
            row[0]= car;
           // row[1]=car.getSerialNumber();
            row[1]=car.getBrandName();
            row[2]=car.getModelNumber();
            row[3]=car.getSeatNumber();
            row[4]=car.getManufacturingYear();
            row[5]=car.getCertificateExpiration();
            row[6]=car.getCity();
            row[7]=car.getAvailabilityStatus();
            System.out.println(car.getSerialNumber());
            if(model.equalsIgnoreCase(car.getModelNumber())){
            dtm.addRow(row);
            
         
            }
            }
            
        }     
        
    
    //CARS BY MIX MAX SEAT - POPULATE TABLE
     private void populateTable(int min, int max){
        DefaultTableModel dtm = (DefaultTableModel)tblCars.getModel();
        dtm.setRowCount(0);
        for(Car car: carDirectory.getCarList()){
            Object row[] = new Object[8];
            row[0]= car;
            //row[1]=car.getSerialNumber();
            row[1]=car.getBrandName();
            row[2]=car.getModelNumber();
            row[3]=car.getSeatNumber();
            row[4]=car.getManufacturingYear();
            row[5]=car.getCertificateExpiration();
            row[6]=car.getCity();
            row[7]=car.getAvailabilityStatus();
            
           // String minimum= String.valueOf(min);
           // String maximum= String.valueOf(max);
            if(car.getSeatNumber() >= min && car.getSeatNumber()<=max && car.getAvailabilityStatus().equalsIgnoreCase("yes")){
               dtm.addRow(row);
            }
            
        }        
     }
    //CARS BY MANUFACTURING YEAR - POPULATE TABLE
    private void populateTable(String yearZ,String abc){
        DefaultTableModel dtm = (DefaultTableModel)tblCars.getModel();
        dtm.setRowCount(0);
        for(Car car: carDirectory.getCarList()){
            Object row[] = new Object[8];
            row[0]= car;
            //row[1]=car.getSerialNumber();
            row[1]=car.getBrandName();
            row[2]=car.getModelNumber();
            row[3]=car.getSeatNumber();
            row[4]=car.getManufacturingYear();
            row[5]=car.getCertificateExpiration();
            row[6]=car.getCity();
            row[7]=car.getAvailabilityStatus();
            
            //int year = Integer.parseInt(yearZ);
            if(yearZ.equals(String.valueOf(car.getManufacturingYear()))){
            dtm.addRow(row);
            } else {
            
            }
        }        
    }
    
    //CARS BY BRAND NAME - POPULATE TABLE
    private void populateTable(String brand){
        DefaultTableModel dtm = (DefaultTableModel)tblCars.getModel();
        dtm.setRowCount(0);
        for(Car car: carDirectory.getCarList()){
            Object row[] = new Object[8];
            row[0]= car;
            //row[1]=car.getSerialNumber();
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
    }
    
    //GENERAL POPULATE TABLE
    private void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel)tblCars.getModel();
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
            
            dtm.addRow(row);
        }
               
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnUpdate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCars = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtSerialNumber = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtBrandName = new javax.swing.JTextField();
        txtModelNumber = new javax.swing.JTextField();
        txtSeatCapacity = new javax.swing.JTextField();
        txtManufacturingYear = new javax.swing.JTextField();
        txtExpirationDate = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtAvailabilityStatus = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtUpdateDate = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTotalAvailable = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtTotalUnavailable = new javax.swing.JTextField();

        setMaximumSize(new java.awt.Dimension(900, 600));
        setPreferredSize(new java.awt.Dimension(900, 600));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

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
        if (tblCars.getColumnModel().getColumnCount() > 0) {
            tblCars.getColumnModel().getColumn(0).setResizable(false);
            tblCars.getColumnModel().getColumn(1).setResizable(false);
            tblCars.getColumnModel().getColumn(2).setResizable(false);
            tblCars.getColumnModel().getColumn(3).setResizable(false);
            tblCars.getColumnModel().getColumn(4).setResizable(false);
            tblCars.getColumnModel().getColumn(5).setResizable(false);
            tblCars.getColumnModel().getColumn(6).setResizable(false);
            tblCars.getColumnModel().getColumn(7).setResizable(false);
        }

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        jLabel6.setText("Year of Manufacturing");

        jLabel7.setText("Availability Status");

        jLabel8.setText("Maintenance Certificate Expiration Date");

        jLabel9.setText("City");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CAR DETAILS");

        jLabel2.setText("Serial Number");

        jLabel3.setText("Model Number");

        jLabel4.setText("Brand Name");

        jLabel5.setText("Seat Capacity");

        jLabel10.setText("Directory Last Updated:");

        jLabel11.setText("Total Cars Available:");

        jLabel12.setText("Total Cars Unavailable");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(481, 481, 481)
                .addComponent(btnUpdate)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 80, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(47, 47, 47)
                                .addComponent(txtUpdateDate, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(99, 99, 99))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSearch)
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(102, 102, 102)
                                        .addComponent(btnView)
                                        .addGap(210, 210, 210)
                                        .addComponent(btnDelete))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTotalAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(202, 202, 202)
                                        .addComponent(jLabel12)
                                        .addGap(50, 50, 50)
                                        .addComponent(txtTotalUnavailable, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(201, 201, 201))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSerialNumber)
                            .addComponent(txtBrandName)
                            .addComponent(txtModelNumber)
                            .addComponent(txtSeatCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtManufacturingYear, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAvailabilityStatus, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtExpirationDate)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                        .addGap(72, 72, 72))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtUpdateDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnView)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtTotalAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtTotalUnavailable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtManufacturingYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtBrandName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAvailabilityStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtExpirationDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSeatCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        
         Car result = carDirectory.searchCar(txtSearch.getText());
        if(result == null){
            JOptionPane.showMessageDialog(null,"Serial Number entered does not exist!", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
        else{         
            
        populateCarDetails(result);
        }
        
        
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCars.getSelectedRow();
        if(selectedRow >= 0){
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to Delete the Car details?", "Warning!", dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION){
                Car car = (Car) tblCars.getValueAt(selectedRow, 0);
                carDirectory.deleteCar(car);
                populateTable(); //to refresh the table
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Please select a row from the table first!","Warning!",JOptionPane.WARNING_MESSAGE);
           
        }
        
        
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
    
        
        //Car car = carDirectory.addCar();
        carObj.setSerialNumber(txtSerialNumber.getText());
        carObj.setModelNumber(txtModelNumber.getText());
        carObj.setBrandName(txtBrandName.getText());
        carObj.setSeatNumber(Integer.parseInt(txtSeatCapacity.getText()));
        carObj.setManufacturingYear(Integer.parseInt(txtManufacturingYear.getText()));
        carObj.setCity(txtCity.getText());
        carObj.setAvailabilityStatus( txtAvailabilityStatus.getText());
           try {
            Date certificateExpiration = new SimpleDateFormat("dd/MM/yyyy").parse(txtExpirationDate.getText());
        } catch (ParseException ex) {
            Logger.getLogger(AddCarJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        JOptionPane.showMessageDialog(null,"Car Details Updated Successfully!");
        
       // Date updateDate = new SimpleDateFormat("dd/MMM/yyyy").
                        
        populateTable();
        populateAvailableCount();
        populateUpdateDate();
        

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCars.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table first to View Details!","Warning!",JOptionPane.WARNING_MESSAGE);
        }
        else{
       //display the details 
       carObj = (Car) tblCars.getValueAt(selectedRow, 0);
       populateCarDetails(carObj);
        }
        
    }//GEN-LAST:event_btnViewActionPerformed

    private void populateCarDetails(Car car){
        
        txtSerialNumber.setText(car.getSerialNumber());
        txtBrandName.setText(car.getBrandName());
        txtModelNumber.setText(String.valueOf(car.getModelNumber()));
        txtSeatCapacity.setText(String.valueOf(car.getSeatNumber()));
        txtManufacturingYear.setText(String.valueOf(car.getManufacturingYear()));
        txtAvailabilityStatus.setText(car.getAvailabilityStatus());
        txtExpirationDate.setText(String.valueOf(car.getCertificateExpiration()));
        txtCity.setText(car.getCity());
        
        
    }
    
    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCars;
    private javax.swing.JTextField txtAvailabilityStatus;
    private javax.swing.JTextField txtBrandName;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtExpirationDate;
    private javax.swing.JTextField txtManufacturingYear;
    private javax.swing.JTextField txtModelNumber;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSeatCapacity;
    private javax.swing.JTextField txtSerialNumber;
    private javax.swing.JTextField txtTotalAvailable;
    private javax.swing.JTextField txtTotalUnavailable;
    private javax.swing.JTextField txtUpdateDate;
    // End of variables declaration//GEN-END:variables

    
}
