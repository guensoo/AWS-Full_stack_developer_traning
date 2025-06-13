package ex06_operator;
import java.util.Scanner;

public class Ex03_Operator {
	public static void main(String[] args) {
		// 비트연산자
		// 논리 연산자와 유사하지만 bit단위의 연산만 가능하다.
		// &(AND) : 논리곱
		// 두 항이 모두 참이면 참 아니면 거짓
		
		// |(OR) : 논리합
		// 두 항중 하나라도 참이면 참 아니면 거짓
		
		// ^(XOR) : 베타적논리합
		// 두 항이 다르면 참 같으면 거짓
		
		// ~(NOT) : 부정연산
		// 참을 거짓으로, 거짓을 참으로 연산한다.
		
		int a = 10; // 1010 
		int b = 7; // 0111
		int c = a & b;
		System.out.println("c : " + c); // 0010 = 2
		
		int a2 = 12; // 1100
		int b2 = 8; // 1000
		int c2 = a2 | b2;
		System.out.println("c2 : " + c2); // 1100 = 12
		
		int a3 = 9; // 1001
		int b3 = 11; // 1011
		int c3 = a3 ^ b3;
		System.out.println("c3 : " + c3); // 0010 = 2
		
		int x = 7; // 0111 
		System.out.println("~x : " + ~x); // 1000 = 8
		// ~x -> -(x+1)
		
		// 시프트연산자
		// 비트의 이동
		// << , >>
		
		x = 10;
		int result = x << 1;
		System.out.println(result); // 10100 = 20
		result = x >> 1;
		System.out.println(result); // 0101 5
		
		// 삼항연산자
		// 조건식? 참일 때 실행할 명령 : 거짓일 때 실행할 명령
		
		int i = 10;
		int i2 = 15;
		result = ++i >= i2 ? 1 : 0;
		System.out.println("result : " + result); // 0
		// -------------------------------------------------------------------------
		// x = 6
		// y = 5
		x = 5;
		int y = x++;
		System.out.println("x의 값 : " + x);
		System.out.println("y의 값 : " + y);
		
		// x = 11
		// y = 19
		// z = 31
		
		x = 10;
		y = 20;
		int z = (++x) + (y--);
		System.out.println("x의 값 : " + x);
		System.out.println("y의 값 : " + y);
		System.out.println("z의 값 : " + z);
		
		// result = ++a >= b || 2 + 7 <= b && 13 - b >= 0 && (a += b) - (a % b) > 10 ? 1 : 0;
		// 11 >= 12 || 9 <= 12 && 1 >= 0 && 22 - 12 > 10;
		// f || t && t && t;
		// true
		
		a = 10;
		b = 12;
		result = ++a >= b || 2 + 7 <= b && 13 - b >= 0 && (a += b) - (a % b) > 10 ? 1 : 0;
		System.out.println(result);
		
		// 국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력받고
		// 1. 세 과목에 대한 합계 출력하기
		// 2. 평균 출력하기 (합계 / 3.0)
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력해 주세요 : ");
		int lang = sc.nextInt();
		System.out.println("영어 점수를 입력해 주세요 : ");
		int eng = sc.nextInt();
		System.out.println("수학 점수를 입력해 주세요 : ");
		int math = sc.nextInt();
		System.out.print("세 과목의 합계는 : " + (lang + eng + math) + "점 입니다.\n");
		System.out.print("세 과목의 평균은 : " + ((lang + eng + math) / 3) + "점 입니다.\n");
		
//		세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
//		세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일때 합격
//		아니면 불합격
		result = lang >= 40 && eng >= 40 && math >= 40 && ((lang + eng + math)/3) >= 60 ? 1 : 0;
		
		 if (result == 1) { System.out.println("결과는 합격입니다."); }
		 else { System.out.printf("결과는 불합격입니다."); }
		 
	}

}
