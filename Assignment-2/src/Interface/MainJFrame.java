/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Car;
import Business.CarDirectory;
import java.awt.CardLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Akshay
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private CarDirectory carDirectory;
    
    public MainJFrame() {
        initComponents();
        
        this.carDirectory = new CarDirectory();
        csvFile();
        image();
        image2();
    }
    
    
         
      public void csvFile(){
        
       String line = "";  
       String splitBy = ",";  
        try   
        {  
            //parsing a CSV file into BufferedReader class constructor  
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Akshay\\Documents\\NetBeansProjects\\Assignment-2\\CarDetails.csv"));  
            while ((line = br.readLine()) != null)   //returns a Boolean value  
            {  
                String[] csv = line.split(splitBy);    // use comma as separator  
               // System.out.println(csv[0],csv[1],csv[2],csv[3],);
                Car car = carDirectory.addCar();
                car.setModelNumber(csv[0]);
                car.setBrandName(csv[1]);
                car.setSeatNumber(Integer.parseInt(csv[2]));
                car.setSerialNumber(csv[3]);
                car.setManufacturingYear(Integer.parseInt(csv[4]));
                car.setAvailabilityStatus(csv[5]);
                try {
                    car.setCertificateExpiration(new SimpleDateFormat("dd/MM/yyyy").parse(csv[6]));
                } catch (ParseException ex) {
                    Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                car.setCity(csv[7]);
                carDirectory.setBrandNameDirectory(car.getBrandName());
            }  
        }   
            catch (IOException e)   
            {  e.printStackTrace(); }   
      }  
      
      
      public void image(){
      
        Image getAbsolutePath = null;
        ImageIcon icon = new ImageIcon("image.png");
        
        Image image = icon.getImage().getScaledInstance(labelCar.getWidth(), labelCar.getHeight(), Image.SCALE_SMOOTH);
        labelCar.setIcon(icon);
        
      }
        //Image image1 = icon.getImage().getScaledInstance(lblCabImage.getWidth(), lblCabImage.getHeight(), Image.SCALE_DEFAULT);
        //lblCabImage.setIcon(icon);
        
       public void image2(){ 
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("image.png"));
        } catch (IOException ex) {
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        Image dimg = img.getScaledInstance(lblCabImage.getWidth(), lblCabImage.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(dimg);
        lblCabImage.setIcon(imageIcon);
        
        
        }
      
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        topJPanel = new javax.swing.JPanel();
        btnSearches = new javax.swing.JButton();
        btnAddCar = new javax.swing.JButton();
        btnUpdateCar = new javax.swing.JButton();
        lblCabImage = new javax.swing.JLabel();
        userProcessContainerJPanel = new javax.swing.JPanel();
        HomeJPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelCar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 600));

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        topJPanel.setBackground(new java.awt.Color(204, 204, 0));

        btnSearches.setBackground(new java.awt.Color(255, 204, 255));
        btnSearches.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btnSearches.setText("Searches");
        btnSearches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchesActionPerformed(evt);
            }
        });

        btnAddCar.setBackground(new java.awt.Color(255, 204, 255));
        btnAddCar.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btnAddCar.setText("Add a Car");
        btnAddCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCarActionPerformed(evt);
            }
        });

        btnUpdateCar.setBackground(new java.awt.Color(255, 204, 255));
        btnUpdateCar.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btnUpdateCar.setText("View & Update Cars' Details");
        btnUpdateCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout topJPanelLayout = new javax.swing.GroupLayout(topJPanel);
        topJPanel.setLayout(topJPanelLayout);
        topJPanelLayout.setHorizontalGroup(
            topJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topJPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnAddCar, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(btnUpdateCar, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(btnSearches, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(lblCabImage, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        topJPanelLayout.setVerticalGroup(
            topJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddCar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdateCar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(topJPanelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(topJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSearches, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCabImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jSplitPane1.setTopComponent(topJPanel);

        userProcessContainerJPanel.setBackground(new java.awt.Color(204, 255, 51));
        userProcessContainerJPanel.setPreferredSize(new java.awt.Dimension(900, 600));
        userProcessContainerJPanel.setLayout(new java.awt.CardLayout());

        HomeJPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("WELCOME TO UBER CAB SERVICE PLATFORM");

        labelCar.setBackground(new java.awt.Color(255, 255, 51));

        javax.swing.GroupLayout HomeJPanelLayout = new javax.swing.GroupLayout(HomeJPanel);
        HomeJPanel.setLayout(HomeJPanelLayout);
        HomeJPanelLayout.setHorizontalGroup(
            HomeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeJPanelLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(labelCar, javax.swing.GroupLayout.PREFERRED_SIZE, 1051, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        HomeJPanelLayout.setVerticalGroup(
            HomeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeJPanelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelCar, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        userProcessContainerJPanel.add(HomeJPanel, "card2");

        jSplitPane1.setRightComponent(userProcessContainerJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchesActionPerformed
        // TODO add your handling code here:
        SearchesJPanel panel = new SearchesJPanel(userProcessContainerJPanel,carDirectory);
        userProcessContainerJPanel.add("UserWorkAreaJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainerJPanel.getLayout();
        layout.next(userProcessContainerJPanel);
        
        
    }//GEN-LAST:event_btnSearchesActionPerformed

    private void btnAddCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCarActionPerformed
        // TODO add your handling code here:

        AddCarJPanel panel = new AddCarJPanel(userProcessContainerJPanel,carDirectory);
        userProcessContainerJPanel.add("AddCarJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainerJPanel.getLayout();
        layout.next(userProcessContainerJPanel);

    }//GEN-LAST:event_btnAddCarActionPerformed

    private void btnUpdateCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCarActionPerformed
        // TODO add your handling code here:
        UpdateJPanel panel = new UpdateJPanel(userProcessContainerJPanel,carDirectory);
        userProcessContainerJPanel.add("UpdateJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainerJPanel.getLayout();
        layout.next(userProcessContainerJPanel);
    }//GEN-LAST:event_btnUpdateCarActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HomeJPanel;
    private javax.swing.JButton btnAddCar;
    private javax.swing.JButton btnSearches;
    private javax.swing.JButton btnUpdateCar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel labelCar;
    private javax.swing.JLabel lblCabImage;
    private javax.swing.JPanel topJPanel;
    private javax.swing.JPanel userProcessContainerJPanel;
    // End of variables declaration//GEN-END:variables
}
