package tdd_Training;

public class BankAccount {
	
	private String accountId;
	private double balance;
	
	public BankAccount(String accountId, double balance) {
		this.accountId = accountId;
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) throws Exception {
		if (amount <= 0)
			throw new Exception("Amount should be greater than 0");
		this.balance += amount;
	}
	
	public void withDraw(double amount) throws Exception {
		if (amount <= 0)
			throw new Exception("amount should be greater than 0");
		if (balance < amount)
			throw new Exception("Insufficient Balance in your account");
		this.balance -= amount;
	}
	
	public void setAccountId(int accountId) throws Exception {
		if (accountId != 10)
		{
			throw new Exception("Account id should be of length 10 characters");
		}
	}
	
	
}
