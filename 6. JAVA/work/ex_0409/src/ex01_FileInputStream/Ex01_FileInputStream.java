package ex01_FileInputStream;

import java.io.IOException;
import java.util.Scanner;

public class Ex01_FileInputStream {
	public static void main(String[] args) {
		byte[] keyboard = new byte[100];
		
		System.out.print("값 : ");
		
		// Scanner sc = new Scanner(System.in);
		// System : System클래스
		// in : input스트림 객체를 의미
		// System.in : 표준 입력 스트림
		
		// 표준 입력 스트림
		// 자바에서 프로그램이 외부로부터 데이터를 입력받을 수 있게 해주는 기본 통로
		// 기본 대상 : 키보드
		
		// 사용자가 키보드로 입력한 값을 keyboard 배열에 저장
		// 사용자가 엔터를 입력할 때 가지 입력을 받는다.
		// 엔터키 값까지 포함되어 저장
		try {
			System.in.read(keyboard);
			
			String s = new String(keyboard).trim();
			System.out.println(s);
			
			// Scanner sc = new Scanner(System.in);
			
			// Scanner(System.in)		vs		System.in.read()
			// 문자 단위로 입력 						바이트 단위 입력
			// 다양한 타입(String, int...)			int(0 ~ 255) 또는 byte[]
			// nextLine 으로 여러줄 처리 가능			직접처리해야한다.
			
			// sc.close();
			// in이 static이고 메모리에 한번만 올라가기 때문에
			// 닫아버리면 프로그램 전체에서 더 이상 키보드 입력이 불가능해진다.
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
