package ex02_exception;

public class Ex03_ArrayIndexOutOfBoundsException {
	public static void main(String[] args) {
		// 배열에서 인덱스(범위)를 초과해 사용할 때 발생한다.
		
		int[] arr = {1,6,7,8,10};
		System.out.println(arr[5]);
	}
}
