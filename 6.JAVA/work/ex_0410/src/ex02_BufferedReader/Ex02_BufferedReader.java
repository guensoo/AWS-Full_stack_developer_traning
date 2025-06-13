package ex02_BufferedReader;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex02_BufferedReader {
	public static void main(String[] args) {
		// BufferedReader를 이용해서 키보드에서 값을 입력받는다.
		// 장점 : Scanner보다 속도가 빠르다.
		
		BufferedReader reader =
				new BufferedReader(
						new InputStreamReader(System.in));
		
		try {
			System.out.print("문자열 입력 : ");
			String str = reader.readLine();
			
			// 정수 입력
			System.out.print("정수 입력 : ");
			int n = Integer.parseInt(reader.readLine());
			
			System.out.println("문자열 : " + str);
			System.out.println("정수 : " + n);
		} catch (Exception e) {
			// TODO: handle exception
		}
		// 원칙대로라면 close()를 통해 닫아줘야 하지만
		// System.in은 닫으면 별로 좋지 않다.
		// static이기 때문 => System.in을 받아서 사용하는
		// 다른 객체들을 못쓰게 된다.
	}
}
