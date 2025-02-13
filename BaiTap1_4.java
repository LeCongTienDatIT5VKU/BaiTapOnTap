package BaiTap1;

public class BaiTap1_4 {
	private int id;
	private String lastName;
	private int salary;
	
	public BaiTap1_4() {
	
	}
	public BaiTap1_4(int id, String lastName, int salary) {
		this.id = id;
		this.lastName = lastName;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAnnualSalary() {
		return salary * 12;
	}
	@Override
	public String toString() {
		return "BaiTap1_4 [id=" + id + ", lastName=" + lastName + ", salary=" + salary + "]";
	}
	
}
