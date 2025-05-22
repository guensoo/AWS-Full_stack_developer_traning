package ex03_this;

public class Phone {
	String brand;
	int series;
	String color = "검정색";
	
	public Phone(String b, int s) {
		brand = b;
		series = s;
	}
	
	// this()
	// 같은 클래승 ㅏㄴ에 있는 생성자 중 매개변수의 개수, 자료형, 순서에 맞는
	// 다른 생성자를 호출하는 메서드로 생성자 냅주에서만 사용할 수 있다.
	
	public Phone(String b, int s, String c) {
		// this 생성자는 첫줄에서만 생성 가능
		this(b,s);
		color = c;
		// this(b,s); // 에러발생 사용불가
	}
	
	public void PhoneInfo() {
		System.out.println(color+" "+brand+" "+series);
	}
}
