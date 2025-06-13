package ex02_lamda;

public class CalMain {
	public static void main(String[] args) {
		// 1. 구현한 클래스를 객체로 만들어 메서드 사용하기
		CalculatorImpl cal1 = new CalculatorImpl();
		int res = cal1.plus(10, 20);
		System.out.println("cal1 : "+res);
		
		// 2. 익명클래스를 통한 메서드의 구현
		// cal2
		MyCalculator cal2 = new MyCalculator() {
		
		@Override
		public int plus(int num1, int num2) {
			return num1+num2;
			}
		};
		
		System.out.println(cal2.plus(10, 20));
		
		// 3. 람다식으로 구현을 하자
		// let f = () => {};
		MyCalculator cal3 = (num1, num2) -> num1+num2;
		
		res = cal3.plus(10, 20);
		
		System.out.println("cal3 : " + res);
		
		// ::(이중콜론) : 메서드 참조 연산자
		// 람다식을 보다 간결하게 사용할 수 있도록 해준다.
//		MyFunction mf = System.out::println;
//		mf.method(5);
		
		// 람다식(lamda expression)
		// 식을 변수에 넣을 수 있다.
		// 람다식을 매개변수에 넣을 수 있다.
		// 람다식을 반환값에 쓸 수 있다.
		
		
	}
}
