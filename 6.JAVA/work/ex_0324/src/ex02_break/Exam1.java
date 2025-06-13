package ex02_break;

import java.util.Random;
import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		// 1 ~ 50 사이의 난수를 생성하고
		// 난수를 맞추는 프로그램 만들기
		// 적은 값이 난수보다 작으면
		// "맞춰야할 숫자가 더 큽니다."
		// 적은 값이 난수보다 크면
		// "맞춰야할 숫자가 더 작습니다."
		
		// 경우의 수
		// 1. 난수를 맞추는 경우 -> if()
		// 2. 난수보다 큰 경우 -> if()
		// 3. 난수보다 작은 경우 -> if()
		
		// 반복횟수를 구하기 어려우니
		// while문을 써보는게 어떨까? 라는 고민을 해볼 수 있다.
		
		// 정답을 x번만에 맞췄습니다.
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int a = ran.nextInt(50)+1;
		int cnt = 1;
		
			while(true) {
				System.out.print("1 ~ 50 사이의 번호를 입력하세요 : ");
				int x = sc.nextInt();
				if(x == a) {
					System.out.println("정답입니다.");
					break;
				} else if(x < a) {
					System.out.println("맞춰야할 숫자가 더 큽니다.");
				} else if(x > a) {
					System.out.println("맞춰야할 숫자가 더 작습니다.");
				}
				cnt++;
			}
		System.out.printf("시도한 횟수 : %d", cnt);
	}
}
