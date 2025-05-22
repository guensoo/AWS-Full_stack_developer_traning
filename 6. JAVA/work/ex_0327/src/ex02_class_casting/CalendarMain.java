package ex02_class_casting;

public class CalendarMain {
	public static void main(String[] args) {
		DeskCalendar dc = new DeskCalendar("보라색", 6);
		dc.info(); // 자식클래스에 오버라이드 된 메서드
		dc.hanging(); // 부모클래스에 선언된 메서드
		dc.onTheDesk(); // 자식클래스에 선언된 메서드
		
		System.out.println();
		
		Calendar c = new DeskCalendar("검은색", 12);
		c.info();
		c.hanging();
		// DeskCalendar 객체임에도 Calendar타입을 가졌기 때문에
		// DeskCalendar의 멤버에는 접근할 수 없다.
		// c.onTheDesk(); // 사용불가
		
		
	}
}
