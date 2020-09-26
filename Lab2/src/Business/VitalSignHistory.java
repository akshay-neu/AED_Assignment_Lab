/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import java.util.ArrayList;
/**
 *
 * @author Akshay
 */
public class VitalSignHistory {
    private ArrayList<VitalSigns> vitalSignHistory;

    public VitalSignHistory() {
        vitalSignHistory = new ArrayList<VitalSigns>();
    }
    
    public ArrayList<VitalSigns> getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<VitalSigns> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
    public VitalSigns addVitals() {
        
        VitalSigns vs = new VitalSigns(); //create new VitalSigns
        vitalSignHistory.add(vs); //add in the ArrayList
        return vs; //retun the value
    }
    
    public void deleteVitals(VitalSigns v) {
        
        vitalSignHistory.remove(v);
        
    }
}
