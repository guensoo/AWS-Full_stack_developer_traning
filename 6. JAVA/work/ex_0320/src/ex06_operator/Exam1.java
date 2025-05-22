package ex06_operator;

import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		// 국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력받고
				// 1. 세 과목에 대한 합계 출력하기
				// 2. 평균 출력하기 (합계 / 3.0)
//				Scanner sc = new Scanner(System.in);
//				System.out.println("국어 점수를 입력해 주세요 : ");
//				int lang = sc.nextInt();
//				System.out.println("영어 점수를 입력해 주세요 : ");
//				int eng = sc.nextInt();
//				System.out.println("수학 점수를 입력해 주세요 : ");
//				int math = sc.nextInt();
//				
//				int total = lang + eng + math;
//				double avg = (lang + eng + math) / 3;
//				System.out.print("세 과목의 합계는 : " + total + "점 입니다.\n");
//				System.out.print("세 과목의 평균은 : " + avg + "점 입니다.\n");
//				
////				세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
////				세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일때 합격
////				아니면 불합격
//				int result;
//				result = lang >= 40 && eng >= 40 && math >= 40 && avg >= 60 ? 1 : 0;
//				String result1 = (lang >= 40 && eng >= 40 && math >= 40 && avg >= 60 ? "합격" : "불합격");
//				System.out.println(result1);
//				 if (result == 1) { System.out.println("합격입니다."); }
//				 else { System.out.printf("불합격입니다."); }
				 
				 //---------------------------------------------------------------------------------------------

				 // 상자 하나에는 농구공이 5개 들어갈 수 있다.
				 // x개의 농구공을 담기위한 박스의 개수를 구하시오
				 // 농구공의 개수는 키보드를 통해 입력받는다.
//				 System.out.printf("공의 개수를 입력해 주세요 : ");
				 Scanner x = new Scanner(System.in);
//				 System.out.println();
//				 int ball = x.nextInt();
//				 int box = 5;
//				 int resultBox = ball % 5 == 0 ? ball / box : (ball / box) + 1;
//				 System.out.printf("필요한 박스의 수 : %d", resultBox);
		
		// 과수원이 있다.
		// 배, 사과, 오렌지를 키우고 있는데 하루에 생산되는 양은
		// 각각 5, 7, 5개이다.
		// 과수원에서 하루에 생산되는 총 개수를 출력하고,
		// 시간당 전체 과일의 평균 생산 갯수를 출력하시오
		// 평균값을 담는 변수는 float로 할것.
		
		int pear = 5;
		int apple = 7;
		int orange = 5;
		int day = pear + apple + orange;
		float timeAvg = (float)day / 24;
		System.out.printf("하루에 생산되는 총 갯수 : %d\n", day);
		System.out.printf("시간당 전체 과일의 생산 갯수 : %.1f", timeAvg);
	}
}
