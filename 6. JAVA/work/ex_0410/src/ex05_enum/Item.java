package ex05_enum;

// 열거형
// 상수들의 집합을 나타내는 특별한 데이터 타입
// 기본적으로 자바의 모든 열거형은 java.leng.Enum클래스를 상속받는다.
// name() : 열거형 상수 이름을 반환(START, STOP, EXIT)
// ordinal() : 열거형 상수의 선언 순서를 리턴(왼쪽부터 0으로 시작)
// values() : 모든 enum 상수를 배열로 반환
// valueOf(String name) : 매개변수로 전달된 name으로 상수를 찾는다.

// 특별한 형태의 클래스다.
// 클래스처럼 필드, 생성자, 메서드를 가질 수 있다.
public enum Item {
	// public static final Item START = new Item();
	// 객체를 만들기 위한 생성자를 호출하는 것이라고 생각한다.
	// 각각의 상수들은 Item클래스로 만든 객체라고 생각하면 된다.
	START("시작", ">"), // Item START = new Item("시작");
	STOP("정지","||"),
	EXIT("종료","X");
	
	// 각각의 상수에 필드 추가하기
	
	//필드의 선언
	String itemStr;
	String symbol;
	
	// 생성자의 선언
	// 열거형의 생성자는 기본적으로 private
	private Item(String itemStr, String symbol){
		this.itemStr = itemStr;
		this.symbol = symbol;
	}
	
	// 메서드의 선언
	public String getItemStr() {
		return itemStr;
	}
	
	public String getSymbol() {
		return symbol;
	}
	// 각각의 상수에 필드 추가하기
}
