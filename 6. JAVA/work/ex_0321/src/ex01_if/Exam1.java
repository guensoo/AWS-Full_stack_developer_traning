package ex01_if;

import java.util.Scanner;

public class Exam1 {
	// 삼항연산자로 만들었던 X개의 농구공을 담기 위한
	// 박스의 개수 구하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("공의 갯수를 입력하세요 : ");
		int x = sc.nextInt();
		int box = 5;
		int result;
		if (x % 5 == 0) {
			result = x / box;
			System.out.printf("필요한 박스의 개수는 : %d개 입니다.", result);
		}
		else {
			result = (x / box) + 1;
			System.out.printf("필요한 박스의 개수는 : %d개 입니다.", result);
		}
	}
}
