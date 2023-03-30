package studio7;

public class Rectangle {
	private double length;
	private double width;
	public Rectangle(double side1, double side2) {
		length = side1;
		width = side2;
	}
	
	public double getArea() {
		return length * width;
	}
	
	public double getPerimeter() {
		return (2 * length) + (2 * width);
	}
	
	public boolean compareArea(Rectangle other) {
		if(this.getArea() < other.getArea()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isSquare() {
		if(length == width) {
			return true;
		}
		else {
			return false;
		}
	}
	
public static void main(String[] args) {
	Rectangle test = new Rectangle(4, 5);
	System.out.println(test.getArea());
	System.out.println(test.getPerimeter());
	System.out.println(test.isSquare());
	Rectangle test2 = new Rectangle(7, 3);
	System.out.println(test.compareArea(test2));
}

}
