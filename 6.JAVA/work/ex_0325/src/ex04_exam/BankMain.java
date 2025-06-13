package ex04_exam;

import java.util.Scanner;

public class BankMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserInfo ui = new UserInfo();
		
		int x = 0; // 최초 계좌 잔액
		end:while(true) {
			System.out.println("해당하는 메뉴 버튼을 눌러주세요");
			System.out.println("1. 입금");
			System.out.println("2. 출금");
			System.out.println("3. 잔액");
			System.out.println("4. 종료");
			int btn = sc.nextInt(); // 메뉴 입력 버튼
			switch(btn) {
				case 1:
					ui.deposit(x);
					break;
				case 2:
					ui.withdraw(x);
					break;
				case 3:
					System.out.println("현재 잔액은 "+ui.showMoney()+"원 입니다.");;
					break;
				case 4:
					System.out.println("시스템을 종료합니다.");
					System.out.println("---------------------");
					break end; // 함수 자체를 나감(label 사용) or return; 으로 함수 자체를 빠져나감
			}
		}
	}
}
