import java.io.*;

public class CheckingAccount{
    private double balance;
    private String accountNumber;

    public CheckingAccount(double balance, String accountNumber){
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount){
	this.balance += amount;
	System.out.println("$" + this.balance + " has been deposited");
    }

    public void withdraw(double amount) throws InsufficientFundsException{
        if (this.balance < amount){
		    throw new InsufficientFundsException(amount - balance);
        } 
        else {
            this.balance -= amount;
            System.out.println("The balance after withdraw is: $" + this.balance);
        }
    }

    public double getBalance(){
        return balance;
    }

    public void setNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public String getNumber(){
        return accountNumber;
    }

}
