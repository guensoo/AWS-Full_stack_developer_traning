package ex03_Map;

import java.util.HashMap;
import java.util.Map;

public class Ex01_HashMap {
	public static void main(String[] args) {
		HashMap<Integer, Character> map = new HashMap<>();
		HashMap<String, String> map2 = new HashMap<>();
		
		// put(K k, V v)
		// HashMap에 데이터 추가하기
		map.put(1, 'A');
		map.put(2, 'B');
		map.put(3, 'C');
		map.put(4, 'A'); // map에 저장되는 value는 중복될 수 있다.'
		map2.put("god", "시발자동차");
		
		System.out.println(map);
		
		map.put(1, 'F'); // 같은 값을 가진 key가 있다면 value를 갱신한다.
		
		System.out.println(map);
		
		// remove(K k)
		// 데이터의 삭제
		map.remove(3);
		
		System.out.println(map);
		System.out.println(map2);
		
		// size()
		// 컬렉션의 크기를 반환
		System.out.println("map의 크기 : " + map.size());
		
		// get(K k)
		// 데이터의 조회
		char res = map.get(1);
		System.out.println(res);
		
		HashMap<String, Double> map3 = new HashMap<String, Double>();
		
		map3.put("k1", 100.0);
		map3.put("k2", 3.14);
		map3.put("k3", 4.15);
		map3.put("k4", 8.8);
		
		double result = map3.get("k2");
		
		
		System.out.println(result);
		
		// containskey(K k)
		// map안에 key가 존재하면 true, 없으면 false
		// containsValue(V v)
		// map안에 value가 존재하면 true, 없으면 false
		
		Iterator<String> iter = 
		map3.keySet().iterator();
		
		// Entry
		// HashMap 내부에서 key-value쌍 하나를 표현할 수 있는 객체
		
		
	}
}
