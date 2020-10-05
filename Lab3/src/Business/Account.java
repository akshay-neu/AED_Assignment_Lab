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
public class Account {
    private String routingNumber;
    private String accountNumber;
    private String bank;
    private int balance;
    private Date createdOn;

    public Account() { //default constructor
     //return type of the constructor is the obj of the class itself   
        this.createdOn = new Date(); //no need of setter method, as have explicilty assigned it here
        
    }
    
    @Override
    public String toString(){
        return bank; //instead of address of the variable, the bank name value will be displayed in the jTable
        
    }
    
    
    public String getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Date getCreatedOn() {
        return createdOn;
    }
    


}
