package ex02_switch;

public class Ex03_switch {
	public static void main(String[] args) {
		// java 12이상으로 업데이트 되면서
		// switch의 문법이 새롭게 만들어졌다.
		// 조건절에 복수개의 값을 사용하는 것이 가능해졌다.
		// 화살표 표현식을 이용하는게 가능하다.
		
//		String day = "SUNDAY";
//		switch(day) {
//		case "MONDAY":
//		case "TUEDAY":
//		case "WENDSDAY":
//		case "THURSDAY":
//		case "FRIDAY":
//			System.out.println("평일");
//			break;
//		case "SATURDAY":
//		case "SUNDAY":
//			System.out.println("주말");
//			break;
//		default:
//			System.out.println("잘못된 입력입니다.");
//			break;
//		}
		
		// 기존의 switch문과는 달리 case에 해당하는 절만 실행되고,
		// 그 후의 case는 실행되지 않는다.
		String day = "MONDAY";
		switch(day) {
		case
			"MONDAY",
			"TUEDAY", 
			"WENDSDAY", 
			"THURSDAY", 
			"FRIDAY" -> System.out.println("평일");
		case
		"SATURDAY",
		"SUNDAY" ->	System.out.println("주말");
		default ->	System.out.println("잘못된 입력입니다.");
		}
	}
}
