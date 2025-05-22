package ex06_List;

import java.util.ArrayList;
import java.util.Scanner;


public class Exam1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		outer:while(true) {
				System.out.print("아이디 생성 : ");
				String id = sc.next();
				for(String x : list) {
					if(list.contains(id)) {
						System.out.println("중복된 아이디");
						continue outer;
					}
				}
				list.add(id);
				for(String x : list) {
					System.out.print(x+" ");
				}
			System.out.println();
			if(list.size() == 5) {
				break;
			}
		}
		
	}
}
