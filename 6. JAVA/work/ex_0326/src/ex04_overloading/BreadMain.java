package ex04_overloading;

public class BreadMain {
	public static void main(String[] args) {
		Bread b = new Bread();
		b.make();
		b.make(2);
		b.make("크림", 3);
	}
}
