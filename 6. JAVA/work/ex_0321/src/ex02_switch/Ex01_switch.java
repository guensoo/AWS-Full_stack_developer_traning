package ex02_switch;

public class Ex01_switch {
	public static void main(String[] args) {
		// switch(비교값) {
		// 		case 조건값:
		// 			비교값과 조건식이 일치할 때 실행할 문장.
		// 			break;
		// 		case 조건값:
		// 			비교값과 조건식이 일치할 때 실행할 문장.
		// 			break;
		// 		case 조건값:
		// 			비교값과 조건식이 일치할 때 실행할 문장.
		// 			break;
		// 		case 조건값:
		// 			비교값과 조건식이 일치할 때 실행할 문장.
		// 			break;
		// 		조건값이 하나도 일치하지 않으면 완전히 빠져나간다.
		//		default:
		// 			비교값과 일치하는 조건값이 없을 때 실행 할 문장
		// }
		
		// switch문의 비교값으로 사용 가능한 자료형
		// 1) 정수(byte, short, int)
		// 2) 문자형(char)
		// 3) 문자열(String)
		
		int num = 7;
		
		switch(num) {
		case 1:
			System.out.println("num은 1입니다.");
			break;
		case 7:
			System.out.println("num은 7입니다.");
			break;
		default:
			System.out.println("num은 1도 7도 아닙니다.");
			break;
		}
		
		String str = "홍";
		String result = null;
		
		switch(str) {
		case "박":
			result = "박길동";
			break;
		case "김":
			result = "김길동";
			break;
		case "이":
			result = "이길동";
			break;
		case "홍":
			result = "홍길동";
			break;
		}
		System.out.println(result);
		
		// 비교값과 조건값의 타입이 일치해야 한다.
		// case에 들어가는 조건값들은 겹칠 수 없다.
		
	}
}
