package ex02_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exam1 {
	public static void main(String[] args) {
		// 짝수만 출력하기
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		numbers.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
		
		// 문자열을 대문자로 변환하여 리스트로 수집하기
		List<String> words = Arrays.asList("java", "stream", "lamda");
		words.stream()
			.map(t -> t.toUpperCase())
			.collect(Collectors.toList())
			.forEach(System.out::println);
	}
}
