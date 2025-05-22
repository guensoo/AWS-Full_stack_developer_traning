package ex05_Generic;

import java.lang.reflect.Array;

class Gen <T> {
	public void printArr(T[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}

public class GenericExam {
	// Gen클래스를 만들어 제네릭타입 T를 가지는
	// printArr메서드를 생성한다.
	// printArr메서드 내부에서 배열을 순차적으로 출력하는 코드를 작성
	// main에서 Integer, Double, Character배열을 각각 만든 뒤
	// Gen클래스의 printArr메서드를 각각 호출하여 배열의 내용을 출력하자.
	// 결과
	// 1 2 3 4 5
	// 1.1 2.2 3.3 4.4 5.5
	// A B C D E
	public static void main(String[] args) {
		Gen gen = new Gen();
		Integer[] iArr = {1,2,3,4,5};
		Double dArr = {1.1,2.2,3.3,4.4,5.5};
		Character cArr = {'A', 'B', 'C', 'D', 'E'};
		
		Gen<Integer> g1 = new Gen();
		Gen<Double> g2 = new Gen();
		Gen<Character> g3 = new Gen();
		
		// 컴파일러가 전달된 인자의 타입을 보고 타입을 추론한다.
		g1.printArr(iArr);
		g1.printArr(dArr);
		g1.printArr(cArr);
		// 타입의 명서
		g1.<Integer>printArr(iArr);
		g1.<Double>printArr(iArr);
		g1.<Character>printArr(iArr);
		
		
		
		gen.printArr(Integer);
		System.out.println();
		gen.printArr(Double);
		System.out.println();
		gen.printArr(Character);
	}
}
