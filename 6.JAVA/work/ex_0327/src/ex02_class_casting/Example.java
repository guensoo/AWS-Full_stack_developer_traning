package ex02_class_casting;

class Parent{};

class Child extends Parent{};

public class Example {
	public static void main(String[] args) {
		Parent p1 = new Parent(); // 부모타입의 p1 객체 생성
		Child c1 = new Child(); // 자식타입의 c1객체를 생성
		
		Parent p2 = new Child(); // 자동 타입 변환
		Parent p3 = c1; // 이미 만들어진 자식객체에 대한 타입 변경
		// Child c2 = p1; // 자동 타입변환이 되지 않는다.
		
		// 기본자료형끼리 비교를 할 때 == 연산자는 값이 같은지 비교하지만
		// 객체끼리 비교할 때 == 연산자는 주소값을 비교한다.
		if(p3 == c1) {
			System.out.println("p3와 c1은 같은 객체를 참조하고있다.");
		}
	}
}
