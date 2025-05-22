package ex02_FileOutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

// 학생의 이름과 점수를 저장하는 프로그램
// 이름과 점수를 FileOutputStream을 이용하여 scores.txt파일에 저장하세요

// 요구사항
// 1. 사용자로부터 이름과 점수를 입력받는다.(Scanner)
// 2. 입력받은 데이터를 "이름 : 점수 \n" 형식으로 문자열로 만들어
// 파일에 쓴다. ex) "김철수 : 84"
// 3. 이름에 exit를 입력하면 프로그램 종료
// 4. 파일은 scores.txt로 저장되며, 기존 내용은 덮어쓴다.
// 5. "이름 : 점수" 형식의 문자열의 각 문자의 char값을 +3을 해 암호화 한다.
// John : 85\n
// Mrkq#5;#B8

public class Exam1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("C:\\Users\\admin\\Desktop\\AWS_cgs\\JAVA\\score.txt");
			while(true) {
			
			System.out.print("이름 : ");
			String name = sc.nextLine();
			if(name.equals("exit")) {
				break;
			}
			String space = " : ";
			System.out.print("점수 : ");
			String score = sc.next();
			
			
			
			char scoreCon;
			for(int i = 0; i < name.length(); i++) {
				char nameCon = name.charAt(i);
				for(int j = 0; j < 3; j++) {
					nameCon++;
				}
				fos.write(nameCon);
			}
			
			for(int i = 0; i < space.length(); i++) {
				char spaceCon = space.charAt(i);
				for(int j = 0; j < 3; j++) {
					spaceCon++;
				}
				fos.write(spaceCon);
			}
			
			for(int i = 0; i < score.length(); i++) {
				char scoreCon1 = score.charAt(i);
				for(int j = 0; j < 3; j++) {
					scoreCon1++;
				}
				fos.write(scoreCon1);
			}
			
			fos.write('\n');
			
			System.out.println("생성 완료");
			sc.nextLine();
			}
			
			// 복호화를 해서 콘솔에 출력하기
			File f = new File("C:\\\\Users\\\\admin\\\\Desktop\\\\AWS_cgs\\\\JAVA\\\\score.txt");
			FileInputStream fis = null;
			// byte[] buffer
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
				try {
					if(fos != null) {
					fos.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
	}
}
