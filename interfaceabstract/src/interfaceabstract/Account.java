/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaceabstract;

/**
 *
 * @author sekar ambar arum
 */
//interface implement
public class Account implements InterfaceBankAccount {
    String accountName;
    String accountNum;
    int balance;

    public Account(String name, String num){
        this.accountName = name;
        this.accountNum = num;
        balance = 0;
    }



    Account(String lendy_Elhadi, String string, int i) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    Account(String lendy_Elhadi, String string, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void deposit(int i) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    void print() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    boolean getBankName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

//abstract extends
public class Account extends AbstractBankAccount {
    private static double bagihasil = 0.1;
    
    public Account(String name, String num, int amt){
        super(name, num, ((int)Account.calculateBonus(amt) + amt));
    }
    
    private static double calculateBonus(int amt){
        return bagihasil*amt;
    }
    
    @Override
    public void deposit(int amt) {
        this.balance += amt;
    }

    @Override
    public void withdraw(int amt) {
        this.balance -= amt;
    }

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public String getBankName() {
        return this.BANK;
    }
    
    public void print(){
        System.out.println("Bank Name: " + this.getBankName()
                            + "\nAccount Name: " + this.accountName
                            + "\nAccount Number: " + this. accountNum
                            + "\nBalance: " + this.balance);
    }
    
}
