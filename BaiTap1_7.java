package BaiTap1;

public class BaiTap1_7 {
	private int day;
	private int month;
	private int year;
	
	public BaiTap1_7() {
		
	}
	public BaiTap1_7(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setDate(int day,int month,int year) {
	this.day=day;
	this.month=month;
	this.year=year;
	
}
	@Override
	public String toString() {
		return "BaiTap1_7 [day=" + day + ", month=" + month + ", year=" + year + "]";
	}	
}
