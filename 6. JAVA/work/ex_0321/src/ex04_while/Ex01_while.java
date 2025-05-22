package ex04_while;

import java.util.Random;
import java.util.Scanner;

public class Ex01_while {
	public static void main(String[] args) {
		// while문은 반복횟수가 정해져있을 때 할 수도 있지만
		// 반복횟수를 정확히 모를때 유용하다.
		
		// while(조건식){
		// 	반복하고자 하는 명령
		// 
		// 증감식;
		// }
		
		int i = 1;
		
		while(i < 4) {
			System.out.println(i);
			i++;
		}
		
		// 반복횟수가 정해져 있지 않을 때
		Random rnd = new Random();
		int random = rnd.nextInt(10)+1; // 1 ~ 10 사이의 난수가 대입
		Scanner sc = new Scanner(System.in);
		// 키보드에서 값을 입력받는다.
		
//		boolean isAnswer = true;
//		while(isAnswer) {
//			System.out.println("정답 : ");
//			int answer = sc.nextInt();
//			if(answer == random) {
//				System.out.println("정답입니다요!!!");
//				isAnswer = false;
//			}
//		}
		
		// int타입 변수 num에 정수를 입력받고
		// 각 자리수의 합을 더한 결과를 출력하세요
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		i = 0;
		int sum = 0;
		while(num > 0) {
			// 12345
			sum += num % 10;
			num = num / 10;
						
		}
		System.out.printf("정수의 합 %d", sum);
		
		
		
		
		
		
	}
}
