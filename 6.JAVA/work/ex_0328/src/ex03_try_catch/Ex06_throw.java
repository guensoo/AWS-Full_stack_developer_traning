package ex03_try_catch;

import java.util.Scanner;

public class Ex06_throw {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int val = 0;
		
		while(true) {
			try {
				System.out.println("숫자를 입력하세요(0 ~ 50) : ");
				val = sc.nextInt();
				if(val == -1) {
					break;
				}
				
				if(val < -1 || val > 50) {
					// throw new 예외객체();
					throw new Exception("숫자의 허용범위가 아닙니다.");
				}
			} catch (Exception e) {
				System.out.println("에러메시지 : "+e.getMessage());
			}
		}
		System.out.println("프로그램 종료");
	}
}
