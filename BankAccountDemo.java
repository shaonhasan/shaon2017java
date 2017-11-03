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
public class BankAccountDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        bankaccount a = new bankaccount();
        a.accountNumber = 100011;
        a.accountName = "Shaon";
        a.voterIdNumber = 201710;
        a.balance = 1000;
        a.deposite(100);

              System.out.printf("Account Number = %d\nVoter ID = %d\nBalance = %.2f\n", a.accountNumber, a.voterIdNumber,a.balance );
    }
    
}
