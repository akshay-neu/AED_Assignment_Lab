/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import java.util.Date;
/**
 *
 * @author Akshay
 */
public class Car {
    private String modelNumber;
    private String brandName;
    private int seatNumber;
    private String serialNumber;
    private int manufacturingYear;
    private String availabilityStatus;
    private Date certificateExpiration;
    private String city;
    
    public String toString(){
        return serialNumber;
        
    }
    public String getModelNumber() {return modelNumber; }

    public void setModelNumber(String modelNumber) {this.modelNumber = modelNumber;}

    public String getBrandName() {return brandName;}

    public void setBrandName(String brandName) {this.brandName = brandName;}

    public int getSeatNumber() {return seatNumber;}

    public void setSeatNumber(int seatNumber) {this.seatNumber = seatNumber;}

    public String getSerialNumber() {return serialNumber;}

    public void setSerialNumber(String serialNumber) {this.serialNumber = serialNumber;}

    public int getManufacturingYear() {return manufacturingYear;}

    public void setManufacturingYear(int manufacturingYear) {this.manufacturingYear = manufacturingYear;}

    public String getAvailabilityStatus() {return availabilityStatus;}

    public void setAvailabilityStatus(String availabilityStatus) {this.availabilityStatus = availabilityStatus;}

    public Date getCertificateExpiration() {return certificateExpiration;}

    public void setCertificateExpiration(Date certificateExpiration) {this.certificateExpiration = certificateExpiration;}

    public String getCity() {return city;}

    public void setCity(String city) {this.city = city;}

    
    
    
    
}
