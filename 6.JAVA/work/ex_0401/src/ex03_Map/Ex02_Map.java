package ex03_Map;

import java.util.HashMap;
import java.util.Scanner;

public class Ex02_Map {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("kim", 1111); 
		map.put("lee", 2222); 
		map.put("park", 3333);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ID : ");
		String id = sc.next();
		
		System.out.print("PW : ");
		int pw = sc.nextInt();
		if(map.containsKey(id)) {
			if(map.get(id).equals(pw)) {
				System.out.println("로그인 성공!");
			}else {
				System.out.println("비밀번호 불일치");
			}
		} else {
			System.out.println("아이디가 존재하지 않습니다.");
		}
		
		
	}
}
