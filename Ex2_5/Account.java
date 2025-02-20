package Ex2_5;

public class Account {
	private int id;
	private Customer customer;
	private double balance;

	public Account(int id, Customer customer, double balance) {
		this.id = id;
		this.customer = customer;
		this.balance = balance;
	}

	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getBalance() {
		return balance;

	}

	public void setBalance(double balance) {
		this.balance = balance;
		balance = 0.0;
	}

	public String getCustomerName() {
		return customer.getName();
	}

	@Override
	public String toString() {
		return "id=" + id + "customer=" + customer + "balance=" + String.format("%.2f", balance);
	}

	public Account deposit(double amount) {
		balance += amount;
		return this;
	}

	public Account wwithdraw(double amount) {
		if (balance >= amount) {
			amount -= balance;
		} else {
			System.out.println("amount withdrawn exceeds the current balance");
		}
		return this;
	}
}
