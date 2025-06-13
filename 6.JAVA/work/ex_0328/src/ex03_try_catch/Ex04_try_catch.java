package ex03_try_catch;

import java.util.Scanner;

public class Ex04_try_catch {
	public static void main(String[] args) {
		// finally
		// 에외 발생 유무와 상관 없이 실행되는 구문이며 생략할 수 있다.
		// 예외를 처리할 때, 예외와 상관없이 반드시 처리해야 하는
		// 구문들을 작성할 때 사용된다.
		// 보통 외부 연동이나 예외가 발생해도 정상 종료되어야 할 구문들에서 사용한다.
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("숫자 입력");
			int number = sc.nextInt();
			System.out.println("입력한 숫자 : " + number);
			
		} catch (Exception e) {
			System.out.println("숫자만 입력해야 한다");
		} finally {
			// 연결을 종료하는 코드들
			// 스캐너 연결종료
			// db와의 연결 종료
			sc.close();
		}
	}
}
