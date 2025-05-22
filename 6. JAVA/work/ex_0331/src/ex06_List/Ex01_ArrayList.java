package ex06_List;

import java.util.ArrayList;
import java.util.List;

public class Ex01_ArrayList {
	public static void main(String[] args) {
		// 리스트의 선언
		List<String> list = new ArrayList<>();
		
		// 데이터 삽입
		list.add("딸기");
		list.add("바나나");
		list.add("망고");
		
		// 리스트의 출력
		System.out.println("리스트 내용 : " + list);
		
		// 리스트의 3번째 위치에 요소 삽입하기
		list.add(2, "수박");
		
		System.out.println("리스트 내용2 : " + list);
		
		list.set(0,  "사과");
		list.set(1,  "키위");
		
		System.out.println("리스트 내용3 : " + list);
		
		// 데이터의 삭제
		// remove(int index) -> 삭제를 하고 삭제한 value를 반환
		System.out.println(list.remove(3));
		
		System.out.println("리스트 내용4 : " + list);
		
		// 리스트에서 데이터 가져오기
		System.out.println(list.get(1));
		
		// 리스트에 들어있는 모든 내용 출력하기
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// 향상된 for문을 이용해 출력할 수 있다.
		for(String x : list) {
			System.out.println("값 : " + x);
		}
	}
}
