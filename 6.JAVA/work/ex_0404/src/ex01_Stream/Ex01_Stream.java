package ex01_Stream;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex01_Stream {
	public static void main(String[] args) {
		// 무한스트림
		// Stream.generate()
		// 무한하게 값을 만들어내는 스트림
		// 무한스트림은 반드시 limit()으로 개수를 제한하는 것이 좋다.
		Stream<String> stream = Stream.generate(() -> "Hello").limit(3);
		stream.forEach(System.out::println);
		
		// Stream.iterate()
		Stream<Integer> stream2 = Stream.iterate(1, n -> n+2).limit(5);
		stream2.forEach(System.out::println);
		
		// 기본자료형스트림
		// int -> IntStream
		// long -> LongStream
		// double -> DoubleStream
		
		IntStream intStream = IntStream.of(1,2,3,4,5);
		IntStream.range(1, 5); // 1 ~ 4
		IntStream.rangeClosed(1, 5); // 1 ~ 5
		
		System.out.println("--------------------------------------");
		
		// Random클래스를 통한 스트림 생성
		// ints() : IntStream을 생성
		// ints(개수, 시작값, 종료값)
		Random random = new Random();
		random.ints(10,1,4).forEach(System.out::println);
		
//		OptionalInt optInt = OptionalInt.empty();
//		System.out.println(optInt.getAsInt());
		
		Optional<String> opt = Optional.ofNullable(null);
		System.out.println("opt="+opt);
	}
}
