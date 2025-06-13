package ex01_Set;

import java.util.HashSet;
import java.util.Random;

public class Ex01_Set {
	public static void main(String[] args) {
		// Set은 객체의 저장 순서를 저장하지 않는다.
		// 수학의 집합과 유사한 개념을 지니고 있다.
		// 중복을 허용하지 않는다.
		// index를 부여하지 않기 때문에 데이터가
		// 입력된 순서대로 출력된다는 보장이 없다.
		
		// HashSet
		// Set 인터페이스에서 가장 많이 사용되는 클래스
		
		HashSet<String> hs1 = new HashSet<>();
		
		// add(E e)
		// 데이터에 추가
		hs1.add("apple");
		hs1.add("banana");
		hs1.add("orange");
		hs1.add("apple"); // 중복되는 데이터는 추가되지 않는다.
		
		System.out.println(hs1); // 입력순서대로 출력되지는 않는다.
		
		hs1.add(null); // null도 1번 저장이 가능하다.
		
		System.out.println(hs1);
		
		// HashSet이 중복되는 요소를 어떻게 체크할까?
		// 1. hashcode()로 같은 주소를 가지고 있는지 비교
		// 2. 해시값이 같으면 equals()로 실제값을 비교
		// 둘 다 같으면 삭제
		
		// remove()
		// 삭제
		hs1.remove("apple");
		
		System.out.println(hs1);
		
		// size()
		// 들어있는 요소의 개수
		System.out.println(hs1.size());
		
		// contains(Object o)
		// 요소가 포함되어있는지 판별
		System.out.println(hs1.contains("banana"));
		
		// HashSet을 언제쓰면 좋을까
		// 1. 중복되는 데이터가 없이 뽑을 때
		// 2. 순서나 정렬이 중요하지 않을 때
		
		// HashSet객체를 이용하여 로또번호 뽑기
		HashSet<Integer> hs2 = new HashSet<>();
		// 1 ~ 45사이의 난수 6개 뽑기
		while(hs2.size() != 6) {
			int r = new Random().nextInt(45)+1;
			hs2.add(r);
		}
		System.out.println(hs2);
		
		// 인덱스가 없기 때문에 하나만 고를수가 없다.
		
		// HashSet을 배열형태로 변환
		
		// hs2.toArray(new Integer[0]);
		// Object[] arr = hs2.toArray();
		// 형변환이 필요하다. -> 타입안정성이 떨어진다.
		
		Integer[] arr = hs2.toArray(new Integer[0]);
		// 왜 Integer[0]을 쓰는걸까
		// 적절한 크기의 새 배열을 만들어서 반환을 해준다.
		
		for(Integer x : arr) {
			System.out.print(x + " ");
		}
	}
}
