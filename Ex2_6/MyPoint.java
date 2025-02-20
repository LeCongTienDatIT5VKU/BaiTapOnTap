package Ex2_6;

public class MyPoint {
	private int x;
	private int y;

	public MyPoint() {
		x = 0;
		y = 0;
	}

	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int[] getXY() {
		return new int[] { x, y };
	}
	public void setXY(int x,int y) {
		this.x=x;
		this.y=y;
	}

	@Override
	public String toString() {
		return String.format("%.2f",x,"%.2f", y);
	}
	public double distance(int x, int y) {
		return Math.sqrt((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y));
	}
	public double distance(MyPoint another) {
		return Math.sqrt((another.x-this.x)*(another.x-this.x)+(another.y-this.y)*(another.y-this.y));
	}
}
