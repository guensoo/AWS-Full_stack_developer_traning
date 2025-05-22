package ex03_Polymorphism;

abstract class Animal{
	public abstract void cry();
}
// 추상클래스를 상속받으면 반드시 추상메서드를 오버라이드 해야한다.
class Pig extends Animal{
	@Override
public void cry() {
	System.out.println("꿀꿀");
	}
}

class Cow extends Animal{
	@Override
	public void cry() {

		System.out.println("음메");
	}
}


class Farm{
	public void sound(Animal animal) {
		// 들어온 객체에 따라서 오버라이딩된 메서드가 호출이 된다.
		animal.cry();
	}
	public void sound(Animal animal) {
		if(animal instanceof Pig) {
			System.out.println("꿀꿀");
		} else {
			System.out.println("음메");
		}
	}
}


public class FarmTest {
	public static void main(String[] args) {
		Farm f = new Farm();
		Pig p = new Pig();
		Cow c = new Cow();
		f.sound(p);
		f.sound(c);
	}
}
