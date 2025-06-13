package ex04_while;

import java.util.Scanner;

public class Ex02_do_while {
	public static void main(String[] args) {
		// while 문과 같이 조건을 만족할 때 까지 반복한다.
		// 다만, while문과 다른 점은 먼저 루프를 한번 실행한 후
		// 조건식을 검사한다는 점이다.
		// 즉, 조건식의 결과와 상관없이 무조건 한 번은 실행한다.
		
		// do{
		// 	반복하고자 하는 명령
		// }while(조건식)
		
		int i = 11;
		do {
			System.out.println(i);
		}while(i <= 10);
		
		// 1 ~ 10까지의 총합 구하기
		i = 0;
		int sum = 0;
		do {
			sum += i;
			i++;
		} while(i <= 10);
		System.out.println(sum);
		
		// 비밀번호 확인 프로그램 만들기
		// 사용자로부터 비밀번호를 입력받아 올바른 비밀번호가
		// 입력될때까지 계속 입력을 요구하는 프로그램 만들기
		// 비밀번호는 9486
		Scanner sc = new Scanner(System.in);
		int password = 9486;
		int a;
		do { // 우선 실행문
			System.out.print("비밀번호를 입력하세요 : ");
			a = sc.nextInt(); // 입력받기
			if(a == password) { // 만약 입력한 비밀번호가 일치한다면
				System.out.println("접속 성공!");
			} else { // 일치하지 않는다면
				System.out.println("비밀번호가 틀렸습니다. 다시 입력하세요");
			}
		}while(a != password); // 입력한 수와 비밀번호가 일치하지 않을때 동안
		
//		int answer;
//		int pw = 9486;
//		do {
//			System.out.println("비밀번호 입력 : ");
//			answer = sc.nextInt();
//			
//			if(pw == answer) {
//				System.out.println("비밀번호가 맞습니다.");
//			}else {
//				System.out.println("비밀번호가 틀렸습니다.");
//			}
//		} while(pw != password);
		
		// 학생의 국어, 영어, 수학 점수를 입력받는다.
		// 단, 각 과목은 40점 이상이어야 하며,
		// 40점 미만이면 해당 과목 점수를 다시 입력 받아야 한다.
		// 가능은 하다.
//		sum = 0;
//		do {
//			System.out.print("국어 점수를 입력해 주세요 : ");
//			int kor = sc.nextInt();
//			if(kor >= 40) {
//				System.out.print("\n영어 점수를 입력해 주세요 : ");
//				int eng = sc.nextInt();
//				if(eng >= 40) {
//					System.out.print("\n수학 점수를 입력해 주세요 : ");
//					int math = sc.nextInt();
//					if(math >= 40) {
//						sum = kor + eng + math;
//						System.out.printf("당신의 점수는 국어 : %d점, 영어 : %d점, 수학 %d점 입니다.", kor, eng, math);
//					}
//					else {
//						System.out.println("수학점수가 낮습니다. 다시 입력해주세요");
//					}
//
//				}
//				else {
//					System.out.println("영어점수가 낮습니다. 다시 입력해주세요");
//				}
//
//			}
//			else {
//				System.out.println("국어점수가 낮습니다. 다시 입력해주세요");
//			}
//			
//		}while(sum < 40);
		int kor;
		int eng;
		int math;
		do {
			System.out.print("국어 점수를 입력해 주세요 : ");
			kor = sc.nextInt();
			
			System.out.print("\n영어 점수를 입력해 주세요 : ");
			eng = sc.nextInt();
			
			System.out.print("\n수학 점수를 입력해 주세요 : ");
			math = sc.nextInt();
			if(kor >= 40 && eng >= 40 && math >= 40) {
				System.out.printf("당신의 점수는 국어 : %d점, 영어 : %d점, 수학 %d점 입니다.", kor, eng, math);
			}
			else {
				System.out.printf("과목 점수가 낮습니다. 다시입력해주세요\n");
			}
			
			
		}while(kor < 40 || eng < 40 || math < 40);
		
	}
}
