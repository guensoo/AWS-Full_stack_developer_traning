package ex04_exam;

import java.util.Scanner;

public class UserInfo {
	int money; // 계좌
	Scanner sc = new Scanner (System.in);
	
	public void deposit(int money1) { // 입금
		System.out.print("입금하실 금액을 입력하세요 : ");
		int charge = sc.nextInt(); // 입금 금액 입력
		money += charge;
		System.out.printf("\n%d원 입금이 완료되었습니다.\n", charge);
	}
	
	public void withdraw(int money1) { // 출금
		System.out.print("출금하실 금액을 입력하세요 : ");
		int charge = sc.nextInt(); // 출금금액 입력
		if(money >= charge) { // 정상출금시
			System.out.printf("\n %d원 출금이 완료되었습니다.\n", charge);
			money -= charge;
		}
		else if(money1 < charge) { // 잔액부족시
			System.out.println("\n잔액이 부족합니다.\n");
		}
	}
	
	public int showMoney() { // 잔액확인
		return money;
	}
}
