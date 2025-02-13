package BaiTap1;

public class BaiTap1_6<Account> {
	private String id;
	private String name;
	private int balance;
	
	public BaiTap1_6(String id, String name) {
		balance = 0;
		this.id = id;
		this.name = name;
	}

	public BaiTap1_6(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int credit(int amount) {
		return amount;
	}
	public int debit(int amount) {
		 if(amount <= balance ) {
			  return amount-balance;	
		 }
		return balance;
	}
	public int transferTo(Account another , int amount) {
		if(amount <= balance) {
			return amount-balance;
		}
		return balance;
	}

	@Override
	public String toString() {
		return "BaiTap1_6 [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
}
