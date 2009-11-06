package mots;

public class Point {
	private double x, y;

	public Point() {
		this.x = 0;
		this.y = 0;
	}
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public void translate(double x, double y) {
		this.x += x;
		this.y += y;
	}

	public void translateX(double x) {
		translate(x, 0);
	}

	public void translateY(double y) {
		translate(0, y);
	}
	
	public void translate(Point p) {
		translate(p.getX(), p.getY());
	}
	
	public double distance(Point p) {
		return Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
	}
}
