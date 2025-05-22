package ex01;

public class Box<T> {
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
	
	private T value;
	
	public void set(T value) {
		this.value = value;
	}
	
	public T get() {
		return value;
	}
}
