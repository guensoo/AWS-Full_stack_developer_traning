package ex03_for;

import java.util.Scanner;

public class Ex01_for {
	public static void main(String[] args) {
		// 반복문
		// 특정 명령을 원하는 만큼 반복하여 실행하는 제어문
		// for, while
		
		// for
		// 주로 반복 횟수가 정해져 있을 때 사용하는 문법
		
		// for(초기식;조건식;증감식){
		// 	반복하고자 하는 명령
		// }
		
		// 초기식 : 반복을 하기 위한 시작값으로 변수를 하나 초기화한다.
		// 조건식 : 반복을 위한 종료값으로 비교연산자를 많이 사용한다.
		// 증감식 : 초기식에 있는 변수의 값을 증감시켜주는 역할을 한다.
		
//		for(int i = 0; i <= 3; i++) {
//			System.out.println(i);
//		}
//		
//		int i;
//		
//		for(i = 0; i <= 3 ; i++) {
//			System.out.println(i);
//		}
		
//		int i = 0; // 초기값을 밖에다 쓸 수 있음
//		
//		for(; i <= 3 ;) {
//			System.out.println(i);
//			i++; // 증감값을 밖에다 쓸 수 있음
//		}
		
		// 초기식에 들어가는 변수 i를 무조건 사용할 필요는 없다.
		// 사용하는게 좋을 것 같을 때 쓰면 된다.
		
		// 1부터 10까지 출력하는 for문 작성하기
		// 1 2 3 4 5 6 7 8 9 10
//		for(i = 1; i <= 10; i++) {
//			System.out.printf("%d ", i);
//		}
		
		// System.out.println();
		
		// 10부터 1까지 출력하는 for문 작성하기
//		for(i = 10; i >= 1; i--) {
//			System.out.printf("%d ", i);
//		}
		
		// System.out.println();
		
		// 1부터 10까지 3의 배수만 출력하는 for문 작성하기
//		for(i = 1; i <= 10; i++) {
//			if(i % 3 == 0){
//			System.out.print(i + " ");
//			}
//		}
		
		// System.out.println();
		
		// 1부터 10까지 총합 구하기
//		int result = 0;
//		for (i = 1; i <= 10; i++)
//			result +=i;
//		System.out.println(result);
		
		// 키보드에서 정수를 하나 입력받아
		// 해당 단의 구구단 출력하기
		// Scanner sc = new Scanner(System.in);
//		System.out.print("구구단 입력 : ");
//		int x = sc.nextInt();
//		for(i = 1; i < 10; i++) {
//			System.out.printf("%d X %d = %d\n", x, i, x * i);
//		}
		
		// 키보드에서 정수 n을 입력받고
		// 1부터 정수 n까지의 총합을 계산하여 결과 출력하기
//		System.out.print("정수를 입력해 주세요 : ");
//		int n = sc.nextInt();
//		int sum = 0;
//		for(i = 1; i <= n; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
		
		// 10개의 정수를 입력받아
		// 그 중 짝수의 개수가 몇개인지 구하세요
//		Scanner sc = new Scanner(System.in);
//		int sum = 0;
//		// System.out.println("10개의 정수를 입력하세요 : ");
//		for(int i = 1; i <= 10; i++) {
//			System.out.printf("%d번째 정수를 입력하세요 : ", i);
//			int n = sc.nextInt();
//				if(n % 2 == 0) {
//					sum += 1;
//				}
//		}
//		System.out.printf("\n입력하신 정수 중 짝수의 개수는 %d개 입니다.", sum);
		
		// 1 + (1+2) + (1+2+3) + (1+2+3+4) +...+(1+2+3+4+5+6+7+8+9+10)
		// sum = sum(1+...+6) + 7
		// sum = sum(1+...+7) + 8
		// sum = sum(1+...+8) + 9
		// sum = sum(1+...+9)+10
		// 의 결과를 계산하시오
		int sum = 0;
		int total = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
			System.out.println(sum);
			total += sum;
			System.out.println(total);
		}
		System.out.println(total);

		// 양의 정수 x를 키보드에서 입력받아
		// x가 홀수면 x이하의 홀수인 양의 정수의 합을 구하고
		// x가 짝수면 x이하의 짝수인 정수의 제곱의 합을 구하세요
		// 10 = 220
		// 7 = 16
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int x = sc.nextInt();
		sum = 0;
		if(x % 2 != 0) {
			for(int i = x; i > 0; i--) {
				if(i % 2 == 1) {
				sum += i;
				}
			}
			System.out.printf("%d이하의 홀수인 정수의 합은 : %d입니다.", x, sum);
		} 
		else {
			for(int i = x; i > 0; i--) {
				if(i % 2 == 0) {
					sum += i * i;
				}
			}
			System.out.printf("%d이하의 짝수인 정수의 제곱의 합은 : %d입니다.", x, sum);
		}
		
//		sum = 0;
//		for(int i = x; i>=0; i-=2) {
//			sum += (x % 2 == 0) ? i*i : i;
//		}
		
	}
}
