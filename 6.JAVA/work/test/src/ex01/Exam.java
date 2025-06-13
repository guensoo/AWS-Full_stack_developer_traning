package ex01;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Exam {
	// 4. 주어진 배열에서 중복된 값을 제거하는 메서드를 작성하세요.
	// - 메서드명 : removeDuplicates
	// - 매개변수 : 정수형 배열
	// - 반환값 : 정수형 배열
	public static void removeDuplicates(int[] x) {
		Set<Integer> arr = new HashSet<>();
		for(int i : x) {
			arr.add(i);
		}
		System.out.println(arr);
		// 4. 25.(금) 시험 후
		// 반환값이 정수형 배열이란다 근수근수야......
		// 왜 Set으로 반환하니...ㅠㅠ
	}
	
	// 5. 주어진 숫자 배열에서 가장 큰 값을 찾는 메서드를 작성하세요.
	public static int max(int[] x) {
		int max = 0;
		for(int num : x) {
			if(num >= max) {
				max = num;
			}
		}
		return max;
	}
	
	// 7. Map을 사용하여 주어진 단어들의 빈도를 계산하는 메서드를 작성하고 결과를 출력하세요
	// - 주어진 문장
	// String text = "apple banana apple apple orange banana apple orange orange";
	// - 메서드명 : wordFrequency
	// - 매개변수 : 문자열
	// - 반환값 :  Map
	// 결과
	// apple: 4
	// banana: 2
	// orange: 3
	 public static Map<String, Integer> wordFrequency(String s) {
		 Map<String, Integer> result = new HashMap<>();
		 String[] words = s.split(" ");
		 for(String word : words) {
			 result.put(word, result.getOrDefault(word, 0)+1);
		 }
		 return result;
		 
	 }

	// 9. int타입의 변수 num이 있을 때, 각 자리의 합을 더한 결과를 출력하는 메서드 만들기
	// 만일 변수 num의 값이 12345라면, '1+2+3+4+5'의 결과인 15를 출력하라.
	// - 메서드명 : sumOfDigits
	// - 매개변수 : 정수
	// - 반환값 : 정수
	 public static int sumOfDigits(int x) {
		 int sum = 0;
		 while(x > 0) {
			 sum += x % 10;
			 x /= 10;
		 }
		 return sum;
	 }
}
