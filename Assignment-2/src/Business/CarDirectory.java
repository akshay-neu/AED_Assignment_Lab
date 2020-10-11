/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author Akshay
 */
public class CarDirectory {

    
    private ArrayList<Car> carList;
    private static HashSet<String> brandNameDirectory;
    
    
    public static void setBrandNameDirectory(String brandNameDirectory) {
        CarDirectory.brandNameDirectory.add(brandNameDirectory);
    }
    
 public static HashSet<String> getBrandNameDirectory() {
        return brandNameDirectory;
    }
    
    
    public CarDirectory(){
        
        this.carList = new ArrayList<Car>();
        this.brandNameDirectory = new HashSet<String>();
        
    }
    
    //Add a car details function
    public Car addCar(){
        Car car = new Car();
        carList.add(car);
        return car;
    }
    
    //Search car details by the given serial number function
    public Car searchCar(String serailNumber)
    {for(Car car: carList)
      {if(car.getSerialNumber().equals(serailNumber))
       {return car;}}
      return null;          
    }  
  
    //Delete selected Car Function    
    public void deleteCar(Car car)
    {     carList.remove(car);}
         
    //First Available Car Search Function
    public Car firstAvailableCar(String location){
        for(Car car: carList){
            if(car.getCity().equals(location) && car.getAvailabilityStatus().equalsIgnoreCase("yes")){
                return car;
            }
        }
        return null;
    }
    
    
    public ArrayList<Car> getCarList() {
        return carList;
    }

    public void setCarList(ArrayList<Car> carList) {
        this.carList = carList;
    }

    //Minimum Maximum Seats Function
    public Car MinMaxSeats(int min, int max) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     
        for(Car car: carList){
            if(car.getSeatNumber()>= min && car.getSeatNumber() <= max){
                return car;
            }
        }
        return null;
    }
    
    //Search By Serial Number Function
    public Car searchCarBySerialNumber(String text) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for(Car car: carList){
            if(car.getSerialNumber().equals(text)){
                return car;
            }
        }
        return null;
        }
    
    
    
    //Search Serial Number
     public String searchSerialNumber(String text) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for(Car car: carList){
            if(car.getSerialNumber().equals(text)){
                return text;
            }
        }
        return null;
        }
    
    //Search By Model Number Function
    public Car searchCarByModelNumber(String text) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
     for(Car car: carList){
            if(car.getModelNumber().equals(text)){
                return car;
            }
        }
        return null;
    }

    //Search By City
    public Car searchCarByCity(String text) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    for(Car car: carList){
            if(car.getCity().equals(text)){
                return car;
            }
        }
        return null;
    }
        
        
}
    
 
