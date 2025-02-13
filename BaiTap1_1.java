package BaiTap1;

public class BaiTap1_1 {
	private double radius;
	private String color;

	public BaiTap1_1() {
		
	}
	public BaiTap1_1(double radius) {
		this.radius = radius;
	}
	public BaiTap1_1(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}


	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;

	}

	public double getArea() {
		return radius * radius * Math.PI;
	}
}




