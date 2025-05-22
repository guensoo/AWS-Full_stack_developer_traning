package ex01_Stream;

import java.util.Optional;

public class Ex02_Optional {
	public static void main(String[] args) {
		// 스트림의 최종결과를 Optional로 반환하는 것 들이 있었다.
		// 제네릭클래스로 T타입의 객체를 감싸는 Wrapper클래스이다.
		
		Optional<String> optStr = Optional.of("abcde");
		// opStr에 들어있는 글자의 수를 반환받기
		// Optional<Integer> optInt = optStr.map(t -> t.length());
		Optional<Integer> optInt = optStr.map(String::length);
		System.out.println("optStr="+optStr.get());
		System.out.println("optInt="+optInt.get());
		
		int result1 = Optional.of("123")
			.filter(x -> x.length() > 0)
			.map(Integer::parseInt)
			.get();
		
		System.out.println("result1 = "+result1);
		
		
	}
}
