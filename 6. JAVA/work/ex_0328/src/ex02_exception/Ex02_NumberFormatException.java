package ex02_exception;

public class Ex02_NumberFormatException {
	public static void main(String[] args) {
		// 잚소된 문자열을 숫자로 형 변환할 때 발생
		String str01 = "11";
		String str02 = "11.2";
		
		int num01 = Integer.parseInt(str01);
		
		System.out.println("String to int : "+num01);
		
		// 실수 형태의 문자열을 정수로 변환
		int num02 = Integer.parseInt(str02);
		
		System.out.println("String to int : "+num02);
		
	}
}
