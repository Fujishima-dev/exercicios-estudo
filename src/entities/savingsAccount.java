package entities;

public class savingsAccount extends Account{

	private double interestRate;
	
	public savingsAccount() {
		super();
	}

	public savingsAccount(int number, String holder, double balance, double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
    
	public void updateBalance() {
		   balance = balance * interestRate;
	}
     @Override
	 public final void withdraw(double amount) {
  	   balance -= amount;
  }
}
