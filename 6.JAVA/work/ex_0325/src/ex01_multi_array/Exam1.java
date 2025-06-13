package ex01_multi_array;

import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		int [][] arr = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20}
		};
		// 배열 arr의 총합과 평균을 구하시오
		// 총합 : 
		// 평균 : 
		
		int sum = 0;
		int cnt = 0;
		double avg = 0.0;
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
				cnt++;
			}
		}
		System.out.println(sum);
		avg = (double)sum / cnt;
		System.out.println(avg);
		
		System.out.println("-------------------------------------------");
		
		// 학생들의 정보를 입력하고, 출력하는 프로그램 작성하기
		// 학생들의 수학과 영어성적을 등록하는 프로그램입니다.
		// 1. 프로그램을 실항하면 몇 명의 정보를 저장할 것인지 입력받는다.
		// 2. 입력받은 수 만큼 학생들의 이름, 수학, 영어성적을
		// 입력받는 프로그램 작성하기
		
		// 예시
		// 등록할 인원수 : 2
		// 이름 : 홍길동
		// 수학 : 90
		// 영어 : 85
		// ------------------
		// 이름 : 독고길동
		// 수학 : 40
		// 영어 100
		// ------------------
		// 2명 등록 완료
		// 홍길동 90 85
		// 독고길동 40 100
		Scanner sc = new Scanner(System.in);
		System.out.print("등록할 인원 수 : ");
		int x = sc.nextInt();
		String[][] stdInfo = new String[x][3];
		
		outer:for(int i = 0; i < x; i++) {
			System.out.print("이름을 입력하세요 : ");
			for(int j = 0; j < stdInfo[i].length -1;) {
				stdInfo[i][j] = sc.next();
				j++;
				System.out.print("수학점수를 입력하세요 : ");
				stdInfo[i][j] = sc.next();
				j++;
				System.out.print("영어점수를 입력하세요 : ");
				stdInfo[i][j] = sc.next();
				j++;
				continue outer;
			}
			System.out.println("-----------------------");
			System.out.printf("%d명 등록 완료", x);
		}
		
		for(int i = 0; i < stdInfo.length; i++) {
			for(int j = 0; j < stdInfo[i].length; j++) {
				System.out.println(stdInfo[i][j]);
			}
		}
		
		for(int i = 0; i < stdInfo.length; i++) {
			System.out.print("이름 : ");
			stdInfo[i][0] = sc.next();
			System.out.print("수학 : ");
			stdInfo[i][1] = sc.next();
			System.out.print("영어 : ");
			stdInfo[i][2] = sc.next();
			System.out.println("-------------");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
