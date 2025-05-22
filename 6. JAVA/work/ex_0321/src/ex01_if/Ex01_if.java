package ex01_if;

import java.util.Scanner;

public class Ex01_if {
	public static void main(String[] args) {
		// 단순 if문
		// 조건문 중에서도 가장 기본이 되는 명령문이다.
		
		// if(조건식){
		// 조건식이 참일 때 실행할 문장
		// }
		
		// 만약 실행해야 하는 명령이 하나라면 중괄호를 생략할 수 있다.
		
		// if(조건식) 조건식이 참일 때 실행할 문장;
		
		// 간결하고 가독성이 좋은 코드를 만드는 중괄호와 들여쓰기
		// 중괄호 블록은 여러 개의 수행문을 하나로 묶기 위해 작성
		// 수행문이 하나일 경우 생략할 수 있지만 중괄호를 사용하면
		// 가독성이 좋을 뿐 아니라 코드의 해석이 용이하고
		// 버그를 찾아 수정하는데 도움이 되므로 중괄호를 사용하는 습관이 중요하다.

		// 중괄호를 사용할 때는 들여쓰기를 하는 것이 좋다.
		// 들여쓰기에는 탭(tab)이나 공백(Space Bar)를 이용하는데
		// 혼용하여 사용하지 않고 한가지 방법으로
		// 일관되게 사용하는 것이 좋다.
		
		int result = 0;
		if(3 > 2) {
			result = 3;
		}
		System.out.println(result);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이 입력 : ");
		int age = sc.nextInt();
		
		if(age > 19) {
			System.out.println("성인입니다.");
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
}
