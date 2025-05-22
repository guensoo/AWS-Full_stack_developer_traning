package exam2;
// 입력한 숫자의 합, 차, 평균 구하기
// Calc클래스를 만들어서 상속받기
public abstract class Calculator {
	
	// 합 메서드
	public abstract int add(int a, int b);

	// 차 메서드
	public abstract int substract(int a, int b);
	
	// 평균 메서드
	public abstract double average(int[] a);
}
