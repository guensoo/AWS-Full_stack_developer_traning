package ex04_array;

import java.util.Arrays;
import java.util.Comparator;

public class Ex02_Arrays {
	public static void main(String[] args) {
		// Arrays 클래스는 배열의 복사, 항목의 정렬, 항목 검색 등
		// 배열을 다루기 위한 다양한 메서드를 제공한다.
		// Arrays 클래스를 이용하면 배열의 기능을 더욱 쉽게 사용할 수 있다.
		
		// Scanner, Random 클래스의 경우
		// 객체를 먼저 생성하고 메서드를 사용함
		
		// Arrays.함수명()로 작성하여 기능을 호출한다.
		
		// 1. 배열의 출력
		// toString()
		// 반복문의 도움 없이 배열을 출력할 수 있도록 도와준다.
		// 배열에 정의된 값을 문자열 형태로 변환하여 출력해준다.
		
		
		int[] arr = {1, 6, 2, 3, 10, 7, 4, 5, 8, 9};
		System.out.println(Arrays.toString(arr));
		
		// 2. 배열의 정렬
		// sort()
		// 기본적으로 오름차순으로 정렬해준다.
		System.out.println("정렬 전");
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("정렬 후");
		System.out.println(Arrays.toString(arr));
		
		// Comparator.reverseOrder()를 통해 내림차순으로
		// 정렬이 가능하다.
		// 하지만 기본자료형 배열로는 불가능하다.
		// 기본자료형의 클래스타입인 Wrapper클래스를 이용한다.
		
		// int -> Integer (int의 클래스타입)
		
		Integer[] iArr = {1, 6, 2, 3, 10, 7, 4, 5, 8, 9};
		
		Arrays.sort(iArr,Comparator.reverseOrder());
		System.out.println(Arrays.toString(iArr));
		
		// 배열의 복사
		// 자바에서 배열은 한 번 생성하면 그 길이를 변경 할 수 없다.
		// 따라서 더 많은 데이터를 저장하거나
		// 기존의 배열과 똑같은 배열을 새로 만드려면 배열을 복사해야 한다.
		// 배열을 복사하는 방법에는 얕은 복사와 깊은 복사 두가지가 있다.
		
		// 얕은복사(Shallow Copy) : 복사된 배열이나 원본 배열이 변경될 때
		// 서로 간의 값이 함께 변경된다.
		// 얕은복사는 주소가 복사된다.
		
		// 깊은복사(Deep Copy) : 복사된 배열이나 원본 배열이
		// 변경될 때 서로 간의 값은 바뀌지 않는다.
		// 깊은 복사는 값이 복사된다.
		
		int[] arr01 = {1, 2, 3};
		// arr01은 배열 {1, 2, 3}의 주소값을 가지고 있다.
		
		System.out.println(arr01);
		
		int[] arr02 = arr01;
		
		// 배열 arr02의 값 변경
		arr02[1] = 10;
		
		System.out.println("arr01 배열 : " + Arrays.toString(arr01));
		System.out.println("arr02 배열 : " + Arrays.toString(arr02));
		
		// 깊은 복사
		// 배열의 깊은 복사는 반복문을 이용해 새로운 배열에 값을
		// 직접 넣어주거나 Arrays 클래스 또는 	System클래스가 가진
		// 기능을 이용한다.
		
		int[] cards = {1,6,4,5,3,2};
		int[] newCards = new int[cards.length];
	
		// 1. Arrays 클래스를 이용한 깊은 복사
		int[] newCards2 = Arrays.copyOf(cards, cards.length);
		
		// 2. 반복문을 이용한 깊은 복사
		for(int i = 0; i < cards.length; i++) {
			newCards[i] = cards[i];
		}
		
		// 3. System클래스를 이용한 깊은 복사
		int[] newCards3 = new int[cards.length];
		
		System.arraycopy(cards, 0, newCards3, 0, cards.length);
		
		newCards[1] = 100;
		System.out.println("cards 배열 : " + Arrays.toString(cards));
		System.out.println("newCards 배열 : " + Arrays.toString(newCards));
		System.out.println("newCards2 배열 : " + Arrays.toString(newCards2));
		System.out.println("newCards3 배열 : " + Arrays.toString(newCards3));
		
		// 다차원 배열
		// 2차원 이상의 배열을 의미하며, 배열의 요소로
		// 또 다른 배열을 가지는 것을 의미한다. 
		
		// 2차원 배열은 요소로써 1차원 배열을 가진다.
		// int[][] arr = new int[크기][1차원 배열의 크기]
		
		int[][] arr2 = {  {1,2,3}, {4,5,6}, {7,8,9}  };
		
		System.out.println(arr2[0][0]);
		
		
		// 요소로 들어가는 1차원 배열의 크기를 지정하지 않고
		// 생성할 수 있다.
		int[][] arr3 = new int[3][2];
		
		// 각 배열의 크기를 각각 선언하여 사용할 수 있다.
		arr3[0] = new int[2];
		arr3[1] = new int[3];
		arr3[2] = new int[1];
		
		int[][] iArr2 = new int[2][3];
		
		iArr2[0][0] = 1; 
		iArr2[0][1] = 1;
		iArr2[0][2] = 1;
		iArr2[1][0] = 1;
		iArr2[1][1] = 1;
		iArr2[1][2] = 1;
		
		System.out.println(iArr2[0]);
		
		
		
	}
}
