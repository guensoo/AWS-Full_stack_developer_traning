package exam1;

import java.util.Arrays;
import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
		// 키보드에서 특수문자를 제외한 알파벳을 무작위로 받는다.
		// 입력받은 문자열에서 소문자 a가 몇 개 있는지 판별하시오
		// 예시
		// 입력 : asdfasdf
		// 결과 : 2
		Scanner sc = new Scanner(System.in);
//		System.out.print("입력 : ");
//		String s = sc.nextLine();
//		int cnt = 0;
//		for(int i = 0; i < s.length(); i++) {
//			if(s.charAt(i) == 'a') {
//			cnt++;
//			}
//		}
//		
//		System.out.println("결과 : "+cnt);
//		sc.close();
		
		// 생일과 성별 구하기
		// 예시
		// 주민번호를 모두 입력하세요(-포함)
		// 911223-103345
		// 0~8
		// 당신은 1999년 12월 23일에 태어난 남자입니다.
//		System.out.println("주민번호를 모두 입력하세요(-포함)");
//		String id = sc.nextLine();
//		int x = id.charAt('-');
//		if(id.trim().length() < 14 || id.trim().charAt(6) != '-') {
//			System.out.println("주민번호를 올바르게 입력하세요");
//		} else {
//			String year = id.substring(0,2);
//			String month = id.substring(2,4);
//			String day = id.substring(4,6);
//			if(Integer.parseInt(year) < 00) {
//				if(id.substring(7) == "1") {
//					System.out.println("당신은 19" + year + "년 " + month + "월 " + day + "일에 태어난 남자입니다.");
//				} else {
//					System.out.println("당신은 19" + year + "년 " + month + "월 " + day + "일에 태어난 여자입니다.");
//				}
//			} else {
//				if(id.substring(7) == "1") {
//					System.out.println("당신은 20" + year + "년 " + month + "월 " + day + "일에 태어난 남자입니다.");
//				} else {
//					System.out.println("당신은 20" + year + "년 " + month + "월 " + day + "일에 태어난 여자입니다.");
//				}
//			}
//		}
		
		// 회문 판별하기
		// 앞으로 읽어도 뒤로 읽어도 똑같이 읽히는 문자열
		// 키보드에서 문자열을 입력받아 회문이면 xxx는 회문입니다.
		// 아니면 xxx는 회문이 아닙니다.
		
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
			
		int rev = str.trim().length()-1;
		char f = str.trim().charAt(0);
		char e = str.trim().charAt(rev);
		if (f == e) {				
			System.out.println(str + "는 회문입니다.");
		} else {
			System.out.println(str + "는 회문이 아닙니다.");
		}
		
		
		
	}
}
