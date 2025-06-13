package ex04_casting;

public class Ex01_Casting {
	public static void main(String[] args) {
		// 형 변환 (Casting)
		// 데이터를 다른 자료형의 데이터로 변환하는 것을 의미한다.
		// 모든 연산은 기본적으로 같은 자료형끼리만 가능하다.
		// 따라서 서로 다른 자료형의 연산을 수행하기 위해서는
		// 같은 자료형으로 변환해야 한다.
		
		int num = 11;
		double num2 = 3.14;
		// 형 변환을 할 때는 : (자료형)데이터;
		double numChange = (double)11;
		
		System.out.println("num : " + num);
		System.out.println("num2 : " + num2);
		System.out.println("numChange : " + numChange);
		System.out.println((int)1.23);
		
		// 형 변환은 숫자를 담을 수 있는 기본 자료형간에만 가능하다.
		// 정수형, 실수형 자료형 뿐만 아니라
		// 문자이면서 동시에 숫자이기도 한 문자형도 가능하다.
		
		// 자동형변환(Promotion)
		// 서로 다른 자료형간의 대입이나 연산을 할 때
		// 형 변환으로 자료형을 일치시켜야만 하지만
		// 다음과 같은 경우 자바의 컴파일러가 자동으로 형 변환을 해주기 때문에
		// 생략이 가능하다.
		
		// 1. 작은 자료형에서 큰 자료형으로 변환할 때
		// 정수형
		// byte -> short -> int -> long
		
		// 실수형
		// float(4바이트) -> double(8바이트)
		
		// 2. 정수형이 실수형으로 바뀔 때
		int i = 14;
		double d = 3.14;
		d = i; // 자동형변환
		
		char c = 'a'; // 아스키코드 97 = a 65 = A
		i = c; // char형에서 int형으로 자동 형변환이 일어난다.
		System.out.println("i : " + i);
		
		// 강제 형 변환(Demotion)
		// (원하는 자료형)데이터 or 변수;
		
		// 큰쪽에서 작은쪽으로 바꿀때는 강제로 형을 바꿔야 한다.
		
		int x = 10; // 4byte
		// byte y = i; // 1byte 큰쪽에서 작은쪽으로 바꿀 때는 강제로 바꿔야한다.
		byte y = (byte)x;
		System.out.println("[int -> byte] x의 값 : " + x + " y의 값 : " + y);
		
		// int -> byte 강제 형 변환(값이 큰 경우)
		int j = 1000;
		byte k = (byte)j;
		System.out.println("[int -> byte] j의 값 : " + j + " k의 값 : " + k);
	}
}
