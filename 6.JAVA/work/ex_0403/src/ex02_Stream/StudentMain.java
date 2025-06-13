package ex02_Stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class StudentMain {
	public static void main(String[] args) {
		Student[] students = {
				new Student("이자바", 3, 300),
				new Student("박자바", 1, 200),
				new Student("김자바", 2, 100),
				new Student("조자바", 2, 150),
				new Student("나자바", 1, 290),
				new Student("강자바", 3, 180)
		};
		
		// Comparator.comparing()
		// 첫번째 정렬 기준을 설정할 때 사용
		
		// thenComparing()
		// 다음에 두번째, 세번째 정렬 기준을 연결할 때 사용
		Stream.of(students)
		// 메서드의 참조가 아니라 람다식을 쓰게 되면, 타입의 추론이 불안전하게 될 수 있다.
		// 컴파일러가 getBan()을 못찾는 일이 생길 수 있다.
		// 자바에서 람다식은 타입을 명시하지 않아도 컴파일러가 문맥을 통해
		// 타입을 유추하려고 한다.
		// comparing의 반환타입이 Comparator<T>인데
		// reversed()를 붙히면 타입 유추가 한 단계 더 복잡해진다.
		// 그래서 람다식 안의 t의 타입 추론이 실패할 수 있다.
			// .sorted(Comparator.comparing(t -> t.getBan())
			// .thenComparing(t -> t.getTotalScore()).reversed())
			.sorted(Comparator.comparing(Student::getBan)
			.thenComparing(Student::getTotalScore))
			.forEach(System.out::println);
		
	}
}
