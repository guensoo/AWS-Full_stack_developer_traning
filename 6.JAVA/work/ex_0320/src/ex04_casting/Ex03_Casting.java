package ex04_casting;

public class Ex03_Casting {
	public static void main(String[] args) {
		// float -> int 강제 형 변환
		float f1 = 12345.67f;
		int i1 = (int)f1;
		System.out.println("[float -> int] f1의 값 : " + f1 + " i1의 값 : " + i1);
		
		// double -> int 강제 형 변환
		double d1 = 12345.67;
		int i2 = (int)d1;
		System.out.println("[double -> int] d1의 값 : " + d1 + " i2의 값 : " + i2);
		
		byte b1 = 100;
		byte b2 = 20;
		
		// byte b3 = b1 + b2; // 오류 발생
		// byte의 표현 범위가 127까지밖에 되지 않으므로
		// byte끼리의 연산은 127을 넘어버릴 가능성이 높다
		// System.out.println(b3); // 에러발생
		// Java 개발자들은 byte의 연산이 수행될 때
		// int형 변수로 값을 받도록 만든다.
		
		// byte b3 = (byte) b1 + b2; // 오류 발생
		byte b3 = (byte)(b1 + b2); // 먼저 연산을 감싼 후 변환하여야 한다.
		
		
		
		
		
		
		
	}

}
