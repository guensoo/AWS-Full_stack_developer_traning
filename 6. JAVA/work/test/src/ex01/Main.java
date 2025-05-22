package ex01;

import java.util.Map;

public class Main extends Exam{
	public static void main(String[] args) {
		// 4. 주어진 배열에서 중복된 값을 제거하는 메서드를 작성하세요.
		// - 메서드명 : removeDuplicates
		// - 매개변수 : 정수형 배열
		// - 반환값 : 정수형 배열
		int[] i_arr = {1,1,1,2,2,2,2,3,3,3,4,4,4,4,4,5,5,5,5,5};
		removeDuplicates(i_arr);
		
		// 5. 주어진 숫자 배열에서 가장 큰 값을 찾는 메서드를 작성하세요.
		int[] f_arr = {3,2,5,7,9,4,2,1,6,8};
		
		System.out.println(max(f_arr));
		
		// 6. '학생' 클래스를 작성하고, '이름', '나이', '학번'을 인스턴스 변수로 가지며 이를 출력하는 메서드를 작성하세요.
		Student student = new Student("홍길동", 24, 1223);
		System.out.println(student.info());
		
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
		String text = "apple banana apple apple orange banana apple orange orange";
		Map<String, Integer> result = wordFrequency(text);
		
		for(Map.Entry<String, Integer> map : result.entrySet()) {
			System.out.println(map.getKey()+" : "+map.getValue());
		}
		
		// 9. int타입의 변수 num이 있을 때, 각 자리의 합을 더한 결과를 출력하는 메서드 만들기
		// 만일 변수 num의 값이 12345라면, '1+2+3+4+5'의 결과인 15를 출력하라.
		// - 메서드명 : sumOfDigits
		// - 매개변수 : 정수
		// - 반환값 : 정수
		int num = 12345;
		System.out.println(sumOfDigits(num));

		// 10. 제네릭을 이용한 박스 클래스 만들기
		// - Box 클래스를 정의합니다. 
		// - 이 클래스는 제네릭 타입 T를 가지는 필드 value가 있습니다.
		// - Box 클래스에는 다음과 같은 메서드를 구현합니다.
		// - set(T value) : 객체를 박스에 담는 메서드
		// - get() : 박스에서 객체를 꺼내는 메서드
		// - Main 클래스에서 Box 클래스를 사용하여 다양한 타입의 객체를 담고 꺼내는 예시를 보여주세요.
		// 예시: Integer, String, Double 타입 객체를 담을 수 있도록 합니다.
		// 출력예시
		// Integer 박스의 값: 10
		// String 박스의 값: Hello, Generics!
		// Double 박스의 값: 3.14
		Box<Integer> i = new Box();
		Box<String> s = new Box();
		Box<Double> d = new Box();
		i.set(10);
		s.set("Hello, Generics!");
		d.set(3.14);
		
		System.out.println("Integer 박스의 값 : "+i.get());
		System.out.println("String 박스의 값 : "+s.get());
		System.out.println("Double 박스의 값 : "+d.get());
		
	}
	
	
}
