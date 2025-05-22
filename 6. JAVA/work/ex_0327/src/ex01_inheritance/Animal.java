package ex01_inheritance;

public class Animal {
	// 공통적으로 가지고 있는 성질
	int eye = 2;
	int leg = 4;
	
	public void info() {
		System.out.println("눈의 개수 : " + eye);
		System.out.println("다리의 개수 : " + leg);
	}

}
