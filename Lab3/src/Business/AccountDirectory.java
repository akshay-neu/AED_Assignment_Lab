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
public class AccountDirectory {
     private ArrayList<Account> accountList;

    public AccountDirectory() {
        this.accountList = new ArrayList<Account>();
        
        
    }
    
    public Account addAccount(){
        Account account = new Account();// create new account
        accountList.add(account);// add in the arraylist
        return account;// return the value
    }
    
    
     public void deleteAccount(Account account){
         accountList.remove(account);// delete the account from the arraylist
     }
     
     public Account searchAccount(String accountNumber){
         for(Account account : accountList){
             if(account.getAccountNumber().equals(accountNumber)){
               return account;  
             }
             
         }    
         
         return null;
     }
     
    public ArrayList<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(ArrayList<Account> accountList) {
        this.accountList = accountList;
    }
    
    
}
