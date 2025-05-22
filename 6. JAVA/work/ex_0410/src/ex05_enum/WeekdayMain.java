package ex05_enum;

public class WeekdayMain {
	public static void main(String[] args) {
		Weekday today = Weekday.SUNDAY;
		
		if(today == Weekday.SUNDAY) {
			System.out.println("쉬는날 입니다.");
		} else {
			System.out.println("출근하는 날 입니다.");
		}
	}
	
	// Operation 열거형을 정의하고
	// 추상메서드 apply(int x, int y) 를 갖고 있다.
	// PLUS, MINUS, MULTI, DIV 상수를 가지고 있습니다.
	// main 메서드에서 모든 연산을 수행하여 출력하세요
}
