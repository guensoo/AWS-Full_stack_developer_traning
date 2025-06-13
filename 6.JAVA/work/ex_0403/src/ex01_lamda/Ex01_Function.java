package ex01_lamda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ex01_Function {
	public static void main(String[] args) {
		// Consumer인터페이스
		Consumer<String> c1 = t -> System.out.println(t);
		c1.accept("홍길동");
		
		//BiConsumer인터페이스
		BiConsumer<String, Integer> c2 = (x, y) -> System.out.println("입력값 1 : " + x + ", 입력값 2 : " + y);
		c2.accept("박길동", 100);
		
		// Supplier
		Supplier<Object> s1 = () -> new Object();
		System.out.println(s1.get());
		
		// Function 인터페이스
		Function<Integer, String> f1 = t -> String.valueOf(t);
		String str = f1.apply(100);
		System.out.println("문자열 str : " + str);
		
		// BiFunction
		BiFunction<String, String, Boolean> f2 = (x, y) -> x.equals(y);
		if(f2.apply("토마토", "토마토")) {
			System.out.println("두 문자열의 값은 같습니다.");
		}
		
		// Predicate
		Predicate<Integer> p1 = t -> t>=60; // boolean
		
		int score = 65;
		
		boolean pass = p1.test(score);
		
		if(pass) {
			System.out.println("홍길동 님의 점수는 " + score + "이고 합격입니다.");
		} else {
			System.out.println("홍길동 님의 점수는 " + score + "이고 불합격입니다.");
		}
	}
	
}
