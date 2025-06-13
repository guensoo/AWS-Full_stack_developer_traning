package ex02_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex01_Stream {
	public static void main(String[] args) {
		// 1. 배열로부터 생성
		String[] fruits = {"Apple", "Banana", "Cherry"};
		Stream<String> fruitStream = Arrays.stream(fruits);
		
		fruitStream.forEach(System.out::println);
		
		// 기본자료형의 배열
		// IntStream, DoubleStream, LongStream으로 처리된다.
		int[] numbers = {1,2,3,4};
		IntStream numberStream = Arrays.stream(numbers);
		numberStream.forEach(System.out::println);
		
		// 2. 컬렉션으로부터 생성
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
		Stream<String> nameStream = names.stream();
		nameStream.forEach(System.out::println);
		
		// 3. Stream.of()로 직접 생성
		// 메서드 안에 직접 값을 나열해서 스트림을 만들 수 있다.
		Stream<String> stream = Stream.of("A", "B", "C");
		stream.forEach(System.out::println);
		
		// 4. 비어있는 스트림 생성
		// 처음부터 아무 요소도 없는 빈 스트림을 생성
		// Stream.empty()를 사용한다.
		Stream<String> emptyStream = Stream.empty();
		System.out.println(emptyStream.count());
		
		// 5. 기본형 스트림
		
	}
}
