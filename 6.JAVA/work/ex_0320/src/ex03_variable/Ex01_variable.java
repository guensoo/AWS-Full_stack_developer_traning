package ex03_variable;

public class Ex01_variable {
	public static void main(String[] args) {
		// 변수
		// 프로그램을 만들고 실행하는데 필요한 값들을
		// 메모리에 저장해두고, 필요할 때 마다 꺼내서 사용
		
		// 메모리에 무질서하게 저장되는 것이 아니라,
		// 메모리 규칙속에서 일부 공간을 할당받아야 한다.
		
		// 메모리에 값을 저장하기 위해 할당해 놓은
		// 특정 공간을 변수라고 한다.
		
		// 1. 변수의 선언
		// 변수를 사용하기 위해서는 선언을 우선 해야한다.
		// 자료형 변수명;
		
		// 변수명 짓는 규칙
		// 1. 숫자 특수문자($, _제외)가 첫글자로 올 수 없다.
		// 2. 대소문자 구별한다.
		// 3. 일반적으로 영어 소문자로 시작한다.
		// 4. 특수문자가 포함될 수 없다.
		// 5. 예약어 금지(if, switch, for, while)
		// 6. 한글은 사용하지 않는다.
		
		// 표기법
		// 카멜케이스(Camel Case) 표기법
		// 두번째 단어부터 첫글자를 대문자로 표기
		// userName, homeAddress ...
		
		// 스네이크(Snake)표기법
		// 모든 단어가 소문자로 시작하고 단어와 단어 사이는
		// _로 연결하는 방식
		// user_name, home_address ...
		
		// 변수에 데이터 입력하기
		// 데이터를 직접 사용하는 대신, 변수에 저장하고
		// 변수명을 사용하여 값을 사용한다.
		
		int studentAge;
		studentAge = 20;
		
		System.out.println(studentAge);
		
		// boolean b = 1; // 에러 (Type mismatch)
		// boolean b = "안녕"; // 에러 (Type mismatch)
		boolean b = false;
		System.out.println("b의 값 : " + b);
		// 자바는 변수의 타입을 엄격하게 지켜야 한다.

		// 문자형
		char ch = '한'; // 한글자만 가능하다.
		System.out.println("ch의 값 : " + ch);
		
		// 아스키코드 값 때문에 에러가 나지 않는다.
		char ch2 = 65;
		System.out.println("ch2의 값 : " + ch2);
		
		// 정수형
		// byte b = 128; // 다른타입이라도 동일한 이름을 사용할 수 없다.
		// byte b = 128; // byte 타입은 127까지 담을 수 있기 때문에 에러 발생
		byte by = 127; // 정상 작동
		short s = 32767;
		int n = 550;
		
		System.out.println("by의 값 : " + by);
		System.out.println("s = " + s);
		System.out.println("n = " + n);
		
		// 실수형
		float f1, f2;
		// Java에서는 실수의 타입을 double형으로 인식하기 때문에
		// 데이터가 float타입이라는 것을 명시해줘야한다.
		// f1 = 3.14; // float타입 명시하지 않아 에러 발생
		// System.out.println("f2 = " + f2); // 에러 발생 변수에 초기값을 넣어주지 않았기 때문

		f1 = 3.14f; // 정상 작동
		f2 = 150.0f;
		System.out.println("f1 = " + f1);
		System.out.println("f2 = " + f2);
		
		int myAge = 20; // 20 -> myAge
		int yourAge = myAge; // myAge -> yourAge
		
		myAge = 21; // myAge 값만 변경되었으며, 그 값을 yourAge에 대입하지 않았기 때문에 값은
		System.out.println("yourAge : " + yourAge); // 값 : 20 이다.
		
		// 두 변수에 들어있는 값을 교환하려면 어떻게 해야할까??
		int su1 = 20, su2 = 30;
		int tmp;
		System.out.println("변경전");
		System.out.println("su1 : " + su1);
		System.out.println("su2" + su2);
		tmp = su1;
		su1 = su2;
		su2 = tmp;
		System.out.println("변경후");
		System.out.println("su1 : " + su1);
		System.out.println("su2 : " + su2);
		
		
		
		
		
		
		
		
	}
}
