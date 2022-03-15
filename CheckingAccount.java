import java.io.*;

public class CheckingAccount{
    private double balance;
    private String accountNumber;

    public CheckingAccount(double balance, String accountNumber){
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount){
        if (amount < 0) {
		throw new IllegalArgumentException("Exception: Deposited amount must be positive.");
	}else {
            	this.balance += amount;
	}    
		System.out.println("$" + this.balance + " has been deposited");
    }

    public void withdraw(double amount) throws InsufficientFundsException{
        if (amount < 0){
            	throw new IllegalArgumentException("Exception: Withdrawal amount must be positive.");
        }
        else if (this.balance < amount){
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
