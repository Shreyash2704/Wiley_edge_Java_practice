package Core_Java;

public class BankAccount {
    private int accNumber;
    public int getAccNumber() {
		return accNumber;
	}


	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	private double balance;
    private String customerName;
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
