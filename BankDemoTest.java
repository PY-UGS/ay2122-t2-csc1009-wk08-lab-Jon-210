import java.util.Scanner;

public class BankDemoTest {

	public static void main(String[] args) {
		try(Scanner input = new Scanner(System.in)){

		    CheckingAccount account = new CheckingAccount(0,"123-123-123");

		    System.out.print("Deposit amount: ");
		    double amount = input.nextDouble();

		    account.deposit(amount);

		    System.out.print("Withdrawal amount: ");
		    amount = input.nextDouble();

		    account.withdraw(amount);

		}catch(InsufficientFundsException e){
			System.out.println("Sorry, but your account is short by: $" + e.getAmount());
		}
	}

}
