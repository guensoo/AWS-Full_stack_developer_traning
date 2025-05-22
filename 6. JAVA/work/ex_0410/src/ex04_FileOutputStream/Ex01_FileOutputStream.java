package ex04_FileOutputStream;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Ex01_FileOutputStream {
	public static void main(String[] args) {
		// 바이트 기반의 스트림은
		// 문자열을 바이트배열로 변환한 후에 작성을 했어야 했다.
		// OutputStreamWriter의 경우 문자열을 바이트로 쉽게 변경을 해주는 보조스트림이다.
		FileOutputStream in = null;
		OutputStreamWriter is = null;
		
		try {
			in = new FileOutputStream("C:\\Users\\admin\\Desktop\\AWS_cgs\\JAVA\\test.txt");
			is = new OutputStreamWriter(in);
			
			System.out.println("파일 생성 시작");
			String[] strArray = {
					"OutputStreamWriter에 대해서 배웁니다.",
					"we are learning about OutputStreamWriter"
			};
			
			for(String str : strArray) {
				is.write(str+"\n");
			}
			
			System.out.println("파일 생성 완료");
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(is != null) {
					is.close();
				}
				if(in != null) {
					in.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
