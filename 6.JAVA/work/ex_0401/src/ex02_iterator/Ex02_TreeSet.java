package ex02_iterator;

import java.util.TreeSet;

public class Ex02_TreeSet {
	public static void main(String[] args) {
		// 자바 컬렉션에서 제공하는 정렬된 Set
		// 중복을 허용하지 않지만
		// Tree기반이기 때문에 자동정렬이 된다.
		// Red-Black Tree라는 
		
		TreeSet<Integer> set1 = new TreeSet<>();
		
		set1.add(7); // 루트노드
		set1.add(4);
		set1.add(9);
		set1.add(1);
		set1.add(5);
		System.out.println(set1);
		System.out.println(set1.first()); // 최소값
		System.out.println(set1.last()); // 최대값
		System.out.println(set1.higher(3)); // 입력값 보다 큰 수 중 최소값
		System.out.println(set1.lower(3)); // 입력 값보다 작은 수 중 최대값
	}
}
