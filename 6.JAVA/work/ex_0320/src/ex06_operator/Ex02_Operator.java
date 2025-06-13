package ex06_operator;

public class Ex02_Operator {
	public static void main(String[] args) {
		// 이항 연산자
		// 피 연산자가 2개인 연산자
		
		// 산술연산자
		int x = 100;
		int y = 200;
		
		System.out.println(x + y); // 300
		System.out.println(x - y); // -100
		System.out.println(x * y); // 20000
		System.out.println(x / y); // 0(몫만 나옴)
		System.out.println(x % y); // 100(나머지만 나옴)
		
		// 오버플로우 발생
		int result = 1000000 * 1000000;
		System.out.println(result);
		
		// 산술 변환
		// 기본적으로 이항 연산자의 연산은 두 피연산자의
		// 타입이 일치해야 연산이 가능하다.
		
		// 컴퓨터는 서로 다른 타입을 계산하지 못하므로
		// 값의 손실이 적은쪽으로 타입을 맞춰준다.
		// long + int -> long + long -> long
		// float + int -> float + float -> float
		// double + float -> double + double -> double
		
		// 대입연산자
		// 우변의 값을 좌변에 대입해주는 연산자
		
		// 복합대입연산자
		// 산술연산자와 대입연산자가 합쳐진 형태
		// A = A +, -, *, /, % B
		
		x = 10;
		y = 1;
		
		y += x; // y = y + x;
		System.out.println(y); // 11
		y -= x; // y = y - x;
		System.out.println(y); // 1
		y *= x; // y = y * x;
		System.out.println(y); // 10
		y /= x; // y = y / x;
		System.out.println(y); // 1
		y %= x; // y = y % x;
		System.out.println(y); // 1
		
		// ++x -> x+=1
		
		// 비교연산자
		// 변수나 상수의 값을 비교하여 참과 거짓을 판단하는 연산자.
		// 결과가 항상 true나 false로 반환된다.
		
		int a = 10;
		int b = 20;
		
		System.out.println(a > b);
		System.out.println(a <= b);
		System.out.println(a == b); // 같다
		System.out.println(a != b); // 같지않다
		
		// 논리연산자
		int myAge = 30;
		int limit = 35;
		
		// &&(AND) : 앞 뒤 피연산자가 둘다 참이어야 참을 반환한다. 
		boolean res = (limit - myAge) >= 5 && myAge>30;
		System.out.println("&&연산결과 : " + res);
		
		// ||(OR) : 앞 뒤 피연산자 중 하나라도 참이라면 참을 반환한다.
		res = (limit - myAge) >= 5 || myAge>30;
		System.out.println("||연산결과 : " + res);
		
		// 비트연산자
		// 논리 연산자와 유사하지만 bit단위의 연산만 가능하다.
		// &(AND) : 논리곱
		// 두 항이 모두 참이면 참 아니면 거짓
		
		// |(OR) : 논리합
		// 두 항중 하나라도 참이면 참 아니면 거짓
		
		// ^(XOR) : 베타적논리합
		// 두 항이 다르면 참 같으면 거짓
		
		// ~(NOT) : 부정연산
		// 참을 거짓으로, 거짓을 참으로 연산한다.
		
	}
}
