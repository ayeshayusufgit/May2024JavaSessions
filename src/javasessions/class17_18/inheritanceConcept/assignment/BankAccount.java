package javasessions.class17_18.inheritanceConcept.assignment;

public class BankAccount {

	String accountNumber;
	double balance;
	String owner;

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		if (amount <= 0) {
			System.out.println("The amount cannot be zero or -ve, enter valid amount");
		} else if (balance <= 0) {
			System.out.println("The balance is -ve, withdraw cannot be performed, pls deposit money in account");
		} else if (amount > balance) {
			System.out.println("The amount to be withdrawn cannot be greater than the balance");
		} else {
			balance -= amount;
		}
	}

	public void printStatement() {
		System.out.println("account number=" + accountNumber + " owner name:" + owner + " balance:" + balance);
	}
}
