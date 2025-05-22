package ex06_List;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		ArrayList<UserInfo> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		out:while(true) {
			UserInfo ui = new UserInfo();
			System.out.print("아이디 입력 : ");
			String id = sc.next();
			ui.setId(id);
			
			// 중복체크하기(숙제)
			for(UserInfo x : arr) {
				if(x.getId().equals(id)) {
					System.out.println("중복된 ID입니다.");
					continue out;
				}
			}
			
			System.out.print("패스워드 입력 : ");
			int pwd = sc.nextInt();
			ui.setPwd(pwd);
			
			
			arr.add(ui);
			
			for(UserInfo x : arr) {
				System.out.println(x.getId());
				System.out.println(x.getPwd());
			}
			
		}
	}
}
