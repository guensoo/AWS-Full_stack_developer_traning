package ex05_Scanner;

import java.util.Scanner;

public class Ex01_Scanner {
	public static void main(String[] args) {
		// 데이터의 입력
		// 프로그램을 실행할 때 키보드를 통해 입력한 데이터를
		// 변수에 대입하겠다.
		// int n = 100;
		
		// java.util패키지에 있는 Scanner클래스를 이용해야한다.
		// 다른 패키지에 있는 기능을 사용하기 위해서는 import를 해야 한다.
		// import 경로
		// let obj = new Object(); => JS에서의 생성자
		// obj.key = value; // 프로퍼티가 없으면 추가
		
//		Scanner sc = new Scanner(System.in); // Scanner 객체 선언
//		
//		System.out.print("정수 입력 : ");
//		int n = sc.nextInt(); // 정수 입력받기
//		System.out.println(n);
		
		// 나이입력받기
		// 제 나이는 x세 입니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		System.out.print("이름 입력 : ");
		String name = sc.next(); // 띄어쓰기를 하면 종료 
		sc.nextLine(); // 엔터값을 대신 가져감
		System.out.println("주소 입력 : ");
		String address = sc.nextLine(); // 엔터를 치면 종료
		System.out.printf("제 나이는 %d세 입니다. 제 이름은 %s 입니다. 제 주소는 %s입니다.\n", age, name, address);
		// or
		System.out.printf("제 이름은 %s 입니다.\n", name);
		System.out.printf("제 나이는 %d세 입니다\n", age);
		System.out.printf("제 주소는 %s 입니다.\n", address);
	}
}
