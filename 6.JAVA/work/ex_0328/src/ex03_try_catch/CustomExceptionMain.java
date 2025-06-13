package ex03_try_catch;

import java.util.Scanner;

public class CustomExceptionMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("나이를 입력하세요 >>");
			int age = sc.nextInt();
			if (age < 0) {
				throw new InputErrorException("입력이 잘못되었습니다.");
			}
			if(age > 19) {
				System.out.println("성인입니다.");
			} else if(age > 13) {
				System.out.println("청소년입니다.");
			} else if(age > 6) {
				System.out.println("청소년입니다.");
			} else {
				System.out.println("아동입니다.");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
