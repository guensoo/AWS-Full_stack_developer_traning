package ex05_Generic;

import java.util.ArrayList;
import java.util.List;

class Fruit{};

class Apple extends Fruit{};
class Banana extends Fruit{};

class FruitBox<T>{
	// List : 제한이 없는 인덱스를 가지는 배열같은 자료구조
	List<T> fruits = new ArrayList<>();
	
	public void add(T fruit) {
		fruits.add(fruit);
	}
}

public class Ex01_Generic {
	public static void main(String[] args) {
		FruitBox<Fruit> box = new FruitBox<>();
		
		// 제네릭 타입은 다형성의 원리가 적용된다.
		box.add(new Fruit());
		box.add(new Apple());
		box.add(new Banana());
	}
}
