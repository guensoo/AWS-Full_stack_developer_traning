package ex01_lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

class User{
	private String name;
	private int age;
	
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String sayHello() {
		return "Hello";
	}
}

public class Ex04_Function {
	public static void main(String[] args) {
		System.out.println("2. 개선된 반복문");
		List<String> names = Arrays.asList("Java", "Python", "C++");
		
		// 1. 반복문
		for(int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		// 2. 향상된 for문(enhanced for)
		System.out.println("2. 개선된 반복문");
		for(String s : names) {
			System.out.println(s);
		}
		
		// 3. forEach()
		System.out.println("3. forEach");
		
		// names.forEach(x -> System.out.println(x));
		names.forEach(System.out::println);
		
		// 정적메서드의 참조
		// static이 붙어있는 메서드
		// 객체를 생성하지 않아도 사용할 수 있다.
		// Math.random()
		// Arrays.toString()
		// Integer.parseInt()
		// Function<String, Integer> parse = t -> Integer.parseInt(t);
		Function<String, Integer> parse = Integer::parseInt;
		
		int result = parse.apply("123");
		System.out.println(result);
		
		System.out.println("----------------------------------");
		
		// 생성자 참조
		// Supplier<ArrayList<String>> listSupplier = new ArrayList();
		Supplier<ArrayList<String>> listSupplier = ArrayList::new;
		
		ArrayList<String> list = listSupplier.get();
		
//		public User apply(String name, int age) {
//			return new User(name, age);
//		}
		
		// (String name, int age) -> {return new User(name, age)};
		
		// (name, age) -> new User(name, age);
		
		// User::new
		
//		BiFunction<String, Integer, User> userCreator = (name, age) -> new User(name, age);
		BiFunction<String, Integer, User> userCreator = User::new;
		
		User u = userCreator.apply("Alice", 30);
		
		System.out.println("----------------------------------");
		
		// 특정 타입의 인스턴스메서드 참조
		// Function<String, Integer> getLength = s -> s.length;
		Function<String, Integer> getLength = String::length;
		int length = getLength.apply("hellow");
		System.out.println("문자열의 길이 : " + length);
		
		// Function<User, String> hello = t -> t.sayHello();
		Function<User, String> hello = User::sayHello;
		
		User u2 = new User("홍길동", 30);
		System.out.println(hello.apply(u2));
	}
}
