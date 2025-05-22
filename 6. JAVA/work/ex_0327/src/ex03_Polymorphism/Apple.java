package ex03_Polymorphism;

public class Apple extends Computer{
	@Override
	public void powerOn() {
		super.powerOn();
		System.out.println("Apple");
	}
}
