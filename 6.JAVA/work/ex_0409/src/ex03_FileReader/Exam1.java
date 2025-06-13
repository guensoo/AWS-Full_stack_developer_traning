package ex03_FileReader;

import java.io.FileReader;

public class Exam1 {
	public static void main(String[] args) {
		// text.txt파일을 만들고 한글, 영어(대문자, 소문자)섞어서 작성
		// text.txt파일의 내용을 읽어와서
		// 영어 대문자의 개수, 소문자의 개수를 판별하여 출력하세요
		// 대문자 : x개
		// 소문자 : x개
		FileReader fr = null;
		try {
			fr = new FileReader("C:\\Users\\admin\\Desktop\\AWS_cgs\\JAVA\\text.txt");
			int code = 0;
			int small = 0;
			int large = 0;
			
			while((code = fr.read()) != -1) {
				if((char)code >='A' && (char)code <= 'Z') {
					large++;
				} else if((char)code >= 'a' && (char)code <='z') {
					small += 1;
				}
			}
			System.out.println("대문자 : "+large);
			System.out.println("소문자 : "+small);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
