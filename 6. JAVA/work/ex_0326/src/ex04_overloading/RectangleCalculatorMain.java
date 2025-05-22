package ex04_overloading;

public class RectangleCalculatorMain {
	public static void main(String[] args) {
		RectangleCalculator r = new RectangleCalculator();
		r.area(3);
		r.area(4, 5);
		r.area(2.4, 3.3);
	}
}
