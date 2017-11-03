/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.account.demo;

/**
 *
 * @author Asus
 */
public class bankaccount {
    int accountNumber;
    String accountName;
    int voterIdNumber;
    float balance;
    
    void withdraw(int amount){
        if(amount > 0 && amount <= balance)
        balance = balance - amount;
         }
    void deposite(int amount){
        balance = balance + amount;
         }
    float getBalance(){
        return balance;
    }
}

