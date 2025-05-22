package ex02_file;

import java.io.File;
import java.io.IOException;

public class Ex06_File {
	public static void main(String[] args) {
		File f = new File("test.txt"); // 경로를 설정
		// 파일 이름만 설정하게 되면 기본적으로 프로젝트 내부로 설정이 된다.
		try {
			// 파일이 존재하지 않으면 새로 생성
			if(f.createNewFile()) {
				System.out.println("파일이 생성되었습니다. : " + f.getName());
			}
			else {
				System.out.println("파일이 이미 존재합니다.");
			}
		} catch (IOException e) {
			System.out.println("파일 생성 중 오류 발생");
			e.printStackTrace();
		}
		// 파일/폴더의 생성이나 삭제까지는 가능하지만
		// 내용을 읽거나 쓰는것은 불가능하다.
	}
}
