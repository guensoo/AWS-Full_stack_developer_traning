package ex05_enum;

import java.util.Arrays;

public class TransportMain {
	public static void main(String[] args) {
		// 각 운송수단별 100km을 갔을 때 금액
		// name : xxx, 100km - fare : xxx
		
		Transportation[] trans = Transportation.values();
		
		for(Transportation tran : trans) {
			System.out.println("name : "+tran.name() + ", 100km - fare : "+tran.totalFare(100));
		}
		
	}
}

// 요일 열거형 만들기
// Weekday라는 열거형을 정의하고, 요일 이름을 상수로 넣는다.
// main 메서드에서 오늘 요일이 SUNDAY면 "쉬는날입니다" 출력
// 그 외에는 "출근하는 날입니다"를 출력해라