package ex02_Stream;

public class Student implements Comparable<Student>{
	
	String name;
	int ban;
	int totalScore;
	
	public Student(String name, int ban, int totalScore) {
		this.name = name;
		this.ban = ban;
		this.totalScore = totalScore;
	}
	
	@Override
	public String toString() {
		return String.format("[%s, %d %d]", name, ban, totalScore).toString();
	}
	
	public int getBan() {
		return ban;
	}
	
	public String getName() {
		return name;
	}
	
	public int getTotalScore() {
		return totalScore;
	}
	
	// compareTo()
	// 객체를 서로 비교할 때 사요하는 메서드
	// 주로 정렬이나 비교연산에 사용된다.
	
	// int result = a.compareTo(b);
	
	// 반환값이 0이면 두 객체가 같다.
	// 반환값이 0보다 작으면 a가 b보다 작다.
	// 반환값이 0보다 크면 a가 b보다 크다.
	
	@Override
	public int compareTo(Student s) {
		// 내가 매개변수로 전달한 객체의 총점 - 메서드를 호출한 객체의 총점
		return s.totalScore - this.totalScore;
	}
}
