package entities;

public class Rectangle {
	public double width;
	public double height;
	
		public double area() {
			return width * height;
		}
		public double perimeter() {
			return 2 * (width + height);
		}
		public double diagonal() {
			double d = Math.PI;
			System.out.printf("valor de d: %.2f%n", d);
			return Math.sqrt(width * width + height * height);
		}
	
	
}
