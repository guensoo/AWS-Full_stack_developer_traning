package ex02_file;

import java.io.File;

public class Ex03_File {
	public static void main(String[] args) {
		String path = "C:\\Users\\admin\\Desktop\\AWS_cgs\\JAVA\\aaa\\bbb";
		
		File f = new File(path);
		
		// exists()
		// 목적지까지의 경로가 존재하면 true
		if(!f.exists()) {
			System.out.println("폴더생성");
			// mkdirs()
			// 복수의 폴더를 생성해준다.
			f.mkdirs();
		}
		
		// File클래스의 역할
		// 폴더를 만들어준다거나
		// 목적지까지의 검증(파일, 폴더, 존재하냐)
		// 폴더일때 목록의 반환
		// 목적지의 크기도 반환
		
		// 내용을 읽거나 쓰는 기능은 없다.
	}
}
