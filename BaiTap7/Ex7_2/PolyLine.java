package BaiTap7.Ex7_2;

import java.util.ArrayList;
import java.util.List;

class PolyLine {
	private List<Point> points;

	public PolyLine() {
		this.points = new ArrayList<>();
	}
	public PolyLine(List<Point> points) {
		this.points = new ArrayList<>(points);
	}
	public void appendPoint(int x, int y) {
		points.add(new Point(x, y));
	}
	public void appendPoint(Point point) {
		points.add(point);
	}
	public double getLength() {
		double length = 0;
		for (int i = 1; i < points.size(); i++) {
			length += points.get(i - 1).distance(points.get(i));
		}
		return length;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("{");
		for (Point p : points) {
			sb.append(p.toString());
		}
		sb.append("}");
		return sb.toString();
	}
}
