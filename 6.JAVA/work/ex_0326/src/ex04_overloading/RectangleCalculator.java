package ex04_overloading;

public class RectangleCalculator {
	// 다양한 방식으로 사각형의 넓이 구하기
	// 메서드명 : area
	int a;
	double b;
	
	// 1. 정사각형의 한 변의 길이를 받아 넓이 변환하기
	public void area(int a) {
		this.a = a * a;
		System.out.println("정사각형의 넓이 : "+ this.a);
	}
	
	
	// 2. 가로 세로 길이를 받아 직사각형의 넓이 반환하기
	public void area(int a, int b) {
		this.a = a * b;
		System.out.println("직사각형의 넓이 : "+this.a);
	}
	
	// 3. 실수형 가로, 세로를 받아 실수 결과 반환하기
	public void area(double a, double b) {
		this.b = a * b;
		System.out.println("사각형의 넓이 : "+this.b);
	}
}
