package ex03_FileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exam1 {
	public static void main(String[] args) {
		// file.txt를 만들고
		// 문장을 입력하고 저장을 한다.
		// FileInputStream으로 읽어온 뒤, 회문인지 아닌지 검증하세요
		
		String path = "C:\\Users\\admin\\Desktop\\AWS_cgs\\JAVA\\file.txt";
		
		File f = new File(path);
		
		byte[] b_read = new byte[(int)f.length()];
		
		FileInputStream fis = null;
		
		if(f.exists()) {
			try {
				fis = new FileInputStream(f);
				
				fis.read(b_read);
				
				String res = new String(b_read);
				
				
				String rev = new StringBuilder(res).reverse().toString().replace(" ", "");
				
				if(res.replace(" ", "").equals(rev)) {
					System.out.println("회문입니다.");
				}
				else {
					System.out.println("회문이 아닙니다.");
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			} finally {
				try {
					if(fis != null) {
						fis.close();
					}
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
	}
}
